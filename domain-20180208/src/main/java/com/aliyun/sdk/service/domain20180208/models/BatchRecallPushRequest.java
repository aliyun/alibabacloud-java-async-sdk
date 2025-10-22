// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link BatchRecallPushRequest} extends {@link RequestModel}
 *
 * <p>BatchRecallPushRequest</p>
 */
public class BatchRecallPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutBizIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> outBizIds;

    private BatchRecallPushRequest(Builder builder) {
        super(builder);
        this.outBizIds = builder.outBizIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRecallPushRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outBizIds
     */
    public java.util.List<String> getOutBizIds() {
        return this.outBizIds;
    }

    public static final class Builder extends Request.Builder<BatchRecallPushRequest, Builder> {
        private java.util.List<String> outBizIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchRecallPushRequest request) {
            super(request);
            this.outBizIds = request.outBizIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;NL12312323123&quot;, &quot;NL12312323124&quot;]</p>
         */
        public Builder outBizIds(java.util.List<String> outBizIds) {
            String outBizIdsShrink = shrink(outBizIds, "OutBizIds", "json");
            this.putQueryParameter("OutBizIds", outBizIdsShrink);
            this.outBizIds = outBizIds;
            return this;
        }

        @Override
        public BatchRecallPushRequest build() {
            return new BatchRecallPushRequest(this);
        } 

    } 

}
