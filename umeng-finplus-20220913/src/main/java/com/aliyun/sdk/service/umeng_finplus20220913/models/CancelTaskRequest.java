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
 * {@link CancelTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelTaskRequest</p>
 */
public class CancelTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Long body;

    private CancelTaskRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelTaskRequest create() {
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

    public static final class Builder extends Request.Builder<CancelTaskRequest, Builder> {
        private Long body; 

        private Builder() {
            super();
        } 

        private Builder(CancelTaskRequest request) {
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
        public CancelTaskRequest build() {
            return new CancelTaskRequest(this);
        } 

    } 

}
