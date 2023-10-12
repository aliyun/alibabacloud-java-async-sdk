// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevicePropertyRequest} extends {@link RequestModel}
 *
 * <p>UpdateDevicePropertyRequest</p>
 */
public class UpdateDevicePropertyRequest extends Request {
    @Body
    @NameInMap("DevicePropertyId")
    @Validation(required = true)
    private String devicePropertyId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("PropertyContent")
    @Validation(required = true)
    private String propertyContent;

    @Body
    @NameInMap("PropertyFormat")
    @Validation(required = true)
    private String propertyFormat;

    @Body
    @NameInMap("PropertyName")
    @Validation(required = true)
    private String propertyName;

    private UpdateDevicePropertyRequest(Builder builder) {
        super(builder);
        this.devicePropertyId = builder.devicePropertyId;
        this.instanceId = builder.instanceId;
        this.propertyContent = builder.propertyContent;
        this.propertyFormat = builder.propertyFormat;
        this.propertyName = builder.propertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDevicePropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devicePropertyId
     */
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return propertyContent
     */
    public String getPropertyContent() {
        return this.propertyContent;
    }

    /**
     * @return propertyFormat
     */
    public String getPropertyFormat() {
        return this.propertyFormat;
    }

    /**
     * @return propertyName
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    public static final class Builder extends Request.Builder<UpdateDevicePropertyRequest, Builder> {
        private String devicePropertyId; 
        private String instanceId; 
        private String propertyContent; 
        private String propertyFormat; 
        private String propertyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDevicePropertyRequest request) {
            super(request);
            this.devicePropertyId = request.devicePropertyId;
            this.instanceId = request.instanceId;
            this.propertyContent = request.propertyContent;
            this.propertyFormat = request.propertyFormat;
            this.propertyName = request.propertyName;
        } 

        /**
         * DevicePropertyId.
         */
        public Builder devicePropertyId(String devicePropertyId) {
            this.putBodyParameter("DevicePropertyId", devicePropertyId);
            this.devicePropertyId = devicePropertyId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PropertyContent.
         */
        public Builder propertyContent(String propertyContent) {
            this.putBodyParameter("PropertyContent", propertyContent);
            this.propertyContent = propertyContent;
            return this;
        }

        /**
         * PropertyFormat.
         */
        public Builder propertyFormat(String propertyFormat) {
            this.putBodyParameter("PropertyFormat", propertyFormat);
            this.propertyFormat = propertyFormat;
            return this;
        }

        /**
         * PropertyName.
         */
        public Builder propertyName(String propertyName) {
            this.putBodyParameter("PropertyName", propertyName);
            this.propertyName = propertyName;
            return this;
        }

        @Override
        public UpdateDevicePropertyRequest build() {
            return new UpdateDevicePropertyRequest(this);
        } 

    } 

}
