// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotAttackStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotAttackStatisticsRequest</p>
 */
public class GetHoneypotAttackStatisticsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RiskLevelList")
    private java.util.List < String > riskLevelList;

    @Query
    @NameInMap("SrcIp")
    @Validation(required = true)
    private String srcIp;

    @Query
    @NameInMap("StartTimeStamp")
    private Long startTimeStamp;

    @Query
    @NameInMap("StatisticsType")
    @Validation(required = true)
    private String statisticsType;

    private GetHoneypotAttackStatisticsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTimeStamp = builder.endTimeStamp;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskLevelList = builder.riskLevelList;
        this.srcIp = builder.srcIp;
        this.startTimeStamp = builder.startTimeStamp;
        this.statisticsType = builder.statisticsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotAttackStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskLevelList
     */
    public java.util.List < String > getRiskLevelList() {
        return this.riskLevelList;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTimeStamp
     */
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    /**
     * @return statisticsType
     */
    public String getStatisticsType() {
        return this.statisticsType;
    }

    public static final class Builder extends Request.Builder<GetHoneypotAttackStatisticsRequest, Builder> {
        private Integer currentPage; 
        private Long endTimeStamp; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List < String > riskLevelList; 
        private String srcIp; 
        private Long startTimeStamp; 
        private String statisticsType; 

        private Builder() {
            super();
        } 

        private Builder(GetHoneypotAttackStatisticsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTimeStamp = request.endTimeStamp;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskLevelList = request.riskLevelList;
            this.srcIp = request.srcIp;
            this.startTimeStamp = request.startTimeStamp;
            this.statisticsType = request.statisticsType;
        } 

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The end time. The value is a UNIX timestamp.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putQueryParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page. We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The risk levels.
         */
        public Builder riskLevelList(java.util.List < String > riskLevelList) {
            this.putQueryParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * The source IP address of the attack.
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * The start time. The value is a UNIX timestamp.
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putQueryParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        /**
         * The type of the attack source statistics. Valid values:
         * <p>
         * 
         * *   **TOP_ATTACKED_AGENT**: the top 5 probes that are attacked the most frequently
         * *   **TOP_ATTACKED_IP**: the top 5 IP addresses that are attacked the most frequently
         * *   **ATTACK_EVENT_TYPE**: the type of the intrusion event
         * *   **ATTACK_HONEYPOT_TYPE**: the type of the attacked honeypot
         */
        public Builder statisticsType(String statisticsType) {
            this.putQueryParameter("StatisticsType", statisticsType);
            this.statisticsType = statisticsType;
            return this;
        }

        @Override
        public GetHoneypotAttackStatisticsRequest build() {
            return new GetHoneypotAttackStatisticsRequest(this);
        } 

    } 

}
