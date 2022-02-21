// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionPrepublishRequest} extends {@link RequestModel}
 *
 * <p>CreateVersionPrepublishRequest</p>
 */
public class CreateVersionPrepublishRequest extends Request {
    @Query
    @NameInMap("BarrierCount")
    @Validation(required = true)
    private String barrierCount;

    @Query
    @NameInMap("IsTotalPrepublish")
    @Validation(required = true)
    private String isTotalPrepublish;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

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

    private CreateVersionPrepublishRequest(Builder builder) {
        super(builder);
        this.barrierCount = builder.barrierCount;
        this.isTotalPrepublish = builder.isTotalPrepublish;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.versionId = builder.versionId;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVersionPrepublishRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return barrierCount
     */
    public String getBarrierCount() {
        return this.barrierCount;
    }

    /**
     * @return isTotalPrepublish
     */
    public String getIsTotalPrepublish() {
        return this.isTotalPrepublish;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<CreateVersionPrepublishRequest, Builder> {
        private String barrierCount; 
        private String isTotalPrepublish; 
        private String name; 
        private String projectId; 
        private String regionId; 
        private String versionId; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(CreateVersionPrepublishRequest response) {
            super(response);
            this.barrierCount = response.barrierCount;
            this.isTotalPrepublish = response.isTotalPrepublish;
            this.name = response.name;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.versionId = response.versionId;
            this.versionType = response.versionType;
        } 

        /**
         * BarrierCount.
         */
        public Builder barrierCount(String barrierCount) {
            this.putQueryParameter("BarrierCount", barrierCount);
            this.barrierCount = barrierCount;
            return this;
        }

        /**
         * IsTotalPrepublish.
         */
        public Builder isTotalPrepublish(String isTotalPrepublish) {
            this.putQueryParameter("IsTotalPrepublish", isTotalPrepublish);
            this.isTotalPrepublish = isTotalPrepublish;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public CreateVersionPrepublishRequest build() {
            return new CreateVersionPrepublishRequest(this);
        } 

    } 

}
