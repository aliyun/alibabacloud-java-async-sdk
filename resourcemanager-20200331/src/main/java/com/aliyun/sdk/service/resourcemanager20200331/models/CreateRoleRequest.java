// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
    @Query
    @NameInMap("AssumeRolePolicyDocument")
    @Validation(required = true)
    private String assumeRolePolicyDocument;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("MaxSessionDuration")
    private Long maxSessionDuration;

    @Query
    @NameInMap("RoleName")
    @Validation(required = true)
    private String roleName;

    private CreateRoleRequest(Builder builder) {
        super(builder);
        this.assumeRolePolicyDocument = builder.assumeRolePolicyDocument;
        this.description = builder.description;
        this.maxSessionDuration = builder.maxSessionDuration;
        this.roleName = builder.roleName;
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
     * @return assumeRolePolicyDocument
     */
    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return maxSessionDuration
     */
    public Long getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<CreateRoleRequest, Builder> {
        private String assumeRolePolicyDocument; 
        private String description; 
        private Long maxSessionDuration; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoleRequest request) {
            super(request);
            this.assumeRolePolicyDocument = request.assumeRolePolicyDocument;
            this.description = request.description;
            this.maxSessionDuration = request.maxSessionDuration;
            this.roleName = request.roleName;
        } 

        /**
         * AssumeRolePolicyDocument.
         */
        public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.putQueryParameter("AssumeRolePolicyDocument", assumeRolePolicyDocument);
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
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
         * MaxSessionDuration.
         */
        public Builder maxSessionDuration(Long maxSessionDuration) {
            this.putQueryParameter("MaxSessionDuration", maxSessionDuration);
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public CreateRoleRequest build() {
            return new CreateRoleRequest(this);
        } 

    } 

}
