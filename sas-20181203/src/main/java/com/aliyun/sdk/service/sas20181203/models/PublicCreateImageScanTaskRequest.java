// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link PublicCreateImageScanTaskRequest} extends {@link RequestModel}
 *
 * <p>PublicCreateImageScanTaskRequest</p>
 */
public class PublicCreateImageScanTaskRequest extends Request {
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

    private PublicCreateImageScanTaskRequest(Builder builder) {
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

    public static PublicCreateImageScanTaskRequest create() {
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

    public static final class Builder extends Request.Builder<PublicCreateImageScanTaskRequest, Builder> {
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

        private Builder(PublicCreateImageScanTaskRequest request) {
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
         * <p>The SHA-256 value of the image digest. Separate multiple SHA-256 values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>6a5e103187b31a94592a47a5858617f7a6c</p>
         */
        public Builder digests(String digests) {
            this.putQueryParameter("Digests", digests);
            this.digests = digests;
            return this;
        }

        /**
         * <p>The ID of the Container Registry instance in which the image repository is created. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6j8vq9l4r5ntht****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The region ID of the image. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionIds(String regionIds) {
            this.putQueryParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The type of the image repository. Separate multiple types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>acr</strong></li>
         * <li><strong>harbor</strong></li>
         * <li><strong>quay</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acr</p>
         */
        public Builder registryTypes(String registryTypes) {
            this.putQueryParameter("RegistryTypes", registryTypes);
            this.registryTypes = registryTypes;
            return this;
        }

        /**
         * <p>The ID of the image repository. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>crr-vridcl4****</p>
         */
        public Builder repoIds(String repoIds) {
            this.putQueryParameter("RepoIds", repoIds);
            this.repoIds = repoIds;
            return this;
        }

        /**
         * <p>The name of the image repository. Separate multiple names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>centos</p>
         */
        public Builder repoNames(String repoNames) {
            this.putQueryParameter("RepoNames", repoNames);
            this.repoNames = repoNames;
            return this;
        }

        /**
         * <p>The namespace to which the image repository belongs. Separate multiple namespaces with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>hanghai-namespace</p>
         */
        public Builder repoNamespaces(String repoNamespaces) {
            this.putQueryParameter("RepoNamespaces", repoNamespaces);
            this.repoNamespaces = repoNamespaces;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168..XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The tag that is added to the image. Separate multiple tags with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public PublicCreateImageScanTaskRequest build() {
            return new PublicCreateImageScanTaskRequest(this);
        } 

    } 

}
