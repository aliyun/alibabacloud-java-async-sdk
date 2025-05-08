// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link GetDocTranslateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocTranslateTaskResponseBody</p>
 */
public class GetDocTranslateTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TranslateErrorCode")
    private String translateErrorCode;

    @com.aliyun.core.annotation.NameInMap("TranslateErrorMessage")
    private String translateErrorMessage;

    @com.aliyun.core.annotation.NameInMap("TranslateFileUrl")
    private String translateFileUrl;

    private GetDocTranslateTaskResponseBody(Builder builder) {
        this.pageCount = builder.pageCount;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.translateErrorCode = builder.translateErrorCode;
        this.translateErrorMessage = builder.translateErrorMessage;
        this.translateFileUrl = builder.translateFileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocTranslateTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return translateErrorCode
     */
    public String getTranslateErrorCode() {
        return this.translateErrorCode;
    }

    /**
     * @return translateErrorMessage
     */
    public String getTranslateErrorMessage() {
        return this.translateErrorMessage;
    }

    /**
     * @return translateFileUrl
     */
    public String getTranslateFileUrl() {
        return this.translateFileUrl;
    }

    public static final class Builder {
        private Integer pageCount; 
        private String requestId; 
        private String status; 
        private String taskId; 
        private String translateErrorCode; 
        private String translateErrorMessage; 
        private String translateFileUrl; 

        private Builder() {
        } 

        private Builder(GetDocTranslateTaskResponseBody model) {
            this.pageCount = model.pageCount;
            this.requestId = model.requestId;
            this.status = model.status;
            this.taskId = model.taskId;
            this.translateErrorCode = model.translateErrorCode;
            this.translateErrorMessage = model.translateErrorMessage;
            this.translateFileUrl = model.translateFileUrl;
        } 

        /**
         * PageCount.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TranslateErrorCode.
         */
        public Builder translateErrorCode(String translateErrorCode) {
            this.translateErrorCode = translateErrorCode;
            return this;
        }

        /**
         * TranslateErrorMessage.
         */
        public Builder translateErrorMessage(String translateErrorMessage) {
            this.translateErrorMessage = translateErrorMessage;
            return this;
        }

        /**
         * TranslateFileUrl.
         */
        public Builder translateFileUrl(String translateFileUrl) {
            this.translateFileUrl = translateFileUrl;
            return this;
        }

        public GetDocTranslateTaskResponseBody build() {
            return new GetDocTranslateTaskResponseBody(this);
        } 

    } 

}
