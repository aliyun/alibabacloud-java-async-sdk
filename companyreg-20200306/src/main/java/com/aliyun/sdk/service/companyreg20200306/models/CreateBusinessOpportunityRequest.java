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
 * {@link CreateBusinessOpportunityRequest} extends {@link RequestModel}
 *
 * <p>CreateBusinessOpportunityRequest</p>
 */
public class CreateBusinessOpportunityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VCode")
    private String vCode;

    private CreateBusinessOpportunityRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.contactName = builder.contactName;
        this.mobile = builder.mobile;
        this.source = builder.source;
        this.vCode = builder.vCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBusinessOpportunityRequest create() {
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
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return source
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * @return vCode
     */
    public String getVCode() {
        return this.vCode;
    }

    public static final class Builder extends Request.Builder<CreateBusinessOpportunityRequest, Builder> {
        private String bizType; 
        private String contactName; 
        private String mobile; 
        private Integer source; 
        private String vCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateBusinessOpportunityRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.contactName = request.contactName;
            this.mobile = request.mobile;
            this.source = request.source;
            this.vCode = request.vCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.hightech</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18704330000</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder source(Integer source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * VCode.
         */
        public Builder vCode(String vCode) {
            this.putQueryParameter("VCode", vCode);
            this.vCode = vCode;
            return this;
        }

        @Override
        public CreateBusinessOpportunityRequest build() {
            return new CreateBusinessOpportunityRequest(this);
        } 

    } 

}
