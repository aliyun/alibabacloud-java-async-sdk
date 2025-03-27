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
         * <p>The time when the task ends. Specify the time in the YYYY-MM-DDThh:mm:ssZ format.</p>
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
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
         * <p>The time when the task starts. Specify the time in the YYYY-MM-DDThh:mm:ssZ format.</p>
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
         * <li><strong>file</strong>: purges the cache by file URL.</li>
         * <li><strong>preload</strong>: prefetches files.</li>
         * <li><strong>directory</strong>: purges the cache by directory.</li>
         * <li><strong>ignoreparams</strong>: purges the cache by URL with specified parameters ignored.</li>
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
