// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShadowSchemaRequest} extends {@link RequestModel}
 *
 * <p>DescribeShadowSchemaRequest</p>
 */
public class DescribeShadowSchemaRequest extends Request {
    @Query
    @NameInMap("DeviceModel")
    @Validation(required = true)
    private String deviceModel;

    @Query
    @NameInMap("IsSimple")
    private Boolean isSimple;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeShadowSchemaRequest(Builder builder) {
        super(builder);
        this.deviceModel = builder.deviceModel;
        this.isSimple = builder.isSimple;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShadowSchemaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return isSimple
     */
    public Boolean getIsSimple() {
        return this.isSimple;
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

    public static final class Builder extends Request.Builder<DescribeShadowSchemaRequest, Builder> {
        private String deviceModel; 
        private Boolean isSimple; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeShadowSchemaRequest response) {
            super(response);
            this.deviceModel = response.deviceModel;
            this.isSimple = response.isSimple;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * DeviceModel.
         */
        public Builder deviceModel(String deviceModel) {
            this.putQueryParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * IsSimple.
         */
        public Builder isSimple(Boolean isSimple) {
            this.putQueryParameter("IsSimple", isSimple);
            this.isSimple = isSimple;
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
        public DescribeShadowSchemaRequest build() {
            return new DescribeShadowSchemaRequest(this);
        } 

    } 

}
