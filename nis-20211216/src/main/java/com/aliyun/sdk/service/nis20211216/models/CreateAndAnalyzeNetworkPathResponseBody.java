// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndAnalyzeNetworkPathResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndAnalyzeNetworkPathResponseBody</p>
 */
public class CreateAndAnalyzeNetworkPathResponseBody extends TeaModel {
    @NameInMap("NetworkReachableAnalysisId")
    private String networkReachableAnalysisId;

    @NameInMap("Protocol")
    private String protocol;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceId")
    private String sourceId;

    @NameInMap("SourceIpAddress")
    private String sourceIpAddress;

    @NameInMap("SourcePort")
    private String sourcePort;

    @NameInMap("SourceType")
    private String sourceType;

    @NameInMap("TargetId")
    private String targetId;

    @NameInMap("TargetIpAddress")
    private String targetIpAddress;

    @NameInMap("TargetPort")
    private String targetPort;

    @NameInMap("TargetType")
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

        /**
         * The ID of the task for analyzing network reachability that you initiated.
         */
        public Builder networkReachableAnalysisId(String networkReachableAnalysisId) {
            this.networkReachableAnalysisId = networkReachableAnalysisId;
            return this;
        }

        /**
         * The protocol type.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the source resource.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The source IP address.
         */
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            return this;
        }

        /**
         * The source port.
         */
        public Builder sourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * The type of the source resource.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The ID of the destination resource.
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * The destination IP address.
         */
        public Builder targetIpAddress(String targetIpAddress) {
            this.targetIpAddress = targetIpAddress;
            return this;
        }

        /**
         * The destination port.
         */
        public Builder targetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        /**
         * The type of the destination resource.
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
