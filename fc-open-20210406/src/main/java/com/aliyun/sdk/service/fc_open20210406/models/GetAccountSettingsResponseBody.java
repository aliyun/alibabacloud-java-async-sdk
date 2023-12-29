// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountSettingsResponseBody</p>
 */
public class GetAccountSettingsResponseBody extends TeaModel {
    @NameInMap("availableAZs")
    private java.util.List < String > availableAZs;

    @NameInMap("defaultRole")
    private String defaultRole;

    private GetAccountSettingsResponseBody(Builder builder) {
        this.availableAZs = builder.availableAZs;
        this.defaultRole = builder.defaultRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableAZs
     */
    public java.util.List < String > getAvailableAZs() {
        return this.availableAZs;
    }

    /**
     * @return defaultRole
     */
    public String getDefaultRole() {
        return this.defaultRole;
    }

    public static final class Builder {
        private java.util.List < String > availableAZs; 
        private String defaultRole; 

        /**
         * The list of zones.
         */
        public Builder availableAZs(java.util.List < String > availableAZs) {
            this.availableAZs = availableAZs;
            return this;
        }

        /**
         * The default RAM role.
         */
        public Builder defaultRole(String defaultRole) {
            this.defaultRole = defaultRole;
            return this;
        }

        public GetAccountSettingsResponseBody build() {
            return new GetAccountSettingsResponseBody(this);
        } 

    } 

}
