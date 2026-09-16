// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeInfoCheckExportRecordRequest} extends {@link RequestModel}
 *
 * <p>DescribeInfoCheckExportRecordRequest</p>
 */
public class DescribeInfoCheckExportRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private DescribeInfoCheckExportRecordRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInfoCheckExportRecordRequest create() {
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeInfoCheckExportRecordRequest, Builder> {
        private Integer currentPage; 
        private String endDate; 
        private Integer pageSize; 
        private String productType; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInfoCheckExportRecordRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The current page number.</p>
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
         * <p>The query end time. Format: YYYY-MM-DD HH:mm:ss, for example, 2025-10-11 21:24:48.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-11 21:24:48</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification.</li>
         * <li><strong>ID_PERIOD</strong>: ID card validity period verification.</li>
         * <li><strong>MOBILE_ONLINE_LENGTH</strong>: Mobile number online duration.</li>
         * <li><strong>MOBILE_ONLINE_STATUS</strong>: Mobile number online status.</li>
         * <li><strong>MOBILE_3_META_SIMPLE</strong>: Mobile number three-element verification (simple edition).</li>
         * <li><strong>MOBILE_3_META</strong>: Mobile number three-element verification (detailed edition).</li>
         * <li><strong>MOBILE_2_META</strong>: Mobile number two-element verification.</li>
         * <li><strong>BANK_CARD_N_META</strong>: Bank card verification (detailed edition).</li>
         * <li><strong>MOBILE_DETECT</strong>: Number detection.</li>
         * <li><strong>VEHICLE_N_META</strong>: Vehicle element verification (enhanced edition).</li>
         * <li><strong>VEHICLE_PENTA_INFO</strong>: Vehicle five-element information recognition.</li>
         * <li><strong>VEHICLE_LICENSE_INFO</strong>: Vehicle information recognition.</li>
         * <li><strong>VEHICLE_INSURE_DATE</strong>: Vehicle insurance date query.</li>
         * <li><strong>VEHICLE_CHECK</strong>: Vehicle element verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ID_CARD_2_META</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The query start time. Format: YYYY-MM-DD HH:mm:ss, for example, 2025-10-11 21:24:48.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-11 21:24:48</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeInfoCheckExportRecordRequest build() {
            return new DescribeInfoCheckExportRecordRequest(this);
        } 

    } 

}
