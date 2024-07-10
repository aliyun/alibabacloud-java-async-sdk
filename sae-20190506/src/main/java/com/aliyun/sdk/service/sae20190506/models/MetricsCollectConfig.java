// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetricsCollectConfig} extends {@link TeaModel}
 *
 * <p>MetricsCollectConfig</p>
 */
public class MetricsCollectConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnablePushToUserSLS")
    private Boolean enablePushToUserSLS;

    @com.aliyun.core.annotation.NameInMap("LogstoreName")
    @com.aliyun.core.annotation.Validation(maxLength = 63)
    private String logstoreName;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(maxLength = 63)
    private String projectName;

    private MetricsCollectConfig(Builder builder) {
        this.enablePushToUserSLS = builder.enablePushToUserSLS;
        this.logstoreName = builder.logstoreName;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricsCollectConfig create() {
        return builder().build();
    }

    /**
     * @return enablePushToUserSLS
     */
    public Boolean getEnablePushToUserSLS() {
        return this.enablePushToUserSLS;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder {
        private Boolean enablePushToUserSLS; 
        private String logstoreName; 
        private String projectName; 

        /**
         * EnablePushToUserSLS.
         */
        public Builder enablePushToUserSLS(Boolean enablePushToUserSLS) {
            this.enablePushToUserSLS = enablePushToUserSLS;
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
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public MetricsCollectConfig build() {
            return new MetricsCollectConfig(this);
        } 

    } 

}
