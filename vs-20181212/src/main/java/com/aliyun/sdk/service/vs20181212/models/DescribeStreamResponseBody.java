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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeStreamResponseBody model) {
            this.app = model.app;
            this.createdTime = model.createdTime;
            this.deviceId = model.deviceId;
            this.enabled = model.enabled;
            this.groupId = model.groupId;
            this.height = model.height;
            this.id = model.id;
            this.name = model.name;
            this.playDomain = model.playDomain;
            this.protocol = model.protocol;
            this.pushDomain = model.pushDomain;
            this.requestId = model.requestId;
            this.status = model.status;
            this.width = model.width;
        } 

        /**
         * <p>The application to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        public Builder app(String app) {
            this.app = app;
            return this;
        }

        /**
         * <p>The time when the stream was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-28T17:00:17Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The ID of the device to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>Indicates whether the stream is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The ID of the group to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****174-cn-qingdao</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The height of the video stream resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * <p>The stream ID.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****997-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>31000000*****0000002</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The streaming domain to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder playDomain(String playDomain) {
            this.playDomain = playDomain;
            return this;
        }

        /**
         * <p>The protocol of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>gb28181</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ingest domain to which the stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder pushDomain(String pushDomain) {
            this.pushDomain = pushDomain;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the stream. Valid values:</p>
         * <ul>
         * <li><p>on (online)</p>
         * </li>
         * <li><p>off (offline)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The width of the video stream resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
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
