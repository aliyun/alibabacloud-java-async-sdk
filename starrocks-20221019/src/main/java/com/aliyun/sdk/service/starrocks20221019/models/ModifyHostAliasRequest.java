// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ModifyHostAliasRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostAliasRequest</p>
 */
public class ModifyHostAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hostAliases")
    private java.util.List<HostAliases> hostAliases;

    private ModifyHostAliasRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.hostAliases = builder.hostAliases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostAliasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return hostAliases
     */
    public java.util.List<HostAliases> getHostAliases() {
        return this.hostAliases;
    }

    public static final class Builder extends Request.Builder<ModifyHostAliasRequest, Builder> {
        private String instanceId; 
        private java.util.List<HostAliases> hostAliases; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostAliasRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.hostAliases = request.hostAliases;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * hostAliases.
         */
        public Builder hostAliases(java.util.List<HostAliases> hostAliases) {
            this.putBodyParameter("hostAliases", hostAliases);
            this.hostAliases = hostAliases;
            return this;
        }

        @Override
        public ModifyHostAliasRequest build() {
            return new ModifyHostAliasRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyHostAliasRequest} extends {@link TeaModel}
     *
     * <p>ModifyHostAliasRequest</p>
     */
    public static class HostAliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hostnames")
        private java.util.List<String> hostnames;

        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        private HostAliases(Builder builder) {
            this.hostnames = builder.hostnames;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAliases create() {
            return builder().build();
        }

        /**
         * @return hostnames
         */
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> hostnames; 
            private String ip; 

            private Builder() {
            } 

            private Builder(HostAliases model) {
                this.hostnames = model.hostnames;
                this.ip = model.ip;
            } 

            /**
             * hostnames.
             */
            public Builder hostnames(java.util.List<String> hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public HostAliases build() {
                return new HostAliases(this);
            } 

        } 

    }
}
