// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUsageDetailDataExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateUsageDetailDataExportTaskRequest</p>
 */
public class CreateUsageDetailDataExportTaskRequest extends Request {
    @Query
    @NameInMap("DomainNames")
    private String domainNames;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Group")
    private String group;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateUsageDetailDataExportTaskRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.endTime = builder.endTime;
        this.group = builder.group;
        this.language = builder.language;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUsageDetailDataExportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateUsageDetailDataExportTaskRequest, Builder> {
        private String domainNames; 
        private String endTime; 
        private String group; 
        private String language; 
        private Long ownerId; 
        private String startTime; 
        private String taskName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateUsageDetailDataExportTaskRequest response) {
            super(response);
            this.domainNames = response.domainNames;
            this.endTime = response.endTime;
            this.group = response.group;
            this.language = response.language;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.taskName = response.taskName;
            this.type = response.type;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateUsageDetailDataExportTaskRequest build() {
            return new CreateUsageDetailDataExportTaskRequest(this);
        } 

    } 

}
