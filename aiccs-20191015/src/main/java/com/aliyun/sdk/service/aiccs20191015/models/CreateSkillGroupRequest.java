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
 * {@link CreateSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillGroupRequest</p>
 */
public class CreateSkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 7)
    private Integer channelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    private Long departmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupName;

    private CreateSkillGroupRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.clientToken = builder.clientToken;
        this.departmentId = builder.departmentId;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.instanceId = builder.instanceId;
        this.skillGroupName = builder.skillGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public Integer getChannelType() {
        return this.channelType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return skillGroupName
     */
    public String getSkillGroupName() {
        return this.skillGroupName;
    }

    public static final class Builder extends Request.Builder<CreateSkillGroupRequest, Builder> {
        private Integer channelType; 
        private String clientToken; 
        private Long departmentId; 
        private String description; 
        private String displayName; 
        private String instanceId; 
        private String skillGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillGroupRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.clientToken = request.clientToken;
            this.departmentId = request.departmentId;
            this.description = request.description;
            this.displayName = request.displayName;
            this.instanceId = request.instanceId;
            this.skillGroupName = request.skillGroupName;
        } 

        /**
         * <p>Channel type of the skill group. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Hotline.</li>
         * <li><strong>2</strong>: Online.</li>
         * <li><strong>3</strong>: Ticket.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder channelType(Integer channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it using UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-****-70b6a298d94d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder departmentId(Long departmentId) {
            this.putBodyParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * <p>Skill group description.</p>
         * 
         * <strong>example:</strong>
         * <p>在线自动化技能组</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>External display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>在线自动化技能组</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Skill group name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>在线自动化技能组</p>
         */
        public Builder skillGroupName(String skillGroupName) {
            this.putBodyParameter("SkillGroupName", skillGroupName);
            this.skillGroupName = skillGroupName;
            return this;
        }

        @Override
        public CreateSkillGroupRequest build() {
            return new CreateSkillGroupRequest(this);
        } 

    } 

}
