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
 * {@link UpdateDataSetRecordResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDataSetRecordResponseBody</p>
 */
public class UpdateDataSetRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSetRecordStatistic")
    private DataSetRecordStatistic dataSetRecordStatistic;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateDataSetRecordResponseBody(Builder builder) {
        this.dataSetRecordStatistic = builder.dataSetRecordStatistic;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSetRecordResponseBody create() {
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

        private Builder(UpdateDataSetRecordResponseBody model) {
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

        public UpdateDataSetRecordResponseBody build() {
            return new UpdateDataSetRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataSetRecordResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDataSetRecordResponseBody</p>
     */
    public static class DataSetRecordStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewDataSetRecordCount")
        private Integer newDataSetRecordCount;

        @com.aliyun.core.annotation.NameInMap("UpdateDataSetRecordCount")
        private Integer updateDataSetRecordCount;

        private DataSetRecordStatistic(Builder builder) {
            this.newDataSetRecordCount = builder.newDataSetRecordCount;
            this.updateDataSetRecordCount = builder.updateDataSetRecordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSetRecordStatistic create() {
            return builder().build();
        }

        /**
         * @return newDataSetRecordCount
         */
        public Integer getNewDataSetRecordCount() {
            return this.newDataSetRecordCount;
        }

        /**
         * @return updateDataSetRecordCount
         */
        public Integer getUpdateDataSetRecordCount() {
            return this.updateDataSetRecordCount;
        }

        public static final class Builder {
            private Integer newDataSetRecordCount; 
            private Integer updateDataSetRecordCount; 

            private Builder() {
            } 

            private Builder(DataSetRecordStatistic model) {
                this.newDataSetRecordCount = model.newDataSetRecordCount;
                this.updateDataSetRecordCount = model.updateDataSetRecordCount;
            } 

            /**
             * NewDataSetRecordCount.
             */
            public Builder newDataSetRecordCount(Integer newDataSetRecordCount) {
                this.newDataSetRecordCount = newDataSetRecordCount;
                return this;
            }

            /**
             * UpdateDataSetRecordCount.
             */
            public Builder updateDataSetRecordCount(Integer updateDataSetRecordCount) {
                this.updateDataSetRecordCount = updateDataSetRecordCount;
                return this;
            }

            public DataSetRecordStatistic build() {
                return new DataSetRecordStatistic(this);
            } 

        } 

    }
}
