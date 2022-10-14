// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateRoleRequest</p>
 */
public class CreateRoleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("body")
    private RoleInput body;

    private CreateRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public RoleInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateRoleRequest, Builder> {
        private String regionId; 
        private RoleInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.body = request.body;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(RoleInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateRoleRequest build() {
            return new CreateRoleRequest(this);
        } 

    } 

}
