// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The enterprise code.</p>
         * 
         * <strong>example:</strong>
         * <p>C-20080808-1</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>Type of emission</p>
         * <blockquote>
         * <p> Valid values: footprint | emission. Meaning: footprint: all inventories are involved in the calculation; emission: only inventories with positive and zero emissions are involved in the calculation, and negative numbers are not involved in the calculation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>footprint</p>
         */
        public Builder emissionType(String emissionType) {
            this.putBodyParameter("emissionType", emissionType);
            this.emissionType = emissionType;
            return this;
        }

        /**
         * <p>Group by</p>
         * <blockquote>
         * <p> Valid values: resource | process | resourceType | processType. Meaning: resource: aggregation by inventory group, process: aggregation by operation group, resourceType: aggregation by inventory type, processType: aggregation by phase group</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>resource</p>
         */
        public Builder group(String group) {
            this.putBodyParameter("group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The type of the obtained environmental impact: gwp indicates the carbon footprint of climate change. 
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/energy-expert/developer-reference/enumerated-values-of-energy-expert#RhGn7">For more information, see the environment impact category enumeration.</a></props></p>
         * 
         * <strong>example:</strong>
         * <p>gwp</p>
         */
        public Builder methodType(String methodType) {
            this.putBodyParameter("methodType", methodType);
            this.methodType = methodType;
            return this;
        }

        /**
         * <p>The product id.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder productId(Long productId) {
            this.putBodyParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>Product type: 1 indicates that the carbon footprint of the product is requested, and 5 indicates that the carbon footprint of the supply chain is requested.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
