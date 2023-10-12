// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeviceResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceResourceRequest</p>
 */
public class UpdateDeviceResourceRequest extends Request {
    @Body
    @NameInMap("Data")
    private String data;

    @Body
    @NameInMap("DeviceResourceId")
    private String deviceResourceId;

    @Body
    @NameInMap("DeviceResourceIds")
    @Validation(required = true)
    private java.util.List < String > deviceResourceIds;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    @Body
    @NameInMap("UpdateType")
    @Validation(required = true)
    private String updateType;

    private UpdateDeviceResourceRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.deviceResourceId = builder.deviceResourceId;
        this.deviceResourceIds = builder.deviceResourceIds;
        this.instanceId = builder.instanceId;
        this.setupProjectId = builder.setupProjectId;
        this.updateType = builder.updateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return deviceResourceId
     */
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    /**
     * @return deviceResourceIds
     */
    public java.util.List < String > getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceResourceRequest, Builder> {
        private String data; 
        private String deviceResourceId; 
        private java.util.List < String > deviceResourceIds; 
        private String instanceId; 
        private String setupProjectId; 
        private String updateType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceResourceRequest request) {
            super(request);
            this.data = request.data;
            this.deviceResourceId = request.deviceResourceId;
            this.deviceResourceIds = request.deviceResourceIds;
            this.instanceId = request.instanceId;
            this.setupProjectId = request.setupProjectId;
            this.updateType = request.updateType;
        } 

        /**
         * 更新数据
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * DeviceResourceId.
         */
        public Builder deviceResourceId(String deviceResourceId) {
            this.putBodyParameter("DeviceResourceId", deviceResourceId);
            this.deviceResourceId = deviceResourceId;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder deviceResourceIds(java.util.List < String > deviceResourceIds) {
            String deviceResourceIdsShrink = shrink(deviceResourceIds, "DeviceResourceIds", "json");
            this.putBodyParameter("DeviceResourceIds", deviceResourceIdsShrink);
            this.deviceResourceIds = deviceResourceIds;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 建设项目id
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putBodyParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        /**
         * 操作类型
         */
        public Builder updateType(String updateType) {
            this.putBodyParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        @Override
        public UpdateDeviceResourceRequest build() {
            return new UpdateDeviceResourceRequest(this);
        } 

    } 

}
