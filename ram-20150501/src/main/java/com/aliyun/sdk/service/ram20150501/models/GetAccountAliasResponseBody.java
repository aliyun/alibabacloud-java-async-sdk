// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GetAccountAliasResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountAliasResponseBody</p>
 */
public class GetAccountAliasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountAlias")
    private String accountAlias;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccountAliasResponseBody(Builder builder) {
        this.accountAlias = builder.accountAlias;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountAliasResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountAlias
     */
    public String getAccountAlias() {
        return this.accountAlias;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accountAlias; 
        private String requestId; 

        /**
         * <p>The alias of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>myalias</p>
         */
        public Builder accountAlias(String accountAlias) {
            this.accountAlias = accountAlias;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountAliasResponseBody build() {
            return new GetAccountAliasResponseBody(this);
        } 

    } 

}
