// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartImageVulScanRequest} extends {@link RequestModel}
 *
 * <p>StartImageVulScanRequest</p>
 */
public class StartImageVulScanRequest extends Request {
    @Query
    @NameInMap("ImageDigest")
    private String imageDigest;

    @Query
    @NameInMap("ImageLayer")
    private String imageLayer;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegistryTypes")
    private java.util.List < String > registryTypes;

    @Query
    @NameInMap("RepName")
    private String repName;

    @Query
    @NameInMap("RepoId")
    private String repoId;

    @Query
    @NameInMap("RepoInstanceId")
    private String repoInstanceId;

    @Query
    @NameInMap("RepoNamespace")
    private String repoNamespace;

    @Query
    @NameInMap("RepoRegionId")
    private String repoRegionId;

    private StartImageVulScanRequest(Builder builder) {
        super(builder);
        this.imageDigest = builder.imageDigest;
        this.imageLayer = builder.imageLayer;
        this.imageTag = builder.imageTag;
        this.lang = builder.lang;
        this.registryTypes = builder.registryTypes;
        this.repName = builder.repName;
        this.repoId = builder.repoId;
        this.repoInstanceId = builder.repoInstanceId;
        this.repoNamespace = builder.repoNamespace;
        this.repoRegionId = builder.repoRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartImageVulScanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageDigest
     */
    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * @return imageLayer
     */
    public String getImageLayer() {
        return this.imageLayer;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return registryTypes
     */
    public java.util.List < String > getRegistryTypes() {
        return this.registryTypes;
    }

    /**
     * @return repName
     */
    public String getRepName() {
        return this.repName;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return repoInstanceId
     */
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoRegionId
     */
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public static final class Builder extends Request.Builder<StartImageVulScanRequest, Builder> {
        private String imageDigest; 
        private String imageLayer; 
        private String imageTag; 
        private String lang; 
        private java.util.List < String > registryTypes; 
        private String repName; 
        private String repoId; 
        private String repoInstanceId; 
        private String repoNamespace; 
        private String repoRegionId; 

        private Builder() {
            super();
        } 

        private Builder(StartImageVulScanRequest response) {
            super(response);
            this.imageDigest = response.imageDigest;
            this.imageLayer = response.imageLayer;
            this.imageTag = response.imageTag;
            this.lang = response.lang;
            this.registryTypes = response.registryTypes;
            this.repName = response.repName;
            this.repoId = response.repoId;
            this.repoInstanceId = response.repoInstanceId;
            this.repoNamespace = response.repoNamespace;
            this.repoRegionId = response.repoRegionId;
        } 

        /**
         * ImageDigest.
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * ImageLayer.
         */
        public Builder imageLayer(String imageLayer) {
            this.putQueryParameter("ImageLayer", imageLayer);
            this.imageLayer = imageLayer;
            return this;
        }

        /**
         * ImageTag.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegistryTypes.
         */
        public Builder registryTypes(java.util.List < String > registryTypes) {
            this.putQueryParameter("RegistryTypes", registryTypes);
            this.registryTypes = registryTypes;
            return this;
        }

        /**
         * RepName.
         */
        public Builder repName(String repName) {
            this.putQueryParameter("RepName", repName);
            this.repName = repName;
            return this;
        }

        /**
         * RepoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("RepoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * RepoInstanceId.
         */
        public Builder repoInstanceId(String repoInstanceId) {
            this.putQueryParameter("RepoInstanceId", repoInstanceId);
            this.repoInstanceId = repoInstanceId;
            return this;
        }

        /**
         * RepoNamespace.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * RepoRegionId.
         */
        public Builder repoRegionId(String repoRegionId) {
            this.putQueryParameter("RepoRegionId", repoRegionId);
            this.repoRegionId = repoRegionId;
            return this;
        }

        @Override
        public StartImageVulScanRequest build() {
            return new StartImageVulScanRequest(this);
        } 

    } 

}
