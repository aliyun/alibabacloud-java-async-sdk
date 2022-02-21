// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsUserAdminResponseBody} extends {@link TeaModel}
 *
 * <p>IsUserAdminResponseBody</p>
 */
public class IsUserAdminResponseBody extends TeaModel {
    @NameInMap("IsAdmin")
    private Boolean isAdmin;

    @NameInMap("IsAllow")
    private Boolean isAllow;

    @NameInMap("RequestId")
    private String requestId;

    private IsUserAdminResponseBody(Builder builder) {
        this.isAdmin = builder.isAdmin;
        this.isAllow = builder.isAllow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsUserAdminResponseBody create() {
        return builder().build();
    }

    /**
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * @return isAllow
     */
    public Boolean getIsAllow() {
        return this.isAllow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isAdmin; 
        private Boolean isAllow; 
        private String requestId; 

        /**
         * IsAdmin.
         */
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        /**
         * IsAllow.
         */
        public Builder isAllow(Boolean isAllow) {
            this.isAllow = isAllow;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public IsUserAdminResponseBody build() {
            return new IsUserAdminResponseBody(this);
        } 

    } 

}
