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
         * <p>The status code of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The additional information. If the request is successful, success is returned. If the request fails, a specific error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Execution failed: element not found or operation timed out, outTaskId:trademark_regnew_public_cn-zz4310rp1lb, flowId:null, nodeUUID:541b6c71-8cce-4ab0-af84-713ca9741821</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76E93048-F90F-57B7-BD46-6097611A706D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The script content of the approval application.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
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
             * <p>The message returned by the API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Execution failed: element not found or operation timed out, outTaskId:trademark_regnew_public_cn-zz4310rp1lb, flowId:null, nodeUUID:541b6c71-8cce-4ab0-af84-713ca9741821</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The message list.</p>
             */
            public Builder messageList(java.util.List<String> messageList) {
                this.messageList = messageList;
                return this;
            }

            /**
             * <p>The request result.</p>
             */
            public Builder saveAnnotationMissionSessionListRequest(SaveAnnotationMissionSessionListRequest saveAnnotationMissionSessionListRequest) {
                this.saveAnnotationMissionSessionListRequest = saveAnnotationMissionSessionListRequest;
                return this;
            }

            /**
             * <p>Indicates whether the request is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
