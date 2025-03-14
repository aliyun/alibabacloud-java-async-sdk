// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdateHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotNodeRequest</p>
 */
public class UpdateHoneypotNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableProbeNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer availableProbeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupProbeIpList")
    private java.util.List<String> securityGroupProbeIpList;

    private UpdateHoneypotNodeRequest(Builder builder) {
        super(builder);
        this.availableProbeNum = builder.availableProbeNum;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.securityGroupProbeIpList = builder.securityGroupProbeIpList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHoneypotNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableProbeNum
     */
    public Integer getAvailableProbeNum() {
        return this.availableProbeNum;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return securityGroupProbeIpList
     */
    public java.util.List<String> getSecurityGroupProbeIpList() {
        return this.securityGroupProbeIpList;
    }

    public static final class Builder extends Request.Builder<UpdateHoneypotNodeRequest, Builder> {
        private Integer availableProbeNum; 
        private String nodeId; 
        private String nodeName; 
        private java.util.List<String> securityGroupProbeIpList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHoneypotNodeRequest request) {
            super(request);
            this.availableProbeNum = request.availableProbeNum;
            this.nodeId = request.nodeId;
            this.nodeName = request.nodeName;
            this.securityGroupProbeIpList = request.securityGroupProbeIpList;
        } 

        /**
         * <p>The number of available probes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder availableProbeNum(Integer availableProbeNum) {
            this.putQueryParameter("AvailableProbeNum", availableProbeNum);
            this.availableProbeNum = availableProbeNum;
            return this;
        }

        /**
         * <p>The ID of the management node.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to query the IDs of management nodes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>67ab3f4c-3db5-4fc3-b51f-00f8bfabfa08</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The name of the management node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HoneypotNodeTest</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The CIDR blocks that are allowed to access the management node.</p>
         */
        public Builder securityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
            this.putQueryParameter("SecurityGroupProbeIpList", securityGroupProbeIpList);
            this.securityGroupProbeIpList = securityGroupProbeIpList;
            return this;
        }

        @Override
        public UpdateHoneypotNodeRequest build() {
            return new UpdateHoneypotNodeRequest(this);
        } 

    } 

}
