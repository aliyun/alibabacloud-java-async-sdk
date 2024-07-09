// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRequestGraphRequest} extends {@link RequestModel}
 *
 * <p>DescribeRequestGraphRequest</p>
 */
public class DescribeRequestGraphRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeRequestGraphRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.endTimestamp = builder.endTimestamp;
        this.lang = builder.lang;
        this.startTimestamp = builder.startTimestamp;
        this.userClientIp = builder.userClientIp;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRequestGraphRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeRequestGraphRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private Long endTimestamp; 
        private String lang; 
        private Long startTimestamp; 
        private String userClientIp; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRequestGraphRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.endTimestamp = request.endTimestamp;
            this.lang = request.lang;
            this.startTimestamp = request.startTimestamp;
            this.userClientIp = request.userClientIp;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The business ID. BizId is specified together with BizType.
         * <p>
         * 
         * *   If you set BizType to AUTH_ZONE, set BizId to a zone ID.
         * *   If you set BizType to RESOLVER_RULE, set BizId to the ID of a forwarding rule.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * The business type. Valid values:
         * <p>
         * 
         * *   AUTH_ZONE: authoritative zone
         * *   RESOLVER_RULE: forwarding rule
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * The end of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The beginning of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC).
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The global ID of the zone. To query the number of DNS requests for a zone, you can specify ZoneId or BizType and BizId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeRequestGraphRequest build() {
            return new DescribeRequestGraphRequest(this);
        } 

    } 

}
