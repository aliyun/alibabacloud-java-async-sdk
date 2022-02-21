// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsThreatStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsThreatStatisticsRequest</p>
 */
public class DescribePdnsThreatStatisticsRequest extends Request {
    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("SubDomain")
    private String subDomain;

    @Query
    @NameInMap("ThreatLevel")
    private String threatLevel;

    @Query
    @NameInMap("ThreatSourceIp")
    private String threatSourceIp;

    @Query
    @NameInMap("ThreatType")
    private String threatType;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribePdnsThreatStatisticsRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.domainName = builder.domainName;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.subDomain = builder.subDomain;
        this.threatLevel = builder.threatLevel;
        this.threatSourceIp = builder.threatSourceIp;
        this.threatType = builder.threatType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsThreatStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return threatLevel
     */
    public String getThreatLevel() {
        return this.threatLevel;
    }

    /**
     * @return threatSourceIp
     */
    public String getThreatSourceIp() {
        return this.threatSourceIp;
    }

    /**
     * @return threatType
     */
    public String getThreatType() {
        return this.threatType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribePdnsThreatStatisticsRequest, Builder> {
        private String direction; 
        private String domainName; 
        private String endDate; 
        private String lang; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startDate; 
        private String subDomain; 
        private String threatLevel; 
        private String threatSourceIp; 
        private String threatType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribePdnsThreatStatisticsRequest response) {
            super(response);
            this.direction = response.direction;
            this.domainName = response.domainName;
            this.endDate = response.endDate;
            this.lang = response.lang;
            this.orderBy = response.orderBy;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startDate = response.startDate;
            this.subDomain = response.subDomain;
            this.threatLevel = response.threatLevel;
            this.threatSourceIp = response.threatSourceIp;
            this.threatType = response.threatType;
            this.type = response.type;
        } 

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
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
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * ThreatLevel.
         */
        public Builder threatLevel(String threatLevel) {
            this.putQueryParameter("ThreatLevel", threatLevel);
            this.threatLevel = threatLevel;
            return this;
        }

        /**
         * ThreatSourceIp.
         */
        public Builder threatSourceIp(String threatSourceIp) {
            this.putQueryParameter("ThreatSourceIp", threatSourceIp);
            this.threatSourceIp = threatSourceIp;
            return this;
        }

        /**
         * ThreatType.
         */
        public Builder threatType(String threatType) {
            this.putQueryParameter("ThreatType", threatType);
            this.threatType = threatType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribePdnsThreatStatisticsRequest build() {
            return new DescribePdnsThreatStatisticsRequest(this);
        } 

    } 

}
