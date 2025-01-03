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
 * {@link Application} extends {@link TeaModel}
 *
 * <p>Application</p>
 */
public class Application extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationName;

    private Application(Builder builder) {
        this.applicationName = builder.applicationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Application create() {
        return builder().build();
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    public static final class Builder {
        private String applicationName; 

        /**
         * <p>应用名称。从EMR控制台集群创建页面可查看到指定发行版的应用名称列表。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Application build() {
            return new Application(this);
        } 

    } 

}
