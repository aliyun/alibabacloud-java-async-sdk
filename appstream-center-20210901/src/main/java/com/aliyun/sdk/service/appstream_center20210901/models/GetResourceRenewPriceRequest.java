// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetResourceRenewPriceRequest} extends {@link RequestModel}
 *
 * <p>GetResourceRenewPriceRequest</p>
 */
public class GetResourceRenewPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private GetResourceRenewPriceRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceRenewPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<GetResourceRenewPriceRequest, Builder> {
        private String appInstanceGroupId; 
        private Long period; 
        private String periodUnit; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceRenewPriceRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.productType = request.productType;
        } 

        /**
         * <p>The ID of the delivery group. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The subscription duration of resources. This parameter must be configured together with <code>PeriodUnit</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter must be configured together with <code>Period</code>. The following items describe valid values for the combinations of <code>Period</code> and <code>PeriodUnit</code>:</p>
         * <ul>
         * <li>1 Week</li>
         * <li>1 Month</li>
         * <li>2 Month</li>
         * <li>3 Month</li>
         * <li>6 Month</li>
         * <li>1 Year</li>
         * <li>2 Year</li>
         * <li>3 Year</li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter is case-insensitive. For example, <code>Week</code> is valid and <code>week</code> is invalid. If you specify a value combination other than the preceding combinations, such as <code>2 Week</code>, the operation can still be called. However, an error occurs when you place the order.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The product type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CloudApp: App Streaming</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public GetResourceRenewPriceRequest build() {
            return new GetResourceRenewPriceRequest(this);
        } 

    } 

}
