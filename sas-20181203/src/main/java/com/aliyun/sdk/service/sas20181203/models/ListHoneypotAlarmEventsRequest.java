// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotAlarmEventsRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotAlarmEventsRequest</p>
 */
public class ListHoneypotAlarmEventsRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("Dealed")
    private String dealed;

    @Body
    @NameInMap("DstIp")
    private String dstIp;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("RiskLevelList")
    private java.util.List < String > riskLevelList;

    @Body
    @NameInMap("SrcIp")
    private String srcIp;

    private ListHoneypotAlarmEventsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.dstIp = builder.dstIp;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
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

    public static final class Builder extends Request.Builder<ListHoneypotAlarmEventsRequest, Builder> {
        private Integer currentPage; 
        private String dealed; 
        private String dstIp; 
        private Integer pageSize; 
        private String requestId; 
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
            this.requestId = request.requestId;
            this.riskLevelList = request.riskLevelList;
            this.srcIp = request.srcIp;
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
         * y: 已经处理 n: 未处理 a: 所有
         */
        public Builder dealed(String dealed) {
            this.putBodyParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * DstIp.
         */
        public Builder dstIp(String dstIp) {
            this.putBodyParameter("DstIp", dstIp);
            this.dstIp = dstIp;
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
