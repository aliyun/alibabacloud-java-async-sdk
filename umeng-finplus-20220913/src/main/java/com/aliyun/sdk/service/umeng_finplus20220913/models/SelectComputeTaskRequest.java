// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link SelectComputeTaskRequest} extends {@link RequestModel}
 *
 * <p>SelectComputeTaskRequest</p>
 */
public class SelectComputeTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Long body;

    private SelectComputeTaskRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectComputeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Long getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SelectComputeTaskRequest, Builder> {
        private Long body; 

        private Builder() {
            super();
        } 

        private Builder(SelectComputeTaskRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Long body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public SelectComputeTaskRequest build() {
            return new SelectComputeTaskRequest(this);
        } 

    } 

}
