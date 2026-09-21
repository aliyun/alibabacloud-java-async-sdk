// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListUploadTasksRequest} extends {@link RequestModel}
 *
 * <p>ListUploadTasksRequest</p>
 */
public class ListUploadTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListUploadTasksRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUploadTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListUploadTasksRequest, Builder> {
        private String endTime; 
        private Long siteId; 
        private String startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListUploadTasksRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>The end time in ISO 8601 format (for example, 2024-01-01T00:00:00+Z).</p>
         * <blockquote>
         * <p>Notice: StartTime and EndTime must be provided together to define the query time window. An error is returned if either one is missing..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-12-06T12:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The site ID. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <blockquote>
         * <p>Notice: This parameter is required when you call the ListUploadTasks operation..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The start time in ISO 8601 format (for example, 2024-01-01T00:00:00+Z).</p>
         * <blockquote>
         * <p>Notice: StartTime and EndTime must be provided together to define the query time window. An error is returned if either one is missing..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-11-29T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>file</strong>: URL file purge.</li>
         * <li><strong>preload</strong>: resource prefetch.</li>
         * <li><strong>directory</strong>: directory purge.</li>
         * <li><strong>ignoreparams</strong>: purge with parameters ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListUploadTasksRequest build() {
            return new ListUploadTasksRequest(this);
        } 

    } 

}
