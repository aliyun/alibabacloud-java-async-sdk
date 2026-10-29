// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
         * <p>The description of the metric repository.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud product metric repository.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the metric repository.</p>
         * <p>Format: consists of lowercase letters, digits, and hyphens (-).</p>
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
         * <p>The region in which monitoring data is stored.</p>
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
         * <p>The storage solution for monitoring data. Valid values:</p>
         * <ul>
         * <li>aliyun_prometheus: monitoring data is stored in Managed Service for Prometheus.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about storage solutions for monitoring data, see <a href="https://help.aliyun.com/document_detail/2594921.html">Storage solutions for Hybrid Cloud Monitoring data</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyun_prometheus</p>
         */
        public Builder namespaceType(String namespaceType) {
            this.putQueryParameter("NamespaceType", namespaceType);
            this.namespaceType = namespaceType;
            return this;
        }

        /**
         * <p>The data storage duration. Valid values:</p>
         * <ul>
         * <li>cms.s1.large: storage duration of 15 days.</li>
         * <li>cms.s1.xlarge: storage duration of 32 days.</li>
         * <li>cms.s1.2xlarge: storage duration of 63 days.</li>
         * <li>cms.s1.3xlarge (default): storage duration of 93 days.</li>
         * <li>cms.s1.6xlarge: storage duration of 185 days.</li>
         * <li>cms.s1.12xlarge: storage duration of 376 days.</li>
         * </ul>
         * <p>For the pricing of different storage duration specifications, see the <strong>Pricing</strong> section in <a href="https://help.aliyun.com/document_detail/223532.html">monitoring dashboard</a>.</p>
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
