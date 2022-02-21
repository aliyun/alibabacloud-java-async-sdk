// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsOrganizationRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevopsOrganizationRequest</p>
 */
public class DeleteDevopsOrganizationRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    private DeleteDevopsOrganizationRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevopsOrganizationRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDevopsOrganizationRequest, Builder> {
        private String orgId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevopsOrganizationRequest response) {
            super(response);
            this.orgId = response.orgId;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        @Override
        public DeleteDevopsOrganizationRequest build() {
            return new DeleteDevopsOrganizationRequest(this);
        } 

    } 

}
