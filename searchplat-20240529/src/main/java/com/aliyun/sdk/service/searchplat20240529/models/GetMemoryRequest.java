// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memory_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryId;

    private GetMemoryRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
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
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return memoryId
     */
    public String getMemoryId() {
        return this.memoryId;
    }

    public static final class Builder extends Request.Builder<GetMemoryRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private String memoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetMemoryRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.memoryId = request.memoryId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder memoryId(String memoryId) {
            this.putPathParameter("memory_id", memoryId);
            this.memoryId = memoryId;
            return this;
        }

        @Override
        public GetMemoryRequest build() {
            return new GetMemoryRequest(this);
        } 

    } 

}
