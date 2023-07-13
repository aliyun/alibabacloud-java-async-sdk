// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
 *
 * <p>ListSoftwaresResponseBody</p>
 */
public class ListSoftwaresResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Softwares")
    private Softwares softwares;

    private ListSoftwaresResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.softwares = builder.softwares;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwaresResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return softwares
     */
    public Softwares getSoftwares() {
        return this.softwares;
    }

    public static final class Builder {
        private String requestId; 
        private Softwares softwares; 

        /**
         * The list of the information about the software installed in the cluster.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The type of the scheduler. Valid values:
         * <p>
         * 
         * *   pbs
         * *   pbs19
         * *   slurm
         * *   slurm19
         * *   slurm20
         * *   opengridscheduler
         * *   deadline
         * *   gridengine
         * *   cube
         * *   custom
         */
        public Builder softwares(Softwares softwares) {
            this.softwares = softwares;
            return this;
        }

        public ListSoftwaresResponseBody build() {
            return new ListSoftwaresResponseBody(this);
        } 

    } 

    public static class ApplicationInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Required")
        private Boolean required;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("Version")
        private String version;

        private ApplicationInfo(Builder builder) {
            this.name = builder.name;
            this.required = builder.required;
            this.tag = builder.tag;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private Boolean required; 
            private String tag; 
            private String version; 

            /**
             * The version of the software.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The tag of the software.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * The name of the software.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ApplicationInfo build() {
                return new ApplicationInfo(this);
            } 

        } 

    }
    public static class Applications extends TeaModel {
        @NameInMap("ApplicationInfo")
        private java.util.List < ApplicationInfo> applicationInfo;

        private Applications(Builder builder) {
            this.applicationInfo = builder.applicationInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationInfo
         */
        public java.util.List < ApplicationInfo> getApplicationInfo() {
            return this.applicationInfo;
        }

        public static final class Builder {
            private java.util.List < ApplicationInfo> applicationInfo; 

            /**
             * ApplicationInfo.
             */
            public Builder applicationInfo(java.util.List < ApplicationInfo> applicationInfo) {
                this.applicationInfo = applicationInfo;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    public static class SoftwareInfo extends TeaModel {
        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("AccountVersion")
        private String accountVersion;

        @NameInMap("Applications")
        private Applications applications;

        @NameInMap("EhpcVersion")
        private String ehpcVersion;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("SchedulerType")
        private String schedulerType;

        @NameInMap("SchedulerVersion")
        private String schedulerVersion;

        private SoftwareInfo(Builder builder) {
            this.accountType = builder.accountType;
            this.accountVersion = builder.accountVersion;
            this.applications = builder.applications;
            this.ehpcVersion = builder.ehpcVersion;
            this.osTag = builder.osTag;
            this.schedulerType = builder.schedulerType;
            this.schedulerVersion = builder.schedulerVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareInfo create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return accountVersion
         */
        public String getAccountVersion() {
            return this.accountVersion;
        }

        /**
         * @return applications
         */
        public Applications getApplications() {
            return this.applications;
        }

        /**
         * @return ehpcVersion
         */
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return schedulerVersion
         */
        public String getSchedulerVersion() {
            return this.schedulerVersion;
        }

        public static final class Builder {
            private String accountType; 
            private String accountVersion; 
            private Applications applications; 
            private String ehpcVersion; 
            private String osTag; 
            private String schedulerType; 
            private String schedulerVersion; 

            /**
             * The version of the E-HPC client.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The service type of the domain account. Valid values:
             * <p>
             * 
             * *   nis
             * *   ldap
             */
            public Builder accountVersion(String accountVersion) {
                this.accountVersion = accountVersion;
                return this;
            }

            /**
             * Indicates whether the software is required. Valid values:
             * <p>
             * 
             * *   false: optional
             * *   true: required
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * The list of the software in the cluster.
             */
            public Builder ehpcVersion(String ehpcVersion) {
                this.ehpcVersion = ehpcVersion;
                return this;
            }

            /**
             * The version of the scheduler.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * The image tag of the cluster.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * The version of the domain account service.
             */
            public Builder schedulerVersion(String schedulerVersion) {
                this.schedulerVersion = schedulerVersion;
                return this;
            }

            public SoftwareInfo build() {
                return new SoftwareInfo(this);
            } 

        } 

    }
    public static class Softwares extends TeaModel {
        @NameInMap("SoftwareInfo")
        private java.util.List < SoftwareInfo> softwareInfo;

        private Softwares(Builder builder) {
            this.softwareInfo = builder.softwareInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Softwares create() {
            return builder().build();
        }

        /**
         * @return softwareInfo
         */
        public java.util.List < SoftwareInfo> getSoftwareInfo() {
            return this.softwareInfo;
        }

        public static final class Builder {
            private java.util.List < SoftwareInfo> softwareInfo; 

            /**
             * SoftwareInfo.
             */
            public Builder softwareInfo(java.util.List < SoftwareInfo> softwareInfo) {
                this.softwareInfo = softwareInfo;
                return this;
            }

            public Softwares build() {
                return new Softwares(this);
            } 

        } 

    }
}
