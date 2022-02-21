// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResolverEndpointRequest} extends {@link RequestModel}
 *
 * <p>UpdateResolverEndpointRequest</p>
 */
public class UpdateResolverEndpointRequest extends Request {
    @Query
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("IpConfig")
    private java.util.List < IpConfig> ipConfig;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    private UpdateResolverEndpointRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.ipConfig = builder.ipConfig;
        this.lang = builder.lang;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResolverEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return ipConfig
     */
    public java.util.List < IpConfig> getIpConfig() {
        return this.ipConfig;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateResolverEndpointRequest, Builder> {
        private String endpointId; 
        private java.util.List < IpConfig> ipConfig; 
        private String lang; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResolverEndpointRequest response) {
            super(response);
            this.endpointId = response.endpointId;
            this.ipConfig = response.ipConfig;
            this.lang = response.lang;
            this.name = response.name;
        } 

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * IpConfig.
         */
        public Builder ipConfig(java.util.List < IpConfig> ipConfig) {
            this.putQueryParameter("IpConfig", ipConfig);
            this.ipConfig = ipConfig;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateResolverEndpointRequest build() {
            return new UpdateResolverEndpointRequest(this);
        } 

    } 

    public static class IpConfig extends TeaModel {
        @NameInMap("AzId")
        private String azId;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private IpConfig(Builder builder) {
            this.azId = builder.azId;
            this.cidrBlock = builder.cidrBlock;
            this.ip = builder.ip;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpConfig create() {
            return builder().build();
        }

        /**
         * @return azId
         */
        public String getAzId() {
            return this.azId;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String azId; 
            private String cidrBlock; 
            private String ip; 
            private String vSwitchId; 

            /**
             * AzId.
             */
            public Builder azId(String azId) {
                this.azId = azId;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public IpConfig build() {
                return new IpConfig(this);
            } 

        } 

    }
}
