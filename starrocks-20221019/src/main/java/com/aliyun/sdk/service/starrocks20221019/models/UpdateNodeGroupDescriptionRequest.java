// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link UpdateNodeGroupDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeGroupDescriptionRequest</p>
 */
public class UpdateNodeGroupDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Acs-Ram-Auth-Context")
    private String xAcsRamAuthContext;

    private UpdateNodeGroupDescriptionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.nodeGroupId = builder.nodeGroupId;
        this.xAcsRamAuthContext = builder.xAcsRamAuthContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeGroupDescriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return xAcsRamAuthContext
     */
    public String getXAcsRamAuthContext() {
        return this.xAcsRamAuthContext;
    }

    public static final class Builder extends Request.Builder<UpdateNodeGroupDescriptionRequest, Builder> {
        private String description; 
        private String nodeGroupId; 
        private String xAcsRamAuthContext; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeGroupDescriptionRequest request) {
            super(request);
            this.description = request.description;
            this.nodeGroupId = request.nodeGroupId;
            this.xAcsRamAuthContext = request.xAcsRamAuthContext;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * X-Acs-Ram-Auth-Context.
         */
        public Builder xAcsRamAuthContext(String xAcsRamAuthContext) {
            this.putQueryParameter("X-Acs-Ram-Auth-Context", xAcsRamAuthContext);
            this.xAcsRamAuthContext = xAcsRamAuthContext;
            return this;
        }

        @Override
        public UpdateNodeGroupDescriptionRequest build() {
            return new UpdateNodeGroupDescriptionRequest(this);
        } 

    } 

}
