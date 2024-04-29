// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotAlarmEventsRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotAlarmEventsRequest</p>
 */
public class ListHoneypotAlarmEventsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DstIp")
    private String dstIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List < String > riskLevelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    private ListHoneypotAlarmEventsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.dstIp = builder.dstIp;
        this.pageSize = builder.pageSize;
        this.riskLevelList = builder.riskLevelList;
        this.srcIp = builder.srcIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotAlarmEventsRequest create() {
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
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return dstIp
     */
    public String getDstIp() {
        return this.dstIp;
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

    public static final class Builder extends Request.Builder<ListHoneypotAlarmEventsRequest, Builder> {
        private Integer currentPage; 
        private String dealed; 
        private String dstIp; 
        private Integer pageSize; 
        private java.util.List < String > riskLevelList; 
        private String srcIp; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotAlarmEventsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.dstIp = request.dstIp;
            this.pageSize = request.pageSize;
            this.riskLevelList = request.riskLevelList;
            this.srcIp = request.srcIp;
        } 

        /**
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The status of the alert events. Valid values:
         * <p>
         * 
         * *   **y**: handled
         * *   **n**: unhandled
         * *   **a**: all states
         */
        public Builder dealed(String dealed) {
            this.putBodyParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The destination IP address.
         */
        public Builder dstIp(String dstIp) {
            this.putBodyParameter("DstIp", dstIp);
            this.dstIp = dstIp;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The risk levels of the alert events.
         */
        public Builder riskLevelList(java.util.List < String > riskLevelList) {
            this.putBodyParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * The source IP address.
         */
        public Builder srcIp(String srcIp) {
            this.putBodyParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        @Override
        public ListHoneypotAlarmEventsRequest build() {
            return new ListHoneypotAlarmEventsRequest(this);
        } 

    } 

}
