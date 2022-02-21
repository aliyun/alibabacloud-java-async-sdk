// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenScdnServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenScdnServiceRequest</p>
 */
public class OpenScdnServiceRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true)
    private Integer bandwidth;

    @Query
    @NameInMap("CcProtection")
    @Validation(required = true)
    private Integer ccProtection;

    @Query
    @NameInMap("DDoSBasic")
    @Validation(required = true)
    private Integer DDoSBasic;

    @Query
    @NameInMap("DomainCount")
    @Validation(required = true)
    private Integer domainCount;

    @Query
    @NameInMap("ElasticProtection")
    @Validation(required = true)
    private Integer elasticProtection;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProtectType")
    @Validation(required = true)
    private String protectType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private OpenScdnServiceRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.ccProtection = builder.ccProtection;
        this.DDoSBasic = builder.DDoSBasic;
        this.domainCount = builder.domainCount;
        this.elasticProtection = builder.elasticProtection;
        this.endDate = builder.endDate;
        this.ownerId = builder.ownerId;
        this.protectType = builder.protectType;
        this.securityToken = builder.securityToken;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenScdnServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return ccProtection
     */
    public Integer getCcProtection() {
        return this.ccProtection;
    }

    /**
     * @return DDoSBasic
     */
    public Integer getDDoSBasic() {
        return this.DDoSBasic;
    }

    /**
     * @return domainCount
     */
    public Integer getDomainCount() {
        return this.domainCount;
    }

    /**
     * @return elasticProtection
     */
    public Integer getElasticProtection() {
        return this.elasticProtection;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return protectType
     */
    public String getProtectType() {
        return this.protectType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<OpenScdnServiceRequest, Builder> {
        private Integer bandwidth; 
        private Integer ccProtection; 
        private Integer DDoSBasic; 
        private Integer domainCount; 
        private Integer elasticProtection; 
        private String endDate; 
        private Long ownerId; 
        private String protectType; 
        private String securityToken; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(OpenScdnServiceRequest response) {
            super(response);
            this.bandwidth = response.bandwidth;
            this.ccProtection = response.ccProtection;
            this.DDoSBasic = response.DDoSBasic;
            this.domainCount = response.domainCount;
            this.elasticProtection = response.elasticProtection;
            this.endDate = response.endDate;
            this.ownerId = response.ownerId;
            this.protectType = response.protectType;
            this.securityToken = response.securityToken;
            this.startDate = response.startDate;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * CcProtection.
         */
        public Builder ccProtection(Integer ccProtection) {
            this.putQueryParameter("CcProtection", ccProtection);
            this.ccProtection = ccProtection;
            return this;
        }

        /**
         * DDoSBasic.
         */
        public Builder DDoSBasic(Integer DDoSBasic) {
            this.putQueryParameter("DDoSBasic", DDoSBasic);
            this.DDoSBasic = DDoSBasic;
            return this;
        }

        /**
         * DomainCount.
         */
        public Builder domainCount(Integer domainCount) {
            this.putQueryParameter("DomainCount", domainCount);
            this.domainCount = domainCount;
            return this;
        }

        /**
         * ElasticProtection.
         */
        public Builder elasticProtection(Integer elasticProtection) {
            this.putQueryParameter("ElasticProtection", elasticProtection);
            this.elasticProtection = elasticProtection;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * ProtectType.
         */
        public Builder protectType(String protectType) {
            this.putQueryParameter("ProtectType", protectType);
            this.protectType = protectType;
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
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public OpenScdnServiceRequest build() {
            return new OpenScdnServiceRequest(this);
        } 

    } 

}
