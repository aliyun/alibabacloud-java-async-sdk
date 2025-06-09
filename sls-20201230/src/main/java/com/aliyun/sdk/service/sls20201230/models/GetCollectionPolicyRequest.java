// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetCollectionPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetCollectionPolicyRequest</p>
 */
public class GetCollectionPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 63, minLength = 3)
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataCode")
    private String dataCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productCode")
    private String productCode;

    private GetCollectionPolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.dataCode = builder.dataCode;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCollectionPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return dataCode
     */
    public String getDataCode() {
        return this.dataCode;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<GetCollectionPolicyRequest, Builder> {
        private String policyName; 
        private String dataCode; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(GetCollectionPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.dataCode = request.dataCode;
            this.productCode = request.productCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>your_log_policy</p>
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * dataCode.
         */
        public Builder dataCode(String dataCode) {
            this.putQueryParameter("dataCode", dataCode);
            this.dataCode = dataCode;
            return this;
        }

        /**
         * productCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public GetCollectionPolicyRequest build() {
            return new GetCollectionPolicyRequest(this);
        } 

    } 

}
