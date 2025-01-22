// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateLivePackageChannelRequest} extends {@link RequestModel}
 *
 * <p>UpdateLivePackageChannelRequest</p>
 */
public class UpdateLivePackageChannelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SegmentCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer segmentCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SegmentDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer segmentDuration;

    private UpdateLivePackageChannelRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.protocol = builder.protocol;
        this.segmentCount = builder.segmentCount;
        this.segmentDuration = builder.segmentDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePackageChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return segmentCount
     */
    public Integer getSegmentCount() {
        return this.segmentCount;
    }

    /**
     * @return segmentDuration
     */
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

    public static final class Builder extends Request.Builder<UpdateLivePackageChannelRequest, Builder> {
        private String channelName; 
        private String description; 
        private String groupName; 
        private String protocol; 
        private Integer segmentCount; 
        private Integer segmentDuration; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLivePackageChannelRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.description = request.description;
            this.groupName = request.groupName;
            this.protocol = request.protocol;
            this.segmentCount = request.segmentCount;
            this.segmentDuration = request.segmentDuration;
        } 

        /**
         * <p>频道名称，字符必须为大小写英文字母或-、<em>。
         * 1 ~ 200个字符。
         * 格式：[A-Za-z0-9</em>-]+</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-1</p>
         */
        public Builder channelName(String channelName) {
            this.putBodyParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>频道描述，最大1000个字符</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>频道组名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>输入协议，目前仅支持HLS</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>输入流m3u8切片个数，2～100</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder segmentCount(Integer segmentCount) {
            this.putBodyParameter("SegmentCount", segmentCount);
            this.segmentCount = segmentCount;
            return this;
        }

        /**
         * <p>输入流切片时长，1～30</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder segmentDuration(Integer segmentDuration) {
            this.putBodyParameter("SegmentDuration", segmentDuration);
            this.segmentDuration = segmentDuration;
            return this;
        }

        @Override
        public UpdateLivePackageChannelRequest build() {
            return new UpdateLivePackageChannelRequest(this);
        } 

    } 

}
