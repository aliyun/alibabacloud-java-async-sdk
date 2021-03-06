// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpnConnectionResponseBody</p>
 */
public class CreateVpnConnectionResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpnConnectionId")
    private String vpnConnectionId;

    private CreateVpnConnectionResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.vpnConnectionId = builder.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static final class Builder {
        private Long createTime; 
        private String name; 
        private String requestId; 
        private String vpnConnectionId; 

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpnConnectionId.
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        public CreateVpnConnectionResponseBody build() {
            return new CreateVpnConnectionResponseBody(this);
        } 

    } 

}
