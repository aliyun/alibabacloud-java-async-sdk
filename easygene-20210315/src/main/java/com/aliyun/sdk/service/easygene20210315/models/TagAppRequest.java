// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagAppRequest} extends {@link RequestModel}
 *
 * <p>TagAppRequest</p>
 */
public class TagAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppRevision")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appRevision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevisionTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String revisionTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private TagAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.appRevision = builder.appRevision;
        this.revisionTag = builder.revisionTag;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appRevision
     */
    public String getAppRevision() {
        return this.appRevision;
    }

    /**
     * @return revisionTag
     */
    public String getRevisionTag() {
        return this.revisionTag;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<TagAppRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String appRevision; 
        private String revisionTag; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(TagAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.appRevision = request.appRevision;
            this.revisionTag = request.revisionTag;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppRevision.
         */
        public Builder appRevision(String appRevision) {
            this.putQueryParameter("AppRevision", appRevision);
            this.appRevision = appRevision;
            return this;
        }

        /**
         * RevisionTag.
         */
        public Builder revisionTag(String revisionTag) {
            this.putQueryParameter("RevisionTag", revisionTag);
            this.revisionTag = revisionTag;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public TagAppRequest build() {
            return new TagAppRequest(this);
        } 

    } 

}
