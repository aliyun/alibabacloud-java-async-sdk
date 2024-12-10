// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UserQuotaPermission} extends {@link TeaModel}
 *
 * <p>UserQuotaPermission</p>
 */
public class UserQuotaPermission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List < String > permissions;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    private UserQuotaPermission(Builder builder) {
        this.permissions = builder.permissions;
        this.quotaId = builder.quotaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserQuotaPermission create() {
        return builder().build();
    }

    /**
     * @return permissions
     */
    public java.util.List < String > getPermissions() {
        return this.permissions;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    public static final class Builder {
        private java.util.List < String > permissions; 
        private String quotaId; 

        /**
         * Permissions.
         */
        public Builder permissions(java.util.List < String > permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        public UserQuotaPermission build() {
            return new UserQuotaPermission(this);
        } 

    } 

}
