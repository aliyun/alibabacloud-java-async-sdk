// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetHoneypotAttackStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetHoneypotAttackStatisticsRequest</p>
 */
public class GetHoneypotAttackStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List<String> riskLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeStamp")
    private Long startTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticsType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getRiskLevelList() {
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
        private java.util.List<String> riskLevelList; 
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
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end time. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1675058931215</p>
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putQueryParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page. We recommend that you do not leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The risk levels.</p>
         */
        public Builder riskLevelList(java.util.List<String> riskLevelList) {
            this.putQueryParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * <p>The source IP address of the attack.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.92.139.**</p>
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * <p>The start time. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1681624877761</p>
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putQueryParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        /**
         * <p>The type of the attack source statistics. Valid values:</p>
         * <ul>
         * <li><strong>TOP_ATTACKED_AGENT</strong>: the top 5 probes that are attacked the most frequently</li>
         * <li><strong>TOP_ATTACKED_IP</strong>: the top 5 IP addresses that are attacked the most frequently</li>
         * <li><strong>ATTACK_EVENT_TYPE</strong>: the type of the intrusion event</li>
         * <li><strong>ATTACK_HONEYPOT_TYPE</strong>: the type of the attacked honeypot</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TOP_ATTACKED_IP</p>
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
