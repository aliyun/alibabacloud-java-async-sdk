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
 * {@link GetLoraNodesTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoraNodesTaskResponseBody</p>
 */
public class GetLoraNodesTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Long successCount;

    @com.aliyun.core.annotation.NameInMap("SuccessDevEuis")
    private SuccessDevEuis successDevEuis;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskState")
    private String taskState;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetLoraNodesTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.successCount = builder.successCount;
        this.successDevEuis = builder.successDevEuis;
        this.taskId = builder.taskId;
        this.taskState = builder.taskState;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoraNodesTaskResponseBody create() {
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

    /**
     * @return successCount
     */
    public Long getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return successDevEuis
     */
    public SuccessDevEuis getSuccessDevEuis() {
        return this.successDevEuis;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskState
     */
    public String getTaskState() {
        return this.taskState;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long successCount; 
        private SuccessDevEuis successDevEuis; 
        private String taskId; 
        private String taskState; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetLoraNodesTaskResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.successCount = model.successCount;
            this.successDevEuis = model.successDevEuis;
            this.taskId = model.taskId;
            this.taskState = model.taskState;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>A system exception occurred.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The number of devices that were created.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder successCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * SuccessDevEuis.
         */
        public Builder successDevEuis(SuccessDevEuis successDevEuis) {
            this.successDevEuis = successDevEuis;
            return this;
        }

        /**
         * <p>The task ID returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>625***</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task status.</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The task is in progress.</li>
         * <li><strong>FINISH</strong>: The task is completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder taskState(String taskState) {
            this.taskState = taskState;
            return this;
        }

        /**
         * <p>The total number of devices that you want to create.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetLoraNodesTaskResponseBody build() {
            return new GetLoraNodesTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoraNodesTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoraNodesTaskResponseBody</p>
     */
    public static class SuccessDevEuis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SuccessDevEui")
        private java.util.List<String> successDevEui;

        private SuccessDevEuis(Builder builder) {
            this.successDevEui = builder.successDevEui;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessDevEuis create() {
            return builder().build();
        }

        /**
         * @return successDevEui
         */
        public java.util.List<String> getSuccessDevEui() {
            return this.successDevEui;
        }

        public static final class Builder {
            private java.util.List<String> successDevEui; 

            private Builder() {
            } 

            private Builder(SuccessDevEuis model) {
                this.successDevEui = model.successDevEui;
            } 

            /**
             * SuccessDevEui.
             */
            public Builder successDevEui(java.util.List<String> successDevEui) {
                this.successDevEui = successDevEui;
                return this;
            }

            public SuccessDevEuis build() {
                return new SuccessDevEuis(this);
            } 

        } 

    }
}
