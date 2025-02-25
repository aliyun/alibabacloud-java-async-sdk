// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAppGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppGroupRequest</p>
 */
public class UpdateAppGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private Integer appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    private Integer maxConcurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateAppGroupRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.maxConcurrency = builder.maxConcurrency;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public Integer getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAppGroupRequest, Builder> {
        private Integer appVersion; 
        private String description; 
        private String groupId; 
        private Integer maxConcurrency; 
        private String namespace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppGroupRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.description = request.description;
            this.groupId = request.groupId;
            this.maxConcurrency = request.maxConcurrency;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The application version. 1: Basic version, 2: Professional version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder appVersion(Integer appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the application. You can obtain the application ID on the <strong>Application Management</strong> page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The maximum number of concurrent instances. Default value: 1. A value of 1 specifies that if the last triggered instance is running, the next instance is not triggered even if the scheduled point in time for running the next instance is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>The ID of the namespace. You can obtain the ID of the namespace on the Namespace page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAppGroupRequest build() {
            return new UpdateAppGroupRequest(this);
        } 

    } 

}
