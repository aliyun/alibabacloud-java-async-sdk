// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetTerraformPricingMappingsRequest} extends {@link RequestModel}
 *
 * <p>GetTerraformPricingMappingsRequest</p>
 */
public class GetTerraformPricingMappingsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    private GetTerraformPricingMappingsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTerraformPricingMappingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetTerraformPricingMappingsRequest, Builder> {
        private java.util.Map<String, ?> body; 

        private Builder() {
            super();
        } 

        private Builder(GetTerraformPricingMappingsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The request body. The resourceTypes field specifies a list of Terraform resource types, such as alicloud_instance. You can specify a maximum of 200 resource types in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;resourceTypes&quot;: [
         *     &quot;alicloud_instance&quot;,
         *     &quot;alicloud_vpc&quot;
         *   ]
         * }</p>
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetTerraformPricingMappingsRequest build() {
            return new GetTerraformPricingMappingsRequest(this);
        } 

    } 

}
