// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Logging} extends {@link TeaModel}
 *
 * <p>Logging</p>
 */
public class Logging extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("loggingDetails")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LoggingDetails> loggingDetails;

    @com.aliyun.core.annotation.NameInMap("loggingProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loggingProject;

    private Logging(Builder builder) {
        this.loggingDetails = builder.loggingDetails;
        this.loggingProject = builder.loggingProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Logging create() {
        return builder().build();
    }

    /**
     * @return loggingDetails
     */
    public java.util.List<LoggingDetails> getLoggingDetails() {
        return this.loggingDetails;
    }

    /**
     * @return loggingProject
     */
    public String getLoggingProject() {
        return this.loggingProject;
    }

    public static final class Builder {
        private java.util.List<LoggingDetails> loggingDetails; 
        private String loggingProject; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder loggingDetails(java.util.List<LoggingDetails> loggingDetails) {
            this.loggingDetails = loggingDetails;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder loggingProject(String loggingProject) {
            this.loggingProject = loggingProject;
            return this;
        }

        public Logging build() {
            return new Logging(this);
        } 

    } 

    /**
     * 
     * {@link Logging} extends {@link TeaModel}
     *
     * <p>Logging</p>
     */
    public static class LoggingDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        @com.aliyun.core.annotation.Validation(required = true)
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private LoggingDetails(Builder builder) {
            this.logstore = builder.logstore;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoggingDetails create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String logstore; 
            private String type; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-logstore</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>consumergroup_log</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LoggingDetails build() {
                return new LoggingDetails(this);
            } 

        } 

    }
}
