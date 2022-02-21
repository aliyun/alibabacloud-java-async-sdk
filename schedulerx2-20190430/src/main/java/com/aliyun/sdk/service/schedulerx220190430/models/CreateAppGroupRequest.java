// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAppGroupRequest</p>
 */
public class CreateAppGroupRequest extends Request {
    @Query
    @NameInMap("AlarmJson")
    private String alarmJson;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("MaxJobs")
    private Integer maxJobs;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceName")
    @Validation(required = true)
    private String namespaceName;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateAppGroupRequest(Builder builder) {
        super(builder);
        this.alarmJson = builder.alarmJson;
        this.appName = builder.appName;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.maxJobs = builder.maxJobs;
        this.namespace = builder.namespace;
        this.namespaceName = builder.namespaceName;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmJson
     */
    public String getAlarmJson() {
        return this.alarmJson;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return maxJobs
     */
    public Integer getMaxJobs() {
        return this.maxJobs;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAppGroupRequest, Builder> {
        private String alarmJson; 
        private String appName; 
        private String description; 
        private String groupId; 
        private Integer maxJobs; 
        private String namespace; 
        private String namespaceName; 
        private String namespaceSource; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppGroupRequest response) {
            super(response);
            this.alarmJson = response.alarmJson;
            this.appName = response.appName;
            this.description = response.description;
            this.groupId = response.groupId;
            this.maxJobs = response.maxJobs;
            this.namespace = response.namespace;
            this.namespaceName = response.namespaceName;
            this.namespaceSource = response.namespaceSource;
            this.regionId = response.regionId;
        } 

        /**
         * AlarmJson.
         */
        public Builder alarmJson(String alarmJson) {
            this.putQueryParameter("AlarmJson", alarmJson);
            this.alarmJson = alarmJson;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MaxJobs.
         */
        public Builder maxJobs(Integer maxJobs) {
            this.putQueryParameter("MaxJobs", maxJobs);
            this.maxJobs = maxJobs;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * NamespaceSource.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAppGroupRequest build() {
            return new CreateAppGroupRequest(this);
        } 

    } 

}
