// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridMonitorNamespaceRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridMonitorNamespaceRequest</p>
 */
public class ModifyHybridMonitorNamespaceRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Spec")
    private String spec;

    private ModifyHybridMonitorNamespaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.namespace = builder.namespace;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridMonitorNamespaceRequest create() {
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
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<ModifyHybridMonitorNamespaceRequest, Builder> {
        private String description; 
        private String namespace; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridMonitorNamespaceRequest request) {
            super(request);
            this.description = request.description;
            this.namespace = request.namespace;
            this.spec = request.spec;
        } 

        /**
         * The description of the namespace.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the namespace.
         * <p>
         * 
         * The name can contain letters, digits, and hyphens (-).
         * 
         * For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The data retention period. Valid values:
         * <p>
         * 
         * *   cms.s1.large: Data is stored for 15 days.
         * *   cms.s1.xlarge: Data is stored for 32 days.
         * *   cms.s1.2xlarge: Data is stored for 63 days.
         * *   cms.s1.3xlarge: Data is stored for 93 days.
         * *   cms.s1.6xlarge: Data is stored for 185 days.
         * *   cms.s1.12xlarge: Data is stored for 376 days.
         * 
         * For information about the pricing for different retention periods, see the **Pricing** section in [Billing of the dashboard feature](~~223532~~).
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public ModifyHybridMonitorNamespaceRequest build() {
            return new ModifyHybridMonitorNamespaceRequest(this);
        } 

    } 

}
