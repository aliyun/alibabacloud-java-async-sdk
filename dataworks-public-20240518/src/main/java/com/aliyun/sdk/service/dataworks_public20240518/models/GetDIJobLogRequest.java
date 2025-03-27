// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDIJobLogRequest} extends {@link RequestModel}
 *
 * <p>GetDIJobLogRequest</p>
 */
public class GetDIJobLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @Deprecated
    private Long DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverId")
    private Long failoverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    private GetDIJobLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.failoverId = builder.failoverId;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.nodeType = builder.nodeType;
        this.pageNumber = builder.pageNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIJobLogRequest create() {
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
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return failoverId
     */
    public Long getFailoverId() {
        return this.failoverId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static final class Builder extends Request.Builder<GetDIJobLogRequest, Builder> {
        private String regionId; 
        private Long DIJobId; 
        private Long failoverId; 
        private Long id; 
        private Long instanceId; 
        private String nodeType; 
        private Integer pageNumber; 

        private Builder() {
            super();
        } 

        private Builder(GetDIJobLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.failoverId = request.failoverId;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.nodeType = request.nodeType;
            this.pageNumber = request.pageNumber;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is deprecated. Use the Id parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * <p>The failover ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder failoverId(Long failoverId) {
            this.putQueryParameter("FailoverId", failoverId);
            this.failoverId = failoverId;
            return this;
        }

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6153616438</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the node. This parameter is applicable only to the tasks that are run on serverless resource groups. Valid values:</p>
         * <ul>
         * <li><strong>MASTER</strong>: the master node, which is used to query the logs of JobManagers.</li>
         * <li><strong>WORKER</strong>: the worker node, which is used to query the logs of TaskManagers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MASTER</p>
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The page number of the pagination query. The value is a positive integer greater than or equal to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        @Override
        public GetDIJobLogRequest build() {
            return new GetDIJobLogRequest(this);
        } 

    } 

}
