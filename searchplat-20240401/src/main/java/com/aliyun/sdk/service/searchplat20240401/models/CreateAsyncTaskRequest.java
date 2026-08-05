// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link CreateAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAsyncTaskRequest</p>
 */
public class CreateAsyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataId")
    private Long dataId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateAsyncTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.dataId = builder.dataId;
        this.id = builder.id;
        this.name = builder.name;
        this.serviceId = builder.serviceId;
        this.serviceType = builder.serviceType;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAsyncTaskRequest create() {
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
     * @return dataId
     */
    public Long getDataId() {
        return this.dataId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateAsyncTaskRequest, Builder> {
        private String workspaceName; 
        private Long dataId; 
        private String id; 
        private String name; 
        private String serviceId; 
        private String serviceType; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateAsyncTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.dataId = request.dataId;
            this.id = request.id;
            this.name = request.name;
            this.serviceId = request.serviceId;
            this.serviceType = request.serviceType;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myWorkspace</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * dataId.
         */
        public Builder dataId(Long dataId) {
            this.putBodyParameter("dataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * serviceType.
         */
        public Builder serviceType(String serviceType) {
            this.putBodyParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateAsyncTaskRequest build() {
            return new CreateAsyncTaskRequest(this);
        } 

    } 

}
