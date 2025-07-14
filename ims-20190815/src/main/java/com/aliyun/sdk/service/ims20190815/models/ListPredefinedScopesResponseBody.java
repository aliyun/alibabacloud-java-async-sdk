// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListPredefinedScopesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPredefinedScopesResponseBody</p>
 */
public class ListPredefinedScopesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PredefinedScopes")
    private PredefinedScopes predefinedScopes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListPredefinedScopesResponseBody model) {
            this.predefinedScopes = model.predefinedScopes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about application permissions.</p>
         */
        public Builder predefinedScopes(PredefinedScopes predefinedScopes) {
            this.predefinedScopes = predefinedScopes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>955C096D-EC99-480B-AF37-3921109107D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPredefinedScopesResponseBody build() {
            return new ListPredefinedScopesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPredefinedScopesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPredefinedScopesResponseBody</p>
     */
    public static class PredefinedScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(PredefinedScope model) {
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>The description of the permission scope.</p>
             * 
             * <strong>example:</strong>
             * <p>Obtain the OpenID of the user. This is the default permission that you cannot remove.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the permission scope.</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
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
    /**
     * 
     * {@link ListPredefinedScopesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPredefinedScopesResponseBody</p>
     */
    public static class PredefinedScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PredefinedScope")
        private java.util.List<PredefinedScope> predefinedScope;

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
        public java.util.List<PredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

        public static final class Builder {
            private java.util.List<PredefinedScope> predefinedScope; 

            private Builder() {
            } 

            private Builder(PredefinedScopes model) {
                this.predefinedScope = model.predefinedScope;
            } 

            /**
             * PredefinedScope.
             */
            public Builder predefinedScope(java.util.List<PredefinedScope> predefinedScope) {
                this.predefinedScope = predefinedScope;
                return this;
            }

            public PredefinedScopes build() {
                return new PredefinedScopes(this);
            } 

        } 

    }
}
