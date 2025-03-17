// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QuerySmartqPermissionByCubeIdRequest} extends {@link RequestModel}
 *
 * <p>QuerySmartqPermissionByCubeIdRequest</p>
 */
public class QuerySmartqPermissionByCubeIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cubeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private QuerySmartqPermissionByCubeIdRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmartqPermissionByCubeIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QuerySmartqPermissionByCubeIdRequest, Builder> {
        private String cubeId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmartqPermissionByCubeIdRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c7223ae-****-3c744528014b</p>
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95c4d**************3852e202</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QuerySmartqPermissionByCubeIdRequest build() {
            return new QuerySmartqPermissionByCubeIdRequest(this);
        } 

    } 

}
