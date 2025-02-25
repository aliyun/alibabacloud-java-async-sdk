// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAliasesOutput} extends {@link TeaModel}
 *
 * <p>ListAliasesOutput</p>
 */
public class ListAliasesOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliases")
    private java.util.List < Alias > aliases;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListAliasesOutput(Builder builder) {
        this.aliases = builder.aliases;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliasesOutput create() {
        return builder().build();
    }

    /**
     * @return aliases
     */
    public java.util.List < Alias > getAliases() {
        return this.aliases;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Alias > aliases; 
        private String nextToken; 

        /**
         * aliases.
         */
        public Builder aliases(java.util.List < Alias > aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListAliasesOutput build() {
            return new ListAliasesOutput(this);
        } 

    } 

}
