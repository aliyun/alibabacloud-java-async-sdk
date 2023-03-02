// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserNeedAuthResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserNeedAuthResponseBody</p>
 */
public class QueryUserNeedAuthResponseBody extends TeaModel {
    @NameInMap("NeedAuth")
    private Boolean needAuth;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryUserNeedAuthResponseBody(Builder builder) {
        this.needAuth = builder.needAuth;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserNeedAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return needAuth
     */
    public Boolean getNeedAuth() {
        return this.needAuth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean needAuth; 
        private String requestId; 
        private Boolean success; 

        /**
         * NeedAuth.
         */
        public Builder needAuth(Boolean needAuth) {
            this.needAuth = needAuth;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUserNeedAuthResponseBody build() {
            return new QueryUserNeedAuthResponseBody(this);
        } 

    } 

}
