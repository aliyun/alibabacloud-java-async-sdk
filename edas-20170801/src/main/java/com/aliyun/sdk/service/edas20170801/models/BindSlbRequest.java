// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link BindSlbRequest} extends {@link RequestModel}
 *
 * <p>BindSlbRequest</p>
 */
public class BindSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slbIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    private BindSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.listenerPort = builder.listenerPort;
        this.slbId = builder.slbId;
        this.slbIp = builder.slbIp;
        this.type = builder.type;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindSlbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return slbIp
     */
    public String getSlbIp() {
        return this.slbIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    public static final class Builder extends Request.Builder<BindSlbRequest, Builder> {
        private String appId; 
        private Integer listenerPort; 
        private String slbId; 
        private String slbIp; 
        private String type; 
        private String vServerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(BindSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.listenerPort = request.listenerPort;
            this.slbId = request.slbId;
            this.slbIp = request.slbIp;
            this.type = request.type;
            this.vServerGroupId = request.vServerGroupId;
        } 

        /**
         * <p>The ID of the EDAS application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-*********</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The listener port for the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The ID of the SLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-wz96ph63r************</p>
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * <p>The IP address of the SLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.16*.<em>.</em></p>
         */
        public Builder slbIp(String slbIp) {
            this.putQueryParameter("SlbIp", slbIp);
            this.slbIp = slbIp;
            return this;
        }

        /**
         * <p>The type of the SLB instance. Valid values:</p>
         * <ul>
         * <li>internet: Internet-facing SLB instance</li>
         * <li>intranet: internal-facing SLB instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the vServer group for the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6******</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        @Override
        public BindSlbRequest build() {
            return new BindSlbRequest(this);
        } 

    } 

}
