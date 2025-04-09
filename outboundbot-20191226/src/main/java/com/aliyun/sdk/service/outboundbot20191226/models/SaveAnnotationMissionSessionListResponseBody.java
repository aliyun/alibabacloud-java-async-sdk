// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link SaveAnnotationMissionSessionListResponseBody} extends {@link TeaModel}
 *
 * <p>SaveAnnotationMissionSessionListResponseBody</p>
 */
public class SaveAnnotationMissionSessionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SaveAnnotationMissionSessionListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAnnotationMissionSessionListResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SaveAnnotationMissionSessionListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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

        public SaveAnnotationMissionSessionListResponseBody build() {
            return new SaveAnnotationMissionSessionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SaveAnnotationMissionSessionListResponseBody} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListResponseBody</p>
     */
    public static class SaveAnnotationMissionSessionListRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionListJsonString")
        private String annotationMissionSessionListJsonString;

        private SaveAnnotationMissionSessionListRequest(Builder builder) {
            this.annotationMissionSessionListJsonString = builder.annotationMissionSessionListJsonString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaveAnnotationMissionSessionListRequest create() {
            return builder().build();
        }

        /**
         * @return annotationMissionSessionListJsonString
         */
        public String getAnnotationMissionSessionListJsonString() {
            return this.annotationMissionSessionListJsonString;
        }

        public static final class Builder {
            private String annotationMissionSessionListJsonString; 

            private Builder() {
            } 

            private Builder(SaveAnnotationMissionSessionListRequest model) {
                this.annotationMissionSessionListJsonString = model.annotationMissionSessionListJsonString;
            } 

            /**
             * AnnotationMissionSessionListJsonString.
             */
            public Builder annotationMissionSessionListJsonString(String annotationMissionSessionListJsonString) {
                this.annotationMissionSessionListJsonString = annotationMissionSessionListJsonString;
                return this;
            }

            public SaveAnnotationMissionSessionListRequest build() {
                return new SaveAnnotationMissionSessionListRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveAnnotationMissionSessionListResponseBody} extends {@link TeaModel}
     *
     * <p>SaveAnnotationMissionSessionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageList")
        private java.util.List<String> messageList;

        @com.aliyun.core.annotation.NameInMap("SaveAnnotationMissionSessionListRequest")
        private SaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.message = builder.message;
            this.messageList = builder.messageList;
            this.saveAnnotationMissionSessionListRequest = builder.saveAnnotationMissionSessionListRequest;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return messageList
         */
        public java.util.List<String> getMessageList() {
            return this.messageList;
        }

        /**
         * @return saveAnnotationMissionSessionListRequest
         */
        public SaveAnnotationMissionSessionListRequest getSaveAnnotationMissionSessionListRequest() {
            return this.saveAnnotationMissionSessionListRequest;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String message; 
            private java.util.List<String> messageList; 
            private SaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.message = model.message;
                this.messageList = model.messageList;
                this.saveAnnotationMissionSessionListRequest = model.saveAnnotationMissionSessionListRequest;
                this.success = model.success;
            } 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * MessageList.
             */
            public Builder messageList(java.util.List<String> messageList) {
                this.messageList = messageList;
                return this;
            }

            /**
             * SaveAnnotationMissionSessionListRequest.
             */
            public Builder saveAnnotationMissionSessionListRequest(SaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest) {
                this.saveAnnotationMissionSessionListRequest = saveAnnotationMissionSessionListRequest;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
