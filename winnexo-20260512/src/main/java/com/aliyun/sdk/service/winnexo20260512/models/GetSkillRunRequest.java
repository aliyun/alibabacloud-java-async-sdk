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
 * {@link GetSkillRunRequest} extends {@link RequestModel}
 *
 * <p>GetSkillRunRequest</p>
 */
public class GetSkillRunRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeLogs")
    private Boolean includeLogs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetSkillRunRequest(Builder builder) {
        super(builder);
        this.includeLogs = builder.includeLogs;
        this.runId = builder.runId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeLogs
     */
    public Boolean getIncludeLogs() {
        return this.includeLogs;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetSkillRunRequest, Builder> {
        private Boolean includeLogs; 
        private String runId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillRunRequest request) {
            super(request);
            this.includeLogs = request.includeLogs;
            this.runId = request.runId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>是否附带执行日志（默认 false，仅在排查问题时建议开启）</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeLogs(Boolean includeLogs) {
            this.putBodyParameter("includeLogs", includeLogs);
            this.includeLogs = includeLogs;
            return this;
        }

        /**
         * <p>runSkill 返回的异步任务 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleRunId</p>
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetSkillRunRequest build() {
            return new GetSkillRunRequest(this);
        } 

    } 

}
