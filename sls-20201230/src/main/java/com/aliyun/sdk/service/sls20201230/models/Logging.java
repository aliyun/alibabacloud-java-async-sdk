// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Logging} extends {@link TeaModel}
 *
 * <p>Logging</p>
 */
public class Logging extends TeaModel {
    @NameInMap("loggingDetails")
    @Validation(required = true)
    private java.util.List < LoggingDetails> loggingDetails;

    @NameInMap("loggingProject")
    @Validation(required = true)
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
    public java.util.List < LoggingDetails> getLoggingDetails() {
        return this.loggingDetails;
    }

    /**
     * @return loggingProject
     */
    public String getLoggingProject() {
        return this.loggingProject;
    }

    public static final class Builder {
        private java.util.List < LoggingDetails> loggingDetails; 
        private String loggingProject; 

        /**
         * loggingDetails.
         */
        public Builder loggingDetails(java.util.List < LoggingDetails> loggingDetails) {
            this.loggingDetails = loggingDetails;
            return this;
        }

        /**
         * loggingProject.
         */
        public Builder loggingProject(String loggingProject) {
            this.loggingProject = loggingProject;
            return this;
        }

        public Logging build() {
            return new Logging(this);
        } 

    } 

    public static class LoggingDetails extends TeaModel {
        @NameInMap("logstore")
        @Validation(required = true)
        private String logstore;

        @NameInMap("type")
        @Validation(required = true)
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
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * type.
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
