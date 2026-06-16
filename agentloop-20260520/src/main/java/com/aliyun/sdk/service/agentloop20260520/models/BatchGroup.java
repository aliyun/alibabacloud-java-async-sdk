// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchGroup} extends {@link TeaModel}
 *
 * <p>BatchGroup</p>
 */
public class BatchGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("batchId")
    private String batchId;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<ExperimentRecord> records;

    private BatchGroup(Builder builder) {
        this.batchId = builder.batchId;
        this.records = builder.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return records
     */
    public java.util.List<ExperimentRecord> getRecords() {
        return this.records;
    }

    public static final class Builder {
        private String batchId; 
        private java.util.List<ExperimentRecord> records; 

        private Builder() {
        } 

        private Builder(BatchGroup model) {
            this.batchId = model.batchId;
            this.records = model.records;
        } 

        /**
         * batchId.
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
            return this;
        }

        /**
         * records.
         */
        public Builder records(java.util.List<ExperimentRecord> records) {
            this.records = records;
            return this;
        }

        public BatchGroup build() {
            return new BatchGroup(this);
        } 

    } 

}
