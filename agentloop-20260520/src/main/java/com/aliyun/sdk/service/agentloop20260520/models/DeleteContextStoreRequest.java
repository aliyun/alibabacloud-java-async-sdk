// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link DeleteContextStoreRequest} extends {@link RequestModel}
 *
 * <p>DeleteContextStoreRequest</p>
 */
public class DeleteContextStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteOutputDataset")
    private Boolean deleteOutputDataset;

    private DeleteContextStoreRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.deleteOutputDataset = builder.deleteOutputDataset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return deleteOutputDataset
     */
    public Boolean getDeleteOutputDataset() {
        return this.deleteOutputDataset;
    }

    public static final class Builder extends Request.Builder<DeleteContextStoreRequest, Builder> {
        private String agentSpace; 
        private String contextStoreName; 
        private Boolean deleteOutputDataset; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContextStoreRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.contextStoreName = request.contextStoreName;
            this.deleteOutputDataset = request.deleteOutputDataset;
        } 

        /**
         * <p>The name of the AgentSpace. The length must be 2 to 64 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the context store to be deleted. The length must be 2 to 64 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>Specifies whether to simultaneously delete the memory output dataset (memory type). Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteOutputDataset(Boolean deleteOutputDataset) {
            this.putQueryParameter("deleteOutputDataset", deleteOutputDataset);
            this.deleteOutputDataset = deleteOutputDataset;
            return this;
        }

        @Override
        public DeleteContextStoreRequest build() {
            return new DeleteContextStoreRequest(this);
        } 

    } 

}
