// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySnapshotCallbackAuthResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySnapshotCallbackAuthResponseBody</p>
 */
public class QuerySnapshotCallbackAuthResponseBody extends TeaModel {
    @NameInMap("CallbackAuthKey")
    private String callbackAuthKey;

    @NameInMap("CallbackReqAuth")
    private String callbackReqAuth;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    private QuerySnapshotCallbackAuthResponseBody(Builder builder) {
        this.callbackAuthKey = builder.callbackAuthKey;
        this.callbackReqAuth = builder.callbackReqAuth;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySnapshotCallbackAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return callbackAuthKey
     */
    public String getCallbackAuthKey() {
        return this.callbackAuthKey;
    }

    /**
     * @return callbackReqAuth
     */
    public String getCallbackReqAuth() {
        return this.callbackReqAuth;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String callbackAuthKey; 
        private String callbackReqAuth; 
        private String domainName; 
        private String requestId; 

        /**
         * CallbackAuthKey.
         */
        public Builder callbackAuthKey(String callbackAuthKey) {
            this.callbackAuthKey = callbackAuthKey;
            return this;
        }

        /**
         * CallbackReqAuth.
         */
        public Builder callbackReqAuth(String callbackReqAuth) {
            this.callbackReqAuth = callbackReqAuth;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySnapshotCallbackAuthResponseBody build() {
            return new QuerySnapshotCallbackAuthResponseBody(this);
        } 

    } 

}
