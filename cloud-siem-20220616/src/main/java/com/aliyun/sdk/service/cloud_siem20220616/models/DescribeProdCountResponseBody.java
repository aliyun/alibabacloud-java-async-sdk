// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProdCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProdCountResponseBody</p>
 */
public class DescribeProdCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProdCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProdCountResponseBody create() {
        return builder().build();
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

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProdCountResponseBody build() {
            return new DescribeProdCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunProdCount")
        private Integer aliyunProdCount;

        @com.aliyun.core.annotation.NameInMap("HcloudProdCount")
        private Integer hcloudProdCount;

        @com.aliyun.core.annotation.NameInMap("QcloudProdCount")
        private Integer qcloudProdCount;

        private Data(Builder builder) {
            this.aliyunProdCount = builder.aliyunProdCount;
            this.hcloudProdCount = builder.hcloudProdCount;
            this.qcloudProdCount = builder.qcloudProdCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunProdCount
         */
        public Integer getAliyunProdCount() {
            return this.aliyunProdCount;
        }

        /**
         * @return hcloudProdCount
         */
        public Integer getHcloudProdCount() {
            return this.hcloudProdCount;
        }

        /**
         * @return qcloudProdCount
         */
        public Integer getQcloudProdCount() {
            return this.qcloudProdCount;
        }

        public static final class Builder {
            private Integer aliyunProdCount; 
            private Integer hcloudProdCount; 
            private Integer qcloudProdCount; 

            /**
             * The number of Alibaba Cloud services.
             */
            public Builder aliyunProdCount(Integer aliyunProdCount) {
                this.aliyunProdCount = aliyunProdCount;
                return this;
            }

            /**
             * The number of Huawei Cloud services.
             */
            public Builder hcloudProdCount(Integer hcloudProdCount) {
                this.hcloudProdCount = hcloudProdCount;
                return this;
            }

            /**
             * The number of Tencent Cloud services.
             */
            public Builder qcloudProdCount(Integer qcloudProdCount) {
                this.qcloudProdCount = qcloudProdCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
