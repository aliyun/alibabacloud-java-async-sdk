// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDingtalkGroupRequest} extends {@link RequestModel}
 *
 * <p>GetEnterpriseDingtalkGroupRequest</p>
 */
public class GetEnterpriseDingtalkGroupRequest extends Request {
    @Body
    @NameInMap("OpenGroupId")
    @Validation(required = true)
    private String openGroupId;

    private GetEnterpriseDingtalkGroupRequest(Builder builder) {
        super(builder);
        this.openGroupId = builder.openGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseDingtalkGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public static final class Builder extends Request.Builder<GetEnterpriseDingtalkGroupRequest, Builder> {
        private String openGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetEnterpriseDingtalkGroupRequest response) {
            super(response);
            this.openGroupId = response.openGroupId;
        } 

        /**
         * OpenGroupId.
         */
        public Builder openGroupId(String openGroupId) {
            this.putBodyParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        @Override
        public GetEnterpriseDingtalkGroupRequest build() {
            return new GetEnterpriseDingtalkGroupRequest(this);
        } 

    } 

}
