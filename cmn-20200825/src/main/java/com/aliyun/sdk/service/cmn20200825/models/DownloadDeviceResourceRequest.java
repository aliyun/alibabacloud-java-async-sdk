// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadDeviceResourceRequest} extends {@link RequestModel}
 *
 * <p>DownloadDeviceResourceRequest</p>
 */
public class DownloadDeviceResourceRequest extends Request {
    @Query
    @NameInMap("DeviceResourceId")
    private String deviceResourceId;

    @Query
    @NameInMap("DeviceResourceIds")
    private java.util.List < String > deviceResourceIds;

    @Query
    @NameInMap("DownloadType")
    @Validation(required = true)
    private String downloadType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    private DownloadDeviceResourceRequest(Builder builder) {
        super(builder);
        this.deviceResourceId = builder.deviceResourceId;
        this.deviceResourceIds = builder.deviceResourceIds;
        this.downloadType = builder.downloadType;
        this.instanceId = builder.instanceId;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadDeviceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return downloadType
     */
    public String getDownloadType() {
        return this.downloadType;
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

    public static final class Builder extends Request.Builder<DownloadDeviceResourceRequest, Builder> {
        private String deviceResourceId; 
        private java.util.List < String > deviceResourceIds; 
        private String downloadType; 
        private String instanceId; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(DownloadDeviceResourceRequest request) {
            super(request);
            this.deviceResourceId = request.deviceResourceId;
            this.deviceResourceIds = request.deviceResourceIds;
            this.downloadType = request.downloadType;
            this.instanceId = request.instanceId;
            this.setupProjectId = request.setupProjectId;
        } 

        /**
         * DeviceResourceId.
         */
        public Builder deviceResourceId(String deviceResourceId) {
            this.putQueryParameter("DeviceResourceId", deviceResourceId);
            this.deviceResourceId = deviceResourceId;
            return this;
        }

        /**
         * DeviceResourceIds.
         */
        public Builder deviceResourceIds(java.util.List < String > deviceResourceIds) {
            String deviceResourceIdsShrink = shrink(deviceResourceIds, "DeviceResourceIds", "json");
            this.putQueryParameter("DeviceResourceIds", deviceResourceIdsShrink);
            this.deviceResourceIds = deviceResourceIds;
            return this;
        }

        /**
         * DownloadType.
         */
        public Builder downloadType(String downloadType) {
            this.putQueryParameter("DownloadType", downloadType);
            this.downloadType = downloadType;
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
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putQueryParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public DownloadDeviceResourceRequest build() {
            return new DownloadDeviceResourceRequest(this);
        } 

    } 

}
