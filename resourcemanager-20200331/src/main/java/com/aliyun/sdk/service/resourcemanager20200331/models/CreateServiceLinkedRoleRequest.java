// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceLinkedRoleRequest</p>
 */
public class CreateServiceLinkedRoleRequest extends Request {
    @Query
    @NameInMap("CustomSuffix")
    private String customSuffix;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private CreateServiceLinkedRoleRequest(Builder builder) {
        super(builder);
        this.customSuffix = builder.customSuffix;
        this.description = builder.description;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customSuffix
     */
    public String getCustomSuffix() {
        return this.customSuffix;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<CreateServiceLinkedRoleRequest, Builder> {
        private String customSuffix; 
        private String description; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceLinkedRoleRequest request) {
            super(request);
            this.customSuffix = request.customSuffix;
            this.description = request.description;
            this.serviceName = request.serviceName;
        } 

        /**
         * CustomSuffix.
         */
        public Builder customSuffix(String customSuffix) {
            this.putQueryParameter("CustomSuffix", customSuffix);
            this.customSuffix = customSuffix;
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
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public CreateServiceLinkedRoleRequest build() {
            return new CreateServiceLinkedRoleRequest(this);
        } 

    } 

}
