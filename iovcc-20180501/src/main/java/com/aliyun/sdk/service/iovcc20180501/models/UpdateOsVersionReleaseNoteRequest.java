// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsVersionReleaseNoteRequest} extends {@link RequestModel}
 *
 * <p>UpdateOsVersionReleaseNoteRequest</p>
 */
public class UpdateOsVersionReleaseNoteRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReleaseNote")
    @Validation(required = true)
    private String releaseNote;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private UpdateOsVersionReleaseNoteRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.releaseNote = builder.releaseNote;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOsVersionReleaseNoteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return releaseNote
     */
    public String getReleaseNote() {
        return this.releaseNote;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<UpdateOsVersionReleaseNoteRequest, Builder> {
        private String projectId; 
        private String regionId; 
        private String releaseNote; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOsVersionReleaseNoteRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.releaseNote = response.releaseNote;
            this.versionId = response.versionId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        /**
         * ReleaseNote.
         */
        public Builder releaseNote(String releaseNote) {
            this.putQueryParameter("ReleaseNote", releaseNote);
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public UpdateOsVersionReleaseNoteRequest build() {
            return new UpdateOsVersionReleaseNoteRequest(this);
        } 

    } 

}
