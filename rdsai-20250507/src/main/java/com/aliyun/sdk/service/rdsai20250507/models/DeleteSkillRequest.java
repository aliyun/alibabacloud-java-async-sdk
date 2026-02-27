// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DeleteSkillRequest} extends {@link RequestModel}
 *
 * <p>DeleteSkillRequest</p>
 */
public class DeleteSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillId;

    private DeleteSkillRequest(Builder builder) {
        super(builder);
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    public static final class Builder extends Request.Builder<DeleteSkillRequest, Builder> {
        private String skillId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSkillRequest request) {
            super(request);
            this.skillId = request.skillId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1fbb6d8b-8845-4e65-871e-48bc6830****</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        @Override
        public DeleteSkillRequest build() {
            return new DeleteSkillRequest(this);
        } 

    } 

}
