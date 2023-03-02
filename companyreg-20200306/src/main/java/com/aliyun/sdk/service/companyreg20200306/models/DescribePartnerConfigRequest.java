// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePartnerConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribePartnerConfigRequest</p>
 */
public class DescribePartnerConfigRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("PartnerCode")
    @Validation(required = true)
    private String partnerCode;

    private DescribePartnerConfigRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.partnerCode = builder.partnerCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePartnerConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return partnerCode
     */
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public static final class Builder extends Request.Builder<DescribePartnerConfigRequest, Builder> {
        private String bizType; 
        private String partnerCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribePartnerConfigRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.partnerCode = request.partnerCode;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * PartnerCode.
         */
        public Builder partnerCode(String partnerCode) {
            this.putQueryParameter("PartnerCode", partnerCode);
            this.partnerCode = partnerCode;
            return this;
        }

        @Override
        public DescribePartnerConfigRequest build() {
            return new DescribePartnerConfigRequest(this);
        } 

    } 

}
