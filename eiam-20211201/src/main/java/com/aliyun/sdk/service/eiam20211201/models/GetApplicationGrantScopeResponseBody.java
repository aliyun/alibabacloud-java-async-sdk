// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationGrantScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationGrantScopeResponseBody</p>
 */
public class GetApplicationGrantScopeResponseBody extends TeaModel {
    @NameInMap("ApplicationGrantScope")
    private ApplicationGrantScope applicationGrantScope;

    @NameInMap("RequestId")
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
         * 授权范围
         */
        public Builder applicationGrantScope(ApplicationGrantScope applicationGrantScope) {
            this.applicationGrantScope = applicationGrantScope;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationGrantScopeResponseBody build() {
            return new GetApplicationGrantScopeResponseBody(this);
        } 

    } 

    public static class ApplicationGrantScope extends TeaModel {
        @NameInMap("GrantScopes")
        private java.util.List < String > grantScopes;

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
        public java.util.List < String > getGrantScopes() {
            return this.grantScopes;
        }

        public static final class Builder {
            private java.util.List < String > grantScopes; 

            /**
             * 应用授权的api权限scope列表
             */
            public Builder grantScopes(java.util.List < String > grantScopes) {
                this.grantScopes = grantScopes;
                return this;
            }

            public ApplicationGrantScope build() {
                return new ApplicationGrantScope(this);
            } 

        } 

    }
}
