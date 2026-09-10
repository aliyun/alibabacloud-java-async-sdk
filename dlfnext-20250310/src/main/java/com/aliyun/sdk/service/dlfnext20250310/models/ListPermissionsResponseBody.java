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
 * {@link ListPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionsResponseBody</p>
 */
public class ListPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("permissions")
    private java.util.List<Permission> permissions;

    private ListPermissionsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.permissions = builder.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionsResponseBody create() {
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
     * @return permissions
     */
    public java.util.List<Permission> getPermissions() {
        return this.permissions;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<Permission> permissions; 

        private Builder() {
        } 

        private Builder(ListPermissionsResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.permissions = model.permissions;
        } 

        /**
         * <p>The pagination token used to retrieve the next page of data. If null is returned, the current page is the last page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>E8ABEB1C3DB893D16576269017992F57</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The permission list.</p>
         */
        public Builder permissions(java.util.List<Permission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public ListPermissionsResponseBody build() {
            return new ListPermissionsResponseBody(this);
        } 

    } 

}
