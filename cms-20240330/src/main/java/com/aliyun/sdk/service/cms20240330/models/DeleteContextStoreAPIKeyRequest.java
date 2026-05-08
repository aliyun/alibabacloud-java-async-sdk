// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteContextStoreAPIKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteContextStoreAPIKeyRequest</p>
 */
public class DeleteContextStoreAPIKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    private String contextStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DeleteContextStoreAPIKeyRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.contextStoreName = builder.contextStoreName;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextStoreAPIKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteContextStoreAPIKeyRequest, Builder> {
        private String workspace; 
        private String contextStoreName; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContextStoreAPIKeyRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.contextStoreName = request.contextStoreName;
            this.name = request.name;
        } 

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * contextStoreName.
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteContextStoreAPIKeyRequest build() {
            return new DeleteContextStoreAPIKeyRequest(this);
        } 

    } 

}
