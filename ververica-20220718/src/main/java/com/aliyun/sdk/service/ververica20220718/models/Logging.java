// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Logging} extends {@link TeaModel}
 *
 * <p>Logging</p>
 */
public class Logging extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("log4j2ConfigurationTemplate")
    private String log4j2ConfigurationTemplate;

    @com.aliyun.core.annotation.NameInMap("log4jLoggers")
    private java.util.List < Log4jLogger > log4jLoggers;

    @com.aliyun.core.annotation.NameInMap("logReservePolicy")
    private LogReservePolicy logReservePolicy;

    @com.aliyun.core.annotation.NameInMap("loggingProfile")
    private String loggingProfile;

    private Logging(Builder builder) {
        this.log4j2ConfigurationTemplate = builder.log4j2ConfigurationTemplate;
        this.log4jLoggers = builder.log4jLoggers;
        this.logReservePolicy = builder.logReservePolicy;
        this.loggingProfile = builder.loggingProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Logging create() {
        return builder().build();
    }

    /**
     * @return log4j2ConfigurationTemplate
     */
    public String getLog4j2ConfigurationTemplate() {
        return this.log4j2ConfigurationTemplate;
    }

    /**
     * @return log4jLoggers
     */
    public java.util.List < Log4jLogger > getLog4jLoggers() {
        return this.log4jLoggers;
    }

    /**
     * @return logReservePolicy
     */
    public LogReservePolicy getLogReservePolicy() {
        return this.logReservePolicy;
    }

    /**
     * @return loggingProfile
     */
    public String getLoggingProfile() {
        return this.loggingProfile;
    }

    public static final class Builder {
        private String log4j2ConfigurationTemplate; 
        private java.util.List < Log4jLogger > log4jLoggers; 
        private LogReservePolicy logReservePolicy; 
        private String loggingProfile; 

        /**
         * log4j2ConfigurationTemplate.
         */
        public Builder log4j2ConfigurationTemplate(String log4j2ConfigurationTemplate) {
            this.log4j2ConfigurationTemplate = log4j2ConfigurationTemplate;
            return this;
        }

        /**
         * log4jLoggers.
         */
        public Builder log4jLoggers(java.util.List < Log4jLogger > log4jLoggers) {
            this.log4jLoggers = log4jLoggers;
            return this;
        }

        /**
         * logReservePolicy.
         */
        public Builder logReservePolicy(LogReservePolicy logReservePolicy) {
            this.logReservePolicy = logReservePolicy;
            return this;
        }

        /**
         * loggingProfile.
         */
        public Builder loggingProfile(String loggingProfile) {
            this.loggingProfile = loggingProfile;
            return this;
        }

        public Logging build() {
            return new Logging(this);
        } 

    } 

}
