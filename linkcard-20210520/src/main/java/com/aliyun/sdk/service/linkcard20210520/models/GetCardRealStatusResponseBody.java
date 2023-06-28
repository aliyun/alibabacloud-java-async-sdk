// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardRealStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardRealStatusResponseBody</p>
 */
public class GetCardRealStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LocalizedMessage")
    private String localizedMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCardRealStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.localizedMessage = builder.localizedMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardRealStatusResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return localizedMessage
     */
    public String getLocalizedMessage() {
        return this.localizedMessage;
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
        private java.util.List < Data> data; 
        private String errorMessage; 
        private String localizedMessage; 
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
        public Builder data(java.util.List < Data> data) {
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
         * LocalizedMessage.
         */
        public Builder localizedMessage(String localizedMessage) {
            this.localizedMessage = localizedMessage;
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

        public GetCardRealStatusResponseBody build() {
            return new GetCardRealStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Gprs")
        private Boolean gprs;

        @NameInMap("Iccid")
        private String iccid;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("SerialNo")
        private String serialNo;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.gprs = builder.gprs;
            this.iccid = builder.iccid;
            this.online = builder.online;
            this.serialNo = builder.serialNo;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gprs
         */
        public Boolean getGprs() {
            return this.gprs;
        }

        /**
         * @return iccid
         */
        public String getIccid() {
            return this.iccid;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean gprs; 
            private String iccid; 
            private Boolean online; 
            private String serialNo; 
            private String status; 

            /**
             * Gprs.
             */
            public Builder gprs(Boolean gprs) {
                this.gprs = gprs;
                return this;
            }

            /**
             * Iccid.
             */
            public Builder iccid(String iccid) {
                this.iccid = iccid;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * SerialNo.
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
