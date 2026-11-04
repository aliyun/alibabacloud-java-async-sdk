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
 * {@link ModifyPhoneTagsRequest} extends {@link RequestModel}
 *
 * <p>ModifyPhoneTagsRequest</p>
 */
public class ModifyPhoneTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
    private java.util.List<String> skillGroupIdList;

    private ModifyPhoneTagsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.serviceTag = builder.serviceTag;
        this.skillGroupIdList = builder.skillGroupIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPhoneTagsRequest create() {
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
     * @return serviceTag
     */
    public String getServiceTag() {
        return this.serviceTag;
    }

    /**
     * @return skillGroupIdList
     */
    public java.util.List<String> getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public static final class Builder extends Request.Builder<ModifyPhoneTagsRequest, Builder> {
        private String instanceId; 
        private String serviceTag; 
        private java.util.List<String> skillGroupIdList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPhoneTagsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.serviceTag = request.serviceTag;
            this.skillGroupIdList = request.skillGroupIdList;
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
         * <p>This parameter is required.</p>
         */
        public Builder serviceTag(String serviceTag) {
            this.putQueryParameter("ServiceTag", serviceTag);
            this.serviceTag = serviceTag;
            return this;
        }

        /**
         * SkillGroupIdList.
         */
        public Builder skillGroupIdList(java.util.List<String> skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        @Override
        public ModifyPhoneTagsRequest build() {
            return new ModifyPhoneTagsRequest(this);
        } 

    } 

}
