// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: Only a dry-run request is sent and the number of nodes in the instance is not modified. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</li>
         * <li>false: The actual request is sent and no dry run is performed. The number of nodes is changed if the requirements are met. By default, the DryRunResult parameter returns false if you set DryRun to false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of nodes in the cluster. If the cluster is deployed in n-n-n mode, the number of nodes in the cluster equals n × 3.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
