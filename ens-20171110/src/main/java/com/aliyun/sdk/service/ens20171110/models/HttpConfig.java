// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HttpConfig} extends {@link TeaModel}
 *
 * <p>HttpConfig</p>
 */
public class HttpConfig extends TeaModel {
    @NameInMap("Cookie")
    private String cookie;

    @NameInMap("CookieTimeout")
    @Validation(maximum = 86400, minimum = 1)
    private Integer cookieTimeout;

    @NameInMap("IdleTimeout")
    @Validation(maximum = 60, minimum = 1)
    private Integer idleTimeout;

    @NameInMap("RequestTimeout")
    @Validation(maximum = 180, minimum = 1)
    private Integer requestTimeout;

    @NameInMap("Scheduler")
    private String scheduler;

    @NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @NameInMap("StickySession")
    private String stickySession;

    @NameInMap("StickySessionType")
    private String stickySessionType;

    @NameInMap("XForwardedFor")
    private String xForwardedFor;

    private HttpConfig(Builder builder) {
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.idleTimeout = builder.idleTimeout;
        this.requestTimeout = builder.requestTimeout;
        this.scheduler = builder.scheduler;
        this.serverCertificateId = builder.serverCertificateId;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.xForwardedFor = builder.xForwardedFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpConfig create() {
        return builder().build();
    }

    /**
     * @return cookie
     */
    public String getCookie() {
        return this.cookie;
    }

    /**
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    /**
     * @return stickySession
     */
    public String getStickySession() {
        return this.stickySession;
    }

    /**
     * @return stickySessionType
     */
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    /**
     * @return xForwardedFor
     */
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

    public static final class Builder {
        private String cookie; 
        private Integer cookieTimeout; 
        private Integer idleTimeout; 
        private Integer requestTimeout; 
        private String scheduler; 
        private String serverCertificateId; 
        private String stickySession; 
        private String stickySessionType; 
        private String xForwardedFor; 

        /**
         * Cookie.
         */
        public Builder cookie(String cookie) {
            this.cookie = cookie;
            return this;
        }

        /**
         * CookieTimeout.
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * IdleTimeout.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * RequestTimeout.
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * ServerCertificateId.
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * StickySession.
         */
        public Builder stickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }

        /**
         * StickySessionType.
         */
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * XForwardedFor.
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        public HttpConfig build() {
            return new HttpConfig(this);
        } 

    } 

}
