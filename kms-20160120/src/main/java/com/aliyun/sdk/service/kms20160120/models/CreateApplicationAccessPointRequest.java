// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationAccessPointRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationAccessPointRequest</p>
 */
public class CreateApplicationAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationMethod")
    private String authenticationMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policies")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policies;

    private CreateApplicationAccessPointRequest(Builder builder) {
        super(builder);
        this.authenticationMethod = builder.authenticationMethod;
        this.description = builder.description;
        this.name = builder.name;
        this.policies = builder.policies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationMethod
     */
    public String getAuthenticationMethod() {
        return this.authenticationMethod;
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

    public static final class Builder extends Request.Builder<CreateApplicationAccessPointRequest, Builder> {
        private String authenticationMethod; 
        private String description; 
        private String name; 
        private String policies; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationAccessPointRequest request) {
            super(request);
            this.authenticationMethod = request.authenticationMethod;
            this.description = request.description;
            this.name = request.name;
            this.policies = request.policies;
        } 

        /**
         * The authentication method. Currently, only ClientKey is supported.
         */
        public Builder authenticationMethod(String authenticationMethod) {
            this.putQueryParameter("AuthenticationMethod", authenticationMethod);
            this.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * The description of the AAP.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the AAP.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The permission policy.
         * <p>
         * 
         * > You can bind up to three permission policies to each AAP.
         */
        public Builder policies(String policies) {
            this.putQueryParameter("Policies", policies);
            this.policies = policies;
            return this;
        }

        @Override
        public CreateApplicationAccessPointRequest build() {
            return new CreateApplicationAccessPointRequest(this);
        } 

    } 

}
