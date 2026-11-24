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
 * {@link ProcessItem} extends {@link TeaModel}
 *
 * <p>ProcessItem</p>
 */
public class ProcessItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.NameInMap("DevType")
    private String devType;

    @com.aliyun.core.annotation.NameInMap("Directory")
    private String directory;

    @com.aliyun.core.annotation.NameInMap("Process")
    private String process;

    private ProcessItem(Builder builder) {
        this.bundleId = builder.bundleId;
        this.devType = builder.devType;
        this.directory = builder.directory;
        this.process = builder.process;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return devType
     */
    public String getDevType() {
        return this.devType;
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
        private String devType; 
        private String directory; 
        private String process; 

        private Builder() {
        } 

        private Builder(ProcessItem model) {
            this.bundleId = model.bundleId;
            this.devType = model.devType;
            this.directory = model.directory;
            this.process = model.process;
        } 

        /**
         * <p>The bundle ID of the application to which the process belongs. The example value com.apple.Terminal is the bundle ID of the macOS Terminal application.</p>
         * 
         * <strong>example:</strong>
         * <p>com.apple.Terminal</p>
         */
        public Builder bundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <p>The operating system type of the user endpoint device to which the process belongs. Valid values:</p>
         * <ul>
         * <li>windows: Windows.</li>
         * <li>macOS: macOS.</li>
         * <li>linux: Linux.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>macOS</p>
         */
        public Builder devType(String devType) {
            this.devType = devType;
            return this;
        }

        /**
         * <p>The process directory path.</p>
         * 
         * <strong>example:</strong>
         * <p>/System/Applications/Utilities/Terminal.app/Contents/MacOS</p>
         */
        public Builder directory(String directory) {
            this.directory = directory;
            return this;
        }

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminal</p>
         */
        public Builder process(String process) {
            this.process = process;
            return this;
        }

        public ProcessItem build() {
            return new ProcessItem(this);
        } 

    } 

}
