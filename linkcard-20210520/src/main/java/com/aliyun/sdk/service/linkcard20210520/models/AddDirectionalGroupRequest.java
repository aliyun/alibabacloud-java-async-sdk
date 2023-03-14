// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDirectionalGroupRequest} extends {@link RequestModel}
 *
 * <p>AddDirectionalGroupRequest</p>
 */
public class AddDirectionalGroupRequest extends Request {
    @Query
    @NameInMap("GroupName")
    @Validation(required = true, maxLength = 30)
    private String groupName;

    private AddDirectionalGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDirectionalGroupRequest create() {
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

    public static final class Builder extends Request.Builder<AddDirectionalGroupRequest, Builder> {
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(AddDirectionalGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
        } 

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public AddDirectionalGroupRequest build() {
            return new AddDirectionalGroupRequest(this);
        } 

    } 

}
