// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationAccessPointRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationAccessPointRequest</p>
 */
public class UpdateApplicationAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policies")
    private String policies;

    private UpdateApplicationAccessPointRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.policies = builder.policies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationAccessPointRequest create() {
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
     * @return policies
     */
    public String getPolicies() {
        return this.policies;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationAccessPointRequest, Builder> {
        private String description; 
        private String name; 
        private String policies; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationAccessPointRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.policies = request.policies;
        } 

        /**
         * The description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the AAP that you want to update.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The permission policy that you want to update.
         * <p>
         * > You can associate up to three permission policies with each AAP.
         */
        public Builder policies(String policies) {
            this.putQueryParameter("Policies", policies);
            this.policies = policies;
            return this;
        }

        @Override
        public UpdateApplicationAccessPointRequest build() {
            return new UpdateApplicationAccessPointRequest(this);
        } 

    } 

}
