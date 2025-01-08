// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ListPoliciesForGroupRequest} extends {@link RequestModel}
 *
 * <p>ListPoliciesForGroupRequest</p>
 */
public class ListPoliciesForGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private ListPoliciesForGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesForGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<ListPoliciesForGroupRequest, Builder> {
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(ListPoliciesForGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
        } 

        /**
         * <p>The name of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public ListPoliciesForGroupRequest build() {
            return new ListPoliciesForGroupRequest(this);
        } 

    } 

}
