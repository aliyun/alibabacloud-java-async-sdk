// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListLiveMessageGroupMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListLiveMessageGroupMessagesRequest</p>
 */
public class ListLiveMessageGroupMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgType")
    private Long msgType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2, minimum = 1)
    private Integer sortType;

    private ListLiveMessageGroupMessagesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.beginTime = builder.beginTime;
        this.dataCenter = builder.dataCenter;
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.msgType = builder.msgType;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveMessageGroupMessagesRequest create() {
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
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return msgType
     */
    public Long getMsgType() {
        return this.msgType;
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortType
     */
    public Integer getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<ListLiveMessageGroupMessagesRequest, Builder> {
        private String appId; 
        private Long beginTime; 
        private String dataCenter; 
        private Long endTime; 
        private String groupId; 
        private Long msgType; 
        private Long nextPageToken; 
        private Integer pageSize; 
        private Integer sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveMessageGroupMessagesRequest request) {
            super(request);
            this.appId = request.appId;
            this.beginTime = request.beginTime;
            this.dataCenter = request.dataCenter;
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.msgType = request.msgType;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.sortType = request.sortType;
        } 

        /**
         * <p>The ID of the interactive messaging application to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you leave this parameter empty, the earliest available time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1697783235</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you leave this parameter empty, the latest available time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1698301635</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the group to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The type of messages that you want to query. If you leave this parameter empty, all types of messages are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder msgType(Long msgType) {
            this.putQueryParameter("MsgType", msgType);
            this.msgType = msgType;
            return this;
        }

        /**
         * <p>The starting page number for the query. If you leave this parameter empty, the query starts from the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>10 to 50</strong>.</p>
         * <p>This parameter is required.</p>
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
         * <p>The sort order based on the time when the messages were sent. Valid values:</p>
         * <ul>
         * <li>1: ascending order</li>
         * <li>2: descending order</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sortType(Integer sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        @Override
        public ListLiveMessageGroupMessagesRequest build() {
            return new ListLiveMessageGroupMessagesRequest(this);
        } 

    } 

}
