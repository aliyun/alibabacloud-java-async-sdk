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
 * {@link UpdateProhibitedSoftwareRequest} extends {@link RequestModel}
 *
 * <p>UpdateProhibitedSoftwareRequest</p>
 */
public class UpdateProhibitedSoftwareRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LinuxProcesses")
    private java.util.List<LinuxProcesses> linuxProcesses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MacOSProcesses")
    private java.util.List<MacOSProcesses> macOSProcesses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String softwareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WindowsProcesses")
    private java.util.List<WindowsProcesses> windowsProcesses;

    private UpdateProhibitedSoftwareRequest(Builder builder) {
        super(builder);
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

    public static UpdateProhibitedSoftwareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateProhibitedSoftwareRequest, Builder> {
        private String description; 
        private java.util.List<LinuxProcesses> linuxProcesses; 
        private java.util.List<MacOSProcesses> macOSProcesses; 
        private String name; 
        private String softwareId; 
        private java.util.List<String> tagIds; 
        private java.util.List<WindowsProcesses> windowsProcesses; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProhibitedSoftwareRequest request) {
            super(request);
            this.description = request.description;
            this.linuxProcesses = request.linuxProcesses;
            this.macOSProcesses = request.macOSProcesses;
            this.name = request.name;
            this.softwareId = request.softwareId;
            this.tagIds = request.tagIds;
            this.windowsProcesses = request.windowsProcesses;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * LinuxProcesses.
         */
        public Builder linuxProcesses(java.util.List<LinuxProcesses> linuxProcesses) {
            this.putBodyParameter("LinuxProcesses", linuxProcesses);
            this.linuxProcesses = linuxProcesses;
            return this;
        }

        /**
         * MacOSProcesses.
         */
        public Builder macOSProcesses(java.util.List<MacOSProcesses> macOSProcesses) {
            this.putBodyParameter("MacOSProcesses", macOSProcesses);
            this.macOSProcesses = macOSProcesses;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-a43c9cbf88df****</p>
         */
        public Builder softwareId(String softwareId) {
            this.putBodyParameter("SoftwareId", softwareId);
            this.softwareId = softwareId;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * WindowsProcesses.
         */
        public Builder windowsProcesses(java.util.List<WindowsProcesses> windowsProcesses) {
            this.putBodyParameter("WindowsProcesses", windowsProcesses);
            this.windowsProcesses = windowsProcesses;
            return this;
        }

        @Override
        public UpdateProhibitedSoftwareRequest build() {
            return new UpdateProhibitedSoftwareRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProhibitedSoftwareRequest} extends {@link TeaModel}
     *
     * <p>UpdateProhibitedSoftwareRequest</p>
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
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * Cmdline.
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * Process.
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
     * {@link UpdateProhibitedSoftwareRequest} extends {@link TeaModel}
     *
     * <p>UpdateProhibitedSoftwareRequest</p>
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
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * Cmdline.
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * Process.
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
     * {@link UpdateProhibitedSoftwareRequest} extends {@link TeaModel}
     *
     * <p>UpdateProhibitedSoftwareRequest</p>
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
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * Cmdline.
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * Process.
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
}
