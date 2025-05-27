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

        private Builder(DescribeProdCountResponseBody model) {
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

        public DescribeProdCountResponseBody build() {
            return new DescribeProdCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProdCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProdCountResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunImportedCount = model.aliyunImportedCount;
                this.aliyunProdCount = model.aliyunProdCount;
                this.hcloudImportedCount = model.hcloudImportedCount;
                this.hcloudProdCount = model.hcloudProdCount;
                this.idcImportedCount = model.idcImportedCount;
                this.idcProdCount = model.idcProdCount;
                this.qcloudImportedCount = model.qcloudImportedCount;
                this.qcloudProdCount = model.qcloudProdCount;
            } 

            /**
             * AliyunImportedCount.
             */
            public Builder aliyunImportedCount(Integer aliyunImportedCount) {
                this.aliyunImportedCount = aliyunImportedCount;
                return this;
            }

            /**
             * <p>The number of Alibaba Cloud services.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
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
             * <p>The number of Huawei Cloud services.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The number of Tencent Cloud services.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
