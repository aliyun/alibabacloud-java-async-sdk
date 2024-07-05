// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserDevicesRequest</p>
 */
public class DescribeUserDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsInstanceIds")
    private String ensInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerName")
    private String serverName;

    private DescribeUserDevicesRequest(Builder builder) {
        super(builder);
        this.ensInstanceIds = builder.ensInstanceIds;
        this.ownerId = builder.ownerId;
        this.serverName = builder.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensInstanceIds
     */
    public String getEnsInstanceIds() {
        return this.ensInstanceIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return serverName
     */
    public String getServerName() {
        return this.serverName;
    }

    public static final class Builder extends Request.Builder<DescribeUserDevicesRequest, Builder> {
        private String ensInstanceIds; 
        private Long ownerId; 
        private String serverName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserDevicesRequest request) {
            super(request);
            this.ensInstanceIds = request.ensInstanceIds;
            this.ownerId = request.ownerId;
            this.serverName = request.serverName;
        } 

        /**
         * EnsInstanceIds.
         */
        public Builder ensInstanceIds(String ensInstanceIds) {
            this.putQueryParameter("EnsInstanceIds", ensInstanceIds);
            this.ensInstanceIds = ensInstanceIds;
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
         * ServerName.
         */
        public Builder serverName(String serverName) {
            this.putQueryParameter("ServerName", serverName);
            this.serverName = serverName;
            return this;
        }

        @Override
        public DescribeUserDevicesRequest build() {
            return new DescribeUserDevicesRequest(this);
        } 

    } 

}
