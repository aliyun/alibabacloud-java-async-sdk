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
 * {@link ListLiveMessageGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListLiveMessageGroupsRequest</p>
 */
public class ListLiveMessageGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupStatus")
    private Integer groupStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2, minimum = 1)
    private Integer sortType;

    private ListLiveMessageGroupsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.groupStatus = builder.groupStatus;
        this.nextPageToken = builder.nextPageToken;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveMessageGroupsRequest create() {
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
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return groupStatus
     */
    public Integer getGroupStatus() {
        return this.groupStatus;
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return sortType
     */
    public Integer getSortType() {
        return this.sortType;
    }

    public static final class Builder extends Request.Builder<ListLiveMessageGroupsRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private Integer groupStatus; 
        private Long nextPageToken; 
        private Integer sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveMessageGroupsRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.groupStatus = request.groupStatus;
            this.nextPageToken = request.nextPageToken;
            this.sortType = request.sortType;
        } 

        /**
         * <p>The application ID.</p>
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
         * <p>The status of the groups to query. Default value: 0. Valid values:</p>
         * <ul>
         * <li>0: all groups</li>
         * <li>1: existing groups</li>
         * <li>2: deleted groups</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder groupStatus(Integer groupStatus) {
            this.putQueryParameter("GroupStatus", groupStatus);
            this.groupStatus = groupStatus;
            return this;
        }

        /**
         * <p>The starting page number for the query. If you leave this parameter empty, the query starts from the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The sort order based on the time when the groups were created. Valid values:</p>
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
        public ListLiveMessageGroupsRequest build() {
            return new ListLiveMessageGroupsRequest(this);
        } 

    } 

}
