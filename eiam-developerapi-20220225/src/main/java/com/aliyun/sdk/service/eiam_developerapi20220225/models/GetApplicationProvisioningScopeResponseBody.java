// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetApplicationProvisioningScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningScopeResponseBody</p>
 */
public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    @NameInMap("organizationalUnitIds")
    private java.util.List < String > organizationalUnitIds;

    private GetApplicationProvisioningScopeResponseBody(Builder builder) {
        this.organizationalUnitIds = builder.organizationalUnitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationProvisioningScopeResponseBody create() {
        return builder().build();
    }

    /**
     * @return organizationalUnitIds
     */
    public java.util.List < String > getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public static final class Builder {
        private java.util.List < String > organizationalUnitIds; 

        /**
         * organizationalUnitIds.
         */
        public Builder organizationalUnitIds(java.util.List < String > organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }

        public GetApplicationProvisioningScopeResponseBody build() {
            return new GetApplicationProvisioningScopeResponseBody(this);
        } 

    } 

}
