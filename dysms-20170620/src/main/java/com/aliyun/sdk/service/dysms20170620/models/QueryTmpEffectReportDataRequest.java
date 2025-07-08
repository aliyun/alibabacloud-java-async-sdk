// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryTmpEffectReportDataRequest} extends {@link RequestModel}
 *
 * <p>QueryTmpEffectReportDataRequest</p>
 */
public class QueryTmpEffectReportDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmpCode")
    private String tmpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmpName")
    private String tmpName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorCode")
    private String vendorCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorName")
    private String vendorName;

    private QueryTmpEffectReportDataRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.tmpCode = builder.tmpCode;
        this.tmpName = builder.tmpName;
        this.vendorCode = builder.vendorCode;
        this.vendorName = builder.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTmpEffectReportDataRequest create() {
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
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
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
     * @return tmpCode
     */
    public String getTmpCode() {
        return this.tmpCode;
    }

    /**
     * @return tmpName
     */
    public String getTmpName() {
        return this.tmpName;
    }

    /**
     * @return vendorCode
     */
    public String getVendorCode() {
        return this.vendorCode;
    }

    /**
     * @return vendorName
     */
    public String getVendorName() {
        return this.vendorName;
    }

    public static final class Builder extends Request.Builder<QueryTmpEffectReportDataRequest, Builder> {
        private String endDate; 
        private Long pageNo; 
        private Long pageSize; 
        private String startDate; 
        private String tmpCode; 
        private String tmpName; 
        private String vendorCode; 
        private String vendorName; 

        private Builder() {
            super();
        } 

        private Builder(QueryTmpEffectReportDataRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.tmpCode = request.tmpCode;
            this.tmpName = request.tmpName;
            this.vendorCode = request.vendorCode;
            this.vendorName = request.vendorName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TmpCode.
         */
        public Builder tmpCode(String tmpCode) {
            this.putQueryParameter("TmpCode", tmpCode);
            this.tmpCode = tmpCode;
            return this;
        }

        /**
         * TmpName.
         */
        public Builder tmpName(String tmpName) {
            this.putQueryParameter("TmpName", tmpName);
            this.tmpName = tmpName;
            return this;
        }

        /**
         * VendorCode.
         */
        public Builder vendorCode(String vendorCode) {
            this.putQueryParameter("VendorCode", vendorCode);
            this.vendorCode = vendorCode;
            return this;
        }

        /**
         * VendorName.
         */
        public Builder vendorName(String vendorName) {
            this.putQueryParameter("VendorName", vendorName);
            this.vendorName = vendorName;
            return this;
        }

        @Override
        public QueryTmpEffectReportDataRequest build() {
            return new QueryTmpEffectReportDataRequest(this);
        } 

    } 

}
