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
 * {@link ListHoneypotAlarmEventsRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotAlarmEventsRequest</p>
 */
public class ListHoneypotAlarmEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIp")
    private String dstIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List<String> riskLevelList;

    @com.aliyun.core.annotation.Query
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
    public java.util.List<String> getRiskLevelList() {
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
        private java.util.List<String> riskLevelList; 
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
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The status of the alert event. Default value: <strong>a</strong>. Valid values:</p>
         * <ul>
         * <li><strong>a</strong>: all states</li>
         * <li><strong>y</strong>: handled</li>
         * <li><strong>n</strong>: unhandled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>183.224.XX.XX</p>
         */
        public Builder dstIp(String dstIp) {
            this.putQueryParameter("DstIp", dstIp);
            this.dstIp = dstIp;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 100. If you leave this parameter empty, 100 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty. We recommend that you set the value to a value no greater than 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>185.224.XX.XX</p>
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        @Override
        public ListHoneypotAlarmEventsRequest build() {
            return new ListHoneypotAlarmEventsRequest(this);
        } 

    } 

}
