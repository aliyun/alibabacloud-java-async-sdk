// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskDetailActivityResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskDetailActivityResponseBody</p>
 */
public class GetTaskDetailActivityResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Object")
    private java.util.List < Object> object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    private GetTaskDetailActivityResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskDetailActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return object
     */
    public java.util.List < Object> getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private java.util.List < Object> object; 
        private String requestId; 
        private Boolean successful; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * Object.
         */
        public Builder object(java.util.List < Object> object) {
            this.object = object;
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
         * Successful.
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public GetTaskDetailActivityResponseBody build() {
            return new GetTaskDetailActivityResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("Content")
        private java.util.Map < String, ? > content;

        @NameInMap("Created")
        private String created;

        @NameInMap("Title")
        private String title;

        @NameInMap("Updated")
        private String updated;

        private Object(Builder builder) {
            this.action = builder.action;
            this.content = builder.content;
            this.created = builder.created;
            this.title = builder.title;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return content
         */
        public java.util.Map < String, ? > getContent() {
            return this.content;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String action; 
            private java.util.Map < String, ? > content; 
            private String created; 
            private String title; 
            private String updated; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(java.util.Map < String, ? > content) {
                this.content = content;
                return this;
            }

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
