// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomDomainOutput} extends {@link TeaModel}
 *
 * <p>ListCustomDomainOutput</p>
 */
public class ListCustomDomainOutput extends TeaModel {
    @NameInMap("customDomains")
    private java.util.List < CustomDomain > customDomains;

    @NameInMap("nextToken")
    private String nextToken;

    private ListCustomDomainOutput(Builder builder) {
        this.customDomains = builder.customDomains;
        this.nextToken = builder.nextToken;
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
    public java.util.List < CustomDomain > getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < CustomDomain > customDomains; 
        private String nextToken; 

        /**
         * customDomains.
         */
        public Builder customDomains(java.util.List < CustomDomain > customDomains) {
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

        public ListCustomDomainOutput build() {
            return new ListCustomDomainOutput(this);
        } 

    } 

}
