// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceStatusRequest</p>
 */
public class DescribeInstanceStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private Integer productType;

    private DescribeInstanceStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return productType
     */
    public Integer getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceStatusRequest, Builder> {
        private String instanceId; 
        private Integer productType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.productType = request.productType;
        } 

        /**
         * The ID of the instance to query.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the instance to query. Valid values:
         * <p>
         * 
         * *   **1**: an Anti-DDoS Pro instance
         * *   **2**: an Anti-DDoS Premium instance
         */
        public Builder productType(Integer productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public DescribeInstanceStatusRequest build() {
            return new DescribeInstanceStatusRequest(this);
        } 

    } 

}
