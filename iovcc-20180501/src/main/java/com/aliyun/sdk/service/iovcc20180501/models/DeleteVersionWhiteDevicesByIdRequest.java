// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVersionWhiteDevicesByIdRequest} extends {@link RequestModel}
 *
 * <p>DeleteVersionWhiteDevicesByIdRequest</p>
 */
public class DeleteVersionWhiteDevicesByIdRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    @Query
    @NameInMap("VersionType")
    @Validation(required = true)
    private String versionType;

    private DeleteVersionWhiteDevicesByIdRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.versionId = builder.versionId;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVersionWhiteDevicesByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
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
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionType
     */
    public String getVersionType() {
        return this.versionType;
    }

    public static final class Builder extends Request.Builder<DeleteVersionWhiteDevicesByIdRequest, Builder> {
        private String ids; 
        private String projectId; 
        private String regionId; 
        private String versionId; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVersionWhiteDevicesByIdRequest response) {
            super(response);
            this.ids = response.ids;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.versionId = response.versionId;
            this.versionType = response.versionType;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
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
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * VersionType.
         */
        public Builder versionType(String versionType) {
            this.putQueryParameter("VersionType", versionType);
            this.versionType = versionType;
            return this;
        }

        @Override
        public DeleteVersionWhiteDevicesByIdRequest build() {
            return new DeleteVersionWhiteDevicesByIdRequest(this);
        } 

    } 

}
