// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrunksOfSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ListTrunksOfSkillGroupRequest</p>
 */
public class ListTrunksOfSkillGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    private ListTrunksOfSkillGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrunksOfSkillGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<ListTrunksOfSkillGroupRequest, Builder> {
        private String instanceId; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListTrunksOfSkillGroupRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.skillGroupId = response.skillGroupId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public ListTrunksOfSkillGroupRequest build() {
            return new ListTrunksOfSkillGroupRequest(this);
        } 

    } 

}
