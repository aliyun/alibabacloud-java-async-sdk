// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInspectionRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateInspectionRecordRequest</p>
 */
public class CreateInspectionRecordRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    @Body
    @NameInMap("ResourceId")
    private String resourceId;

    private CreateInspectionRecordRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInspectionRecordRequest create() {
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

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<CreateInspectionRecordRequest, Builder> {
        private String operaUid; 
        private String productCode; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInspectionRecordRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
            this.resourceId = request.resourceId;
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

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public CreateInspectionRecordRequest build() {
            return new CreateInspectionRecordRequest(this);
        } 

    } 

}
