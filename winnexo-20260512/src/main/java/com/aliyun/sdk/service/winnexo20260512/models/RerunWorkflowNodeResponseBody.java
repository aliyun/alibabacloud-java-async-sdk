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
 * {@link RerunWorkflowNodeResponseBody} extends {@link TeaModel}
 *
 * <p>RerunWorkflowNodeResponseBody</p>
 */
public class RerunWorkflowNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("affectedNodeKeys")
    private java.util.List<String> affectedNodeKeys;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("revision")
    private Long revision;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("stateVersion")
    private Long stateVersion;

    private RerunWorkflowNodeResponseBody(Builder builder) {
        this.affectedNodeKeys = builder.affectedNodeKeys;
        this.code = builder.code;
        this.message = builder.message;
        this.planId = builder.planId;
        this.requestId = builder.requestId;
        this.revision = builder.revision;
        this.runId = builder.runId;
        this.stateVersion = builder.stateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunWorkflowNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return affectedNodeKeys
     */
    public java.util.List<String> getAffectedNodeKeys() {
        return this.affectedNodeKeys;
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revision
     */
    public Long getRevision() {
        return this.revision;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return stateVersion
     */
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public static final class Builder {
        private java.util.List<String> affectedNodeKeys; 
        private String code; 
        private String message; 
        private String planId; 
        private String requestId; 
        private Long revision; 
        private String runId; 
        private Long stateVersion; 

        private Builder() {
        } 

        private Builder(RerunWorkflowNodeResponseBody model) {
            this.affectedNodeKeys = model.affectedNodeKeys;
            this.code = model.code;
            this.message = model.message;
            this.planId = model.planId;
            this.requestId = model.requestId;
            this.revision = model.revision;
            this.runId = model.runId;
            this.stateVersion = model.stateVersion;
        } 

        /**
         * <p>本次重跑影响的节点 key 列表，供调用方刷新；成功响应恒包含，错误响应可缺省</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;query.amount&quot;]</p>
         */
        public Builder affectedNodeKeys(java.util.List<String> affectedNodeKeys) {
            this.affectedNodeKeys = affectedNodeKeys;
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
         * <p>重跑后的当前物理计划ID；固定规划节点重跑可能生成新计划，后续查询应使用此值</p>
         * 
         * <strong>example:</strong>
         * <p>plan_new</p>
         */
        public Builder planId(String planId) {
            this.planId = planId;
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
         * <p>重跑后的当前计划修订号</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder revision(Long revision) {
            this.revision = revision;
            return this;
        }

        /**
         * <p>当前工作流运行ID，固定节点生成新 revision 时保持不变</p>
         * 
         * <strong>example:</strong>
         * <p>run_20261105_01</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>重跑被接受后的工作流状态版本</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        public RerunWorkflowNodeResponseBody build() {
            return new RerunWorkflowNodeResponseBody(this);
        } 

    } 

}
