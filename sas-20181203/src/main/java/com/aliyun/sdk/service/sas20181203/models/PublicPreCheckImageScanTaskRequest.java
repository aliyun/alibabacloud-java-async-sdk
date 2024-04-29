// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublicPreCheckImageScanTaskRequest} extends {@link RequestModel}
 *
 * <p>PublicPreCheckImageScanTaskRequest</p>
 */
public class PublicPreCheckImageScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Digests")
    private String digests;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private String regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryTypes")
    private String registryTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoIds")
    private String repoIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNames")
    private String repoNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNamespaces")
    private String repoNamespaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private PublicPreCheckImageScanTaskRequest(Builder builder) {
        super(builder);
        this.digests = builder.digests;
        this.instanceIds = builder.instanceIds;
        this.regionIds = builder.regionIds;
        this.registryTypes = builder.registryTypes;
        this.repoIds = builder.repoIds;
        this.repoNames = builder.repoNames;
        this.repoNamespaces = builder.repoNamespaces;
        this.sourceIp = builder.sourceIp;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicPreCheckImageScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return digests
     */
    public String getDigests() {
        return this.digests;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionIds
     */
    public String getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return registryTypes
     */
    public String getRegistryTypes() {
        return this.registryTypes;
    }

    /**
     * @return repoIds
     */
    public String getRepoIds() {
        return this.repoIds;
    }

    /**
     * @return repoNames
     */
    public String getRepoNames() {
        return this.repoNames;
    }

    /**
     * @return repoNamespaces
     */
    public String getRepoNamespaces() {
        return this.repoNamespaces;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<PublicPreCheckImageScanTaskRequest, Builder> {
        private String digests; 
        private String instanceIds; 
        private String regionIds; 
        private String registryTypes; 
        private String repoIds; 
        private String repoNames; 
        private String repoNamespaces; 
        private String sourceIp; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(PublicPreCheckImageScanTaskRequest request) {
            super(request);
            this.digests = request.digests;
            this.instanceIds = request.instanceIds;
            this.regionIds = request.regionIds;
            this.registryTypes = request.registryTypes;
            this.repoIds = request.repoIds;
            this.repoNames = request.repoNames;
            this.repoNamespaces = request.repoNamespaces;
            this.sourceIp = request.sourceIp;
            this.tags = request.tags;
        } 

        /**
         * Digests.
         */
        public Builder digests(String digests) {
            this.putQueryParameter("Digests", digests);
            this.digests = digests;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * RegionIds.
         */
        public Builder regionIds(String regionIds) {
            this.putQueryParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * RegistryTypes.
         */
        public Builder registryTypes(String registryTypes) {
            this.putQueryParameter("RegistryTypes", registryTypes);
            this.registryTypes = registryTypes;
            return this;
        }

        /**
         * RepoIds.
         */
        public Builder repoIds(String repoIds) {
            this.putQueryParameter("RepoIds", repoIds);
            this.repoIds = repoIds;
            return this;
        }

        /**
         * RepoNames.
         */
        public Builder repoNames(String repoNames) {
            this.putQueryParameter("RepoNames", repoNames);
            this.repoNames = repoNames;
            return this;
        }

        /**
         * RepoNamespaces.
         */
        public Builder repoNamespaces(String repoNamespaces) {
            this.putQueryParameter("RepoNamespaces", repoNamespaces);
            this.repoNamespaces = repoNamespaces;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public PublicPreCheckImageScanTaskRequest build() {
            return new PublicPreCheckImageScanTaskRequest(this);
        } 

    } 

}
