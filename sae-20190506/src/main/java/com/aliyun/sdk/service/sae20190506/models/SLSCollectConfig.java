// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link SLSCollectConfig} extends {@link TeaModel}
 *
 * <p>SLSCollectConfig</p>
 */
public class SLSCollectConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogPath")
    private String logPath;

    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.NameInMap("LogstoreName")
    private String logstoreName;

    @com.aliyun.core.annotation.NameInMap("LogtailName")
    private String logtailName;

    @com.aliyun.core.annotation.NameInMap("MachineGroup")
    private String machineGroup;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    private SLSCollectConfig(Builder builder) {
        this.logPath = builder.logPath;
        this.logType = builder.logType;
        this.logstoreName = builder.logstoreName;
        this.logtailName = builder.logtailName;
        this.machineGroup = builder.machineGroup;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SLSCollectConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logPath
     */
    public String getLogPath() {
        return this.logPath;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return logtailName
     */
    public String getLogtailName() {
        return this.logtailName;
    }

    /**
     * @return machineGroup
     */
    public String getMachineGroup() {
        return this.machineGroup;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder {
        private String logPath; 
        private String logType; 
        private String logstoreName; 
        private String logtailName; 
        private String machineGroup; 
        private String projectName; 

        private Builder() {
        } 

        private Builder(SLSCollectConfig model) {
            this.logPath = model.logPath;
            this.logType = model.logType;
            this.logstoreName = model.logstoreName;
            this.logtailName = model.logtailName;
            this.machineGroup = model.machineGroup;
            this.projectName = model.projectName;
        } 

        /**
         * LogPath.
         */
        public Builder logPath(String logPath) {
            this.logPath = logPath;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.logType = logType;
            return this;
        }

        /**
         * LogstoreName.
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * LogtailName.
         */
        public Builder logtailName(String logtailName) {
            this.logtailName = logtailName;
            return this;
        }

        /**
         * MachineGroup.
         */
        public Builder machineGroup(String machineGroup) {
            this.machineGroup = machineGroup;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public SLSCollectConfig build() {
            return new SLSCollectConfig(this);
        } 

    } 

}
