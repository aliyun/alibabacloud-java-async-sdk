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
 * {@link UninstallSkillsRequest} extends {@link RequestModel}
 *
 * <p>UninstallSkillsRequest</p>
 */
public class UninstallSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    private java.util.List<String> skillIds;

    private UninstallSkillsRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.skillIds = builder.skillIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallSkillsRequest create() {
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

    public static final class Builder extends Request.Builder<UninstallSkillsRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private java.util.List<String> skillIds; 

        private Builder() {
            super();
        } 

        private Builder(UninstallSkillsRequest request) {
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
        public UninstallSkillsRequest build() {
            return new UninstallSkillsRequest(this);
        } 

    } 

}
