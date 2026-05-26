// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentexplorer20260317.models;

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
 * {@link GetSkillContentRequest} extends {@link RequestModel}
 *
 * <p>GetSkillContentRequest</p>
 */
public class GetSkillContentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    private GetSkillContentRequest(Builder builder) {
        super(builder);
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    public static final class Builder extends Request.Builder<GetSkillContentRequest, Builder> {
        private String skillName; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillContentRequest request) {
            super(request);
            this.skillName = request.skillName;
        } 

        /**
         * <p>skill name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-manager</p>
         */
        public Builder skillName(String skillName) {
            this.putPathParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        @Override
        public GetSkillContentRequest build() {
            return new GetSkillContentRequest(this);
        } 

    } 

}
