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
 * {@link GetComputeQuotaPlanRequest} extends {@link RequestModel}
 *
 * <p>GetComputeQuotaPlanRequest</p>
 */
public class GetComputeQuotaPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planName;

    private GetComputeQuotaPlanRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.planName = builder.planName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeQuotaPlanRequest create() {
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

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    public static final class Builder extends Request.Builder<GetComputeQuotaPlanRequest, Builder> {
        private String nickname; 
        private String planName; 

        private Builder() {
            super();
        } 

        private Builder(GetComputeQuotaPlanRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.planName = request.planName;
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

        /**
         * <p>The name of quota plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        public Builder planName(String planName) {
            this.putPathParameter("planName", planName);
            this.planName = planName;
            return this;
        }

        @Override
        public GetComputeQuotaPlanRequest build() {
            return new GetComputeQuotaPlanRequest(this);
        } 

    } 

}
