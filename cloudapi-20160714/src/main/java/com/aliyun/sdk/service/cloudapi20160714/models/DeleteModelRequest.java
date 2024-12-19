// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DeleteModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelRequest</p>
 */
public class DeleteModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    private DeleteModelRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.modelName = builder.modelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    public static final class Builder extends Request.Builder<DeleteModelRequest, Builder> {
        private String groupId; 
        private String modelName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.modelName = request.modelName;
        } 

        /**
         * <p>The ID of the API group to which the model belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30e792398d6c4569b04c0e53a3494381</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        @Override
        public DeleteModelRequest build() {
            return new DeleteModelRequest(this);
        } 

    } 

}
