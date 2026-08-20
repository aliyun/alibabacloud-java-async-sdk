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
 * {@link ListProhibitedSoftwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListProhibitedSoftwareResponseBody</p>
 */
public class ListProhibitedSoftwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Software")
    private java.util.List<Software> software;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListProhibitedSoftwareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.software = builder.software;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProhibitedSoftwareResponseBody create() {
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
    public java.util.List<Software> getSoftware() {
        return this.software;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Software> software; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListProhibitedSoftwareResponseBody model) {
            this.requestId = model.requestId;
            this.software = model.software;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C7F49DCC-8EFE-59BE-8947-0529CC458C59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Software.
         */
        public Builder software(java.util.List<Software> software) {
            this.software = software;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListProhibitedSoftwareResponseBody build() {
            return new ListProhibitedSoftwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListProhibitedSoftwareResponseBody</p>
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
     * {@link ListProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListProhibitedSoftwareResponseBody</p>
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
     * {@link ListProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListProhibitedSoftwareResponseBody</p>
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
    /**
     * 
     * {@link ListProhibitedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListProhibitedSoftwareResponseBody</p>
     */
    public static class Software extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DynamicPolicyIds")
        private java.util.List<String> dynamicPolicyIds;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("LinuxProcesses")
        private java.util.List<LinuxProcesses> linuxProcesses;

        @com.aliyun.core.annotation.NameInMap("MacOSProcesses")
        private java.util.List<MacOSProcesses> macOSProcesses;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
        private java.util.List<String> policyIds;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        @com.aliyun.core.annotation.NameInMap("TagIds")
        private java.util.List<String> tagIds;

        @com.aliyun.core.annotation.NameInMap("WindowsProcesses")
        private java.util.List<WindowsProcesses> windowsProcesses;

        private Software(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.dynamicPolicyIds = builder.dynamicPolicyIds;
            this.isDefault = builder.isDefault;
            this.linuxProcesses = builder.linuxProcesses;
            this.macOSProcesses = builder.macOSProcesses;
            this.name = builder.name;
            this.policyIds = builder.policyIds;
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
         * @return dynamicPolicyIds
         */
        public java.util.List<String> getDynamicPolicyIds() {
            return this.dynamicPolicyIds;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
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
         * @return policyIds
         */
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
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
            private java.util.List<String> dynamicPolicyIds; 
            private Boolean isDefault; 
            private java.util.List<LinuxProcesses> linuxProcesses; 
            private java.util.List<MacOSProcesses> macOSProcesses; 
            private String name; 
            private java.util.List<String> policyIds; 
            private String softwareId; 
            private java.util.List<String> tagIds; 
            private java.util.List<WindowsProcesses> windowsProcesses; 

            private Builder() {
            } 

            private Builder(Software model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.dynamicPolicyIds = model.dynamicPolicyIds;
                this.isDefault = model.isDefault;
                this.linuxProcesses = model.linuxProcesses;
                this.macOSProcesses = model.macOSProcesses;
                this.name = model.name;
                this.policyIds = model.policyIds;
                this.softwareId = model.softwareId;
                this.tagIds = model.tagIds;
                this.windowsProcesses = model.windowsProcesses;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DynamicPolicyIds.
             */
            public Builder dynamicPolicyIds(java.util.List<String> dynamicPolicyIds) {
                this.dynamicPolicyIds = dynamicPolicyIds;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * LinuxProcesses.
             */
            public Builder linuxProcesses(java.util.List<LinuxProcesses> linuxProcesses) {
                this.linuxProcesses = linuxProcesses;
                return this;
            }

            /**
             * MacOSProcesses.
             */
            public Builder macOSProcesses(java.util.List<MacOSProcesses> macOSProcesses) {
                this.macOSProcesses = macOSProcesses;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PolicyIds.
             */
            public Builder policyIds(java.util.List<String> policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            /**
             * SoftwareId.
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * TagIds.
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * WindowsProcesses.
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
