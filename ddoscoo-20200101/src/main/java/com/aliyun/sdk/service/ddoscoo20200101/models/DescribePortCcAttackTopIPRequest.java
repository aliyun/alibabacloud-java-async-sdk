// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortCcAttackTopIPRequest} extends {@link RequestModel}
 *
 * <p>DescribePortCcAttackTopIPRequest</p>
 */
public class DescribePortCcAttackTopIPRequest extends Request {
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
        private String ip; 
        private Long limit; 
        private String port; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribePortCcAttackTopIPRequest request) {
            super(request);
            this.ip = request.ip;
            this.limit = request.limit;
            this.port = request.port;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * The IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance to query.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The maximum number of entries to return.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The attacked port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: seconds.
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
