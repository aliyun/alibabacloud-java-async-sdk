// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TurnOnSecondSwitchRequest} extends {@link RequestModel}
 *
 * <p>TurnOnSecondSwitchRequest</p>
 */
public class TurnOnSecondSwitchRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("ProxyUserId")
    private String proxyUserId;

    @Query
    @NameInMap("ReleaseStartTime")
    @Validation(required = true)
    private Long releaseStartTime;

    private TurnOnSecondSwitchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pid = builder.pid;
        this.proxyUserId = builder.proxyUserId;
        this.releaseStartTime = builder.releaseStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TurnOnSecondSwitchRequest create() {
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
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return proxyUserId
     */
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    /**
     * @return releaseStartTime
     */
    public Long getReleaseStartTime() {
        return this.releaseStartTime;
    }

    public static final class Builder extends Request.Builder<TurnOnSecondSwitchRequest, Builder> {
        private String regionId; 
        private String pid; 
        private String proxyUserId; 
        private Long releaseStartTime; 

        private Builder() {
            super();
        } 

        private Builder(TurnOnSecondSwitchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pid = request.pid;
            this.proxyUserId = request.proxyUserId;
            this.releaseStartTime = request.releaseStartTime;
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
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * ProxyUserId.
         */
        public Builder proxyUserId(String proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * ReleaseStartTime.
         */
        public Builder releaseStartTime(Long releaseStartTime) {
            this.putQueryParameter("ReleaseStartTime", releaseStartTime);
            this.releaseStartTime = releaseStartTime;
            return this;
        }

        @Override
        public TurnOnSecondSwitchRequest build() {
            return new TurnOnSecondSwitchRequest(this);
        } 

    } 

}
