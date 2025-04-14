// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceStatusRequest</p>
 */
public class DescribeInstanceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the Anti-DDoS Proxy instance to query.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all Anti-DDoS Proxy (Chinese Mainland) or Anti-DDoS Proxy (Outside Chinese Mainland) instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-6ja1y6p5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the Anti-DDoS Proxy instance to query. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: an Anti-DDoS Proxy (Chinese Mainland) instance</li>
         * <li><strong>2</strong>: an Anti-DDoS Proxy (Outside Chinese Mainland) instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
