// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListSkillGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListSkillGroupsRequest</p>
 */
public class ListSkillGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private java.util.List<String> skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupName")
    private java.util.List<String> skillGroupName;

    private ListSkillGroupsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
        this.skillGroupName = builder.skillGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupsRequest create() {
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
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return skillGroupName
     */
    public java.util.List<String> getSkillGroupName() {
        return this.skillGroupName;
    }

    public static final class Builder extends Request.Builder<ListSkillGroupsRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> skillGroupId; 
        private java.util.List<String> skillGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillGroupsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
            this.skillGroupName = request.skillGroupName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(java.util.List<String> skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * SkillGroupName.
         */
        public Builder skillGroupName(java.util.List<String> skillGroupName) {
            this.putQueryParameter("SkillGroupName", skillGroupName);
            this.skillGroupName = skillGroupName;
            return this;
        }

        @Override
        public ListSkillGroupsRequest build() {
            return new ListSkillGroupsRequest(this);
        } 

    } 

}
