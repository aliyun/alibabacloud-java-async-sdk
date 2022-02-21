// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeOssPreSignedAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeOssPreSignedAddressResponseBody</p>
 */
public class CreateEdgeOssPreSignedAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEdgeOssPreSignedAddressResponseBody build() {
            return new CreateEdgeOssPreSignedAddressResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("OssAddress")
        private String ossAddress;

        @NameInMap("OssPreSignedAddress")
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

            /**
             * OssAddress.
             */
            public Builder ossAddress(String ossAddress) {
                this.ossAddress = ossAddress;
                return this;
            }

            /**
             * OssPreSignedAddress.
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
