// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListVisitorChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListVisitorChatMessagesRequest</p>
 */
public class ListVisitorChatMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessChannelId")
    private String accessChannelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VisitorId")
    private String visitorId;

    private ListVisitorChatMessagesRequest(Builder builder) {
        super(builder);
        this.accessChannelId = builder.accessChannelId;
        this.accessToken = builder.accessToken;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.sortOrder = builder.sortOrder;
        this.startTime = builder.startTime;
        this.visitorId = builder.visitorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVisitorChatMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessChannelId
     */
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return visitorId
     */
    public String getVisitorId() {
        return this.visitorId;
    }

    public static final class Builder extends Request.Builder<ListVisitorChatMessagesRequest, Builder> {
        private String accessChannelId; 
        private String accessToken; 
        private String endTime; 
        private String instanceId; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String sortOrder; 
        private Long startTime; 
        private String visitorId; 

        private Builder() {
            super();
        } 

        private Builder(ListVisitorChatMessagesRequest request) {
            super(request);
            this.accessChannelId = request.accessChannelId;
            this.accessToken = request.accessToken;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.sortOrder = request.sortOrder;
            this.startTime = request.startTime;
            this.visitorId = request.visitorId;
        } 

        /**
         * AccessChannelId.
         */
        public Builder accessChannelId(String accessChannelId) {
            this.putQueryParameter("AccessChannelId", accessChannelId);
            this.accessChannelId = accessChannelId;
            return this;
        }

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * VisitorId.
         */
        public Builder visitorId(String visitorId) {
            this.putQueryParameter("VisitorId", visitorId);
            this.visitorId = visitorId;
            return this;
        }

        @Override
        public ListVisitorChatMessagesRequest build() {
            return new ListVisitorChatMessagesRequest(this);
        } 

    } 

}
