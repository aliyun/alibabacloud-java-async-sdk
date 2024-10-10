// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHoneypotEventsRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotEventsRequest</p>
 */
public class ListHoneypotEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentIdList")
    private java.util.List < String > agentIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmEventId")
    private Long alarmEventId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HoneypotIdList")
    private java.util.List < String > honeypotIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortraitId")
    private String portraitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List < String > riskLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    private ListHoneypotEventsRequest(Builder builder) {
        super(builder);
        this.agentIdList = builder.agentIdList;
        this.alarmEventId = builder.alarmEventId;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.honeypotIdList = builder.honeypotIdList;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.portraitId = builder.portraitId;
        this.requestId = builder.requestId;
        this.riskLevelList = builder.riskLevelList;
        this.srcIp = builder.srcIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIdList
     */
    public java.util.List < String > getAgentIdList() {
        return this.agentIdList;
    }

    /**
     * @return alarmEventId
     */
    public Long getAlarmEventId() {
        return this.alarmEventId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return honeypotIdList
     */
    public java.util.List < String > getHoneypotIdList() {
        return this.honeypotIdList;
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
     * @return portraitId
     */
    public String getPortraitId() {
        return this.portraitId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder extends Request.Builder<ListHoneypotEventsRequest, Builder> {
        private java.util.List < String > agentIdList; 
        private Long alarmEventId; 
        private Integer currentPage; 
        private String dealed; 
        private java.util.List < String > honeypotIdList; 
        private String lang; 
        private Integer pageSize; 
        private String portraitId; 
        private String requestId; 
        private java.util.List < String > riskLevelList; 
        private String srcIp; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotEventsRequest request) {
            super(request);
            this.agentIdList = request.agentIdList;
            this.alarmEventId = request.alarmEventId;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.honeypotIdList = request.honeypotIdList;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.portraitId = request.portraitId;
            this.requestId = request.requestId;
            this.riskLevelList = request.riskLevelList;
            this.srcIp = request.srcIp;
        } 

        /**
         * <p>The probe IDs.</p>
         */
        public Builder agentIdList(java.util.List < String > agentIdList) {
            this.putBodyParameter("AgentIdList", agentIdList);
            this.agentIdList = agentIdList;
            return this;
        }

        /**
         * <p>The ID of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>1259925</p>
         */
        public Builder alarmEventId(Long alarmEventId) {
            this.putBodyParameter("AlarmEventId", alarmEventId);
            this.alarmEventId = alarmEventId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li><strong>y</strong>: handled</li>
         * <li><strong>n</strong>: unhandled</li>
         * <li><strong>a</strong>: all statuses</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>y</p>
         */
        public Builder dealed(String dealed) {
            this.putBodyParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The honeypot IDs.</p>
         */
        public Builder honeypotIdList(java.util.List < String > honeypotIdList) {
            this.putBodyParameter("HoneypotIdList", honeypotIdList);
            this.honeypotIdList = honeypotIdList;
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
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the attacker profile.</p>
         * 
         * <strong>example:</strong>
         * <p>cd48604a-1694-4f03-ade0-ec6994c3*****</p>
         */
        public Builder portraitId(String portraitId) {
            this.putQueryParameter("PortraitId", portraitId);
            this.portraitId = portraitId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F9CE167-58D5-5DA6-AA3B-923EED02****</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The risk levels.</p>
         */
        public Builder riskLevelList(java.util.List < String > riskLevelList) {
            this.putBodyParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>185.237.96.***</p>
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        @Override
        public ListHoneypotEventsRequest build() {
            return new ListHoneypotEventsRequest(this);
        } 

    } 

}
