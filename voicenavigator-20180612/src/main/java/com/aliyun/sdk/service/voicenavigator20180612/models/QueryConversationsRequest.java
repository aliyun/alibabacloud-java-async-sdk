// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link QueryConversationsRequest} extends {@link RequestModel}
 *
 * <p>QueryConversationsRequest</p>
 */
public class QueryConversationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeLeftRange")
    private Long beginTimeLeftRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimeRightRange")
    private Long beginTimeRightRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 200)
    private Integer pageSize;

    private QueryConversationsRequest(Builder builder) {
        super(builder);
        this.beginTimeLeftRange = builder.beginTimeLeftRange;
        this.beginTimeRightRange = builder.beginTimeRightRange;
        this.callingNumber = builder.callingNumber;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConversationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTimeLeftRange
     */
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    /**
     * @return beginTimeRightRange
     */
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryConversationsRequest, Builder> {
        private Long beginTimeLeftRange; 
        private Long beginTimeRightRange; 
        private String callingNumber; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryConversationsRequest request) {
            super(request);
            this.beginTimeLeftRange = request.beginTimeLeftRange;
            this.beginTimeRightRange = request.beginTimeRightRange;
            this.callingNumber = request.callingNumber;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The start of the time range to query. This value is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582183381000</p>
         */
        public Builder beginTimeLeftRange(Long beginTimeLeftRange) {
            this.putQueryParameter("BeginTimeLeftRange", beginTimeLeftRange);
            this.beginTimeLeftRange = beginTimeLeftRange;
            return this;
        }

        /**
         * <p>The end of the time range to query. This value is a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582356181000</p>
         */
        public Builder beginTimeRightRange(Long beginTimeRightRange) {
            this.putQueryParameter("BeginTimeRightRange", beginTimeRightRange);
            this.beginTimeRightRange = beginTimeRightRange;
            return this;
        }

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>02811111111</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12f407b22cbe4890ac595f09985848d5</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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

        @Override
        public QueryConversationsRequest build() {
            return new QueryConversationsRequest(this);
        } 

    } 

}
