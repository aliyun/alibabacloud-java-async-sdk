// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceSystemUpdateFunnelEventsRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceSystemUpdateFunnelEventsRequest</p>
 */
public class GetDeviceSystemUpdateFunnelEventsRequest extends Request {
    @Query
    @NameInMap("IdType")
    private String idType;

    @Query
    @NameInMap("OriginalId")
    private String originalId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TargetVersion")
    private String targetVersion;

    private GetDeviceSystemUpdateFunnelEventsRequest(Builder builder) {
        super(builder);
        this.idType = builder.idType;
        this.originalId = builder.originalId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceSystemUpdateFunnelEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idType
     */
    public String getIdType() {
        return this.idType;
    }

    /**
     * @return originalId
     */
    public String getOriginalId() {
        return this.originalId;
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
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder extends Request.Builder<GetDeviceSystemUpdateFunnelEventsRequest, Builder> {
        private String idType; 
        private String originalId; 
        private String projectId; 
        private String regionId; 
        private String targetVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceSystemUpdateFunnelEventsRequest response) {
            super(response);
            this.idType = response.idType;
            this.originalId = response.originalId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.targetVersion = response.targetVersion;
        } 

        /**
         * IdType.
         */
        public Builder idType(String idType) {
            this.putQueryParameter("IdType", idType);
            this.idType = idType;
            return this;
        }

        /**
         * OriginalId.
         */
        public Builder originalId(String originalId) {
            this.putQueryParameter("OriginalId", originalId);
            this.originalId = originalId;
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
         * TargetVersion.
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        @Override
        public GetDeviceSystemUpdateFunnelEventsRequest build() {
            return new GetDeviceSystemUpdateFunnelEventsRequest(this);
        } 

    } 

}
