// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrincipalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrincipalsResponseBody</p>
 */
public class ListPrincipalsResponseBody extends TeaModel {
    @NameInMap("Principals")
    private java.util.List < Principals> principals;

    @NameInMap("RequestId")
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

    /**
     * @return principals
     */
    public java.util.List < Principals> getPrincipals() {
        return this.principals;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Principals> principals; 
        private String requestId; 

        /**
         * The RAM entities.
         */
        public Builder principals(java.util.List < Principals> principals) {
            this.principals = principals;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrincipalsResponseBody build() {
            return new ListPrincipalsResponseBody(this);
        } 

    } 

    public static class Principals extends TeaModel {
        @NameInMap("PrincipalId")
        private String principalId;

        @NameInMap("PrincipalType")
        private String principalType;

        private Principals(Builder builder) {
            this.principalId = builder.principalId;
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
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalType; 

            /**
             * The ID of the RAM entity.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * The type of the RAM entity. Valid values:
             * <p>
             * 
             * *   RamUser: a RAM user
             * *   RamRole: a RAM role
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
