// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeAppRecordingFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppRecordingFilesRequest</p>
 */
public class DescribeAppRecordingFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTs")
    private Long startTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    private DescribeAppRecordingFilesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.endTs = builder.endTs;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startTs = builder.startTs;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppRecordingFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DescribeAppRecordingFilesRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long endTs; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long startTs; 
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppRecordingFilesRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.endTs = request.endTs;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startTs = request.startTs;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>App ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testappid</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>311</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The query range specifies the start time of the recording task. It is defined as a closed interval and measured in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1712376532000</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Query range start time (open interval) for recording tasks, in milliseconds. If not specified, defaults to the past 3 days. You can query recordings up to one year old.</p>
         * 
         * <strong>example:</strong>
         * <p>1712376032000</p>
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * <p>List of recording task IDs.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            String taskIdsShrink = shrink(taskIds, "TaskIds", "json");
            this.putQueryParameter("TaskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DescribeAppRecordingFilesRequest build() {
            return new DescribeAppRecordingFilesRequest(this);
        } 

    } 

}
