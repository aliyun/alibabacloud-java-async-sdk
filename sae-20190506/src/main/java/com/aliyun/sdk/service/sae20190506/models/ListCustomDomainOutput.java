// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListCustomDomainOutput} extends {@link TeaModel}
 *
 * <p>ListCustomDomainOutput</p>
 */
public class ListCustomDomainOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("customDomains")
    private java.util.List<CustomDomain> customDomains;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListCustomDomainOutput(Builder builder) {
        this.customDomains = builder.customDomains;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomDomainOutput create() {
        return builder().build();
    }

    /**
     * @return customDomains
     */
    public java.util.List<CustomDomain> getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CustomDomain> customDomains; 
        private String nextToken; 
        private String requestId; 

        /**
         * customDomains.
         */
        public Builder customDomains(java.util.List<CustomDomain> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCustomDomainOutput build() {
            return new ListCustomDomainOutput(this);
        } 

    } 

}
