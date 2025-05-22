// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link DescribePartnerConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribePartnerConfigRequest</p>
 */
public class DescribePartnerConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartnerCode")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.wangwen</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jinsan</p>
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
