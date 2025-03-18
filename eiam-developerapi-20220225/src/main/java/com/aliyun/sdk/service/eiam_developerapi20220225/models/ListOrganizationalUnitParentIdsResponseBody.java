// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link ListOrganizationalUnitParentIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitParentIdsResponseBody</p>
 */
public class ListOrganizationalUnitParentIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parentIds")
    private java.util.List<String> parentIds;

    private ListOrganizationalUnitParentIdsResponseBody(Builder builder) {
        this.parentIds = builder.parentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitParentIdsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentIds
     */
    public java.util.List<String> getParentIds() {
        return this.parentIds;
    }

    public static final class Builder {
        private java.util.List<String> parentIds; 

        private Builder() {
        } 

        private Builder(ListOrganizationalUnitParentIdsResponseBody model) {
            this.parentIds = model.parentIds;
        } 

        /**
         * <p>The IDs of the parent organizational units. The IDs of the organizational unit are ordered based on their levels from high to low. Only the IDs of the organizational units within the authorization scope are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>[ou_xxx001]</p>
         */
        public Builder parentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }

        public ListOrganizationalUnitParentIdsResponseBody build() {
            return new ListOrganizationalUnitParentIdsResponseBody(this);
        } 

    } 

}
