// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetApplicationGrantScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationGrantScopeResponseBody</p>
 */
public class GetApplicationGrantScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationGrantScope")
    private ApplicationGrantScope applicationGrantScope;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationGrantScopeResponseBody(Builder builder) {
        this.applicationGrantScope = builder.applicationGrantScope;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationGrantScopeResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationGrantScope
     */
    public ApplicationGrantScope getApplicationGrantScope() {
        return this.applicationGrantScope;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationGrantScope applicationGrantScope; 
        private String requestId; 

        /**
         * <p>The permissions of the Developer API feature.</p>
         */
        public Builder applicationGrantScope(ApplicationGrantScope applicationGrantScope) {
            this.applicationGrantScope = applicationGrantScope;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationGrantScopeResponseBody build() {
            return new GetApplicationGrantScopeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationGrantScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationGrantScopeResponseBody</p>
     */
    public static class ApplicationGrantScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantScopes")
        private java.util.List<String> grantScopes;

        private ApplicationGrantScope(Builder builder) {
            this.grantScopes = builder.grantScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationGrantScope create() {
            return builder().build();
        }

        /**
         * @return grantScopes
         */
        public java.util.List<String> getGrantScopes() {
            return this.grantScopes;
        }

        public static final class Builder {
            private java.util.List<String> grantScopes; 

            /**
             * <p>The permissions of the Developer API feature.</p>
             */
            public Builder grantScopes(java.util.List<String> grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            public ApplicationGrantScope build() {
                return new ApplicationGrantScope(this);
            } 

        } 

    }
}
