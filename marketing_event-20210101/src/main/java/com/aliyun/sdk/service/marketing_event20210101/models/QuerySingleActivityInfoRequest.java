// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySingleActivityInfoRequest} extends {@link RequestModel}
 *
 * <p>QuerySingleActivityInfoRequest</p>
 */
public class QuerySingleActivityInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyName")
    private String companyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerName")
    private String customerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QRCode")
    private String QRCode;

    private QuerySingleActivityInfoRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.companyName = builder.companyName;
        this.customerName = builder.customerName;
        this.mobile = builder.mobile;
        this.QRCode = builder.QRCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySingleActivityInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return companyName
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * @return customerName
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return QRCode
     */
    public String getQRCode() {
        return this.QRCode;
    }

    public static final class Builder extends Request.Builder<QuerySingleActivityInfoRequest, Builder> {
        private String activityId; 
        private String companyName; 
        private String customerName; 
        private String mobile; 
        private String QRCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySingleActivityInfoRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.companyName = request.companyName;
            this.customerName = request.customerName;
            this.mobile = request.mobile;
            this.QRCode = request.QRCode;
        } 

        /**
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * CompanyName.
         */
        public Builder companyName(String companyName) {
            this.putQueryParameter("CompanyName", companyName);
            this.companyName = companyName;
            return this;
        }

        /**
         * CustomerName.
         */
        public Builder customerName(String customerName) {
            this.putQueryParameter("CustomerName", customerName);
            this.customerName = customerName;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * QRCode.
         */
        public Builder QRCode(String QRCode) {
            this.putQueryParameter("QRCode", QRCode);
            this.QRCode = QRCode;
            return this;
        }

        @Override
        public QuerySingleActivityInfoRequest build() {
            return new QuerySingleActivityInfoRequest(this);
        } 

    } 

}
