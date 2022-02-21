// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaMetaRequest} extends {@link RequestModel}
 *
 * <p>GetMediaMetaRequest</p>
 */
public class GetMediaMetaRequest extends Request {
    @Query
    @NameInMap("MediaUri")
    @Validation(required = true)
    private String mediaUri;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetMediaMetaRequest(Builder builder) {
        super(builder);
        this.mediaUri = builder.mediaUri;
        this.project = builder.project;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaUri
     */
    public String getMediaUri() {
        return this.mediaUri;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetMediaMetaRequest, Builder> {
        private String mediaUri; 
        private String project; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaMetaRequest response) {
            super(response);
            this.mediaUri = response.mediaUri;
            this.project = response.project;
            this.regionId = response.regionId;
        } 

        /**
         * MediaUri.
         */
        public Builder mediaUri(String mediaUri) {
            this.putQueryParameter("MediaUri", mediaUri);
            this.mediaUri = mediaUri;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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
        public GetMediaMetaRequest build() {
            return new GetMediaMetaRequest(this);
        } 

    } 

}
