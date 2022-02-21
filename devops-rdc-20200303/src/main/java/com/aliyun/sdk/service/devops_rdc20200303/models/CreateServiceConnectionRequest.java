// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceConnectionRequest</p>
 */
public class CreateServiceConnectionRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ServiceConnectionType")
    @Validation(required = true)
    private String serviceConnectionType;

    @Body
    @NameInMap("UserPk")
    private String userPk;

    private CreateServiceConnectionRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.serviceConnectionType = builder.serviceConnectionType;
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceConnectionRequest create() {
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
     * @return serviceConnectionType
     */
    public String getServiceConnectionType() {
        return this.serviceConnectionType;
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<CreateServiceConnectionRequest, Builder> {
        private String orgId; 
        private String serviceConnectionType; 
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceConnectionRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.serviceConnectionType = response.serviceConnectionType;
            this.userPk = response.userPk;
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
         * ServiceConnectionType.
         */
        public Builder serviceConnectionType(String serviceConnectionType) {
            this.putBodyParameter("ServiceConnectionType", serviceConnectionType);
            this.serviceConnectionType = serviceConnectionType;
            return this;
        }

        /**
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public CreateServiceConnectionRequest build() {
            return new CreateServiceConnectionRequest(this);
        } 

    } 

}
