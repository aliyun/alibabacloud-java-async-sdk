// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityGroupRequest</p>
 */
public class CreateSecurityGroupRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private CreateSecurityGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.securityGroupName = builder.securityGroupName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityGroupRequest create() {
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
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<CreateSecurityGroupRequest, Builder> {
        private String description; 
        private String securityGroupName; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityGroupRequest request) {
            super(request);
            this.description = request.description;
            this.securityGroupName = request.securityGroupName;
            this.version = request.version;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * SecurityGroupName.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public CreateSecurityGroupRequest build() {
            return new CreateSecurityGroupRequest(this);
        } 

    } 

}
