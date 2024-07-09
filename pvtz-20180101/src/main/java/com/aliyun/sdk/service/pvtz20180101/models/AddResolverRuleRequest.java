// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>AddResolverRuleRequest</p>
 */
public class AddResolverRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ForwardIp> forwardIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneName;

    private AddResolverRuleRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.forwardIp = builder.forwardIp;
        this.lang = builder.lang;
        this.name = builder.name;
        this.type = builder.type;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddResolverRuleRequest create() {
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
     * @return forwardIp
     */
    public java.util.List < ForwardIp> getForwardIp() {
        return this.forwardIp;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<AddResolverRuleRequest, Builder> {
        private String endpointId; 
        private java.util.List < ForwardIp> forwardIp; 
        private String lang; 
        private String name; 
        private String type; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(AddResolverRuleRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.forwardIp = request.forwardIp;
            this.lang = request.lang;
            this.name = request.name;
            this.type = request.type;
            this.zoneName = request.zoneName;
        } 

        /**
         * The endpoint ID.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The destination IP address and port number.
         */
        public Builder forwardIp(java.util.List < ForwardIp> forwardIp) {
            this.putQueryParameter("ForwardIp", forwardIp);
            this.forwardIp = forwardIp;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The name of the forwarding rule.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the forwarding rule. Valid value:
         * <p>
         * 
         * *   OUTBOUND: forwards Domain Name System (DNS) requests to one or more external IP addresses.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The name of the forward zone.
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public AddResolverRuleRequest build() {
            return new AddResolverRuleRequest(this);
        } 

    } 

    public static class ForwardIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        private ForwardIp(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardIp create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String ip; 
            private Integer port; 

            /**
             * The destination IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public ForwardIp build() {
                return new ForwardIp(this);
            } 

        } 

    }
}
