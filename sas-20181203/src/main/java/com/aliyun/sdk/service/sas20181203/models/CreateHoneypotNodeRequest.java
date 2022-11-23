// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotNodeRequest</p>
 */
public class CreateHoneypotNodeRequest extends Request {
    @Query
    @NameInMap("AllowHoneypotAccessInternet")
    private Boolean allowHoneypotAccessInternet;

    @Query
    @NameInMap("AvailableProbeNum")
    private Integer availableProbeNum;

    @Query
    @NameInMap("NodeName")
    @Validation(required = true)
    private String nodeName;

    @Query
    @NameInMap("SecurityGroupProbeIpList")
    private java.util.List < String > securityGroupProbeIpList;

    private CreateHoneypotNodeRequest(Builder builder) {
        super(builder);
        this.allowHoneypotAccessInternet = builder.allowHoneypotAccessInternet;
        this.availableProbeNum = builder.availableProbeNum;
        this.nodeName = builder.nodeName;
        this.securityGroupProbeIpList = builder.securityGroupProbeIpList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowHoneypotAccessInternet
     */
    public Boolean getAllowHoneypotAccessInternet() {
        return this.allowHoneypotAccessInternet;
    }

    /**
     * @return availableProbeNum
     */
    public Integer getAvailableProbeNum() {
        return this.availableProbeNum;
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

    public static final class Builder extends Request.Builder<CreateHoneypotNodeRequest, Builder> {
        private Boolean allowHoneypotAccessInternet; 
        private Integer availableProbeNum; 
        private String nodeName; 
        private java.util.List < String > securityGroupProbeIpList; 

        private Builder() {
            super();
        } 

        private Builder(CreateHoneypotNodeRequest request) {
            super(request);
            this.allowHoneypotAccessInternet = request.allowHoneypotAccessInternet;
            this.availableProbeNum = request.availableProbeNum;
            this.nodeName = request.nodeName;
            this.securityGroupProbeIpList = request.securityGroupProbeIpList;
        } 

        /**
         * 是否允许蜜罐访问外网
         */
        public Builder allowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
            this.putQueryParameter("AllowHoneypotAccessInternet", allowHoneypotAccessInternet);
            this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
            return this;
        }

        /**
         * 可用探针数量
         */
        public Builder availableProbeNum(Integer availableProbeNum) {
            this.putQueryParameter("AvailableProbeNum", availableProbeNum);
            this.availableProbeNum = availableProbeNum;
            return this;
        }

        /**
         * 管理节点名称
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
        public CreateHoneypotNodeRequest build() {
            return new CreateHoneypotNodeRequest(this);
        } 

    } 

}
