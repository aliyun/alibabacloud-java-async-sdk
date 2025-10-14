// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateDataSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataSetResponseBody</p>
 */
public class CreateDataSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSetRecordStatistic")
    private DataSetRecordStatistic dataSetRecordStatistic;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataSetResponseBody(Builder builder) {
        this.dataSetRecordStatistic = builder.dataSetRecordStatistic;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetRecordStatistic
     */
    public DataSetRecordStatistic getDataSetRecordStatistic() {
        return this.dataSetRecordStatistic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataSetRecordStatistic dataSetRecordStatistic; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDataSetResponseBody model) {
            this.dataSetRecordStatistic = model.dataSetRecordStatistic;
            this.requestId = model.requestId;
        } 

        /**
         * DataSetRecordStatistic.
         */
        public Builder dataSetRecordStatistic(DataSetRecordStatistic dataSetRecordStatistic) {
            this.dataSetRecordStatistic = dataSetRecordStatistic;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataSetResponseBody build() {
            return new CreateDataSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataSetResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDataSetResponseBody</p>
     */
    public static class DataSetRecordStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSetId")
        private String dataSetId;

        @com.aliyun.core.annotation.NameInMap("NewDataSetRecordCount")
        private Integer newDataSetRecordCount;

        private DataSetRecordStatistic(Builder builder) {
            this.dataSetId = builder.dataSetId;
            this.newDataSetRecordCount = builder.newDataSetRecordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSetRecordStatistic create() {
            return builder().build();
        }

        /**
         * @return dataSetId
         */
        public String getDataSetId() {
            return this.dataSetId;
        }

        /**
         * @return newDataSetRecordCount
         */
        public Integer getNewDataSetRecordCount() {
            return this.newDataSetRecordCount;
        }

        public static final class Builder {
            private String dataSetId; 
            private Integer newDataSetRecordCount; 

            private Builder() {
            } 

            private Builder(DataSetRecordStatistic model) {
                this.dataSetId = model.dataSetId;
                this.newDataSetRecordCount = model.newDataSetRecordCount;
            } 

            /**
             * DataSetId.
             */
            public Builder dataSetId(String dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * NewDataSetRecordCount.
             */
            public Builder newDataSetRecordCount(Integer newDataSetRecordCount) {
                this.newDataSetRecordCount = newDataSetRecordCount;
                return this;
            }

            public DataSetRecordStatistic build() {
                return new DataSetRecordStatistic(this);
            } 

        } 

    }
}
