// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link CreateAndAnalyzeNetworkPathResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndAnalyzeNetworkPathResponseBody</p>
 */
public class CreateAndAnalyzeNetworkPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkReachableAnalysisId")
    private String networkReachableAnalysisId;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourceIpAddress")
    private String sourceIpAddress;

    @com.aliyun.core.annotation.NameInMap("SourcePort")
    private String sourcePort;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.NameInMap("TargetIpAddress")
    private String targetIpAddress;

    @com.aliyun.core.annotation.NameInMap("TargetPort")
    private String targetPort;

    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private CreateAndAnalyzeNetworkPathResponseBody(Builder builder) {
        this.networkReachableAnalysisId = builder.networkReachableAnalysisId;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceIpAddress = builder.sourceIpAddress;
        this.sourcePort = builder.sourcePort;
        this.sourceType = builder.sourceType;
        this.targetId = builder.targetId;
        this.targetIpAddress = builder.targetIpAddress;
        this.targetPort = builder.targetPort;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndAnalyzeNetworkPathResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkReachableAnalysisId
     */
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * @return sourcePort
     */
    public String getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetIpAddress
     */
    public String getTargetIpAddress() {
        return this.targetIpAddress;
    }

    /**
     * @return targetPort
     */
    public String getTargetPort() {
        return this.targetPort;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder {
        private String networkReachableAnalysisId; 
        private String protocol; 
        private String requestId; 
        private String sourceId; 
        private String sourceIpAddress; 
        private String sourcePort; 
        private String sourceType; 
        private String targetId; 
        private String targetIpAddress; 
        private String targetPort; 
        private String targetType; 

        private Builder() {
        } 

        private Builder(CreateAndAnalyzeNetworkPathResponseBody model) {
            this.networkReachableAnalysisId = model.networkReachableAnalysisId;
            this.protocol = model.protocol;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceIpAddress = model.sourceIpAddress;
            this.sourcePort = model.sourcePort;
            this.sourceType = model.sourceType;
            this.targetId = model.targetId;
            this.targetIpAddress = model.targetIpAddress;
            this.targetPort = model.targetPort;
            this.targetType = model.targetType;
        } 

        /**
         * <p>The ID of the task for analyzing network reachability that you initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>nra-dfe9e53d2b524568****</p>
         */
        public Builder networkReachableAnalysisId(String networkReachableAnalysisId) {
            this.networkReachableAnalysisId = networkReachableAnalysisId;
            return this;
        }

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the source resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf62y8khhbkbdrp6****</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * <p>The source port.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * <p>The type of the source resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The ID of the destination resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5eactvw7wtpktv5****</p>
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.50.XX.XX</p>
         */
        public Builder targetIpAddress(String targetIpAddress) {
            this.targetIpAddress = targetIpAddress;
            return this;
        }

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder targetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        /**
         * <p>The type of the destination resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public CreateAndAnalyzeNetworkPathResponseBody build() {
            return new CreateAndAnalyzeNetworkPathResponseBody(this);
        } 

    } 

}
