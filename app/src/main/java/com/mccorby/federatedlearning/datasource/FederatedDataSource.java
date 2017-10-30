package com.mccorby.federatedlearning.datasource;

import com.mccorby.federatedlearning.core.domain.model.FederatedDataSet;

public interface FederatedDataSource {

    FederatedDataSet getTrainingData(int batchSize);
    FederatedDataSet getTestData(int batchSize);
    FederatedDataSet getCrossValidationData(int batchSize);
}
