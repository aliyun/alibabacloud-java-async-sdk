// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLinkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLinkResponseBody</p>
 */
public class CreateLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private CreateLinkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLinkResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public CreateLinkResponseBody build() {
            return new CreateLinkResponseBody(this);
        } 

    } 

    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ResultContent(Builder builder) {
            this.data = builder.data;
            this.target = builder.target;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String data; 
            private String target; 
            private String version; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
