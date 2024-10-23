// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupRequest</p>
 */
public class DeleteGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private DeleteGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteGroupRequest, Builder> {
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
        } 

        /**
         * <p>The name of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev-Team</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public DeleteGroupRequest build() {
            return new DeleteGroupRequest(this);
        } 

    } 

}
