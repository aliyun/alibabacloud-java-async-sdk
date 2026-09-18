// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

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
 * {@link KopilotListConversationsRequest} extends {@link RequestModel}
 *
 * <p>KopilotListConversationsRequest</p>
 */
public class KopilotListConversationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCursor")
    private String destinationCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationPageSize")
    private Integer destinationPageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeAutomationOverview")
    private Boolean includeAutomationOverview;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskCursor")
    private String taskCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskPageSize")
    private Integer taskPageSize;

    private KopilotListConversationsRequest(Builder builder) {
        super(builder);
        this.destinationCursor = builder.destinationCursor;
        this.destinationPageSize = builder.destinationPageSize;
        this.includeAutomationOverview = builder.includeAutomationOverview;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.taskCursor = builder.taskCursor;
        this.taskPageSize = builder.taskPageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KopilotListConversationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationCursor
     */
    public String getDestinationCursor() {
        return this.destinationCursor;
    }

    /**
     * @return destinationPageSize
     */
    public Integer getDestinationPageSize() {
        return this.destinationPageSize;
    }

    /**
     * @return includeAutomationOverview
     */
    public Boolean getIncludeAutomationOverview() {
        return this.includeAutomationOverview;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return taskCursor
     */
    public String getTaskCursor() {
        return this.taskCursor;
    }

    /**
     * @return taskPageSize
     */
    public Integer getTaskPageSize() {
        return this.taskPageSize;
    }

    public static final class Builder extends Request.Builder<KopilotListConversationsRequest, Builder> {
        private String destinationCursor; 
        private Integer destinationPageSize; 
        private Boolean includeAutomationOverview; 
        private Integer page; 
        private String regionId; 
        private Integer size; 
        private String taskCursor; 
        private Integer taskPageSize; 

        private Builder() {
            super();
        } 

        private Builder(KopilotListConversationsRequest request) {
            super(request);
            this.destinationCursor = request.destinationCursor;
            this.destinationPageSize = request.destinationPageSize;
            this.includeAutomationOverview = request.includeAutomationOverview;
            this.page = request.page;
            this.regionId = request.regionId;
            this.size = request.size;
            this.taskCursor = request.taskCursor;
            this.taskPageSize = request.taskPageSize;
        } 

        /**
         * <p>The pagination cursor for notification channels. Do not specify this parameter for the first query. For subsequent queries, pass in the value of Data.AutomationOverview.Destinations.NextCursor from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder destinationCursor(String destinationCursor) {
            this.putQueryParameter("DestinationCursor", destinationCursor);
            this.destinationCursor = destinationCursor;
            return this;
        }

        /**
         * <p>The number of entries per page for the notification channel list. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder destinationPageSize(Integer destinationPageSize) {
            this.putQueryParameter("DestinationPageSize", destinationPageSize);
            this.destinationPageSize = destinationPageSize;
            return this;
        }

        /**
         * <p>Specifies whether to return the overview of scheduled tasks and notification channels for the account. A value of true indicates that the overview is returned. If this parameter is not specified, the overview is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeAutomationOverview(Boolean includeAutomationOverview) {
            this.putQueryParameter("IncludeAutomationOverview", includeAutomationOverview);
            this.includeAutomationOverview = includeAutomationOverview;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The pagination cursor. Do not specify this parameter for the first query. For subsequent queries, pass in the value of Data.AutomationOverview.Tasks.NextCursor from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder taskCursor(String taskCursor) {
            this.putQueryParameter("TaskCursor", taskCursor);
            this.taskCursor = taskCursor;
            return this;
        }

        /**
         * <p>The number of entries per page for the scheduled task list. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder taskPageSize(Integer taskPageSize) {
            this.putQueryParameter("TaskPageSize", taskPageSize);
            this.taskPageSize = taskPageSize;
            return this;
        }

        @Override
        public KopilotListConversationsRequest build() {
            return new KopilotListConversationsRequest(this);
        } 

    } 

}
