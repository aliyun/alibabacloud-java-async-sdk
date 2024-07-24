// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCmsExporterRequest} extends {@link RequestModel}
 *
 * <p>InstallCmsExporterRequest</p>
 */
public class InstallCmsExporterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmsArgs")
    private String cmsArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectArgs")
    private String directArgs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTag")
    private Boolean enableTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private InstallCmsExporterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.cmsArgs = builder.cmsArgs;
        this.directArgs = builder.directArgs;
        this.enableTag = builder.enableTag;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallCmsExporterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cmsArgs
     */
    public String getCmsArgs() {
        return this.cmsArgs;
    }

    /**
     * @return directArgs
     */
    public String getDirectArgs() {
        return this.directArgs;
    }

    /**
     * @return enableTag
     */
    public Boolean getEnableTag() {
        return this.enableTag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InstallCmsExporterRequest, Builder> {
        private String clusterId; 
        private String cmsArgs; 
        private String directArgs; 
        private Boolean enableTag; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InstallCmsExporterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.cmsArgs = request.cmsArgs;
            this.directArgs = request.directArgs;
            this.enableTag = request.enableTag;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The cloud services that you want to monitor. The CmsArgs parameter is the startup parameter of the cms-exporter collector. Separate multiple cloud services with number signs (`#`).
         */
        public Builder cmsArgs(String cmsArgs) {
            this.putQueryParameter("CmsArgs", cmsArgs);
            this.cmsArgs = cmsArgs;
            return this;
        }

        /**
         * The recently monitored cloud services. Separate multiple cloud services with number signs (`#`).
         */
        public Builder directArgs(String directArgs) {
            this.putQueryParameter("DirectArgs", directArgs);
            this.directArgs = directArgs;
            return this;
        }

        /**
         * Specifies whether to collect the aliyun tags attached to each cloud service. Default value: false.
         */
        public Builder enableTag(Boolean enableTag) {
            this.putQueryParameter("EnableTag", enableTag);
            this.enableTag = enableTag;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InstallCmsExporterRequest build() {
            return new InstallCmsExporterRequest(this);
        } 

    } 

}
