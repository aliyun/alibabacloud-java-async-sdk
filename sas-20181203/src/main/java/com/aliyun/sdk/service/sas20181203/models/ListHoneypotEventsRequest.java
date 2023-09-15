// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotEventsRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotEventsRequest</p>
 */
public class ListHoneypotEventsRequest extends Request {
    @Body
    @NameInMap("AgentIdList")
    private java.util.List < String > agentIdList;

    @Body
    @NameInMap("AlarmEventId")
    private Long alarmEventId;

    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("Dealed")
    private String dealed;

    @Body
    @NameInMap("HoneypotIdList")
    private java.util.List < String > honeypotIdList;

    @Body
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PortraitId")
    private String portraitId;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("RiskLevelList")
    private java.util.List < String > riskLevelList;

    @Query
    @NameInMap("SrcIp")
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
         * AgentIdList.
         */
        public Builder agentIdList(java.util.List < String > agentIdList) {
            this.putBodyParameter("AgentIdList", agentIdList);
            this.agentIdList = agentIdList;
            return this;
        }

        /**
         * AlarmEventId.
         */
        public Builder alarmEventId(Long alarmEventId) {
            this.putBodyParameter("AlarmEventId", alarmEventId);
            this.alarmEventId = alarmEventId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Dealed.
         */
        public Builder dealed(String dealed) {
            this.putBodyParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * HoneypotIdList.
         */
        public Builder honeypotIdList(java.util.List < String > honeypotIdList) {
            this.putBodyParameter("HoneypotIdList", honeypotIdList);
            this.honeypotIdList = honeypotIdList;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PortraitId.
         */
        public Builder portraitId(String portraitId) {
            this.putQueryParameter("PortraitId", portraitId);
            this.portraitId = portraitId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskLevelList.
         */
        public Builder riskLevelList(java.util.List < String > riskLevelList) {
            this.putBodyParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * SrcIp.
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
