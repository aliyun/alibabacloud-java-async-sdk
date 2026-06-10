// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetSkillSpaceRequest} extends {@link RequestModel}
 *
 * <p>GetSkillSpaceRequest</p>
 */
public class GetSkillSpaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillSpaceId;

    private GetSkillSpaceRequest(Builder builder) {
        super(builder);
        this.skillSpaceId = builder.skillSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillSpaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skillSpaceId
     */
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    public static final class Builder extends Request.Builder<GetSkillSpaceRequest, Builder> {
        private String skillSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillSpaceRequest request) {
            super(request);
            this.skillSpaceId = request.skillSpaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder skillSpaceId(String skillSpaceId) {
            this.putQueryParameter("SkillSpaceId", skillSpaceId);
            this.skillSpaceId = skillSpaceId;
            return this;
        }

        @Override
        public GetSkillSpaceRequest build() {
            return new GetSkillSpaceRequest(this);
        } 

    } 

}
