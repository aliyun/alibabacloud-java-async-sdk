// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscribeRequest} extends {@link RequestModel}
 *
 * <p>CreateSubscribeRequest</p>
 */
public class CreateSubscribeRequest extends Request {
    @Query
    @NameInMap("DeviceModel")
    @Validation(required = true)
    private String deviceModel;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubscribeList")
    private String subscribeList;

    @Query
    @NameInMap("Version")
    private String version;

    private CreateSubscribeRequest(Builder builder) {
        super(builder);
        this.deviceModel = builder.deviceModel;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.subscribeList = builder.subscribeList;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscribeRequest create() {
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
     * @return subscribeList
     */
    public String getSubscribeList() {
        return this.subscribeList;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<CreateSubscribeRequest, Builder> {
        private String deviceModel; 
        private String projectId; 
        private String regionId; 
        private String subscribeList; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubscribeRequest response) {
            super(response);
            this.deviceModel = response.deviceModel;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.subscribeList = response.subscribeList;
            this.version = response.version;
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
         * SubscribeList.
         */
        public Builder subscribeList(String subscribeList) {
            this.putQueryParameter("SubscribeList", subscribeList);
            this.subscribeList = subscribeList;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public CreateSubscribeRequest build() {
            return new CreateSubscribeRequest(this);
        } 

    } 

}
