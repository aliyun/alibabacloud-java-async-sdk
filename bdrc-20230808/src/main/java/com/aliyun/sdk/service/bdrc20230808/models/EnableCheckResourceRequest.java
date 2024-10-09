// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableCheckResourceRequest} extends {@link RequestModel}
 *
 * <p>EnableCheckResourceRequest</p>
 */
public class EnableCheckResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceArn;

    private EnableCheckResourceRequest(Builder builder) {
        super(builder);
        this.resourceArn = builder.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCheckResourceRequest create() {
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

    public static final class Builder extends Request.Builder<EnableCheckResourceRequest, Builder> {
        private String resourceArn; 

        private Builder() {
            super();
        } 

        private Builder(EnableCheckResourceRequest request) {
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
        public EnableCheckResourceRequest build() {
            return new EnableCheckResourceRequest(this);
        } 

    } 

}
