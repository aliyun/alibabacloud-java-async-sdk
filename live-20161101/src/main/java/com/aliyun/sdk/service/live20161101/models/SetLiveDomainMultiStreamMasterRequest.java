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
 * {@link SetLiveDomainMultiStreamMasterRequest} extends {@link RequestModel}
 *
 * <p>SetLiveDomainMultiStreamMasterRequest</p>
 */
public class SetLiveDomainMultiStreamMasterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpstreamSequence")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upstreamSequence;

    private SetLiveDomainMultiStreamMasterRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.streamName = builder.streamName;
        this.upstreamSequence = builder.upstreamSequence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveDomainMultiStreamMasterRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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

    /**
     * @return upstreamSequence
     */
    public String getUpstreamSequence() {
        return this.upstreamSequence;
    }

    public static final class Builder extends Request.Builder<SetLiveDomainMultiStreamMasterRequest, Builder> {
        private String appName; 
        private String domain; 
        private Long ownerId; 
        private String streamName; 
        private String upstreamSequence; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveDomainMultiStreamMasterRequest request) {
            super(request);
            this.appName = request.appName;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.streamName = request.streamName;
            this.upstreamSequence = request.upstreamSequence;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testapp</p>
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
         * <p>example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
         * <p>The name of the live stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The unique identifier of the stream ingest.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>teststream_***</p>
         */
        public Builder upstreamSequence(String upstreamSequence) {
            this.putQueryParameter("UpstreamSequence", upstreamSequence);
            this.upstreamSequence = upstreamSequence;
            return this;
        }

        @Override
        public SetLiveDomainMultiStreamMasterRequest build() {
            return new SetLiveDomainMultiStreamMasterRequest(this);
        } 

    } 

}
