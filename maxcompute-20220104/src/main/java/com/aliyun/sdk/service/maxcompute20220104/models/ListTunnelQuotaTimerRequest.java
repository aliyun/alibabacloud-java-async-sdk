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
 * {@link ListTunnelQuotaTimerRequest} extends {@link RequestModel}
 *
 * <p>ListTunnelQuotaTimerRequest</p>
 */
public class ListTunnelQuotaTimerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    private ListTunnelQuotaTimerRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTunnelQuotaTimerRequest create() {
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

    public static final class Builder extends Request.Builder<ListTunnelQuotaTimerRequest, Builder> {
        private String nickname; 

        private Builder() {
            super();
        } 

        private Builder(ListTunnelQuotaTimerRequest request) {
            super(request);
            this.nickname = request.nickname;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ot_tunnel_quota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        @Override
        public ListTunnelQuotaTimerRequest build() {
            return new ListTunnelQuotaTimerRequest(this);
        } 

    } 

}
