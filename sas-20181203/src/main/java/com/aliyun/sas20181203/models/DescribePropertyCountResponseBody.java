// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribePropertyCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyCountResponseBody</p>
 */
public class DescribePropertyCountResponseBody extends TeaModel {
    @NameInMap("AutoRun")
    private Integer autoRun;

    @NameInMap("Cron")
    private Integer cron;

    @NameInMap("Port")
    private Integer port;

    @NameInMap("Process")
    private Integer process;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sca")
    private Integer sca;

    @NameInMap("Software")
    private Integer software;

    @NameInMap("User")
    private Integer user;


    private DescribePropertyCountResponseBody(Builder builder) {
        this.autoRun = builder.autoRun;
        this.cron = builder.cron;
        this.port = builder.port;
        this.process = builder.process;
        this.requestId = builder.requestId;
        this.sca = builder.sca;
        this.software = builder.software;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRun
     */
    public Integer getAutoRun() {
        return this.autoRun;
    }

    /**
     * @return cron
     */
    public Integer getCron() {
        return this.cron;
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

    public static final class Builder {
        private Integer autoRun; 
        private Integer cron; 
        private Integer port; 
        private Integer process; 
        private String requestId; 
        private Integer sca; 
        private Integer software; 
        private Integer user; 

        /**
         * <p>AutoRun.</p>
         */
        public Builder autoRun(Integer autoRun) {
            this.autoRun = autoRun;
            return this;
        }

        /**
         * <p>Cron.</p>
         */
        public Builder cron(Integer cron) {
            this.cron = cron;
            return this;
        }

        /**
         * <p>Port.</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>Process.</p>
         */
        public Builder process(Integer process) {
            this.process = process;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Sca.</p>
         */
        public Builder sca(Integer sca) {
            this.sca = sca;
            return this;
        }

        /**
         * <p>Software.</p>
         */
        public Builder software(Integer software) {
            this.software = software;
            return this;
        }

        /**
         * <p>User.</p>
         */
        public Builder user(Integer user) {
            this.user = user;
            return this;
        }

        public DescribePropertyCountResponseBody build() {
            return new DescribePropertyCountResponseBody(this);
        } 

    } 

}
