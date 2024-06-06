// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventoryListRequest} extends {@link RequestModel}
 *
 * <p>GetInventoryListRequest</p>
 */
public class GetInventoryListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("emissionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String emissionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("methodType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String methodType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long productType;

    private GetInventoryListRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.emissionType = builder.emissionType;
        this.group = builder.group;
        this.methodType = builder.methodType;
        this.productId = builder.productId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventoryListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return emissionType
     */
    public String getEmissionType() {
        return this.emissionType;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return methodType
     */
    public String getMethodType() {
        return this.methodType;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return productType
     */
    public Long getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<GetInventoryListRequest, Builder> {
        private String code; 
        private String emissionType; 
        private String group; 
        private String methodType; 
        private Long productId; 
        private Long productType; 

        private Builder() {
            super();
        } 

        private Builder(GetInventoryListRequest request) {
            super(request);
            this.code = request.code;
            this.emissionType = request.emissionType;
            this.group = request.group;
            this.methodType = request.methodType;
            this.productId = request.productId;
            this.productType = request.productType;
        } 

        /**
         * The enterprise code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * Type of emission
         * <p>
         * 
         * >  Valid values: footprint | emission. Meaning: footprint: all inventories are involved in the calculation; emission: only inventories with positive and zero emissions are involved in the calculation, and negative numbers are not involved in the calculation.
         */
        public Builder emissionType(String emissionType) {
            this.putBodyParameter("emissionType", emissionType);
            this.emissionType = emissionType;
            return this;
        }

        /**
         * Group by
         * <p>
         * 
         * >  Valid values: resource | process | resourceType | processType. Meaning: resource: aggregation by inventory group, process: aggregation by operation group, resourceType: aggregation by inventory type, processType: aggregation by phase group
         */
        public Builder group(String group) {
            this.putBodyParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * The type of the obtained environmental impact: gwp indicates the carbon footprint of climate change. For more information, see the type value of the enumerated values.
         */
        public Builder methodType(String methodType) {
            this.putBodyParameter("methodType", methodType);
            this.methodType = methodType;
            return this;
        }

        /**
         * The product id.
         */
        public Builder productId(Long productId) {
            this.putBodyParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * Product type: 1 indicates that the carbon footprint of the product is requested, and 5 indicates that the carbon footprint of the supply chain is requested.
         */
        public Builder productType(Long productType) {
            this.putBodyParameter("productType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public GetInventoryListRequest build() {
            return new GetInventoryListRequest(this);
        } 

    } 

}
