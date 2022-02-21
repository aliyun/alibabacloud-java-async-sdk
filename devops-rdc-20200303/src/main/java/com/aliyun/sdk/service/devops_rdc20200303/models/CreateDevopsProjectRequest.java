// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateDevopsProjectRequest</p>
 */
public class CreateDevopsProjectRequest extends Request {
    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    private CreateDevopsProjectRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.orgId = builder.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevopsProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    public static final class Builder extends Request.Builder<CreateDevopsProjectRequest, Builder> {
        private String description; 
        private String name; 
        private String orgId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevopsProjectRequest response) {
            super(response);
            this.description = response.description;
            this.name = response.name;
            this.orgId = response.orgId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
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
        public CreateDevopsProjectRequest build() {
            return new CreateDevopsProjectRequest(this);
        } 

    } 

}
