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
 * {@link DescribeVerifyStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifyStatisticsRequest</p>
 */
public class DescribeVerifyStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgeGt")
    private String ageGt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    private DescribeVerifyStatisticsRequest(Builder builder) {
        super(builder);
        this.ageGt = builder.ageGt;
        this.endDate = builder.endDate;
        this.productCode = builder.productCode;
        this.serviceCode = builder.serviceCode;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ageGt
     */
    public String getAgeGt() {
        return this.ageGt;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeVerifyStatisticsRequest, Builder> {
        private String ageGt; 
        private Long endDate; 
        private String productCode; 
        private String serviceCode; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifyStatisticsRequest request) {
            super(request);
            this.ageGt = request.ageGt;
            this.endDate = request.endDate;
            this.productCode = request.productCode;
            this.serviceCode = request.serviceCode;
            this.startDate = request.startDate;
        } 

        /**
         * <p>Whether the age is over 14 years old:</p>
         * <ul>
         * <li><strong>T</strong>: Over</li>
         * <li><strong>F</strong>: Under</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>T</p>
         */
        public Builder ageGt(String ageGt) {
            this.putQueryParameter("AgeGt", ageGt);
            this.ageGt = ageGt;
            return this;
        }

        /**
         * <p>End date of the query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1760630399999</p>
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Product Code.</p>
         * 
         * <strong>example:</strong>
         * <p>ID_PRO</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Service type:</p>
         * <ul>
         * <li><strong>antcloudauth</strong>: Financial-grade real-person authentication.</li>
         * <li><strong>cloudauthst</strong> (discontinued): Enhanced real-person authentication.</li>
         * <li><strong>cloudauth</strong> (discontinued): Real-person authentication.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>antcloudauth</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Start date of the query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1760025600000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeVerifyStatisticsRequest build() {
            return new DescribeVerifyStatisticsRequest(this);
        } 

    } 

}
