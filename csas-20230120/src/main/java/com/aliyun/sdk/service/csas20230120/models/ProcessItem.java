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
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        /**
         * DevType.
         */
        public Builder devType(String devType) {
            this.devType = devType;
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

        public ProcessItem build() {
            return new ProcessItem(this);
        } 

    } 

}
