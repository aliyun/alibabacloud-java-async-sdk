// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotNodeRequest</p>
 */
public class UpdateHoneypotNodeRequest extends Request {
    @Query
    @NameInMap("AvailableProbeNum")
    @Validation(required = true)
    private Integer availableProbeNum;

    @Query
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Query
    @NameInMap("NodeName")
    @Validation(required = true)
    private String nodeName;

    @Query
    @NameInMap("SecurityGroupProbeIpList")
    private java.util.List < String > securityGroupProbeIpList;

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
    public java.util.List < String > getSecurityGroupProbeIpList() {
        return this.securityGroupProbeIpList;
    }

    public static final class Builder extends Request.Builder<UpdateHoneypotNodeRequest, Builder> {
        private Integer availableProbeNum; 
        private String nodeId; 
        private String nodeName; 
        private java.util.List < String > securityGroupProbeIpList; 

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
         * AvailableProbeNum.
         */
        public Builder availableProbeNum(Integer availableProbeNum) {
            this.putQueryParameter("AvailableProbeNum", availableProbeNum);
            this.availableProbeNum = availableProbeNum;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * SecurityGroupProbeIpList.
         */
        public Builder securityGroupProbeIpList(java.util.List < String > securityGroupProbeIpList) {
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
