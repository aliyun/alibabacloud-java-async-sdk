// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateResolverRuleRequest</p>
 */
public class UpdateResolverRuleRequest extends Request {
    @Query
    @NameInMap("ForwardIp")
    private java.util.List < ForwardIp> forwardIp;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    private UpdateResolverRuleRequest(Builder builder) {
        super(builder);
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
        private java.util.List < ForwardIp> forwardIp; 
        private String lang; 
        private String name; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResolverRuleRequest request) {
            super(request);
            this.forwardIp = request.forwardIp;
            this.lang = request.lang;
            this.name = request.name;
            this.ruleId = request.ruleId;
        } 

        /**
         * ForwardIp.
         */
        public Builder forwardIp(java.util.List < ForwardIp> forwardIp) {
            this.putQueryParameter("ForwardIp", forwardIp);
            this.forwardIp = forwardIp;
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

        /**
         * RuleId.
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

    public static class ForwardIp extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
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
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Port.
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
