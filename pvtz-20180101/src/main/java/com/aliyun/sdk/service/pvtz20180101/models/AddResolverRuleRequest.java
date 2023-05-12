// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>AddResolverRuleRequest</p>
 */
public class AddResolverRuleRequest extends Request {
    @Query
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("ForwardIp")
    @Validation(required = true)
    private java.util.List < ForwardIp> forwardIp;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("ZoneName")
    @Validation(required = true)
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
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * ZoneName.
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
        @NameInMap("Ip")
        @Validation(required = true)
        private String ip;

        @NameInMap("Port")
        @Validation(required = true)
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
