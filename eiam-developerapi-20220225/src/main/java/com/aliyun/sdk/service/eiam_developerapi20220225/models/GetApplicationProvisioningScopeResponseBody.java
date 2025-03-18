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
 * {@link GetApplicationProvisioningScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningScopeResponseBody</p>
 */
public class GetApplicationProvisioningScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupIds")
    private java.util.List<String> groupIds;

    @com.aliyun.core.annotation.NameInMap("organizationalUnitIds")
    private java.util.List<String> organizationalUnitIds;

    private GetApplicationProvisioningScopeResponseBody(Builder builder) {
        this.groupIds = builder.groupIds;
        this.organizationalUnitIds = builder.organizationalUnitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationProvisioningScopeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupIds
     */
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return organizationalUnitIds
     */
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public static final class Builder {
        private java.util.List<String> groupIds; 
        private java.util.List<String> organizationalUnitIds; 

        private Builder() {
        } 

        private Builder(GetApplicationProvisioningScopeResponseBody model) {
            this.groupIds = model.groupIds;
            this.organizationalUnitIds = model.organizationalUnitIds;
        } 

        /**
         * groupIds.
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>The IDs of organizational units.</p>
         * 
         * <strong>example:</strong>
         * <p>[ou_xxx001]</p>
         */
        public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }

        public GetApplicationProvisioningScopeResponseBody build() {
            return new GetApplicationProvisioningScopeResponseBody(this);
        } 

    } 

}
