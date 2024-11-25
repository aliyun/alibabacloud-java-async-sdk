// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateResolverRuleRequest</p>
 */
public class UpdateResolverRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardIp")
    private java.util.List < ForwardIp> forwardIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private UpdateResolverRuleRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.forwardIp = builder.forwardIp;
        this.lang = builder.lang;
        this.name = builder.name;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResolverRuleRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<UpdateResolverRuleRequest, Builder> {
        private String endpointId; 
        private java.util.List < ForwardIp> forwardIp; 
        private String lang; 
        private String name; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResolverRuleRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.forwardIp = request.forwardIp;
            this.lang = request.lang;
            this.name = request.name;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * <p>The IP addresses and ports of the external Domain Name System (DNS) servers. Enter the IP addresses and ports of the destination servers to which the DNS requests are forwarded. You can enter up to six IP addresses and ports. Both private and public IP addresses are supported.</p>
         * <blockquote>
         * <p> If you specify public IP addresses as the IP addresses of the external DNS servers and Elastic Compute Service (ECS) instances in the outbound virtual private cloud (VPC) are not assigned public IP addresses, you need to activate NAT Gateway for the VPC and create and manage SNAT entries on a NAT gateway.</p>
         * </blockquote>
         */
        public Builder forwardIp(java.util.List < ForwardIp> forwardIp) {
            this.putQueryParameter("ForwardIp", forwardIp);
            this.forwardIp = forwardIp;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>forward rule-test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public UpdateResolverRuleRequest build() {
            return new UpdateResolverRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateResolverRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateResolverRuleRequest</p>
     */
    public static class ForwardIp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
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
             * <p>The IP address of the destination server.</p>
             * <blockquote>
             * <p> You cannot specify the following IP addresses as the IP addresses of the external DNS servers because the IP addresses are reserved by the system: 100.100.2.136 to 100.100.2.138, and 100.100.2.116 to 100.100.2.118.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port of the destination server.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
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
