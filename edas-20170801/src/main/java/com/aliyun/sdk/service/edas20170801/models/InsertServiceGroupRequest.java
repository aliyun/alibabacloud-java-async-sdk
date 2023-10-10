// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>InsertServiceGroupRequest</p>
 */
public class InsertServiceGroupRequest extends Request {
    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    private InsertServiceGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertServiceGroupRequest create() {
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

    public static final class Builder extends Request.Builder<InsertServiceGroupRequest, Builder> {
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(InsertServiceGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
        } 

        /**
         * The name of the service group that you want to create.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public InsertServiceGroupRequest build() {
            return new InsertServiceGroupRequest(this);
        } 

    } 

}
