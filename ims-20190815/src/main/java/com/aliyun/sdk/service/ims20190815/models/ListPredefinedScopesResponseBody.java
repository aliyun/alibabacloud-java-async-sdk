// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPredefinedScopesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPredefinedScopesResponseBody</p>
 */
public class ListPredefinedScopesResponseBody extends TeaModel {
    @NameInMap("PredefinedScopes")
    private PredefinedScopes predefinedScopes;

    @NameInMap("RequestId")
    private String requestId;

    private ListPredefinedScopesResponseBody(Builder builder) {
        this.predefinedScopes = builder.predefinedScopes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPredefinedScopesResponseBody create() {
        return builder().build();
    }

    /**
     * @return predefinedScopes
     */
    public PredefinedScopes getPredefinedScopes() {
        return this.predefinedScopes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PredefinedScopes predefinedScopes; 
        private String requestId; 

        /**
         * PredefinedScopes.
         */
        public Builder predefinedScopes(PredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPredefinedScopesResponseBody build() {
            return new ListPredefinedScopesResponseBody(this);
        } 

    } 

    public static class PredefinedScope extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        private PredefinedScope(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredefinedScope create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String name; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PredefinedScope build() {
                return new PredefinedScope(this);
            } 

        } 

    }
    public static class PredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        private java.util.List < PredefinedScope> predefinedScope;

        private PredefinedScopes(Builder builder) {
            this.predefinedScope = builder.predefinedScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredefinedScopes create() {
            return builder().build();
        }

        /**
         * @return predefinedScope
         */
        public java.util.List < PredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

        public static final class Builder {
            private java.util.List < PredefinedScope> predefinedScope; 

            /**
             * PredefinedScope.
             */
            public Builder predefinedScope(java.util.List < PredefinedScope> predefinedScope) {
                this.predefinedScope = predefinedScope;
                return this;
            }

            public PredefinedScopes build() {
                return new PredefinedScopes(this);
            } 

        } 

    }
}
