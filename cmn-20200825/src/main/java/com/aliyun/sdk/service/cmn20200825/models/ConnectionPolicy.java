// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConnectionPolicy} extends {@link TeaModel}
 *
 * <p>ConnectionPolicy</p>
 */
public class ConnectionPolicy extends TeaModel {
    @NameInMap("Algorithm")
    private String algorithm;

    @NameInMap("ConnectionPolicyId")
    private String connectionPolicyId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DownlinkDeviceId")
    private String downlinkDeviceId;

    @NameInMap("DownlinkModuleId")
    private String downlinkModuleId;

    @NameInMap("Id")
    private String id;

    @NameInMap("LinkCount")
    private Long linkCount;

    @NameInMap("Name")
    private String name;

    @NameInMap("NetworkArchitectureIterationId")
    private String networkArchitectureIterationId;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UplinkDeviceId")
    private String uplinkDeviceId;

    @NameInMap("UplinkModelId")
    private String uplinkModelId;

    private ConnectionPolicy(Builder builder) {
        this.algorithm = builder.algorithm;
        this.connectionPolicyId = builder.connectionPolicyId;
        this.createTime = builder.createTime;
        this.downlinkDeviceId = builder.downlinkDeviceId;
        this.downlinkModuleId = builder.downlinkModuleId;
        this.id = builder.id;
        this.linkCount = builder.linkCount;
        this.name = builder.name;
        this.networkArchitectureIterationId = builder.networkArchitectureIterationId;
        this.updateTime = builder.updateTime;
        this.uplinkDeviceId = builder.uplinkDeviceId;
        this.uplinkModelId = builder.uplinkModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectionPolicy create() {
        return builder().build();
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return connectionPolicyId
     */
    public String getConnectionPolicyId() {
        return this.connectionPolicyId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return downlinkDeviceId
     */
    public String getDownlinkDeviceId() {
        return this.downlinkDeviceId;
    }

    /**
     * @return downlinkModuleId
     */
    public String getDownlinkModuleId() {
        return this.downlinkModuleId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return linkCount
     */
    public Long getLinkCount() {
        return this.linkCount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkArchitectureIterationId
     */
    public String getNetworkArchitectureIterationId() {
        return this.networkArchitectureIterationId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return uplinkDeviceId
     */
    public String getUplinkDeviceId() {
        return this.uplinkDeviceId;
    }

    /**
     * @return uplinkModelId
     */
    public String getUplinkModelId() {
        return this.uplinkModelId;
    }

    public static final class Builder {
        private String algorithm; 
        private String connectionPolicyId; 
        private String createTime; 
        private String downlinkDeviceId; 
        private String downlinkModuleId; 
        private String id; 
        private Long linkCount; 
        private String name; 
        private String networkArchitectureIterationId; 
        private String updateTime; 
        private String uplinkDeviceId; 
        private String uplinkModelId; 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * ConnectionPolicyId.
         */
        public Builder connectionPolicyId(String connectionPolicyId) {
            this.connectionPolicyId = connectionPolicyId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DownlinkDeviceId.
         */
        public Builder downlinkDeviceId(String downlinkDeviceId) {
            this.downlinkDeviceId = downlinkDeviceId;
            return this;
        }

        /**
         * DownlinkModuleId.
         */
        public Builder downlinkModuleId(String downlinkModuleId) {
            this.downlinkModuleId = downlinkModuleId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * LinkCount.
         */
        public Builder linkCount(Long linkCount) {
            this.linkCount = linkCount;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NetworkArchitectureIterationId.
         */
        public Builder networkArchitectureIterationId(String networkArchitectureIterationId) {
            this.networkArchitectureIterationId = networkArchitectureIterationId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UplinkDeviceId.
         */
        public Builder uplinkDeviceId(String uplinkDeviceId) {
            this.uplinkDeviceId = uplinkDeviceId;
            return this;
        }

        /**
         * UplinkModelId.
         */
        public Builder uplinkModelId(String uplinkModelId) {
            this.uplinkModelId = uplinkModelId;
            return this;
        }

        public ConnectionPolicy build() {
            return new ConnectionPolicy(this);
        } 

    } 

}
