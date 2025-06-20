// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link SafeChangeStartResponseBody} extends {@link TeaModel}
 *
 * <p>SafeChangeStartResponseBody</p>
 */
public class SafeChangeStartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SafeChangeStartResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeStartResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SafeChangeStartResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public SafeChangeStartResponseBody build() {
            return new SafeChangeStartResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SafeChangeStartResponseBody} extends {@link TeaModel}
     *
     * <p>SafeChangeStartResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveResultUrl")
        private String approveResultUrl;

        @com.aliyun.core.annotation.NameInMap("CheckResultUrl")
        private String checkResultUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubSatus")
        private String subSatus;

        private Data(Builder builder) {
            this.approveResultUrl = builder.approveResultUrl;
            this.checkResultUrl = builder.checkResultUrl;
            this.status = builder.status;
            this.subSatus = builder.subSatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return approveResultUrl
         */
        public String getApproveResultUrl() {
            return this.approveResultUrl;
        }

        /**
         * @return checkResultUrl
         */
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subSatus
         */
        public String getSubSatus() {
            return this.subSatus;
        }

        public static final class Builder {
            private String approveResultUrl; 
            private String checkResultUrl; 
            private String status; 
            private String subSatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.approveResultUrl = model.approveResultUrl;
                this.checkResultUrl = model.checkResultUrl;
                this.status = model.status;
                this.subSatus = model.subSatus;
            } 

            /**
             * ApproveResultUrl.
             */
            public Builder approveResultUrl(String approveResultUrl) {
                this.approveResultUrl = approveResultUrl;
                return this;
            }

            /**
             * CheckResultUrl.
             */
            public Builder checkResultUrl(String checkResultUrl) {
                this.checkResultUrl = checkResultUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubSatus.
             */
            public Builder subSatus(String subSatus) {
                this.subSatus = subSatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
