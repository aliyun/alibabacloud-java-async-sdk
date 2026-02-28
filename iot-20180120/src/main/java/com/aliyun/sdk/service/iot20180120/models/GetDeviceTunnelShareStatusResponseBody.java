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
 * {@link GetDeviceTunnelShareStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceTunnelShareStatusResponseBody</p>
 */
public class GetDeviceTunnelShareStatusResponseBody extends TeaModel {
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

        private Builder(GetDeviceTunnelShareStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link GetDeviceTunnelShareStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceTunnelShareStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtOpened")
        private Long gmtOpened;

        @com.aliyun.core.annotation.NameInMap("IsOpen")
        private Boolean isOpen;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("ShareId")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtOpened = model.gmtOpened;
                this.isOpen = model.isOpen;
                this.password = model.password;
                this.shareId = model.shareId;
            } 

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
