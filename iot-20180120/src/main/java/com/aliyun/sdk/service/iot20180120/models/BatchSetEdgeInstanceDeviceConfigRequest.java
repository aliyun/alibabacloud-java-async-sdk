// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetEdgeInstanceDeviceConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchSetEdgeInstanceDeviceConfigRequest</p>
 */
public class BatchSetEdgeInstanceDeviceConfigRequest extends Request {
    @Query
    @NameInMap("DeviceConfigs")
    @Validation(required = true)
    private java.util.List < DeviceConfigs> deviceConfigs;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchSetEdgeInstanceDeviceConfigRequest(Builder builder) {
        super(builder);
        this.deviceConfigs = builder.deviceConfigs;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetEdgeInstanceDeviceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceConfigs
     */
    public java.util.List < DeviceConfigs> getDeviceConfigs() {
        return this.deviceConfigs;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchSetEdgeInstanceDeviceConfigRequest, Builder> {
        private java.util.List < DeviceConfigs> deviceConfigs; 
        private String instanceId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetEdgeInstanceDeviceConfigRequest response) {
            super(response);
            this.deviceConfigs = response.deviceConfigs;
            this.instanceId = response.instanceId;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * DeviceConfigs.
         */
        public Builder deviceConfigs(java.util.List < DeviceConfigs> deviceConfigs) {
            this.putQueryParameter("DeviceConfigs", deviceConfigs);
            this.deviceConfigs = deviceConfigs;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BatchSetEdgeInstanceDeviceConfigRequest build() {
            return new BatchSetEdgeInstanceDeviceConfigRequest(this);
        } 

    } 

    public static class DeviceConfigs extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("IotId")
        @Validation(required = true)
        private String iotId;

        private DeviceConfigs(Builder builder) {
            this.content = builder.content;
            this.iotId = builder.iotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceConfigs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private String content; 
            private String iotId; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            public DeviceConfigs build() {
                return new DeviceConfigs(this);
            } 

        } 

    }
}
