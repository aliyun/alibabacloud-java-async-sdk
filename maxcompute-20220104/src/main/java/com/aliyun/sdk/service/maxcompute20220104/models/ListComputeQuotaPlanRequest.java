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
 * {@link ListComputeQuotaPlanRequest} extends {@link RequestModel}
 *
 * <p>ListComputeQuotaPlanRequest</p>
 */
public class ListComputeQuotaPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    private ListComputeQuotaPlanRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeQuotaPlanRequest create() {
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

    public static final class Builder extends Request.Builder<ListComputeQuotaPlanRequest, Builder> {
        private String nickname; 

        private Builder() {
            super();
        } 

        private Builder(ListComputeQuotaPlanRequest request) {
            super(request);
            this.nickname = request.nickname;
        } 

        /**
         * <p>The nickname of level-1 compute quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_MyQuota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        @Override
        public ListComputeQuotaPlanRequest build() {
            return new ListComputeQuotaPlanRequest(this);
        } 

    } 

}
