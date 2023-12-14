// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProdCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProdCountResponseBody</p>
 */
public class DescribeProdCountResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AliyunProdCount")
        private Integer aliyunProdCount;

        @NameInMap("HcloudProdCount")
        private Integer hcloudProdCount;

        @NameInMap("QcloudProdCount")
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
             * AliyunProdCount.
             */
            public Builder aliyunProdCount(Integer aliyunProdCount) {
                this.aliyunProdCount = aliyunProdCount;
                return this;
            }

            /**
             * HcloudProdCount.
             */
            public Builder hcloudProdCount(Integer hcloudProdCount) {
                this.hcloudProdCount = hcloudProdCount;
                return this;
            }

            /**
             * QcloudProdCount.
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
