// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetComputeEffectivePlanRequest} extends {@link RequestModel}
 *
 * <p>GetComputeEffectivePlanRequest</p>
 */
public class GetComputeEffectivePlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    private GetComputeEffectivePlanRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeEffectivePlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    public static final class Builder extends Request.Builder<GetComputeEffectivePlanRequest, Builder> {
        private String nickname; 

        private Builder() {
            super();
        } 

        private Builder(GetComputeEffectivePlanRequest request) {
            super(request);
            this.nickname = request.nickname;
        } 

        /**
         * <p>The nickname of level-1 compute quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_ComputeQuota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        @Override
        public GetComputeEffectivePlanRequest build() {
            return new GetComputeEffectivePlanRequest(this);
        } 

    } 

}
