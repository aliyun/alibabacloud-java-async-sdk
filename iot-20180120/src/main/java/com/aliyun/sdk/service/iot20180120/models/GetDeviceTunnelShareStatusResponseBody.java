// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceTunnelShareStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceTunnelShareStatusResponseBody</p>
 */
public class GetDeviceTunnelShareStatusResponseBody extends TeaModel {
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

    private GetDeviceTunnelShareStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceTunnelShareStatusResponseBody create() {
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

        public GetDeviceTunnelShareStatusResponseBody build() {
            return new GetDeviceTunnelShareStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("GmtOpened")
        private Long gmtOpened;

        @NameInMap("IsOpen")
        private Boolean isOpen;

        @NameInMap("Password")
        private String password;

        @NameInMap("ShareId")
        private String shareId;

        private Data(Builder builder) {
            this.gmtOpened = builder.gmtOpened;
            this.isOpen = builder.isOpen;
            this.password = builder.password;
            this.shareId = builder.shareId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtOpened
         */
        public Long getGmtOpened() {
            return this.gmtOpened;
        }

        /**
         * @return isOpen
         */
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return shareId
         */
        public String getShareId() {
            return this.shareId;
        }

        public static final class Builder {
            private Long gmtOpened; 
            private Boolean isOpen; 
            private String password; 
            private String shareId; 

            /**
             * GmtOpened.
             */
            public Builder gmtOpened(Long gmtOpened) {
                this.gmtOpened = gmtOpened;
                return this;
            }

            /**
             * IsOpen.
             */
            public Builder isOpen(Boolean isOpen) {
                this.isOpen = isOpen;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * ShareId.
             */
            public Builder shareId(String shareId) {
                this.shareId = shareId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
