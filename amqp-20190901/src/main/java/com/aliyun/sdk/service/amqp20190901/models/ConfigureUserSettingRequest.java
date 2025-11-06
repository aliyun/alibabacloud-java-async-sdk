// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link ConfigureUserSettingRequest} extends {@link RequestModel}
 *
 * <p>ConfigureUserSettingRequest</p>
 */
public class ConfigureUserSettingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logstore")
    private String logstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PutType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String putType;

    private ConfigureUserSettingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bucketName = builder.bucketName;
        this.consoleSessionId = builder.consoleSessionId;
        this.instanceId = builder.instanceId;
        this.logstore = builder.logstore;
        this.projectName = builder.projectName;
        this.putType = builder.putType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureUserSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return putType
     */
    public String getPutType() {
        return this.putType;
    }

    public static final class Builder extends Request.Builder<ConfigureUserSettingRequest, Builder> {
        private String regionId; 
        private String bucketName; 
        private String consoleSessionId; 
        private String instanceId; 
        private String logstore; 
        private String projectName; 
        private String putType; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureUserSettingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bucketName = request.bucketName;
            this.consoleSessionId = request.consoleSessionId;
            this.instanceId = request.instanceId;
            this.logstore = request.logstore;
            this.projectName = request.projectName;
            this.putType = request.putType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Logstore.
         */
        public Builder logstore(String logstore) {
            this.putQueryParameter("Logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder putType(String putType) {
            this.putQueryParameter("PutType", putType);
            this.putType = putType;
            return this;
        }

        @Override
        public ConfigureUserSettingRequest build() {
            return new ConfigureUserSettingRequest(this);
        } 

    } 

}
