// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link QuerySnapshotCallbackAuthResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySnapshotCallbackAuthResponseBody</p>
 */
public class QuerySnapshotCallbackAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallbackAuthKey")
    private String callbackAuthKey;

    @com.aliyun.core.annotation.NameInMap("CallbackReqAuth")
    private String callbackReqAuth;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QuerySnapshotCallbackAuthResponseBody model) {
            this.callbackAuthKey = model.callbackAuthKey;
            this.callbackReqAuth = model.callbackReqAuth;
            this.domainName = model.domainName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The callback authentication key.</p>
         * 
         * <strong>example:</strong>
         * <p>yourkey</p>
         */
        public Builder callbackAuthKey(String callbackAuthKey) {
            this.callbackAuthKey = callbackAuthKey;
            return this;
        }

        /**
         * <p>Indicates whether callback authentication is enabled. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: Callback authentication is enabled.</li>
         * <li><strong>no</strong>: Callback authentication is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder callbackReqAuth(String callbackReqAuth) {
            this.callbackReqAuth = callbackReqAuth;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD5</p>
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
