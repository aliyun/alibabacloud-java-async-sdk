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
 * {@link ListAgentBySkillGroupIdRequest} extends {@link RequestModel}
 *
 * <p>ListAgentBySkillGroupIdRequest</p>
 */
public class ListAgentBySkillGroupIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long skillGroupId;

    private ListAgentBySkillGroupIdRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentBySkillGroupIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return skillGroupId
     */
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<ListAgentBySkillGroupIdRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private Long skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentBySkillGroupIdRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * <p>A unique ID for the Customer request. It is used for idempotency validation and can be generated using a UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The skill group ID.<br>You can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API and view the <strong>SkillGroupId</strong> in the response parameters to obtain the skill group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>666666</p>
         */
        public Builder skillGroupId(Long skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public ListAgentBySkillGroupIdRequest build() {
            return new ListAgentBySkillGroupIdRequest(this);
        } 

    } 

}
