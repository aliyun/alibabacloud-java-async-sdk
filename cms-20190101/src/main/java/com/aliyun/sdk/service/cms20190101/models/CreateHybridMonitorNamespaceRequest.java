// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHybridMonitorNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridMonitorNamespaceRequest</p>
 */
public class CreateHybridMonitorNamespaceRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceRegion")
    private String namespaceRegion;

    @Query
    @NameInMap("NamespaceType")
    private String namespaceType;

    @Query
    @NameInMap("Spec")
    private String spec;

    private CreateHybridMonitorNamespaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.namespace = builder.namespace;
        this.namespaceRegion = builder.namespaceRegion;
        this.namespaceType = builder.namespaceType;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridMonitorNamespaceRequest create() {
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
     * @return namespaceRegion
     */
    public String getNamespaceRegion() {
        return this.namespaceRegion;
    }

    /**
     * @return namespaceType
     */
    public String getNamespaceType() {
        return this.namespaceType;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<CreateHybridMonitorNamespaceRequest, Builder> {
        private String description; 
        private String namespace; 
        private String namespaceRegion; 
        private String namespaceType; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridMonitorNamespaceRequest request) {
            super(request);
            this.description = request.description;
            this.namespace = request.namespace;
            this.namespaceRegion = request.namespaceRegion;
            this.namespaceType = request.namespaceType;
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
         * The name can contain lowercase letters, digits, and hyphens (-).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The region where the metric data is stored.
         */
        public Builder namespaceRegion(String namespaceRegion) {
            this.putQueryParameter("NamespaceRegion", namespaceRegion);
            this.namespaceRegion = namespaceRegion;
            return this;
        }

        /**
         * The storage scheme of metric data. Valid values:
         * <p>
         * 
         * *   m_prom_pool: The metric data is stored in Simple Log Service.
         * *   m_prometheus: The metric data is stored in the storage space provided by CloudMonitor.
         * 
         * >  For more information about the storage schemes of metric data, see [Storage schemes of metric data in Hybrid Cloud Monitoring](~~2594921~~).
         */
        public Builder namespaceType(String namespaceType) {
            this.putQueryParameter("NamespaceType", namespaceType);
            this.namespaceType = namespaceType;
            return this;
        }

        /**
         * The data retention period. Valid values:
         * <p>
         * 
         * *   cms.s1.large (Retention Period 15 Days)
         * *   cms.s1.xlarge (Retention Period 32 Days)
         * *   cms.s1.2xlarge (Retention Period 63 Days)
         * *   cms.s1.3xlarge (Retention Period 93 Days) (default)
         * *   cms.s1.6xlarge (Retention Period 185 Days)
         * *   cms.s1.12xlarge (Retention Period 367 Days)
         * 
         * For information about the pricing for different retention periods, see the **Pricing** section in [Billing of the dashboard feature](~~223532~~).
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public CreateHybridMonitorNamespaceRequest build() {
            return new CreateHybridMonitorNamespaceRequest(this);
        } 

    } 

}
