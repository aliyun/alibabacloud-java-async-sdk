// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInspectionWhitelistsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInspectionWhitelistsRequest</p>
 */
public class DescribeInspectionWhitelistsRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    private DescribeInspectionWhitelistsRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionWhitelistsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribeInspectionWhitelistsRequest, Builder> {
        private String operaUid; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInspectionWhitelistsRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribeInspectionWhitelistsRequest build() {
            return new DescribeInspectionWhitelistsRequest(this);
        } 

    } 

}
