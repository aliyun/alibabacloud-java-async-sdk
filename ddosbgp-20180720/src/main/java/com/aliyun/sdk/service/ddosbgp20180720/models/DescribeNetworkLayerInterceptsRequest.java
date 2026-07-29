// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link DescribeNetworkLayerInterceptsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkLayerInterceptsRequest</p>
 */
public class DescribeNetworkLayerInterceptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationIp")
    private String destinationIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Long destinationPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkProtocol")
    private String networkProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolNumber")
    private Long protocolNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Long sourcePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeNetworkLayerInterceptsRequest(Builder builder) {
        super(builder);
        this.destinationIp = builder.destinationIp;
        this.destinationPort = builder.destinationPort;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.networkProtocol = builder.networkProtocol;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.protocolNumber = builder.protocolNumber;
        this.sourcePort = builder.sourcePort;
        this.srcIp = builder.srcIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkLayerInterceptsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationIp
     */
    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * @return destinationPort
     */
    public Long getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkProtocol
     */
    public String getNetworkProtocol() {
        return this.networkProtocol;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return protocolNumber
     */
    public Long getProtocolNumber() {
        return this.protocolNumber;
    }

    /**
     * @return sourcePort
     */
    public Long getSourcePort() {
        return this.sourcePort;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkLayerInterceptsRequest, Builder> {
        private String destinationIp; 
        private Long destinationPort; 
        private Long endTime; 
        private String instanceId; 
        private String networkProtocol; 
        private Long page; 
        private Long pageSize; 
        private Long protocolNumber; 
        private Long sourcePort; 
        private String srcIp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkLayerInterceptsRequest request) {
            super(request);
            this.destinationIp = request.destinationIp;
            this.destinationPort = request.destinationPort;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.networkProtocol = request.networkProtocol;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.protocolNumber = request.protocolNumber;
            this.sourcePort = request.sourcePort;
            this.srcIp = request.srcIp;
            this.startTime = request.startTime;
        } 

        /**
         * DestinationIp.
         */
        public Builder destinationIp(String destinationIp) {
            this.putQueryParameter("DestinationIp", destinationIp);
            this.destinationIp = destinationIp;
            return this;
        }

        /**
         * DestinationPort.
         */
        public Builder destinationPort(Long destinationPort) {
            this.putQueryParameter("DestinationPort", destinationPort);
            this.destinationPort = destinationPort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1563445054</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkProtocol.
         */
        public Builder networkProtocol(String networkProtocol) {
            this.putQueryParameter("NetworkProtocol", networkProtocol);
            this.networkProtocol = networkProtocol;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProtocolNumber.
         */
        public Builder protocolNumber(Long protocolNumber) {
            this.putQueryParameter("ProtocolNumber", protocolNumber);
            this.protocolNumber = protocolNumber;
            return this;
        }

        /**
         * SourcePort.
         */
        public Builder sourcePort(Long sourcePort) {
            this.putQueryParameter("SourcePort", sourcePort);
            this.sourcePort = sourcePort;
            return this;
        }

        /**
         * SrcIp.
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1557305044</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeNetworkLayerInterceptsRequest build() {
            return new DescribeNetworkLayerInterceptsRequest(this);
        } 

    } 

}
