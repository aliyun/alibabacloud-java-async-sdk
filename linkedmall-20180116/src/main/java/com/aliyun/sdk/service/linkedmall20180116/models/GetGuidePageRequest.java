// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetGuidePageRequest} extends {@link RequestModel}
 *
 * <p>GetGuidePageRequest</p>
 */
public class GetGuidePageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    private GetGuidePageRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGuidePageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    public static final class Builder extends Request.Builder<GetGuidePageRequest, Builder> {
        private String bizId; 

        private Builder() {
            super();
        } 

        private Builder(GetGuidePageRequest request) {
            super(request);
            this.bizId = request.bizId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL2***100001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        @Override
        public GetGuidePageRequest build() {
            return new GetGuidePageRequest(this);
        } 

    } 

}
