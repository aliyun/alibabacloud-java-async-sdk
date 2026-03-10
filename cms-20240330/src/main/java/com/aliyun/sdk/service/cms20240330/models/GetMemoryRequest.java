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
 * {@link GetMemoryRequest} extends {@link RequestModel}
 *
 * <p>GetMemoryRequest</p>
 */
public class GetMemoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String memoryId;

    private GetMemoryRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.memoryStoreName = builder.memoryStoreName;
        this.memoryId = builder.memoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryRequest create() {
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
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return memoryId
     */
    public String getMemoryId() {
        return this.memoryId;
    }

    public static final class Builder extends Request.Builder<GetMemoryRequest, Builder> {
        private String workspace; 
        private String memoryStoreName; 
        private String memoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetMemoryRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.memoryStoreName = request.memoryStoreName;
            this.memoryId = request.memoryId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-1793369865235921-cn-shenzhen</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory-store</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>019ca1e5-7307-7d50-b943-5e628326a8ed</p>
         */
        public Builder memoryId(String memoryId) {
            this.putPathParameter("memoryId", memoryId);
            this.memoryId = memoryId;
            return this;
        }

        @Override
        public GetMemoryRequest build() {
            return new GetMemoryRequest(this);
        } 

    } 

}
