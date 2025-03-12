// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link DeleteUserInRecycleBinRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserInRecycleBinRequest</p>
 */
public class DeleteUserInRecycleBinRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private DeleteUserInRecycleBinRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserInRecycleBinRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteUserInRecycleBinRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserInRecycleBinRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteUserInRecycleBinRequest build() {
            return new DeleteUserInRecycleBinRequest(this);
        } 

    } 

}
