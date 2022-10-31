// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMixStreamRequest} extends {@link RequestModel}
 *
 * <p>DeleteMixStreamRequest</p>
 */
public class DeleteMixStreamRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("MixStreamId")
    @Validation(required = true)
    private String mixStreamId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StreamName")
    private String streamName;

    private DeleteMixStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.mixStreamId = builder.mixStreamId;
        this.ownerId = builder.ownerId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMixStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return mixStreamId
     */
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<DeleteMixStreamRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String domainName; 
        private String mixStreamId; 
        private Long ownerId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMixStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.mixStreamId = request.mixStreamId;
            this.ownerId = request.ownerId;
            this.streamName = request.streamName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * MixStreamId.
         */
        public Builder mixStreamId(String mixStreamId) {
            this.putQueryParameter("MixStreamId", mixStreamId);
            this.mixStreamId = mixStreamId;
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
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public DeleteMixStreamRequest build() {
            return new DeleteMixStreamRequest(this);
        } 

    } 

}
