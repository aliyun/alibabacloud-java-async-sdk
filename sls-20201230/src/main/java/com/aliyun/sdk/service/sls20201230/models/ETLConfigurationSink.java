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
 * {@link ETLConfigurationSink} extends {@link TeaModel}
 *
 * <p>ETLConfigurationSink</p>
 */
public class ETLConfigurationSink extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessKeyId")
    @Deprecated
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("accessKeySecret")
    @Deprecated
    private String accessKeySecret;

    @com.aliyun.core.annotation.NameInMap("datasets")
    private java.util.List<String> datasets;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleArn;

    private ETLConfigurationSink(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.datasets = builder.datasets;
        this.endpoint = builder.endpoint;
        this.logstore = builder.logstore;
        this.name = builder.name;
        this.project = builder.project;
        this.roleArn = builder.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ETLConfigurationSink create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return accessKeySecret
     */
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /**
     * @return datasets
     */
    public java.util.List<String> getDatasets() {
        return this.datasets;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeySecret; 
        private java.util.List<String> datasets; 
        private String endpoint; 
        private String logstore; 
        private String name; 
        private String project; 
        private String roleArn; 

        /**
         * accessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * accessKeySecret.
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * datasets.
         */
        public Builder datasets(java.util.List<String> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-etljob</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::13234:role/logtarget</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public ETLConfigurationSink build() {
            return new ETLConfigurationSink(this);
        } 

    } 

}
