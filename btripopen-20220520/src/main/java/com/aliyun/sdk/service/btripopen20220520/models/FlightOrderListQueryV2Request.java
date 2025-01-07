// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link FlightOrderListQueryV2Request} extends {@link RequestModel}
 *
 * <p>FlightOrderListQueryV2Request</p>
 */
public class FlightOrderListQueryV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("approve_id")
    private java.util.List<String> approveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("booker_id")
    private java.util.List<String> bookerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("depart_id")
    private java.util.List<String> departId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end_date")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_Size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scroll_id")
    private String scrollId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("start_date")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("supplier")
    private java.util.List<String> supplier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("thirdpart_approve_id")
    private java.util.List<String> thirdpartApproveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("update_end_date")
    private String updateEndDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("update_start_date")
    private String updateStartDate;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private FlightOrderListQueryV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approveId = builder.approveId;
        this.bookerId = builder.bookerId;
        this.departId = builder.departId;
        this.endDate = builder.endDate;
        this.pageSize = builder.pageSize;
        this.scrollId = builder.scrollId;
        this.startDate = builder.startDate;
        this.supplier = builder.supplier;
        this.thirdpartApproveId = builder.thirdpartApproveId;
        this.updateEndDate = builder.updateEndDate;
        this.updateStartDate = builder.updateStartDate;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightOrderListQueryV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return approveId
     */
    public java.util.List<String> getApproveId() {
        return this.approveId;
    }

    /**
     * @return bookerId
     */
    public java.util.List<String> getBookerId() {
        return this.bookerId;
    }

    /**
     * @return departId
     */
    public java.util.List<String> getDepartId() {
        return this.departId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scrollId
     */
    public String getScrollId() {
        return this.scrollId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return supplier
     */
    public java.util.List<String> getSupplier() {
        return this.supplier;
    }

    /**
     * @return thirdpartApproveId
     */
    public java.util.List<String> getThirdpartApproveId() {
        return this.thirdpartApproveId;
    }

    /**
     * @return updateEndDate
     */
    public String getUpdateEndDate() {
        return this.updateEndDate;
    }

    /**
     * @return updateStartDate
     */
    public String getUpdateStartDate() {
        return this.updateStartDate;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightOrderListQueryV2Request, Builder> {
        private String regionId; 
        private java.util.List<String> approveId; 
        private java.util.List<String> bookerId; 
        private java.util.List<String> departId; 
        private String endDate; 
        private Integer pageSize; 
        private String scrollId; 
        private String startDate; 
        private java.util.List<String> supplier; 
        private java.util.List<String> thirdpartApproveId; 
        private String updateEndDate; 
        private String updateStartDate; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightOrderListQueryV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.approveId = request.approveId;
            this.bookerId = request.bookerId;
            this.departId = request.departId;
            this.endDate = request.endDate;
            this.pageSize = request.pageSize;
            this.scrollId = request.scrollId;
            this.startDate = request.startDate;
            this.supplier = request.supplier;
            this.thirdpartApproveId = request.thirdpartApproveId;
            this.updateEndDate = request.updateEndDate;
            this.updateStartDate = request.updateStartDate;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * approve_id.
         */
        public Builder approveId(java.util.List<String> approveId) {
            String approveIdShrink = shrink(approveId, "approve_id", "json");
            this.putQueryParameter("approve_id", approveIdShrink);
            this.approveId = approveId;
            return this;
        }

        /**
         * booker_id.
         */
        public Builder bookerId(java.util.List<String> bookerId) {
            String bookerIdShrink = shrink(bookerId, "booker_id", "json");
            this.putQueryParameter("booker_id", bookerIdShrink);
            this.bookerId = bookerId;
            return this;
        }

        /**
         * depart_id.
         */
        public Builder departId(java.util.List<String> departId) {
            String departIdShrink = shrink(departId, "depart_id", "json");
            this.putQueryParameter("depart_id", departIdShrink);
            this.departId = departId;
            return this;
        }

        /**
         * end_date.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("end_date", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * page_Size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_Size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * scroll_id.
         */
        public Builder scrollId(String scrollId) {
            this.putQueryParameter("scroll_id", scrollId);
            this.scrollId = scrollId;
            return this;
        }

        /**
         * start_date.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("start_date", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * supplier.
         */
        public Builder supplier(java.util.List<String> supplier) {
            String supplierShrink = shrink(supplier, "supplier", "json");
            this.putQueryParameter("supplier", supplierShrink);
            this.supplier = supplier;
            return this;
        }

        /**
         * thirdpart_approve_id.
         */
        public Builder thirdpartApproveId(java.util.List<String> thirdpartApproveId) {
            String thirdpartApproveIdShrink = shrink(thirdpartApproveId, "thirdpart_approve_id", "json");
            this.putQueryParameter("thirdpart_approve_id", thirdpartApproveIdShrink);
            this.thirdpartApproveId = thirdpartApproveId;
            return this;
        }

        /**
         * update_end_date.
         */
        public Builder updateEndDate(String updateEndDate) {
            this.putQueryParameter("update_end_date", updateEndDate);
            this.updateEndDate = updateEndDate;
            return this;
        }

        /**
         * update_start_date.
         */
        public Builder updateStartDate(String updateStartDate) {
            this.putQueryParameter("update_start_date", updateStartDate);
            this.updateStartDate = updateStartDate;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public FlightOrderListQueryV2Request build() {
            return new FlightOrderListQueryV2Request(this);
        } 

    } 

}
