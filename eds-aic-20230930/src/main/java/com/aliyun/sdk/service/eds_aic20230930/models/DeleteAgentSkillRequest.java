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
 * {@link DeleteAgentSkillRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentSkillRequest</p>
 */
public class DeleteAgentSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    private java.util.List<String> skillIds;

    private DeleteAgentSkillRequest(Builder builder) {
        super(builder);
        this.skillIds = builder.skillIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skillIds
     */
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public static final class Builder extends Request.Builder<DeleteAgentSkillRequest, Builder> {
        private java.util.List<String> skillIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentSkillRequest request) {
            super(request);
            this.skillIds = request.skillIds;
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
        public DeleteAgentSkillRequest build() {
            return new DeleteAgentSkillRequest(this);
        } 

    } 

}
