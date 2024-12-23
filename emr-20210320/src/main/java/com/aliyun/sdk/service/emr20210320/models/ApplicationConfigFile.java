// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ApplicationConfigFile} extends {@link TeaModel}
 *
 * <p>ApplicationConfigFile</p>
 */
public class ApplicationConfigFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("ConfigFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configFileName;

    private ApplicationConfigFile(Builder builder) {
        this.applicationName = builder.applicationName;
        this.configFileName = builder.configFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplicationConfigFile create() {
        return builder().build();
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return configFileName
     */
    public String getConfigFileName() {
        return this.configFileName;
    }

    public static final class Builder {
        private String applicationName; 
        private String configFileName; 

        /**
         * <p>应用名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>配置文件名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>core-site.xml</p>
         */
        public Builder configFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }

        public ApplicationConfigFile build() {
            return new ApplicationConfigFile(this);
        } 

    } 

}
