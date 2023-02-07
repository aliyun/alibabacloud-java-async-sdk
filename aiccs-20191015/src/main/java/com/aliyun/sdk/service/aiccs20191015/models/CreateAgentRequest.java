// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAgentRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRequest</p>
 */
public class CreateAgentRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("SkillGroupId")
    private java.util.List < Long > skillGroupId;

    @Body
    @NameInMap("SkillGroupIdList")
    private java.util.List < Long > skillGroupIdList;

    private CreateAgentRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clientToken = builder.clientToken;
        this.displayName = builder.displayName;
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
        this.skillGroupIdList = builder.skillGroupIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return skillGroupId
     */
    public java.util.List < Long > getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return skillGroupIdList
     */
    public java.util.List < Long > getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public static final class Builder extends Request.Builder<CreateAgentRequest, Builder> {
        private String accountName; 
        private String clientToken; 
        private String displayName; 
        private String instanceId; 
        private java.util.List < Long > skillGroupId; 
        private java.util.List < Long > skillGroupIdList; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clientToken = request.clientToken;
            this.displayName = request.displayName;
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
            this.skillGroupIdList = request.skillGroupIdList;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * js sdk中自动生成的鉴权token
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(java.util.List < Long > skillGroupId) {
            this.putBodyParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * SkillGroupIdList.
         */
        public Builder skillGroupIdList(java.util.List < Long > skillGroupIdList) {
            this.putBodyParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        @Override
        public CreateAgentRequest build() {
            return new CreateAgentRequest(this);
        } 

    } 

}
