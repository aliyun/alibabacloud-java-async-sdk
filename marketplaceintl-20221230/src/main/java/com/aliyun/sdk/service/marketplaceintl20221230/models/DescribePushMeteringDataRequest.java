// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20221230.models;

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
 * {@link DescribePushMeteringDataRequest} extends {@link RequestModel}
 *
 * <p>DescribePushMeteringDataRequest</p>
 */
public class DescribePushMeteringDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushOrderBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushOrderBizId;

    private DescribePushMeteringDataRequest(Builder builder) {
        super(builder);
        this.pushOrderBizId = builder.pushOrderBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePushMeteringDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pushOrderBizId
     */
    public String getPushOrderBizId() {
        return this.pushOrderBizId;
    }

    public static final class Builder extends Request.Builder<DescribePushMeteringDataRequest, Builder> {
        private String pushOrderBizId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePushMeteringDataRequest request) {
            super(request);
            this.pushOrderBizId = request.pushOrderBizId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pushData123456</p>
         */
        public Builder pushOrderBizId(String pushOrderBizId) {
            this.putQueryParameter("PushOrderBizId", pushOrderBizId);
            this.pushOrderBizId = pushOrderBizId;
            return this;
        }

        @Override
        public DescribePushMeteringDataRequest build() {
            return new DescribePushMeteringDataRequest(this);
        } 

    } 

}
