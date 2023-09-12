// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link ListOrganizationalUnitParentIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitParentIdsResponseBody</p>
 */
public class ListOrganizationalUnitParentIdsResponseBody extends TeaModel {
    @NameInMap("parentIds")
    private java.util.List < String > parentIds;

    private ListOrganizationalUnitParentIdsResponseBody(Builder builder) {
        this.parentIds = builder.parentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitParentIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return parentIds
     */
    public java.util.List < String > getParentIds() {
        return this.parentIds;
    }

    public static final class Builder {
        private java.util.List < String > parentIds; 

        /**
         * parentIds.
         */
        public Builder parentIds(java.util.List < String > parentIds) {
            this.parentIds = parentIds;
            return this;
        }

        public ListOrganizationalUnitParentIdsResponseBody build() {
            return new ListOrganizationalUnitParentIdsResponseBody(this);
        } 

    } 

}
