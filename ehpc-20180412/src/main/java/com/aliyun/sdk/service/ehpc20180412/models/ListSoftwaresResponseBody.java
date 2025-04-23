// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
 *
 * <p>ListSoftwaresResponseBody</p>
 */
public class ListSoftwaresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Softwares")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListSoftwaresResponseBody model) {
            this.requestId = model.requestId;
            this.softwares = model.softwares;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of the information about the software installed in the cluster.</p>
         */
        public Builder softwares(Softwares softwares) {
            this.softwares = softwares;
            return this;
        }

        public ListSoftwaresResponseBody build() {
            return new ListSoftwaresResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
    public static class ApplicationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(ApplicationInfo model) {
                this.name = model.name;
                this.required = model.required;
                this.tag = model.tag;
                this.version = model.version;
            } 

            /**
             * <p>The name of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>cudnnt</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the software is required. Valid values:</p>
             * <ul>
             * <li>false: optional</li>
             * <li>true: required</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The tag of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>CUDNN_9.0</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The version of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>9.0</p>
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
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationInfo")
        private java.util.List<ApplicationInfo> applicationInfo;

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
        public java.util.List<ApplicationInfo> getApplicationInfo() {
            return this.applicationInfo;
        }

        public static final class Builder {
            private java.util.List<ApplicationInfo> applicationInfo; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationInfo = model.applicationInfo;
            } 

            /**
             * ApplicationInfo.
             */
            public Builder applicationInfo(java.util.List<ApplicationInfo> applicationInfo) {
                this.applicationInfo = applicationInfo;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
    public static class SoftwareInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("AccountVersion")
        private String accountVersion;

        @com.aliyun.core.annotation.NameInMap("Applications")
        private Applications applications;

        @com.aliyun.core.annotation.NameInMap("EhpcVersion")
        private String ehpcVersion;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("SchedulerVersion")
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

            private Builder() {
            } 

            private Builder(SoftwareInfo model) {
                this.accountType = model.accountType;
                this.accountVersion = model.accountVersion;
                this.applications = model.applications;
                this.ehpcVersion = model.ehpcVersion;
                this.osTag = model.osTag;
                this.schedulerType = model.schedulerType;
                this.schedulerVersion = model.schedulerVersion;
            } 

            /**
             * <p>The service type of the domain account. Valid values:</p>
             * <ul>
             * <li>nis</li>
             * <li>ldap</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nis</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The version of the domain account service.</p>
             * 
             * <strong>example:</strong>
             * <p>2.31</p>
             */
            public Builder accountVersion(String accountVersion) {
                this.accountVersion = accountVersion;
                return this;
            }

            /**
             * <p>The list of the software in the cluster.</p>
             */
            public Builder applications(Applications applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The version of the E-HPC client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder ehpcVersion(String ehpcVersion) {
                this.ehpcVersion = ehpcVersion;
                return this;
            }

            /**
             * <p>The image tag of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <p>The type of the scheduler. Valid values:</p>
             * <ul>
             * <li>pbs</li>
             * <li>pbs19</li>
             * <li>slurm</li>
             * <li>slurm19</li>
             * <li>slurm20</li>
             * <li>opengridscheduler</li>
             * <li>deadline</li>
             * <li>gridengine</li>
             * <li>cube</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pbs</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The version of the scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>18.1.1</p>
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
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
    public static class Softwares extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SoftwareInfo")
        private java.util.List<SoftwareInfo> softwareInfo;

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
        public java.util.List<SoftwareInfo> getSoftwareInfo() {
            return this.softwareInfo;
        }

        public static final class Builder {
            private java.util.List<SoftwareInfo> softwareInfo; 

            private Builder() {
            } 

            private Builder(Softwares model) {
                this.softwareInfo = model.softwareInfo;
            } 

            /**
             * SoftwareInfo.
             */
            public Builder softwareInfo(java.util.List<SoftwareInfo> softwareInfo) {
                this.softwareInfo = softwareInfo;
                return this;
            }

            public Softwares build() {
                return new Softwares(this);
            } 

        } 

    }
}
