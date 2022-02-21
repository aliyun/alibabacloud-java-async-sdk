// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrunkProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrunkProvidersResponseBody</p>
 */
public class ListTrunkProvidersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TrunkProviders")
    private java.util.List < TrunkProviders> trunkProviders;

    private ListTrunkProvidersResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.trunkProviders = builder.trunkProviders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrunkProvidersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return trunkProviders
     */
    public java.util.List < TrunkProviders> getTrunkProviders() {
        return this.trunkProviders;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TrunkProviders> trunkProviders; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TrunkProviders.
         */
        public Builder trunkProviders(java.util.List < TrunkProviders> trunkProviders) {
            this.trunkProviders = trunkProviders;
            return this;
        }

        public ListTrunkProvidersResponseBody build() {
            return new ListTrunkProvidersResponseBody(this);
        } 

    } 

    public static class TrunkProviders extends TeaModel {
        @NameInMap("ProviderName")
        private String providerName;

        @NameInMap("Status")
        private String status;

        private TrunkProviders(Builder builder) {
            this.providerName = builder.providerName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrunkProviders create() {
            return builder().build();
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String providerName; 
            private String status; 

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TrunkProviders build() {
                return new TrunkProviders(this);
            } 

        } 

    }
}
