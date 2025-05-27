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
 * {@link ListDataSourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceTypesResponseBody</p>
 */
public class ListDataSourceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataSourceTypesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataSourceTypesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
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

        public ListDataSourceTypesResponseBody build() {
            return new ListDataSourceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceTypesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        private Data(Builder builder) {
            this.cloudCode = builder.cloudCode;
            this.dataSourceType = builder.dataSourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public static final class Builder {
            private String cloudCode; 
            private String dataSourceType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cloudCode = model.cloudCode;
                this.dataSourceType = model.dataSourceType;
            } 

            /**
             * <p>The code of the third-party cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>hcloud</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>obs: Huawei Cloud Object Storage Service (OBS)</li>
             * <li>wafApi: download API of Tencent Cloud Web Application Firewall (WAF)</li>
             * <li>ckafka: Tencent Cloud Kafka (CKafka)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>obs</p>
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
