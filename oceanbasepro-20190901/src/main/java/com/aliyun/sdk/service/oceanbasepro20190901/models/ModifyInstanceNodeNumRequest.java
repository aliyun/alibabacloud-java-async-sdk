// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNodeNumRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceNodeNumRequest</p>
 */
public class ModifyInstanceNodeNumRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("NodeNum")
    @Validation(required = true)
    private String nodeNum;

    private ModifyInstanceNodeNumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
        private String instanceId; 
        private String nodeNum; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceNodeNumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.nodeNum = request.nodeNum;
        } 

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Oceanbase集群的ID
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 集群节点个数信息。 如果部署模式为n-n-n，则节点个数为n * 3
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
