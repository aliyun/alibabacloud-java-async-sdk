// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EtlSourceConfig} extends {@link TeaModel}
 *
 * <p>EtlSourceConfig</p>
 */
public class EtlSourceConfig extends TeaModel {
    @NameInMap("logstoreName")
    @Validation(required = true)
    private String logstoreName;

    private EtlSourceConfig(Builder builder) {
        this.logstoreName = builder.logstoreName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EtlSourceConfig create() {
        return builder().build();
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public static final class Builder {
        private String logstoreName; 

        /**
         * 数据源logtore
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        public EtlSourceConfig build() {
            return new EtlSourceConfig(this);
        } 

    } 

}
