// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudSiemAssetsCounterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudSiemAssetsCounterResponseBody</p>
 */
public class DescribeCloudSiemAssetsCounterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCloudSiemAssetsCounterResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemAssetsCounterResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudSiemAssetsCounterResponseBody build() {
            return new DescribeCloudSiemAssetsCounterResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetNum")
        private Integer assetNum;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        private Data(Builder builder) {
            this.assetNum = builder.assetNum;
            this.assetType = builder.assetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetNum
         */
        public Integer getAssetNum() {
            return this.assetNum;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        public static final class Builder {
            private Integer assetNum; 
            private String assetType; 

            /**
             * The number of assets.
             */
            public Builder assetNum(Integer assetNum) {
                this.assetNum = assetNum;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   ip
             * *   domain
             * *   url
             * *   process
             * *   file
             * *   host
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
