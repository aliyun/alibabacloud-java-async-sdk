// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListResourceInstanceWorkerRequest} extends {@link RequestModel}
 *
 * <p>ListResourceInstanceWorkerRequest</p>
 */
public class ListResourceInstanceWorkerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerName")
    private String workerName;

    private ListResourceInstanceWorkerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.workerName = builder.workerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceInstanceWorkerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return workerName
     */
    public String getWorkerName() {
        return this.workerName;
    }

    public static final class Builder extends Request.Builder<ListResourceInstanceWorkerRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String instanceName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String workerName; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceInstanceWorkerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.instanceName = request.instanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.workerName = request.workerName;
        } 

        /**
         * <p>The ID of the cluster to which the resource group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the resource group. For more information about how to query the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-adfabas</p>
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the instance in a resource group. For more information about how to query the instance name, see <a href="https://help.aliyun.com/document_detail/412129.html">ListResourceInstances</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cne10</p>
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * WorkerName.
         */
        public Builder workerName(String workerName) {
            this.putQueryParameter("WorkerName", workerName);
            this.workerName = workerName;
            return this;
        }

        @Override
        public ListResourceInstanceWorkerRequest build() {
            return new ListResourceInstanceWorkerRequest(this);
        } 

    } 

}
