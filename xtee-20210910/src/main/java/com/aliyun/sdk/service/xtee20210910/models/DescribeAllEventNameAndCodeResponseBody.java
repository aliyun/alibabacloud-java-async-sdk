// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllEventNameAndCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllEventNameAndCodeResponseBody</p>
 */
public class DescribeAllEventNameAndCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DescribeAllEventNameAndCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllEventNameAndCodeResponseBody create() {
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
    public String getHttpStatusCode() {
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
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAllEventNameAndCodeResponseBody build() {
            return new DescribeAllEventNameAndCodeResponseBody(this);
        } 

    } 

    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        private Children(Builder builder) {
            this.createType = builder.createType;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String createType; 
            private String eventCode; 
            private String eventName; 
            private String eventType; 

            /**
             * createType.
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * eventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("children")
        private java.util.List < Children> children;

        @com.aliyun.core.annotation.NameInMap("createType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        private ResultObject(Builder builder) {
            this.children = builder.children;
            this.createType = builder.createType;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < Children> getChildren() {
            return this.children;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private java.util.List < Children> children; 
            private String createType; 
            private String eventCode; 
            private String eventName; 
            private String eventType; 

            /**
             * children.
             */
            public Builder children(java.util.List < Children> children) {
                this.children = children;
                return this;
            }

            /**
             * createType.
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * eventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
