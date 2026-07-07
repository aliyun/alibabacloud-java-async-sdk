// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link DeleteTenantSkillsRequest} extends {@link RequestModel}
 *
 * <p>DeleteTenantSkillsRequest</p>
 */
public class DeleteTenantSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillChannel")
    private String skillChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    private java.util.List<String> skillIds;

    private DeleteTenantSkillsRequest(Builder builder) {
        super(builder);
        this.skillChannel = builder.skillChannel;
        this.skillIds = builder.skillIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTenantSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skillChannel
     */
    public String getSkillChannel() {
        return this.skillChannel;
    }

    /**
     * @return skillIds
     */
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public static final class Builder extends Request.Builder<DeleteTenantSkillsRequest, Builder> {
        private String skillChannel; 
        private java.util.List<String> skillIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTenantSkillsRequest request) {
            super(request);
            this.skillChannel = request.skillChannel;
            this.skillIds = request.skillIds;
        } 

        /**
         * SkillChannel.
         */
        public Builder skillChannel(String skillChannel) {
            this.putQueryParameter("SkillChannel", skillChannel);
            this.skillChannel = skillChannel;
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
        public DeleteTenantSkillsRequest build() {
            return new DeleteTenantSkillsRequest(this);
        } 

    } 

}
