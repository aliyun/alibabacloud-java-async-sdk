// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyHybridMonitorNamespaceRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridMonitorNamespaceRequest</p>
 */
public class ModifyHybridMonitorNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
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
         * <p>The description of the namespace.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * <p>The name can contain letters, digits, and hyphens (-).</p>
         * <p>For information about how to obtain the name of a namespace, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
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
         * <p>The data retention period. Valid values:</p>
         * <ul>
         * <li>cms.s1.large: Data is stored for 15 days.</li>
         * <li>cms.s1.xlarge: Data is stored for 32 days.</li>
         * <li>cms.s1.2xlarge: Data is stored for 63 days.</li>
         * <li>cms.s1.3xlarge: Data is stored for 93 days.</li>
         * <li>cms.s1.6xlarge: Data is stored for 185 days.</li>
         * <li>cms.s1.12xlarge: Data is stored for 376 days.</li>
         * </ul>
         * <p>For information about the pricing for different retention periods, see the <strong>Pricing</strong> section in <a href="https://help.aliyun.com/document_detail/223532.html">Billing of the dashboard feature</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cms.s1.2xlarge</p>
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
