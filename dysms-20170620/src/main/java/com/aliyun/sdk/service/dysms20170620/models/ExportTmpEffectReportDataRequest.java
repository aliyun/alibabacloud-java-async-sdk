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
 * {@link ExportTmpEffectReportDataRequest} extends {@link RequestModel}
 *
 * <p>ExportTmpEffectReportDataRequest</p>
 */
public class ExportTmpEffectReportDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

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

    private ExportTmpEffectReportDataRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
        this.tmpCode = builder.tmpCode;
        this.tmpName = builder.tmpName;
        this.vendorCode = builder.vendorCode;
        this.vendorName = builder.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportTmpEffectReportDataRequest create() {
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

    public static final class Builder extends Request.Builder<ExportTmpEffectReportDataRequest, Builder> {
        private String endDate; 
        private String startDate; 
        private String tmpCode; 
        private String tmpName; 
        private String vendorCode; 
        private String vendorName; 

        private Builder() {
            super();
        } 

        private Builder(ExportTmpEffectReportDataRequest request) {
            super(request);
            this.endDate = request.endDate;
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
        public ExportTmpEffectReportDataRequest build() {
            return new ExportTmpEffectReportDataRequest(this);
        } 

    } 

}
