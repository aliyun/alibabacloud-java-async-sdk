// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateProhibitedSoftwareResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProhibitedSoftwareResponseBody</p>
 */
public class CreateProhibitedSoftwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Software")
    private Software software;

    private CreateProhibitedSoftwareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.software = builder.software;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProhibitedSoftwareResponseBody create() {
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
     * @return software
     */
    public Software getSoftware() {
        return this.software;
    }

    public static final class Builder {
        private String requestId; 
        private Software software; 

        private Builder() {
        } 

        private Builder(CreateProhibitedSoftwareResponseBody model) {
            this.requestId = model.requestId;
            this.software = model.software;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B9AC7B08-80F5-5EDD-8E6B-033F2FE5D4E2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the disabled software.</p>
         */
        public Builder software(Software software) {
            this.software = software;
            return this;
        }

        public CreateProhibitedSoftwareResponseBody build() {
            return new CreateProhibitedSoftwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProhibitedSoftwareResponseBody</p>
     */
    public static class LinuxProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        private LinuxProcesses(Builder builder) {
            this.bundleId = builder.bundleId;
            this.cmdline = builder.cmdline;
            this.directory = builder.directory;
            this.process = builder.process;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinuxProcesses create() {
            return builder().build();
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        public static final class Builder {
            private String bundleId; 
            private String cmdline; 
            private String directory; 
            private String process; 

            private Builder() {
            } 

            private Builder(LinuxProcesses model) {
                this.bundleId = model.bundleId;
                this.cmdline = model.cmdline;
                this.directory = model.directory;
                this.process = model.process;
            } 

            /**
             * <p>The bundle ID of the application. This parameter is required only for macOS processes.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun.security.sase</p>
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * <p>The command line parameters for starting the process.</p>
             * 
             * <strong>example:</strong>
             * <p>--start-minimized</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The directory where the process is located.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Program Files\Thunder Network\Thunder</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The process name.</p>
             * 
             * <strong>example:</strong>
             * <p>terraform</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            public LinuxProcesses build() {
                return new LinuxProcesses(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProhibitedSoftwareResponseBody</p>
     */
    public static class MacOSProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        private MacOSProcesses(Builder builder) {
            this.bundleId = builder.bundleId;
            this.cmdline = builder.cmdline;
            this.directory = builder.directory;
            this.process = builder.process;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MacOSProcesses create() {
            return builder().build();
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        public static final class Builder {
            private String bundleId; 
            private String cmdline; 
            private String directory; 
            private String process; 

            private Builder() {
            } 

            private Builder(MacOSProcesses model) {
                this.bundleId = model.bundleId;
                this.cmdline = model.cmdline;
                this.directory = model.directory;
                this.process = model.process;
            } 

            /**
             * <p>The bundle ID of the application. This parameter is required only for macOS processes.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun.security.sase</p>
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * <p>The command line parameters for starting the process.</p>
             * 
             * <strong>example:</strong>
             * <p>--start-minimized</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The directory where the process is located.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Program Files\Thunder Network\Thunder</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The process name.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest_update.exe</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            public MacOSProcesses build() {
                return new MacOSProcesses(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProhibitedSoftwareResponseBody</p>
     */
    public static class WindowsProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        private WindowsProcesses(Builder builder) {
            this.bundleId = builder.bundleId;
            this.cmdline = builder.cmdline;
            this.directory = builder.directory;
            this.process = builder.process;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WindowsProcesses create() {
            return builder().build();
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        public static final class Builder {
            private String bundleId; 
            private String cmdline; 
            private String directory; 
            private String process; 

            private Builder() {
            } 

            private Builder(WindowsProcesses model) {
                this.bundleId = model.bundleId;
                this.cmdline = model.cmdline;
                this.directory = model.directory;
                this.process = model.process;
            } 

            /**
             * <p>The bundle ID of the application. This parameter is required only for macOS processes.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun.security.sase</p>
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * <p>The command line parameters for starting the process.</p>
             * 
             * <strong>example:</strong>
             * <p>--start-minimized</p>
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * <p>The directory where the process is located.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Program Files\Thunder Network\Thunder</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The process name.</p>
             * 
             * <strong>example:</strong>
             * <p>anaconda3.exe</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            public WindowsProcesses build() {
                return new WindowsProcesses(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProhibitedSoftwareResponseBody</p>
     */
    public static class Software extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LinuxProcesses")
        private java.util.List<LinuxProcesses> linuxProcesses;

        @com.aliyun.core.annotation.NameInMap("MacOSProcesses")
        private java.util.List<MacOSProcesses> macOSProcesses;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        @com.aliyun.core.annotation.NameInMap("TagIds")
        private java.util.List<String> tagIds;

        @com.aliyun.core.annotation.NameInMap("WindowsProcesses")
        private java.util.List<WindowsProcesses> windowsProcesses;

        private Software(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.linuxProcesses = builder.linuxProcesses;
            this.macOSProcesses = builder.macOSProcesses;
            this.name = builder.name;
            this.softwareId = builder.softwareId;
            this.tagIds = builder.tagIds;
            this.windowsProcesses = builder.windowsProcesses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Software create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return linuxProcesses
         */
        public java.util.List<LinuxProcesses> getLinuxProcesses() {
            return this.linuxProcesses;
        }

        /**
         * @return macOSProcesses
         */
        public java.util.List<MacOSProcesses> getMacOSProcesses() {
            return this.macOSProcesses;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        /**
         * @return tagIds
         */
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        /**
         * @return windowsProcesses
         */
        public java.util.List<WindowsProcesses> getWindowsProcesses() {
            return this.windowsProcesses;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private java.util.List<LinuxProcesses> linuxProcesses; 
            private java.util.List<MacOSProcesses> macOSProcesses; 
            private String name; 
            private String softwareId; 
            private java.util.List<String> tagIds; 
            private java.util.List<WindowsProcesses> windowsProcesses; 

            private Builder() {
            } 

            private Builder(Software model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.linuxProcesses = model.linuxProcesses;
                this.macOSProcesses = model.macOSProcesses;
                this.name = model.name;
                this.softwareId = model.softwareId;
                this.tagIds = model.tagIds;
                this.windowsProcesses = model.windowsProcesses;
            } 

            /**
             * <p>The creation time of the disabled software, in the yyyy-MM-dd HH:mm:ss format. The time is in the UTC+8 time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-05 10:20:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the disabled software.</p>
             * 
             * <strong>example:</strong>
             * <p>Endpoint group targeting github</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of process configurations for the Linux operating system.</p>
             */
            public Builder linuxProcesses(java.util.List<LinuxProcesses> linuxProcesses) {
                this.linuxProcesses = linuxProcesses;
                return this;
            }

            /**
             * <p>The list of process configurations for the macOS operating system.</p>
             */
            public Builder macOSProcesses(java.util.List<MacOSProcesses> macOSProcesses) {
                this.macOSProcesses = macOSProcesses;
                return this;
            }

            /**
             * <p>The software name.</p>
             * 
             * <strong>example:</strong>
             * <p>shell</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the disabled software.</p>
             * 
             * <strong>example:</strong>
             * <p>swb-83995ff2ae38****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * <p>The IDs of disabled software tags associated with this disabled software.</p>
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * <p>The list of process configurations for the Windows operating system.</p>
             */
            public Builder windowsProcesses(java.util.List<WindowsProcesses> windowsProcesses) {
                this.windowsProcesses = windowsProcesses;
                return this;
            }

            public Software build() {
                return new Software(this);
            } 

        } 

    }
}
