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
 * {@link DescribeCloudSiemAssetsCounterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudSiemAssetsCounterResponseBody</p>
 */
public class DescribeCloudSiemAssetsCounterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCloudSiemAssetsCounterResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudSiemAssetsCounterResponseBody build() {
            return new DescribeCloudSiemAssetsCounterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudSiemAssetsCounterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudSiemAssetsCounterResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetNum = model.assetNum;
                this.assetType = model.assetType;
            } 

            /**
             * <p>The number of assets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assetNum(Integer assetNum) {
                this.assetNum = assetNum;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li>ip</li>
             * <li>domain</li>
             * <li>url</li>
             * <li>process</li>
             * <li>file</li>
             * <li>host</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
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
