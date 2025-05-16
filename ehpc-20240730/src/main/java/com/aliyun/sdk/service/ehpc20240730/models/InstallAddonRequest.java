// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link InstallAddonRequest} extends {@link RequestModel}
 *
 * <p>InstallAddonRequest</p>
 */
public class InstallAddonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourcesSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourcesSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicesSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String servicesSpec;

    private InstallAddonRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.addonVersion = builder.addonVersion;
        this.clusterId = builder.clusterId;
        this.resourcesSpec = builder.resourcesSpec;
        this.servicesSpec = builder.servicesSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAddonRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return addonVersion
     */
    public String getAddonVersion() {
        return this.addonVersion;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourcesSpec
     */
    public String getResourcesSpec() {
        return this.resourcesSpec;
    }

    /**
     * @return servicesSpec
     */
    public String getServicesSpec() {
        return this.servicesSpec;
    }

    public static final class Builder extends Request.Builder<InstallAddonRequest, Builder> {
        private String addonName; 
        private String addonVersion; 
        private String clusterId; 
        private String resourcesSpec; 
        private String servicesSpec; 

        private Builder() {
            super();
        } 

        private Builder(InstallAddonRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.addonVersion = request.addonVersion;
            this.clusterId = request.clusterId;
            this.resourcesSpec = request.resourcesSpec;
            this.servicesSpec = request.servicesSpec;
        } 

        /**
         * <p>The addon name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * <p>The addon version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder addonVersion(String addonVersion) {
            this.putQueryParameter("AddonVersion", addonVersion);
            this.addonVersion = addonVersion;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The resource configurations of the addon.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><code>{&quot;EipResource&quot;: {&quot;AutoCreate&quot;: true}, &quot;EcsResources&quot;: [{&quot;InstanceType&quot;: &quot;ecs.c7.xlarge&quot;, &quot;ImageId&quot;: &quot;centos_7_6_xxx.vhd&quot;, &quot;SystemDisk&quot;: {&quot;Category&quot;: &quot;cloud_essd&quot;, &quot;Size&quot;: 40, &quot;Level&quot;: &quot;PL0&quot;}]}</code></p>
         */
        public Builder resourcesSpec(String resourcesSpec) {
            this.putQueryParameter("ResourcesSpec", resourcesSpec);
            this.resourcesSpec = resourcesSpec;
            return this;
        }

        /**
         * <p>The service configurations of the addon.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><code>[{&quot;ServiceName&quot;: &quot;SSH&quot;, &quot;ServiceAccessType&quot;: null, &quot;ServiceAccessUrl&quot;: null, &quot;NetworkACL&quot;: [{&quot;IpProtocol&quot;: &quot;TCP&quot;, &quot;Port&quot;: 22, &quot;SourceCidrIp&quot;: &quot;0.0.0.0/0&quot;}]}, {&quot;ServiceName&quot;: &quot;VNC&quot;, &quot;ServiceAccessType&quot;: null, &quot;ServiceAccessUrl&quot;: null, &quot;NetworkACL&quot;: [{&quot;IpProtocol&quot;: &quot;TCP&quot;, &quot;Port&quot;: 12016, &quot;SourceCidrIp&quot;: &quot;0.0.0.0/0&quot;}]}]</code></p>
         */
        public Builder servicesSpec(String servicesSpec) {
            this.putQueryParameter("ServicesSpec", servicesSpec);
            this.servicesSpec = servicesSpec;
            return this;
        }

        @Override
        public InstallAddonRequest build() {
            return new InstallAddonRequest(this);
        } 

    } 

}
