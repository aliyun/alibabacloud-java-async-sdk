// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHybridMonitorNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridMonitorNamespaceRequest</p>
 */
public class CreateHybridMonitorNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceRegion")
    private String namespaceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceType")
    private String namespaceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
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
         * <p>The description of the namespace.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>The name can contain lowercase letters, digits, and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The region where the metric data is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder namespaceRegion(String namespaceRegion) {
            this.putQueryParameter("NamespaceRegion", namespaceRegion);
            this.namespaceRegion = namespaceRegion;
            return this;
        }

        /**
         * <p>The storage scheme of metric data. Valid values:</p>
         * <ul>
         * <li>m_prom_user: The metric data is stored in Simple Log Service.</li>
         * <li>m_prom_pool: The metric data is stored in the private storage space provided by CloudMonitor.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about the storage schemes of metric data, see <a href="https://help.aliyun.com/document_detail/2594921.html">Data storage schemes for Hybrid Cloud Monitoring</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>m_prometheus</p>
         */
        public Builder namespaceType(String namespaceType) {
            this.putQueryParameter("NamespaceType", namespaceType);
            this.namespaceType = namespaceType;
            return this;
        }

        /**
         * <p>The data retention period. Valid values:</p>
         * <ul>
         * <li>cms.s1.large (Retention Period 15 Days)</li>
         * <li>cms.s1.xlarge (Retention Period 32 Days)</li>
         * <li>cms.s1.2xlarge (Retention Period 63 Days)</li>
         * <li>cms.s1.3xlarge (Retention Period 93 Days) (default)</li>
         * <li>cms.s1.6xlarge (Retention Period 185 Days)</li>
         * <li>cms.s1.12xlarge (Retention Period 367 Days)</li>
         * </ul>
         * <p>For information about the pricing for different retention periods, see the <strong>Pricing</strong> section in <a href="https://help.aliyun.com/document_detail/223532.html">Billing of the dashboard feature</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cms.s1.3xlarge</p>
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
