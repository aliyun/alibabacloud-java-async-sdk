// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link MaxComputeExportConfiguration} extends {@link TeaModel}
 *
 * <p>MaxComputeExportConfiguration</p>
 */
public class MaxComputeExportConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fromTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fromTime;

    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("sink")
    @com.aliyun.core.annotation.Validation(required = true)
    private MaxComputeExportConfigurationSink sink;

    @com.aliyun.core.annotation.NameInMap("toTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long toTime;

    private MaxComputeExportConfiguration(Builder builder) {
        this.fromTime = builder.fromTime;
        this.logstore = builder.logstore;
        this.roleArn = builder.roleArn;
        this.sink = builder.sink;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaxComputeExportConfiguration create() {
        return builder().build();
    }

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return sink
     */
    public MaxComputeExportConfigurationSink getSink() {
        return this.sink;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    public static final class Builder {
        private Long fromTime; 
        private String logstore; 
        private String roleArn; 
        private MaxComputeExportConfigurationSink sink; 
        private Long toTime; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-logstore-demo</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789:role/aliyunlogdefaultrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sink(MaxComputeExportConfigurationSink sink) {
            this.sink = sink;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder toTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }

        public MaxComputeExportConfiguration build() {
            return new MaxComputeExportConfiguration(this);
        } 

    } 

}
