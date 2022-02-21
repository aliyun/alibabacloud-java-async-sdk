// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRequestGraphRequest} extends {@link RequestModel}
 *
 * <p>DescribeRequestGraphRequest</p>
 */
public class DescribeRequestGraphRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("EndTimestamp")
    @Validation(required = true)
    private Long endTimestamp;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StartTimestamp")
    @Validation(required = true)
    private Long startTimestamp;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
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

        private Builder(DescribeRequestGraphRequest response) {
            super(response);
            this.bizId = response.bizId;
            this.bizType = response.bizType;
            this.endTimestamp = response.endTimestamp;
            this.lang = response.lang;
            this.startTimestamp = response.startTimestamp;
            this.userClientIp = response.userClientIp;
            this.vpcId = response.vpcId;
            this.zoneId = response.zoneId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
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
