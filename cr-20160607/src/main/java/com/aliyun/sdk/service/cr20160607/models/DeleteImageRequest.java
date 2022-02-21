// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageRequest</p>
 */
public class DeleteImageRequest extends Request {
    @Path
    @NameInMap("RepoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Path
    @NameInMap("Tag")
    @Validation(required = true)
    private String tag;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteImageRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteImageRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private String tag; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.tag = response.tag;
            this.regionId = response.regionId;
        } 

        /**
         * RepoNamespace.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putPathParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putPathParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putPathParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteImageRequest build() {
            return new DeleteImageRequest(this);
        } 

    } 

}
