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
 * {@link ModifyGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyGroupRequest</p>
 */
public class ModifyGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    private String callback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InProtocol")
    private String inProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LazyPull")
    private Boolean lazyPull;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutProtocol")
    private String outProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayDomain")
    private String playDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushDomain")
    private String pushDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private ModifyGroupRequest(Builder builder) {
        super(builder);
        this.callback = builder.callback;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.id = builder.id;
        this.inProtocol = builder.inProtocol;
        this.lazyPull = builder.lazyPull;
        this.name = builder.name;
        this.outProtocol = builder.outProtocol;
        this.ownerId = builder.ownerId;
        this.playDomain = builder.playDomain;
        this.pushDomain = builder.pushDomain;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return inProtocol
     */
    public String getInProtocol() {
        return this.inProtocol;
    }

    /**
     * @return lazyPull
     */
    public Boolean getLazyPull() {
        return this.lazyPull;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outProtocol
     */
    public String getOutProtocol() {
        return this.outProtocol;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playDomain
     */
    public String getPlayDomain() {
        return this.playDomain;
    }

    /**
     * @return pushDomain
     */
    public String getPushDomain() {
        return this.pushDomain;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ModifyGroupRequest, Builder> {
        private String callback; 
        private String description; 
        private Boolean enabled; 
        private String id; 
        private String inProtocol; 
        private Boolean lazyPull; 
        private String name; 
        private String outProtocol; 
        private Long ownerId; 
        private String playDomain; 
        private String pushDomain; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGroupRequest request) {
            super(request);
            this.callback = request.callback;
            this.description = request.description;
            this.enabled = request.enabled;
            this.id = request.id;
            this.inProtocol = request.inProtocol;
            this.lazyPull = request.lazyPull;
            this.name = request.name;
            this.outProtocol = request.outProtocol;
            this.ownerId = request.ownerId;
            this.playDomain = request.playDomain;
            this.pushDomain = request.pushDomain;
            this.region = request.region;
        } 

        /**
         * <p>Callback URL for device or stream status updates in the group.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * <p>Description of the space.</p>
         * 
         * <strong>example:</strong>
         * <p>用于测试使用</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the space is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The ID of the space.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32388487739092994-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Ingest protocol used by the group. Valid values:</p>
         * <ul>
         * <li><p>gb28181</p>
         * </li>
         * <li><p>rtmp</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gb28181</p>
         */
        public Builder inProtocol(String inProtocol) {
            this.putQueryParameter("InProtocol", inProtocol);
            this.inProtocol = inProtocol;
            return this;
        }

        /**
         * <p>Whether on-demand stream pulling is enabled. Valid values:</p>
         * <ul>
         * <li><p>false (default)</p>
         * </li>
         * <li><p>true</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder lazyPull(Boolean lazyPull) {
            this.putQueryParameter("LazyPull", lazyPull);
            this.lazyPull = lazyPull;
            return this;
        }

        /**
         * <p>Space name.</p>
         * 
         * <strong>example:</strong>
         * <p>myGroup</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Playback protocols used by the group. Separate multiple values with commas. Valid values:</p>
         * <ul>
         * <li><p>flv</p>
         * </li>
         * <li><p>hls</p>
         * </li>
         * <li><p>rtmp</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flv,rtmp,hls</p>
         */
        public Builder outProtocol(String outProtocol) {
            this.putQueryParameter("OutProtocol", outProtocol);
            this.outProtocol = outProtocol;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Streaming domain used by the group.</p>
         * 
         * <strong>example:</strong>
         * <p>myplay.com</p>
         */
        public Builder playDomain(String playDomain) {
            this.putQueryParameter("PlayDomain", playDomain);
            this.playDomain = playDomain;
            return this;
        }

        /**
         * <p>Ingest domain used by the group. Applies only to groups that use the RTMP ingest protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>mypush.com</p>
         */
        public Builder pushDomain(String pushDomain) {
            this.putQueryParameter("PushDomain", pushDomain);
            this.pushDomain = pushDomain;
            return this;
        }

        /**
         * <p>The region where the space is located. This region serves as the service center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public ModifyGroupRequest build() {
            return new ModifyGroupRequest(this);
        } 

    } 

}
