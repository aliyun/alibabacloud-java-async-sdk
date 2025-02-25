// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableCheckResourceRequest} extends {@link RequestModel}
 *
 * <p>DisableCheckResourceRequest</p>
 */
public class DisableCheckResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceArn;

    private DisableCheckResourceRequest(Builder builder) {
        super(builder);
        this.resourceArn = builder.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableCheckResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    public static final class Builder extends Request.Builder<DisableCheckResourceRequest, Builder> {
        private String resourceArn; 

        private Builder() {
            super();
        } 

        private Builder(DisableCheckResourceRequest request) {
            super(request);
            this.resourceArn = request.resourceArn;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
         */
        public Builder resourceArn(String resourceArn) {
            this.putBodyParameter("ResourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        @Override
        public DisableCheckResourceRequest build() {
            return new DisableCheckResourceRequest(this);
        } 

    } 

}
