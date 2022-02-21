// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCertifyResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertifyResultResponseBody</p>
 */
public class GetCertifyResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetCertifyResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertifyResultResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCertifyResultResponseBody build() {
            return new GetCertifyResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DeviceToken")
        private String deviceToken;

        @NameInMap("IdentityInfo")
        private String identityInfo;

        @NameInMap("MaterialInfo")
        private String materialInfo;

        @NameInMap("VerifyDesc")
        private String verifyDesc;

        @NameInMap("VerifyResult")
        private String verifyResult;

        private Data(Builder builder) {
            this.deviceToken = builder.deviceToken;
            this.identityInfo = builder.identityInfo;
            this.materialInfo = builder.materialInfo;
            this.verifyDesc = builder.verifyDesc;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceToken
         */
        public String getDeviceToken() {
            return this.deviceToken;
        }

        /**
         * @return identityInfo
         */
        public String getIdentityInfo() {
            return this.identityInfo;
        }

        /**
         * @return materialInfo
         */
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        /**
         * @return verifyDesc
         */
        public String getVerifyDesc() {
            return this.verifyDesc;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String deviceToken; 
            private String identityInfo; 
            private String materialInfo; 
            private String verifyDesc; 
            private String verifyResult; 

            /**
             * DeviceToken.
             */
            public Builder deviceToken(String deviceToken) {
                this.deviceToken = deviceToken;
                return this;
            }

            /**
             * IdentityInfo.
             */
            public Builder identityInfo(String identityInfo) {
                this.identityInfo = identityInfo;
                return this;
            }

            /**
             * MaterialInfo.
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * VerifyDesc.
             */
            public Builder verifyDesc(String verifyDesc) {
                this.verifyDesc = verifyDesc;
                return this;
            }

            /**
             * VerifyResult.
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
