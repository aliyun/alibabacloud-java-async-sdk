// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link InstallSkillsRequest} extends {@link RequestModel}
 *
 * <p>InstallSkillsRequest</p>
 */
public class InstallSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    private java.util.List<String> skillIds;

    private InstallSkillsRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.skillIds = builder.skillIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return skillIds
     */
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public static final class Builder extends Request.Builder<InstallSkillsRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private java.util.List<String> skillIds; 

        private Builder() {
            super();
        } 

        private Builder(InstallSkillsRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.skillIds = request.skillIds;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * SkillIds.
         */
        public Builder skillIds(java.util.List<String> skillIds) {
            this.putQueryParameter("SkillIds", skillIds);
            this.skillIds = skillIds;
            return this;
        }

        @Override
        public InstallSkillsRequest build() {
            return new InstallSkillsRequest(this);
        } 

    } 

}
