// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link EstimatedPriceQueryV2Request} extends {@link RequestModel}
 *
 * <p>EstimatedPriceQueryV2Request</p>
 */
public class EstimatedPriceQueryV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("biz_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("depart_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String departDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from_city")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("leave_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String leaveDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to_city")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private EstimatedPriceQueryV2Request(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.departDate = builder.departDate;
        this.fromCity = builder.fromCity;
        this.leaveDate = builder.leaveDate;
        this.toCity = builder.toCity;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EstimatedPriceQueryV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return departDate
     */
    public String getDepartDate() {
        return this.departDate;
    }

    /**
     * @return fromCity
     */
    public String getFromCity() {
        return this.fromCity;
    }

    /**
     * @return leaveDate
     */
    public String getLeaveDate() {
        return this.leaveDate;
    }

    /**
     * @return toCity
     */
    public String getToCity() {
        return this.toCity;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<EstimatedPriceQueryV2Request, Builder> {
        private String bizType; 
        private String departDate; 
        private String fromCity; 
        private String leaveDate; 
        private String toCity; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(EstimatedPriceQueryV2Request request) {
            super(request);
            this.bizType = request.bizType;
            this.departDate = request.departDate;
            this.fromCity = request.fromCity;
            this.leaveDate = request.leaveDate;
            this.toCity = request.toCity;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flight</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("biz_type", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        public Builder departDate(String departDate) {
            this.putQueryParameter("depart_date", departDate);
            this.departDate = departDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fromCity(String fromCity) {
            this.putQueryParameter("from_city", fromCity);
            this.fromCity = fromCity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        public Builder leaveDate(String leaveDate) {
            this.putQueryParameter("leave_date", leaveDate);
            this.leaveDate = leaveDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder toCity(String toCity) {
            this.putQueryParameter("to_city", toCity);
            this.toCity = toCity;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public EstimatedPriceQueryV2Request build() {
            return new EstimatedPriceQueryV2Request(this);
        } 

    } 

}
