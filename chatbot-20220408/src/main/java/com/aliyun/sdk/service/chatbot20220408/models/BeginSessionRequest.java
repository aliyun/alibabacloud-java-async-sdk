// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link BeginSessionRequest} extends {@link RequestModel}
 *
 * <p>BeginSessionRequest</p>
 */
public class BeginSessionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SandBox")
    private Boolean sandBox;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorParam")
    private String vendorParam;

    private BeginSessionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.sandBox = builder.sandBox;
        this.vendorParam = builder.vendorParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeginSessionRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sandBox
     */
    public Boolean getSandBox() {
        return this.sandBox;
    }

    /**
     * @return vendorParam
     */
    public String getVendorParam() {
        return this.vendorParam;
    }

    public static final class Builder extends Request.Builder<BeginSessionRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String instanceId; 
        private Boolean sandBox; 
        private String vendorParam; 

        private Builder() {
            super();
        } 

        private Builder(BeginSessionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.sandBox = request.sandBox;
            this.vendorParam = request.vendorParam;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SandBox.
         */
        public Builder sandBox(Boolean sandBox) {
            this.putBodyParameter("SandBox", sandBox);
            this.sandBox = sandBox;
            return this;
        }

        /**
         * VendorParam.
         */
        public Builder vendorParam(String vendorParam) {
            this.putBodyParameter("VendorParam", vendorParam);
            this.vendorParam = vendorParam;
            return this;
        }

        @Override
        public BeginSessionRequest build() {
            return new BeginSessionRequest(this);
        } 

    } 

}
