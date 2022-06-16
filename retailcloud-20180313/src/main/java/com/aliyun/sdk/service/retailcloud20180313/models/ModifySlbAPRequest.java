// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySlbAPRequest} extends {@link RequestModel}
 *
 * <p>ModifySlbAPRequest</p>
 */
public class ModifySlbAPRequest extends Request {
    @Query
    @NameInMap("CookieTimeout")
    private Integer cookieTimeout;

    @Query
    @NameInMap("EstablishedTimeout")
    private Integer establishedTimeout;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RealServerPort")
    private Integer realServerPort;

    @Query
    @NameInMap("SlbAPId")
    @Validation(required = true)
    private Long slbAPId;

    @Query
    @NameInMap("SslCertId")
    private String sslCertId;

    @Query
    @NameInMap("StickySession")
    private Integer stickySession;

    private ModifySlbAPRequest(Builder builder) {
        super(builder);
        this.cookieTimeout = builder.cookieTimeout;
        this.establishedTimeout = builder.establishedTimeout;
        this.name = builder.name;
        this.realServerPort = builder.realServerPort;
        this.slbAPId = builder.slbAPId;
        this.sslCertId = builder.sslCertId;
        this.stickySession = builder.stickySession;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySlbAPRequest create() {
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
     * @return establishedTimeout
     */
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return realServerPort
     */
    public Integer getRealServerPort() {
        return this.realServerPort;
    }

    /**
     * @return slbAPId
     */
    public Long getSlbAPId() {
        return this.slbAPId;
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

    public static final class Builder extends Request.Builder<ModifySlbAPRequest, Builder> {
        private Integer cookieTimeout; 
        private Integer establishedTimeout; 
        private String name; 
        private Integer realServerPort; 
        private Long slbAPId; 
        private String sslCertId; 
        private Integer stickySession; 

        private Builder() {
            super();
        } 

        private Builder(ModifySlbAPRequest request) {
            super(request);
            this.cookieTimeout = request.cookieTimeout;
            this.establishedTimeout = request.establishedTimeout;
            this.name = request.name;
            this.realServerPort = request.realServerPort;
            this.slbAPId = request.slbAPId;
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
         * EstablishedTimeout.
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.putQueryParameter("EstablishedTimeout", establishedTimeout);
            this.establishedTimeout = establishedTimeout;
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
         * RealServerPort.
         */
        public Builder realServerPort(Integer realServerPort) {
            this.putQueryParameter("RealServerPort", realServerPort);
            this.realServerPort = realServerPort;
            return this;
        }

        /**
         * SlbAPId.
         */
        public Builder slbAPId(Long slbAPId) {
            this.putQueryParameter("SlbAPId", slbAPId);
            this.slbAPId = slbAPId;
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
        public ModifySlbAPRequest build() {
            return new ModifySlbAPRequest(this);
        } 

    } 

}
