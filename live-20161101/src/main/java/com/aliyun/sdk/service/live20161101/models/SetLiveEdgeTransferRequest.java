// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveEdgeTransferRequest} extends {@link RequestModel}
 *
 * <p>SetLiveEdgeTransferRequest</p>
 */
public class SetLiveEdgeTransferRequest extends Request {
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
    @NameInMap("HttpDns")
    private String httpDns;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StreamName")
    private String streamName;

    @Query
    @NameInMap("TargetDomainList")
    private String targetDomainList;

    @Query
    @NameInMap("TransferArgs")
    private String transferArgs;

    private SetLiveEdgeTransferRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.httpDns = builder.httpDns;
        this.ownerId = builder.ownerId;
        this.streamName = builder.streamName;
        this.targetDomainList = builder.targetDomainList;
        this.transferArgs = builder.transferArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveEdgeTransferRequest create() {
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
     * @return httpDns
     */
    public String getHttpDns() {
        return this.httpDns;
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
     * @return targetDomainList
     */
    public String getTargetDomainList() {
        return this.targetDomainList;
    }

    /**
     * @return transferArgs
     */
    public String getTransferArgs() {
        return this.transferArgs;
    }

    public static final class Builder extends Request.Builder<SetLiveEdgeTransferRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String domainName; 
        private String httpDns; 
        private Long ownerId; 
        private String streamName; 
        private String targetDomainList; 
        private String transferArgs; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveEdgeTransferRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.httpDns = request.httpDns;
            this.ownerId = request.ownerId;
            this.streamName = request.streamName;
            this.targetDomainList = request.targetDomainList;
            this.transferArgs = request.transferArgs;
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
         * HttpDns.
         */
        public Builder httpDns(String httpDns) {
            this.putQueryParameter("HttpDns", httpDns);
            this.httpDns = httpDns;
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

        /**
         * TargetDomainList.
         */
        public Builder targetDomainList(String targetDomainList) {
            this.putQueryParameter("TargetDomainList", targetDomainList);
            this.targetDomainList = targetDomainList;
            return this;
        }

        /**
         * TransferArgs.
         */
        public Builder transferArgs(String transferArgs) {
            this.putQueryParameter("TransferArgs", transferArgs);
            this.transferArgs = transferArgs;
            return this;
        }

        @Override
        public SetLiveEdgeTransferRequest build() {
            return new SetLiveEdgeTransferRequest(this);
        } 

    } 

}
