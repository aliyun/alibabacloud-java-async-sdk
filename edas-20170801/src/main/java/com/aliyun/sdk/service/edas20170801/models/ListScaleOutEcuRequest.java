// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScaleOutEcuRequest} extends {@link RequestModel}
 *
 * <p>ListScaleOutEcuRequest</p>
 */
public class ListScaleOutEcuRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("InstanceNum")
    private Integer instanceNum;

    @Query
    @NameInMap("LogicalRegionId")
    private String logicalRegionId;

    @Query
    @NameInMap("Mem")
    private Integer mem;

    private ListScaleOutEcuRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.cpu = builder.cpu;
        this.groupId = builder.groupId;
        this.instanceNum = builder.instanceNum;
        this.logicalRegionId = builder.logicalRegionId;
        this.mem = builder.mem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScaleOutEcuRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return this.instanceNum;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return mem
     */
    public Integer getMem() {
        return this.mem;
    }

    public static final class Builder extends Request.Builder<ListScaleOutEcuRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private Integer cpu; 
        private String groupId; 
        private Integer instanceNum; 
        private String logicalRegionId; 
        private Integer mem; 

        private Builder() {
            super();
        } 

        private Builder(ListScaleOutEcuRequest request) {
            super(request);
            this.appId = request.appId;
            this.clusterId = request.clusterId;
            this.cpu = request.cpu;
            this.groupId = request.groupId;
            this.instanceNum = request.instanceNum;
            this.logicalRegionId = request.logicalRegionId;
            this.mem = request.mem;
        } 

        /**
         * The ID of the application. Specify this parameter if you want to query the available ECUs in the cluster where the application is deployed.
         * <p>
         * 
         * >  Specify at least one of the ClusterId and AppId parameters as the query parameter.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the cluster. Specify this parameter if you want to query the available ECUs in the cluster.
         * <p>
         * 
         * > Specify at least one of the ClusterId and AppId parameters as the query parameter.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of CPU cores based on which you want to query the available ECUs in the cluster.
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The ID of the instance group. Specify this parameter if you want to query the available ECUs in the cluster where the instance group resides.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The number of ECUs that you want to query. If this parameter is not specified, all the ECUs that meet the query conditions are returned.
         */
        public Builder instanceNum(Integer instanceNum) {
            this.putQueryParameter("InstanceNum", instanceNum);
            this.instanceNum = instanceNum;
            return this;
        }

        /**
         * The ID of the namespace.
         * <p>
         * 
         * *   The ID of a custom namespace is in the `region ID:namespace identifier` format. Example: cn-beijing:test.
         * *   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * The size of available memory based on which you want to query the available ECUs in the cluster. Unit: MB.
         */
        public Builder mem(Integer mem) {
            this.putQueryParameter("Mem", mem);
            this.mem = mem;
            return this;
        }

        @Override
        public ListScaleOutEcuRequest build() {
            return new ListScaleOutEcuRequest(this);
        } 

    } 

}
