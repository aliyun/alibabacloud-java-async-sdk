// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectAppRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectAppRequest</p>
 */
public class CreateProjectAppRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AppPkgName")
    @Validation(required = true)
    private String appPkgName;

    @Query
    @NameInMap("OsType")
    @Validation(required = true)
    private Integer osType;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateProjectAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appPkgName = builder.appPkgName;
        this.osType = builder.osType;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appPkgName
     */
    public String getAppPkgName() {
        return this.appPkgName;
    }

    /**
     * @return osType
     */
    public Integer getOsType() {
        return this.osType;
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

    public static final class Builder extends Request.Builder<CreateProjectAppRequest, Builder> {
        private String appName; 
        private String appPkgName; 
        private Integer osType; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectAppRequest response) {
            super(response);
            this.appName = response.appName;
            this.appPkgName = response.appPkgName;
            this.osType = response.osType;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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
         * AppPkgName.
         */
        public Builder appPkgName(String appPkgName) {
            this.putQueryParameter("AppPkgName", appPkgName);
            this.appPkgName = appPkgName;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(Integer osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
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

        @Override
        public CreateProjectAppRequest build() {
            return new CreateProjectAppRequest(this);
        } 

    } 

}
