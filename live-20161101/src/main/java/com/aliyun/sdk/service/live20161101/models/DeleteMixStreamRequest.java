// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteMixStreamRequest} extends {@link RequestModel}
 *
 * <p>DeleteMixStreamRequest</p>
 */
public class DeleteMixStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MixStreamId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mixStreamId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    private DeleteMixStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.mixStreamId = builder.mixStreamId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<DeleteMixStreamRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String mixStreamId; 
        private Long ownerId; 
        private String regionId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMixStreamRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.mixStreamId = request.mixStreamId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The ID of the stream mixing task. If the task was created by calling the <a href="https://help.aliyun.com/document_detail/2848087.html">CreateMixStream</a> operation, check the value of the response parameter MixStreamId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>749b7594-86d6-37b1-513b-e1e19845****</p>
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the output stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
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
