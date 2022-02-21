// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserNameRequest} extends {@link RequestModel}
 *
 * <p>GetUserNameRequest</p>
 */
public class GetUserNameRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GetUserNameRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetUserNameRequest, Builder> {
        private String orgId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserNameRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.userId = response.userId;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetUserNameRequest build() {
            return new GetUserNameRequest(this);
        } 

    } 

}
