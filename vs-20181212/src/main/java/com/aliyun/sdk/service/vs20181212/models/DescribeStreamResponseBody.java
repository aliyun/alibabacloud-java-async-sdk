// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeStreamResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamResponseBody</p>
 */
public class DescribeStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PlayDomain")
    private String playDomain;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("PushDomain")
    private String pushDomain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Integer width;

    private DescribeStreamResponseBody(Builder builder) {
        this.app = builder.app;
        this.createdTime = builder.createdTime;
        this.deviceId = builder.deviceId;
        this.enabled = builder.enabled;
        this.groupId = builder.groupId;
        this.height = builder.height;
        this.id = builder.id;
        this.name = builder.name;
        this.playDomain = builder.playDomain;
        this.protocol = builder.protocol;
        this.pushDomain = builder.pushDomain;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamResponseBody create() {
        return builder().build();
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return playDomain
     */
    public String getPlayDomain() {
        return this.playDomain;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return pushDomain
     */
    public String getPushDomain() {
        return this.pushDomain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder {
        private String app; 
        private String createdTime; 
        private String deviceId; 
        private Boolean enabled; 
        private String groupId; 
        private Integer height; 
        private String id; 
        private String name; 
        private String playDomain; 
        private String protocol; 
        private String pushDomain; 
        private String requestId; 
        private String status; 
        private Integer width; 

        /**
         * App.
         */
        public Builder app(String app) {
            this.app = app;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PlayDomain.
         */
        public Builder playDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * PushDomain.
         */
        public Builder pushDomain(String pushDomain) {
            this.pushDomain = pushDomain;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(Integer width) {
            this.width = width;
            return this;
        }

        public DescribeStreamResponseBody build() {
            return new DescribeStreamResponseBody(this);
        } 

    } 

}
