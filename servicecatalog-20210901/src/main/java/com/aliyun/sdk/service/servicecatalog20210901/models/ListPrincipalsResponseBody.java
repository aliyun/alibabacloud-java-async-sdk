// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListPrincipalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrincipalsResponseBody</p>
 */
public class ListPrincipalsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Principals")
    private java.util.List<Principals> principals;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrincipalsResponseBody(Builder builder) {
        this.principals = builder.principals;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrincipalsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return principals
     */
    public java.util.List<Principals> getPrincipals() {
        return this.principals;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Principals> principals; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrincipalsResponseBody model) {
            this.principals = model.principals;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The RAM entities.</p>
         */
        public Builder principals(java.util.List<Principals> principals) {
            this.principals = principals;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrincipalsResponseBody build() {
            return new ListPrincipalsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrincipalsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrincipalsResponseBody</p>
     */
    public static class Principals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalPattern")
        private String principalPattern;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Principals(Builder builder) {
            this.principalId = builder.principalId;
            this.principalPattern = builder.principalPattern;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Principals create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalPattern
         */
        public String getPrincipalPattern() {
            return this.principalPattern;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalPattern; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Principals model) {
                this.principalId = model.principalId;
                this.principalPattern = model.principalPattern;
                this.principalType = model.principalType;
            } 

            /**
             * <p>The ID of the RAM entity.</p>
             * 
             * <strong>example:</strong>
             * <p>24477111603637****</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * PrincipalPattern.
             */
            public Builder principalPattern(String principalPattern) {
                this.principalPattern = principalPattern;
                return this;
            }

            /**
             * <p>The type of the RAM entity. Valid values:</p>
             * <ul>
             * <li>RamUser: a RAM user</li>
             * <li>RamRole: a RAM role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Principals build() {
                return new Principals(this);
            } 

        } 

    }
}
