// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortCcAttackTopIPRequest} extends {@link RequestModel}
 *
 * <p>DescribePortCcAttackTopIPRequest</p>
 */
public class DescribePortCcAttackTopIPRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTimestamp;

    private DescribePortCcAttackTopIPRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ip = builder.ip;
        this.limit = builder.limit;
        this.port = builder.port;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortCcAttackTopIPRequest create() {
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
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<DescribePortCcAttackTopIPRequest, Builder> {
        private String regionId; 
        private String ip; 
        private Long limit; 
        private String port; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribePortCcAttackTopIPRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ip = request.ip;
            this.limit = request.limit;
            this.port = request.port;
            this.startTimestamp = request.startTimestamp;
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
         * <p>The IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The attacked port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6663</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1678017453</p>
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public DescribePortCcAttackTopIPRequest build() {
            return new DescribePortCcAttackTopIPRequest(this);
        } 

    } 

}
