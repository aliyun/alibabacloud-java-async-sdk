// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyCountResponseBody</p>
 */
public class DescribePropertyCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Autorun")
    private Integer autorun;

    @com.aliyun.core.annotation.NameInMap("Cron")
    private Integer cron;

    @com.aliyun.core.annotation.NameInMap("Database")
    private Integer database;

    @com.aliyun.core.annotation.NameInMap("Lkm")
    private Integer lkm;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("Process")
    private Integer process;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sca")
    private Integer sca;

    @com.aliyun.core.annotation.NameInMap("Software")
    private Integer software;

    @com.aliyun.core.annotation.NameInMap("User")
    private Integer user;

    @com.aliyun.core.annotation.NameInMap("Web")
    private Integer web;

    @com.aliyun.core.annotation.NameInMap("Webserver")
    private Integer webserver;

    private DescribePropertyCountResponseBody(Builder builder) {
        this.autorun = builder.autorun;
        this.cron = builder.cron;
        this.database = builder.database;
        this.lkm = builder.lkm;
        this.port = builder.port;
        this.process = builder.process;
        this.requestId = builder.requestId;
        this.sca = builder.sca;
        this.software = builder.software;
        this.user = builder.user;
        this.web = builder.web;
        this.webserver = builder.webserver;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return autorun
     */
    public Integer getAutorun() {
        return this.autorun;
    }

    /**
     * @return cron
     */
    public Integer getCron() {
        return this.cron;
    }

    /**
     * @return database
     */
    public Integer getDatabase() {
        return this.database;
    }

    /**
     * @return lkm
     */
    public Integer getLkm() {
        return this.lkm;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return process
     */
    public Integer getProcess() {
        return this.process;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sca
     */
    public Integer getSca() {
        return this.sca;
    }

    /**
     * @return software
     */
    public Integer getSoftware() {
        return this.software;
    }

    /**
     * @return user
     */
    public Integer getUser() {
        return this.user;
    }

    /**
     * @return web
     */
    public Integer getWeb() {
        return this.web;
    }

    /**
     * @return webserver
     */
    public Integer getWebserver() {
        return this.webserver;
    }

    public static final class Builder {
        private Integer autorun; 
        private Integer cron; 
        private Integer database; 
        private Integer lkm; 
        private Integer port; 
        private Integer process; 
        private String requestId; 
        private Integer sca; 
        private Integer software; 
        private Integer user; 
        private Integer web; 
        private Integer webserver; 

        /**
         * The number of startup items.
         */
        public Builder autorun(Integer autorun) {
            this.autorun = autorun;
            return this;
        }

        /**
         * The number of scheduled tasks.
         */
        public Builder cron(Integer cron) {
            this.cron = cron;
            return this;
        }

        /**
         * The number of databases.
         */
        public Builder database(Integer database) {
            this.database = database;
            return this;
        }

        /**
         * The number of kernel modules.
         */
        public Builder lkm(Integer lkm) {
            this.lkm = lkm;
            return this;
        }

        /**
         * The number of ports.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * The number of processes.
         */
        public Builder process(Integer process) {
            this.process = process;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of middleware assets.
         */
        public Builder sca(Integer sca) {
            this.sca = sca;
            return this;
        }

        /**
         * The number of software assets.
         */
        public Builder software(Integer software) {
            this.software = software;
            return this;
        }

        /**
         * The number of accounts.
         */
        public Builder user(Integer user) {
            this.user = user;
            return this;
        }

        /**
         * The number of websites.
         */
        public Builder web(Integer web) {
            this.web = web;
            return this;
        }

        /**
         * The number of web services.
         */
        public Builder webserver(Integer webserver) {
            this.webserver = webserver;
            return this;
        }

        public DescribePropertyCountResponseBody build() {
            return new DescribePropertyCountResponseBody(this);
        } 

    } 

}
