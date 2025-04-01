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
 * {@link GetQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaRequest</p>
 */
public class GetQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("mock")
    private Boolean mock;

    private GetQuotaRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.mock = builder.mock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaRequest create() {
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
     * @return mock
     */
    public Boolean getMock() {
        return this.mock;
    }

    public static final class Builder extends Request.Builder<GetQuotaRequest, Builder> {
        private String nickname; 
        private Boolean mock; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.mock = request.mock;
        } 

        /**
         * <p>The name of the quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_a</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>Specifies whether to include submodules. Valid values: -true: The request includes submodules. -false: The request does not include submodules. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder mock(Boolean mock) {
            this.putQueryParameter("mock", mock);
            this.mock = mock;
            return this;
        }

        @Override
        public GetQuotaRequest build() {
            return new GetQuotaRequest(this);
        } 

    } 

}
