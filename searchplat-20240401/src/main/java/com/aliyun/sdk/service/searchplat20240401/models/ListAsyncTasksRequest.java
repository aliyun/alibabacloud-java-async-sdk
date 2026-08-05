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
 * {@link ListAsyncTasksRequest} extends {@link RequestModel}
 *
 * <p>ListAsyncTasksRequest</p>
 */
public class ListAsyncTasksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataId")
    private Integer dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    private ListAsyncTasksRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.dataId = builder.dataId;
        this.dryRun = builder.dryRun;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncTasksRequest create() {
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
    public Integer getDataId() {
        return this.dataId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<ListAsyncTasksRequest, Builder> {
        private String workspaceName; 
        private Integer dataId; 
        private Boolean dryRun; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(ListAsyncTasksRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.dataId = request.dataId;
            this.dryRun = request.dryRun;
            this.serviceType = request.serviceType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * dataId.
         */
        public Builder dataId(Integer dataId) {
            this.putQueryParameter("dataId", dataId);
            this.dataId = dataId;
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

        /**
         * serviceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public ListAsyncTasksRequest build() {
            return new ListAsyncTasksRequest(this);
        } 

    } 

}
