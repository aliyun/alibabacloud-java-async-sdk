// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRecordStreamRequest} extends {@link RequestModel}
 *
 * <p>StartRecordStreamRequest</p>
 */
public class StartRecordStreamRequest extends Request {
    @Query
    @NameInMap("App")
    private String app;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlayDomain")
    private String playDomain;

    private StartRecordStreamRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.id = builder.id;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.playDomain = builder.playDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRecordStreamRequest create() {
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

    public static final class Builder extends Request.Builder<StartRecordStreamRequest, Builder> {
        private String app; 
        private String id; 
        private String name; 
        private Long ownerId; 
        private String playDomain; 

        private Builder() {
            super();
        } 

        private Builder(StartRecordStreamRequest response) {
            super(response);
            this.app = response.app;
            this.id = response.id;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.playDomain = response.playDomain;
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
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public StartRecordStreamRequest build() {
            return new StartRecordStreamRequest(this);
        } 

    } 

}
