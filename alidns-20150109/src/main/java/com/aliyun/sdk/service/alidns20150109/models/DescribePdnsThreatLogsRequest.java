// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsThreatLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribePdnsThreatLogsRequest</p>
 */
public class DescribePdnsThreatLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThreatLevel")
    private String threatLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThreatSourceIp")
    private String threatSourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThreatType")
    private String threatType;

    private DescribePdnsThreatLogsRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.threatLevel = builder.threatLevel;
        this.threatSourceIp = builder.threatSourceIp;
        this.threatType = builder.threatType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePdnsThreatLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<DescribePdnsThreatLogsRequest, Builder> {
        private String endDate; 
        private String keyword; 
        private String lang; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startDate; 
        private String threatLevel; 
        private String threatSourceIp; 
        private String threatType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePdnsThreatLogsRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.threatLevel = request.threatLevel;
            this.threatSourceIp = request.threatSourceIp;
            this.threatType = request.threatType;
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
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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

        @Override
        public DescribePdnsThreatLogsRequest build() {
            return new DescribePdnsThreatLogsRequest(this);
        } 

    } 

}
