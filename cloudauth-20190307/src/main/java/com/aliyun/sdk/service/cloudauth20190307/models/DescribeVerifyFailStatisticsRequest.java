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
 * {@link DescribeVerifyFailStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifyFailStatisticsRequest</p>
 */
public class DescribeVerifyFailStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgeGt")
    private String ageGt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Api")
    @com.aliyun.core.annotation.Validation(required = true)
    private String api;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    private DescribeVerifyFailStatisticsRequest(Builder builder) {
        super(builder);
        this.ageGt = builder.ageGt;
        this.api = builder.api;
        this.deviceType = builder.deviceType;
        this.endDate = builder.endDate;
        this.productCode = builder.productCode;
        this.serviceCode = builder.serviceCode;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyFailStatisticsRequest create() {
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
     * @return api
     */
    public String getApi() {
        return this.api;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
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

    public static final class Builder extends Request.Builder<DescribeVerifyFailStatisticsRequest, Builder> {
        private String ageGt; 
        private String api; 
        private String deviceType; 
        private Long endDate; 
        private String productCode; 
        private String serviceCode; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifyFailStatisticsRequest request) {
            super(request);
            this.ageGt = request.ageGt;
            this.api = request.api;
            this.deviceType = request.deviceType;
            this.endDate = request.endDate;
            this.productCode = request.productCode;
            this.serviceCode = request.serviceCode;
            this.startDate = request.startDate;
        } 

        /**
         * <p>Age greater than 14 years old:</p>
         * <ul>
         * <li><strong>T</strong>: Greater than</li>
         * <li><strong>F</strong>: Less than</li>
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
         * <p>API code:</p>
         * <ul>
         * <li><strong>INIT_SERVICE</strong>: Server-side initialization failure</li>
         * <li><strong>INIT_DEVICE</strong>: Client-side failure</li>
         * <li><strong>VERIFY_DEVICE</strong>: Authentication failed</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INIT_SERVICE</p>
         */
        public Builder api(String api) {
            this.putQueryParameter("Api", api);
            this.api = api;
            return this;
        }

        /**
         * <p>Device type.</p>
         * <ul>
         * <li>ios</li>
         * <li>android</li>
         * <li>websdk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ios</p>
         */
        public Builder deviceType(String deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>End time of the query.</p>
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
         * <p>Product code.</p>
         * <p>This parameter is required.</p>
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
         * <p>cloudauthst</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * <p>Start time of the query.</p>
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
        public DescribeVerifyFailStatisticsRequest build() {
            return new DescribeVerifyFailStatisticsRequest(this);
        } 

    } 

}
