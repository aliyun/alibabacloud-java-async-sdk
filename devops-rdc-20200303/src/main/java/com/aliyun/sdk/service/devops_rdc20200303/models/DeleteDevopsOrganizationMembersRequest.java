// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsOrganizationMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevopsOrganizationMembersRequest</p>
 */
public class DeleteDevopsOrganizationMembersRequest extends Request {
    @Body
    @NameInMap("OrgId")
    private String orgId;

    @Body
    @NameInMap("RealPk")
    private String realPk;

    @Body
    @NameInMap("UserId")
    private String userId;

    private DeleteDevopsOrganizationMembersRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.realPk = builder.realPk;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevopsOrganizationMembersRequest create() {
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
     * @return realPk
     */
    public String getRealPk() {
        return this.realPk;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteDevopsOrganizationMembersRequest, Builder> {
        private String orgId; 
        private String realPk; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevopsOrganizationMembersRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.realPk = response.realPk;
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
         * RealPk.
         */
        public Builder realPk(String realPk) {
            this.putBodyParameter("RealPk", realPk);
            this.realPk = realPk;
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
        public DeleteDevopsOrganizationMembersRequest build() {
            return new DeleteDevopsOrganizationMembersRequest(this);
        } 

    } 

}
