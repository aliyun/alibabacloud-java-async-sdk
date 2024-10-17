// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BackFillResponseBody} extends {@link TeaModel}
 *
 * <p>BackFillResponseBody</p>
 */
public class BackFillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DagInstanceId")
    private Long dagInstanceId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private Long nodeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BackFillResponseBody(Builder builder) {
        this.dagInstanceId = builder.dagInstanceId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nodeId = builder.nodeId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackFillResponseBody create() {
        return builder().build();
    }

    /**
     * @return dagInstanceId
     */
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
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
        private Long dagInstanceId; 
        private String errorCode; 
        private String errorMessage; 
        private Long nodeId; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The ID of the execution record of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>47****</p>
         */
        public Builder dagInstanceId(Long dagInstanceId) {
            this.dagInstanceId = dagInstanceId;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>43****</p>
         */
        public Builder nodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BackFillResponseBody build() {
            return new BackFillResponseBody(this);
        } 

    } 

}
