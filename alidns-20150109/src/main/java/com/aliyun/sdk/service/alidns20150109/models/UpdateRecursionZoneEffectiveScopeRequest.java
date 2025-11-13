// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateRecursionZoneEffectiveScopeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecursionZoneEffectiveScopeRequest</p>
 */
public class UpdateRecursionZoneEffectiveScopeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveScopes")
    private java.util.List<EffectiveScopes> effectiveScopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private UpdateRecursionZoneEffectiveScopeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.effectiveScopes = builder.effectiveScopes;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecursionZoneEffectiveScopeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return effectiveScopes
     */
    public java.util.List<EffectiveScopes> getEffectiveScopes() {
        return this.effectiveScopes;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpdateRecursionZoneEffectiveScopeRequest, Builder> {
        private String clientToken; 
        private java.util.List<EffectiveScopes> effectiveScopes; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecursionZoneEffectiveScopeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.effectiveScopes = request.effectiveScopes;
            this.zoneId = request.zoneId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EffectiveScopes.
         */
        public Builder effectiveScopes(java.util.List<EffectiveScopes> effectiveScopes) {
            String effectiveScopesShrink = shrink(effectiveScopes, "EffectiveScopes", "json");
            this.putQueryParameter("EffectiveScopes", effectiveScopesShrink);
            this.effectiveScopes = effectiveScopes;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateRecursionZoneEffectiveScopeRequest build() {
            return new UpdateRecursionZoneEffectiveScopeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRecursionZoneEffectiveScopeRequest} extends {@link TeaModel}
     *
     * <p>UpdateRecursionZoneEffectiveScopeRequest</p>
     */
    public static class EffectiveScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveType")
        private String effectiveType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private java.util.List<String> scope;

        private EffectiveScopes(Builder builder) {
            this.effectiveType = builder.effectiveType;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveScopes create() {
            return builder().build();
        }

        /**
         * @return effectiveType
         */
        public String getEffectiveType() {
            return this.effectiveType;
        }

        /**
         * @return scope
         */
        public java.util.List<String> getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String effectiveType; 
            private java.util.List<String> scope; 

            private Builder() {
            } 

            private Builder(EffectiveScopes model) {
                this.effectiveType = model.effectiveType;
                this.scope = model.scope;
            } 

            /**
             * EffectiveType.
             */
            public Builder effectiveType(String effectiveType) {
                this.effectiveType = effectiveType;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(java.util.List<String> scope) {
                this.scope = scope;
                return this;
            }

            public EffectiveScopes build() {
                return new EffectiveScopes(this);
            } 

        } 

    }
}
