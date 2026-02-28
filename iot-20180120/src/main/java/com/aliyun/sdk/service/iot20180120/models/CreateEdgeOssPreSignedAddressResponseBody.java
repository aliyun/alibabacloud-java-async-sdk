// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateEdgeOssPreSignedAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeOssPreSignedAddressResponseBody</p>
 */
public class CreateEdgeOssPreSignedAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateEdgeOssPreSignedAddressResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeOssPreSignedAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateEdgeOssPreSignedAddressResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data that is returned if the call was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91E2BFA2-ECD7-4E11-B36B-66BCC4773922</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEdgeOssPreSignedAddressResponseBody build() {
            return new CreateEdgeOssPreSignedAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEdgeOssPreSignedAddressResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEdgeOssPreSignedAddressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssAddress")
        private String ossAddress;

        @com.aliyun.core.annotation.NameInMap("OssPreSignedAddress")
        private String ossPreSignedAddress;

        private Data(Builder builder) {
            this.ossAddress = builder.ossAddress;
            this.ossPreSignedAddress = builder.ossPreSignedAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ossAddress
         */
        public String getOssAddress() {
            return this.ossAddress;
        }

        /**
         * @return ossPreSignedAddress
         */
        public String getOssPreSignedAddress() {
            return this.ossPreSignedAddress;
        }

        public static final class Builder {
            private String ossAddress; 
            private String ossPreSignedAddress; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ossAddress = model.ossAddress;
                this.ossPreSignedAddress = model.ossPreSignedAddress;
            } 

            /**
             * <p>The URL of the OSS object.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip">http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip</a></p>
             */
            public Builder ossAddress(String ossAddress) {
                this.ossAddress = ossAddress;
                return this;
            }

            /**
             * <p>The pre-signed URL of the OSS object. For more information, see <a href="https://help.aliyun.com/document_detail/32016.html">OSS documentation</a>.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip?Expires%5Cu003d1581586402%5Cu0026OSSAccessKeyId%5Cu003daS4MT0IYrP******%5Cu0026Signature%5Cu003dIUUjZ881H3rUoCOwjMXPmGbw">http://xxxx.oss-cn-shanghai.aliyuncs.com/driver/a534d3b81*******8fe7da0/DRIVER_VERSION_CONTENT/df9b9f441*********4c90d0c21d14/2.0.0/1581586102750/driver_code.zip?Expires\u003d1581586402\u0026OSSAccessKeyId\u003daS4MT0IYrP******\u0026Signature\u003dIUUjZ881H3rUoCOwjMXPmGbw</a>******</p>
             */
            public Builder ossPreSignedAddress(String ossPreSignedAddress) {
                this.ossPreSignedAddress = ossPreSignedAddress;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
