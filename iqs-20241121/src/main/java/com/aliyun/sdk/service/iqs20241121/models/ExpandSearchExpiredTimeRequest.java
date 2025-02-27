// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ExpandSearchExpiredTimeRequest} extends {@link RequestModel}
 *
 * <p>ExpandSearchExpiredTimeRequest</p>
 */
public class ExpandSearchExpiredTimeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ExpendExpiredTimeRequest body;

    private ExpandSearchExpiredTimeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpandSearchExpiredTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ExpendExpiredTimeRequest getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ExpandSearchExpiredTimeRequest, Builder> {
        private ExpendExpiredTimeRequest body; 

        private Builder() {
            super();
        } 

        private Builder(ExpandSearchExpiredTimeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(ExpendExpiredTimeRequest body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ExpandSearchExpiredTimeRequest build() {
            return new ExpandSearchExpiredTimeRequest(this);
        } 

    } 

}
