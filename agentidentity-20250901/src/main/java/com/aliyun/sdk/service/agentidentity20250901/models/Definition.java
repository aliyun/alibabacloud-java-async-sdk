// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link Definition} extends {@link TeaModel}
 *
 * <p>Definition</p>
 */
public class Definition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cedar")
    private Cedar cedar;

    private Definition(Builder builder) {
        this.cedar = builder.cedar;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Definition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cedar
     */
    public Cedar getCedar() {
        return this.cedar;
    }

    public static final class Builder {
        private Cedar cedar; 

        private Builder() {
        } 

        private Builder(Definition model) {
            this.cedar = model.cedar;
        } 

        /**
         * Cedar.
         */
        public Builder cedar(Cedar cedar) {
            this.cedar = cedar;
            return this;
        }

        public Definition build() {
            return new Definition(this);
        } 

    } 

    /**
     * 
     * {@link Definition} extends {@link TeaModel}
     *
     * <p>Definition</p>
     */
    public static class Cedar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statement")
        private String statement;

        private Cedar(Builder builder) {
            this.statement = builder.statement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cedar create() {
            return builder().build();
        }

        /**
         * @return statement
         */
        public String getStatement() {
            return this.statement;
        }

        public static final class Builder {
            private String statement; 

            private Builder() {
            } 

            private Builder(Cedar model) {
                this.statement = model.statement;
            } 

            /**
             * Statement.
             */
            public Builder statement(String statement) {
                this.statement = statement;
                return this;
            }

            public Cedar build() {
                return new Cedar(this);
            } 

        } 

    }
}
