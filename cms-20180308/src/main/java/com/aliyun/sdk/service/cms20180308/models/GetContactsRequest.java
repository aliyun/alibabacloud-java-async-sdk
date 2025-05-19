// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link GetContactsRequest} extends {@link RequestModel}
 *
 * <p>GetContactsRequest</p>
 */
public class GetContactsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    private GetContactsRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContactsRequest create() {
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

    public static final class Builder extends Request.Builder<GetContactsRequest, Builder> {
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(GetContactsRequest request) {
            super(request);
            this.groupName = request.groupName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public GetContactsRequest build() {
            return new GetContactsRequest(this);
        } 

    } 

}
