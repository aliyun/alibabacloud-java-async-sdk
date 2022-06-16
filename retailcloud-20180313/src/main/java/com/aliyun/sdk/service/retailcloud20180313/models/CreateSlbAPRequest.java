// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlbAPRequest} extends {@link RequestModel}
 *
 * <p>CreateSlbAPRequest</p>
 */
public class CreateSlbAPRequest extends Request {
    @Query
    @NameInMap("CookieTimeout")
    private Integer cookieTimeout;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    @Query
    @NameInMap("EstablishedTimeout")
    private Integer establishedTimeout;

    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true)
    private Integer listenerPort;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Protocol")
    @Validation(required = true)
    private String protocol;

    @Query
    @NameInMap("RealServerPort")
    @Validation(required = true)
    private Integer realServerPort;

    @Query
    @NameInMap("SlbId")
    @Validation(required = true)
    private String slbId;

    @Query
    @NameInMap("SslCertId")
    private String sslCertId;

    @Query
    @NameInMap("StickySession")
    private Integer stickySession;

    private CreateSlbAPRequest(Builder builder) {
        super(builder);
        this.cookieTimeout = builder.cookieTimeout;
        this.envId = builder.envId;
        this.establishedTimeout = builder.establishedTimeout;
        this.listenerPort = builder.listenerPort;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.realServerPort = builder.realServerPort;
        this.slbId = builder.slbId;
        this.sslCertId = builder.sslCertId;
        this.stickySession = builder.stickySession;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlbAPRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return establishedTimeout
     */
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return realServerPort
     */
    public Integer getRealServerPort() {
        return this.realServerPort;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return sslCertId
     */
    public String getSslCertId() {
        return this.sslCertId;
    }

    /**
     * @return stickySession
     */
    public Integer getStickySession() {
        return this.stickySession;
    }

    public static final class Builder extends Request.Builder<CreateSlbAPRequest, Builder> {
        private Integer cookieTimeout; 
        private Long envId; 
        private Integer establishedTimeout; 
        private Integer listenerPort; 
        private String name; 
        private String protocol; 
        private Integer realServerPort; 
        private String slbId; 
        private String sslCertId; 
        private Integer stickySession; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlbAPRequest request) {
            super(request);
            this.cookieTimeout = request.cookieTimeout;
            this.envId = request.envId;
            this.establishedTimeout = request.establishedTimeout;
            this.listenerPort = request.listenerPort;
            this.name = request.name;
            this.protocol = request.protocol;
            this.realServerPort = request.realServerPort;
            this.slbId = request.slbId;
            this.sslCertId = request.sslCertId;
            this.stickySession = request.stickySession;
        } 

        /**
         * CookieTimeout.
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.putQueryParameter("CookieTimeout", cookieTimeout);
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * EstablishedTimeout.
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.putQueryParameter("EstablishedTimeout", establishedTimeout);
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
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
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * RealServerPort.
         */
        public Builder realServerPort(Integer realServerPort) {
            this.putQueryParameter("RealServerPort", realServerPort);
            this.realServerPort = realServerPort;
            return this;
        }

        /**
         * SlbId.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * SslCertId.
         */
        public Builder sslCertId(String sslCertId) {
            this.putQueryParameter("SslCertId", sslCertId);
            this.sslCertId = sslCertId;
            return this;
        }

        /**
         * StickySession.
         */
        public Builder stickySession(Integer stickySession) {
            this.putQueryParameter("StickySession", stickySession);
            this.stickySession = stickySession;
            return this;
        }

        @Override
        public CreateSlbAPRequest build() {
            return new CreateSlbAPRequest(this);
        } 

    } 

}
