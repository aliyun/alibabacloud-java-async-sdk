// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("roles")
    private java.util.List<Role> roles;

    private ListRolesResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return roles
     */
    public java.util.List<Role> getRoles() {
        return this.roles;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<Role> roles; 

        private Builder() {
        } 

        private Builder(ListRolesResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.roles = model.roles;
        } 

        /**
         * <p>The token used to retrieve the next page of results. If a null value is returned, the current page is the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>E8ABEB1C3DB893D16576269017992F57</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The roles.</p>
         */
        public Builder roles(java.util.List<Role> roles) {
            this.roles = roles;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

}
