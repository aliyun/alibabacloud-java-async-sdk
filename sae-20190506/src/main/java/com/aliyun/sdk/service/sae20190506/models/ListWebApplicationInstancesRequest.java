// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListWebApplicationInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListWebApplicationInstancesRequest</p>
 */
public class ListWebApplicationInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionIds")
    private java.util.List<String> versionIds;

    private ListWebApplicationInstancesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.endTime = builder.endTime;
        this.instanceIds = builder.instanceIds;
        this.limit = builder.limit;
        this.namespaceId = builder.namespaceId;
        this.startTime = builder.startTime;
        this.statuses = builder.statuses;
        this.versionIds = builder.versionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebApplicationInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    /**
     * @return versionIds
     */
    public java.util.List<String> getVersionIds() {
        return this.versionIds;
    }

    public static final class Builder extends Request.Builder<ListWebApplicationInstancesRequest, Builder> {
        private String applicationId; 
        private Long endTime; 
        private java.util.List<String> instanceIds; 
        private String limit; 
        private String namespaceId; 
        private Long startTime; 
        private java.util.List<String> statuses; 
        private java.util.List<String> versionIds; 

        private Builder() {
            super();
        } 

        private Builder(ListWebApplicationInstancesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.endTime = request.endTime;
            this.instanceIds = request.instanceIds;
            this.limit = request.limit;
            this.namespaceId = request.namespaceId;
            this.startTime = request.startTime;
            this.statuses = request.statuses;
            this.versionIds = request.versionIds;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>614a6500-fddb-464d-a549-408a07******</p>
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The time when the operation ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1715567192</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-667d143a-17b4e0fa-46d3a2******</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The number of application instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1562831689704</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the application instance.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putQueryParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>The ID of the application version.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
        public Builder versionIds(java.util.List<String> versionIds) {
            String versionIdsShrink = shrink(versionIds, "VersionIds", "json");
            this.putQueryParameter("VersionIds", versionIdsShrink);
            this.versionIds = versionIds;
            return this;
        }

        @Override
        public ListWebApplicationInstancesRequest build() {
            return new ListWebApplicationInstancesRequest(this);
        } 

    } 

}
