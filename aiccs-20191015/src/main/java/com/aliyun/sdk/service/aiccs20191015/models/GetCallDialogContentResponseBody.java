// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetCallDialogContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetCallDialogContentResponseBody</p>
 */
public class GetCallDialogContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCallDialogContentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallDialogContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCallDialogContentResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Details about the access denial. Returned only when RAM authentication fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Denied</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FB0B0481-F13E-16E0-8A7A-1AD2FXXXEF55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCallDialogContentResponseBody build() {
            return new GetCallDialogContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCallDialogContentResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDialogContentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallStatus")
        private Long callStatus;

        @com.aliyun.core.annotation.NameInMap("DialogContent")
        private String dialogContent;

        private Data(Builder builder) {
            this.callId = builder.callId;
            this.callStatus = builder.callStatus;
            this.dialogContent = builder.dialogContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callStatus
         */
        public Long getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return dialogContent
         */
        public String getDialogContent() {
            return this.dialogContent;
        }

        public static final class Builder {
            private String callId; 
            private Long callStatus; 
            private String dialogContent; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callId = model.callId;
                this.callStatus = model.callStatus;
                this.dialogContent = model.dialogContent;
            } 

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456^123478</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The call status.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><code>0</code>: Not connected</p>
             * </li>
             * <li><p><code>1</code>: Connected</p>
             * </li>
             * <li><p><code>2</code>: Disconnected</p>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder callStatus(Long callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * <p>The dialog content.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;content\&quot;:\&quot;您好。\&quot;,\&quot;role\&quot;:\&quot;assistant\&quot;},{\&quot;content\&quot;:\&quot;不用了。\&quot;,\&quot;role\&quot;:\&quot;user\&quot;},{\&quot;content\&quot;:\&quot;呃，不用了，再见，谢谢。\&quot;,\&quot;role\&quot;:\&quot;user\&quot;}]</p>
             */
            public Builder dialogContent(String dialogContent) {
                this.dialogContent = dialogContent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
