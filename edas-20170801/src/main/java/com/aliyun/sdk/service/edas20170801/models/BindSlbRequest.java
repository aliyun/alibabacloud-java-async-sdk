// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindSlbRequest} extends {@link RequestModel}
 *
 * <p>BindSlbRequest</p>
 */
public class BindSlbRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ListenerPort")
    @Validation(maximum = 65535)
    private Integer listenerPort;

    @Query
    @NameInMap("SlbId")
    @Validation(required = true)
    private String slbId;

    @Query
    @NameInMap("SlbIp")
    @Validation(required = true)
    private String slbIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("VServerGroupId")
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
         * The ID of the EDAS application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The listener port for the SLB instance.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The ID of the SLB instance.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * The IP address of the SLB instance.
         */
        public Builder slbIp(String slbIp) {
            this.putQueryParameter("SlbIp", slbIp);
            this.slbIp = slbIp;
            return this;
        }

        /**
         * The type of the SLB instance. Valid values:
         * <p>
         * 
         * *   internet: Internet-facing SLB instance
         * *   intranet: internal-facing SLB instance
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The ID of the vServer group for the internal-facing SLB instance.
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
