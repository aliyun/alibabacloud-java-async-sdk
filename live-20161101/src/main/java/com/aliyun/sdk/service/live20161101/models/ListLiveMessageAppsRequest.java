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
 * {@link ListLiveMessageAppsRequest} extends {@link RequestModel}
 *
 * <p>ListLiveMessageAppsRequest</p>
 */
public class ListLiveMessageAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2, minimum = 1)
    private Integer sortType;

    private ListLiveMessageAppsRequest(Builder builder) {
        super(builder);
        this.dataCenter = builder.dataCenter;
        this.nextPageToken = builder.nextPageToken;
        this.sortType = builder.sortType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveMessageAppsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
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

    public static final class Builder extends Request.Builder<ListLiveMessageAppsRequest, Builder> {
        private String dataCenter; 
        private Long nextPageToken; 
        private Integer sortType; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveMessageAppsRequest request) {
            super(request);
            this.dataCenter = request.dataCenter;
            this.nextPageToken = request.nextPageToken;
            this.sortType = request.sortType;
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
         * <p>The starting page number for the query. If you leave this parameter empty or set this parameter to -1, the query starts from the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The sort order based on the creation time. Valid values:</p>
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
        public ListLiveMessageAppsRequest build() {
            return new ListLiveMessageAppsRequest(this);
        } 

    } 

}
