// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CloseWorkflowTodosResponseBody} extends {@link TeaModel}
 *
 * <p>CloseWorkflowTodosResponseBody</p>
 */
public class CloseWorkflowTodosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cancelledCount")
    private Long cancelledCount;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sourceWorkflowId")
    private String sourceWorkflowId;

    private CloseWorkflowTodosResponseBody(Builder builder) {
        this.cancelledCount = builder.cancelledCount;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sourceWorkflowId = builder.sourceWorkflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseWorkflowTodosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelledCount
     */
    public Long getCancelledCount() {
        return this.cancelledCount;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return sourceWorkflowId
     */
    public String getSourceWorkflowId() {
        return this.sourceWorkflowId;
    }

    public static final class Builder {
        private Long cancelledCount; 
        private String code; 
        private String message; 
        private String requestId; 
        private String sourceWorkflowId; 

        private Builder() {
        } 

        private Builder(CloseWorkflowTodosResponseBody model) {
            this.cancelledCount = model.cancelledCount;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sourceWorkflowId = model.sourceWorkflowId;
        } 

        /**
         * <p>关闭条数（幂等重复调用为 0）</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder cancelledCount(Long cancelledCount) {
            this.cancelledCount = cancelledCount;
            return this;
        }

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>工作流 ID（原样回显）</p>
         * 
         * <strong>example:</strong>
         * <p>wf-1</p>
         */
        public Builder sourceWorkflowId(String sourceWorkflowId) {
            this.sourceWorkflowId = sourceWorkflowId;
            return this;
        }

        public CloseWorkflowTodosResponseBody build() {
            return new CloseWorkflowTodosResponseBody(this);
        } 

    } 

}
