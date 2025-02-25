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
        @com.aliyun.core.annotation.NameInMap("AliyunImportedCount")
        private Integer aliyunImportedCount;

        @com.aliyun.core.annotation.NameInMap("AliyunProdCount")
        private Integer aliyunProdCount;

        @com.aliyun.core.annotation.NameInMap("HcloudImportedCount")
        private Integer hcloudImportedCount;

        @com.aliyun.core.annotation.NameInMap("HcloudProdCount")
        private Integer hcloudProdCount;

        @com.aliyun.core.annotation.NameInMap("IdcImportedCount")
        private Integer idcImportedCount;

        @com.aliyun.core.annotation.NameInMap("IdcProdCount")
        private Integer idcProdCount;

        @com.aliyun.core.annotation.NameInMap("QcloudImportedCount")
        private Integer qcloudImportedCount;

        @com.aliyun.core.annotation.NameInMap("QcloudProdCount")
        private Integer qcloudProdCount;

        private Data(Builder builder) {
            this.aliyunImportedCount = builder.aliyunImportedCount;
            this.aliyunProdCount = builder.aliyunProdCount;
            this.hcloudImportedCount = builder.hcloudImportedCount;
            this.hcloudProdCount = builder.hcloudProdCount;
            this.idcImportedCount = builder.idcImportedCount;
            this.idcProdCount = builder.idcProdCount;
            this.qcloudImportedCount = builder.qcloudImportedCount;
            this.qcloudProdCount = builder.qcloudProdCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunImportedCount
         */
        public Integer getAliyunImportedCount() {
            return this.aliyunImportedCount;
        }

        /**
         * @return aliyunProdCount
         */
        public Integer getAliyunProdCount() {
            return this.aliyunProdCount;
        }

        /**
         * @return hcloudImportedCount
         */
        public Integer getHcloudImportedCount() {
            return this.hcloudImportedCount;
        }

        /**
         * @return hcloudProdCount
         */
        public Integer getHcloudProdCount() {
            return this.hcloudProdCount;
        }

        /**
         * @return idcImportedCount
         */
        public Integer getIdcImportedCount() {
            return this.idcImportedCount;
        }

        /**
         * @return idcProdCount
         */
        public Integer getIdcProdCount() {
            return this.idcProdCount;
        }

        /**
         * @return qcloudImportedCount
         */
        public Integer getQcloudImportedCount() {
            return this.qcloudImportedCount;
        }

        /**
         * @return qcloudProdCount
         */
        public Integer getQcloudProdCount() {
            return this.qcloudProdCount;
        }

        public static final class Builder {
            private Integer aliyunImportedCount; 
            private Integer aliyunProdCount; 
            private Integer hcloudImportedCount; 
            private Integer hcloudProdCount; 
            private Integer idcImportedCount; 
            private Integer idcProdCount; 
            private Integer qcloudImportedCount; 
            private Integer qcloudProdCount; 

            /**
             * AliyunImportedCount.
             */
            public Builder aliyunImportedCount(Integer aliyunImportedCount) {
                this.aliyunImportedCount = aliyunImportedCount;
                return this;
            }

            /**
             * The number of Alibaba Cloud services.
             */
            public Builder aliyunProdCount(Integer aliyunProdCount) {
                this.aliyunProdCount = aliyunProdCount;
                return this;
            }

            /**
             * HcloudImportedCount.
             */
            public Builder hcloudImportedCount(Integer hcloudImportedCount) {
                this.hcloudImportedCount = hcloudImportedCount;
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
             * IdcImportedCount.
             */
            public Builder idcImportedCount(Integer idcImportedCount) {
                this.idcImportedCount = idcImportedCount;
                return this;
            }

            /**
             * IdcProdCount.
             */
            public Builder idcProdCount(Integer idcProdCount) {
                this.idcProdCount = idcProdCount;
                return this;
            }

            /**
             * QcloudImportedCount.
             */
            public Builder qcloudImportedCount(Integer qcloudImportedCount) {
                this.qcloudImportedCount = qcloudImportedCount;
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
