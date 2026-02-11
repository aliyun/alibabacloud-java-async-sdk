// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link GetConsistencySnapshotRequest} extends {@link RequestModel}
 *
 * <p>GetConsistencySnapshotRequest</p>
 */
public class GetConsistencySnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentTimestamp")
    private Long currentTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    private String proxyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetConsistencySnapshotRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.currentTimestamp = builder.currentTimestamp;
        this.pid = builder.pid;
        this.proxyUserId = builder.proxyUserId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsistencySnapshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return currentTimestamp
     */
    public Long getCurrentTimestamp() {
        return this.currentTimestamp;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetConsistencySnapshotRequest, Builder> {
        private String appType; 
        private Long currentTimestamp; 
        private String pid; 
        private String proxyUserId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetConsistencySnapshotRequest request) {
            super(request);
            this.appType = request.appType;
            this.currentTimestamp = request.currentTimestamp;
            this.pid = request.pid;
            this.proxyUserId = request.proxyUserId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * CurrentTimestamp.
         */
        public Builder currentTimestamp(Long currentTimestamp) {
            this.putQueryParameter("CurrentTimestamp", currentTimestamp);
            this.currentTimestamp = currentTimestamp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetConsistencySnapshotRequest build() {
            return new GetConsistencySnapshotRequest(this);
        } 

    } 

}
