// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNodeNumRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceNodeNumRequest</p>
 */
public class ModifyInstanceNodeNumRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeNum;

    private ModifyInstanceNodeNumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.nodeNum = builder.nodeNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNodeNumRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeNum
     */
    public String getNodeNum() {
        return this.nodeNum;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceNodeNumRequest, Builder> {
        private String regionId; 
        private Boolean dryRun; 
        private String instanceId; 
        private String nodeNum; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNodeNumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.nodeNum = request.nodeNum;
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
         * Specifies whether to perform only a dry run for the request. Default value: false. Valid values:
         * <p>
         * - true: Only a dry-run request is sent and the number of nodes in the instance is not modified. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.
         * - false: The actual request is sent and no dry run is performed. The number of nodes is changed if the requirements are met. By default, the DryRunResult parameter returns false if you set DryRun to false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of nodes in the cluster. If the cluster is deployed in n-n-n mode, the number of nodes in the cluster equals n × 3.
         */
        public Builder nodeNum(String nodeNum) {
            this.putBodyParameter("NodeNum", nodeNum);
            this.nodeNum = nodeNum;
            return this;
        }

        @Override
        public ModifyInstanceNodeNumRequest build() {
            return new ModifyInstanceNodeNumRequest(this);
        } 

    } 

}
