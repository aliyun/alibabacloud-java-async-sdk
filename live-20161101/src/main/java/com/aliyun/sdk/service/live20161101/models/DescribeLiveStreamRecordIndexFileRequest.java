// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamRecordIndexFileRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamRecordIndexFileRequest</p>
 */
public class DescribeLiveStreamRecordIndexFileRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RecordId")
    @Validation(required = true)
    private String recordId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private DescribeLiveStreamRecordIndexFileRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.recordId = builder.recordId;
        this.securityToken = builder.securityToken;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamRecordIndexFileRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamRecordIndexFileRequest, Builder> {
        private String appName; 
        private String domainName; 
        private Long ownerId; 
        private String recordId; 
        private String securityToken; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamRecordIndexFileRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.recordId = request.recordId;
            this.securityToken = request.securityToken;
            this.streamName = request.streamName;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
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
        public DescribeLiveStreamRecordIndexFileRequest build() {
            return new DescribeLiveStreamRecordIndexFileRequest(this);
        } 

    } 

}
