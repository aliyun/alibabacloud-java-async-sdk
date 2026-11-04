// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link DeleteFaceUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceUserRequest</p>
 */
public class DeleteFaceUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private DeleteFaceUserRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteFaceUserRequest, Builder> {
        private String isolationId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceUserRequest request) {
            super(request);
            this.isolationId = request.isolationId;
            this.userId = request.userId;
        } 

        /**
         * <p>The business isolation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHzXiHu</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The unique internal user ID of the face service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3mtjaqebeq4dulcy</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteFaceUserRequest build() {
            return new DeleteFaceUserRequest(this);
        } 

    } 

}
