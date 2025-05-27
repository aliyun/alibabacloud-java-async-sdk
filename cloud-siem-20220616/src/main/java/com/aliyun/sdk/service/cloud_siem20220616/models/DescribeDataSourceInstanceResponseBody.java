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
 * {@link DescribeDataSourceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSourceInstanceResponseBody</p>
 */
public class DescribeDataSourceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDataSourceInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceInstanceResponseBody create() {
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

        private Builder(DescribeDataSourceInstanceResponseBody model) {
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

        public DescribeDataSourceInstanceResponseBody build() {
            return new DescribeDataSourceInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataSourceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceInstanceResponseBody</p>
     */
    public static class DataSourceInstanceParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParaCode")
        private String paraCode;

        @com.aliyun.core.annotation.NameInMap("ParaValue")
        private String paraValue;

        private DataSourceInstanceParams(Builder builder) {
            this.paraCode = builder.paraCode;
            this.paraValue = builder.paraValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceInstanceParams create() {
            return builder().build();
        }

        /**
         * @return paraCode
         */
        public String getParaCode() {
            return this.paraCode;
        }

        /**
         * @return paraValue
         */
        public String getParaValue() {
            return this.paraValue;
        }

        public static final class Builder {
            private String paraCode; 
            private String paraValue; 

            private Builder() {
            } 

            private Builder(DataSourceInstanceParams model) {
                this.paraCode = model.paraCode;
                this.paraValue = model.paraValue;
            } 

            /**
             * <p>The code of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>region_code</p>
             */
            public Builder paraCode(String paraCode) {
                this.paraCode = paraCode;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-guangzhou</p>
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            public DataSourceInstanceParams build() {
                return new DataSourceInstanceParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataSourceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceId")
        private String dataSourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceInstanceParams")
        private java.util.List<DataSourceInstanceParams> dataSourceInstanceParams;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.cloudCode = builder.cloudCode;
            this.dataSourceInstanceId = builder.dataSourceInstanceId;
            this.dataSourceInstanceParams = builder.dataSourceInstanceParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return dataSourceInstanceId
         */
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

        /**
         * @return dataSourceInstanceParams
         */
        public java.util.List<DataSourceInstanceParams> getDataSourceInstanceParams() {
            return this.dataSourceInstanceParams;
        }

        public static final class Builder {
            private String accountId; 
            private String cloudCode; 
            private String dataSourceInstanceId; 
            private java.util.List<DataSourceInstanceParams> dataSourceInstanceParams; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountId = model.accountId;
                this.cloudCode = model.cloudCode;
                this.dataSourceInstanceId = model.dataSourceInstanceId;
                this.dataSourceInstanceParams = model.dataSourceInstanceParams;
            } 

            /**
             * <p>The ID of the cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxx</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The code of the cloud service provider. Valid values:</p>
             * <ul>
             * <li>qcloud: Tencent Cloud</li>
             * <li>aliyun: Alibaba Cloud</li>
             * <li>hcloud: Huawei Cloud</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hcloud</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
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

            /**
             * <p>The parameters of the data source.</p>
             */
            public Builder dataSourceInstanceParams(java.util.List<DataSourceInstanceParams> dataSourceInstanceParams) {
                this.dataSourceInstanceParams = dataSourceInstanceParams;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
