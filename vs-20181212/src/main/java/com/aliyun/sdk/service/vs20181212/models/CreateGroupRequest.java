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
 * {@link CreateGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupRequest</p>
 */
public class CreateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    private String callback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LazyPull")
    private Boolean lazyPull;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
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

    private CreateGroupRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.callback = builder.callback;
        this.description = builder.description;
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

    public static CreateGroupRequest create() {
        return builder().build();
    }

@Override
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

    public static final class Builder extends Request.Builder<CreateGroupRequest, Builder> {
        private String app; 
        private String callback; 
        private String description; 
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

        private Builder(CreateGroupRequest request) {
            super(request);
            this.app = request.app;
            this.callback = request.callback;
            this.description = request.description;
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
         * App.
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * Callback.
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        public Builder inProtocol(String inProtocol) {
            this.putQueryParameter("InProtocol", inProtocol);
            this.inProtocol = inProtocol;
            return this;
        }

        /**
         * LazyPull.
         */
        public Builder lazyPull(Boolean lazyPull) {
            this.putQueryParameter("LazyPull", lazyPull);
            this.lazyPull = lazyPull;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OutProtocol.
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
         * PlayDomain.
         */
        public Builder playDomain(String playDomain) {
            this.putQueryParameter("PlayDomain", playDomain);
            this.playDomain = playDomain;
            return this;
        }

        /**
         * PushDomain.
         */
        public Builder pushDomain(String pushDomain) {
            this.putQueryParameter("PushDomain", pushDomain);
            this.pushDomain = pushDomain;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
        } 

    } 

}
