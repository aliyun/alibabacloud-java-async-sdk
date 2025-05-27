// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link AddDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>AddDataSourceResponseBody</p>
 */
public class AddDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDataSourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddDataSourceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDataSourceResponseBody build() {
            return new AddDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>AddDataSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceId")
        private String dataSourceInstanceId;

        private Data(Builder builder) {
            this.count = builder.count;
            this.dataSourceInstanceId = builder.dataSourceInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return dataSourceInstanceId
         */
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

        public static final class Builder {
            private Integer count; 
            private String dataSourceInstanceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.dataSourceInstanceId = model.dataSourceInstanceId;
            } 

            /**
             * <p>The number of data sources that are added. The value 1 indicates that data source is added, and a value less than or equal to 0 indicates that the data source failed to be added.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ID of the data source. The ID is an MD5 hash value that is calculated by the threat analysis feature based on specific parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>220ba97c9d1fdb0b9c7e8c7ca328d7ea</p>
             */
            public Builder dataSourceInstanceId(String dataSourceInstanceId) {
                this.dataSourceInstanceId = dataSourceInstanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
