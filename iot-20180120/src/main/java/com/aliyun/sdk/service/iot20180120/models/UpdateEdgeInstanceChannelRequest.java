// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateEdgeInstanceChannelRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeInstanceChannelRequest</p>
 */
public class UpdateEdgeInstanceChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private UpdateEdgeInstanceChannelRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.channelName = builder.channelName;
        this.configs = builder.configs;
        this.driverId = builder.driverId;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeInstanceChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
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

    public static final class Builder extends Request.Builder<UpdateEdgeInstanceChannelRequest, Builder> {
        private String channelId; 
        private String channelName; 
        private java.util.List<Configs> configs; 
        private String driverId; 
        private String instanceId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeInstanceChannelRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.channelName = request.channelName;
            this.configs = request.configs;
            this.driverId = request.driverId;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BE0BD49EF5EF4D119D09CC1B25******</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>le_name_update</p>
         */
        public Builder channelName(String channelName) {
            this.putQueryParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.putQueryParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9c1ae7bd59f1469abbdccc9592******</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6GaTtvTj7vJhiS******</p>
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
        public UpdateEdgeInstanceChannelRequest build() {
            return new UpdateEdgeInstanceChannelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEdgeInstanceChannelRequest} extends {@link TeaModel}
     *
     * <p>UpdateEdgeInstanceChannelRequest</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Configs(Builder builder) {
            this.content = builder.content;
            this.format = builder.format;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String content; 
            private String format; 
            private String key; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.content = model.content;
                this.format = model.format;
                this.key = model.key;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;protocol&quot;:&quot;TCP&quot;, &quot;ip&quot;:&quot;1.2.3.4&quot;, &quot;port&quot;:122}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
