// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link UpdateBusinessLogicRequest} extends {@link RequestModel}
 *
 * <p>UpdateBusinessLogicRequest</p>
 */
public class UpdateBusinessLogicRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessLogicIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessLogicIdKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateBusinessLogicRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessLogicIdKey = builder.businessLogicIdKey;
        this.description = builder.description;
        this.type = builder.type;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBusinessLogicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return businessLogicIdKey
     */
    public String getBusinessLogicIdKey() {
        return this.businessLogicIdKey;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateBusinessLogicRequest, Builder> {
        private String regionId; 
        private String businessLogicIdKey; 
        private String description; 
        private Long type; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBusinessLogicRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessLogicIdKey = request.businessLogicIdKey;
            this.description = request.description;
            this.type = request.type;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>businessLogic-AAAAAAAAAGAIyJoP7LbKuA</p>
         */
        public Builder businessLogicIdKey(String businessLogicIdKey) {
            this.putBodyParameter("businessLogicIdKey", businessLogicIdKey);
            this.businessLogicIdKey = businessLogicIdKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(Long type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateBusinessLogicRequest build() {
            return new UpdateBusinessLogicRequest(this);
        } 

    } 

}
