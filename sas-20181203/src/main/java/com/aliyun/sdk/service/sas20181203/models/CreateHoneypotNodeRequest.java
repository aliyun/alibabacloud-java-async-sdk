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
 * {@link CreateHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateHoneypotNodeRequest</p>
 */
public class CreateHoneypotNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowHoneypotAccessInternet")
    private Boolean allowHoneypotAccessInternet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableProbeNum")
    private Integer availableProbeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupProbeIpList")
    private java.util.List<String> securityGroupProbeIpList;

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
    public java.util.List<String> getSecurityGroupProbeIpList() {
        return this.securityGroupProbeIpList;
    }

    public static final class Builder extends Request.Builder<CreateHoneypotNodeRequest, Builder> {
        private Boolean allowHoneypotAccessInternet; 
        private Integer availableProbeNum; 
        private String nodeName; 
        private java.util.List<String> securityGroupProbeIpList; 

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
         * <p>Specifies whether to allow the honeypot to access the Internet. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Allowed.</li>
         * <li><strong>false</strong>: Not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowHoneypotAccessInternet(Boolean allowHoneypotAccessInternet) {
            this.putQueryParameter("AllowHoneypotAccessInternet", allowHoneypotAccessInternet);
            this.allowHoneypotAccessInternet = allowHoneypotAccessInternet;
            return this;
        }

        /**
         * <p>The number of available probes. This parameter is required. If this parameter is not specified, the API returns InvalidParam (400). The minimum value is 20. If the value is less than 20, the API returns InvalidProbeNum (400).</p>
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
         * <p>The name of the management node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>manageNode</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The list of allowed CIDR blocks. This parameter is required. At least one allowed CIDR block must be specified, such as 0.0.0.0/0. If this parameter is not specified, the API returns InvalidParam (400).</p>
         */
        public Builder securityGroupProbeIpList(java.util.List<String> securityGroupProbeIpList) {
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
