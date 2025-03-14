// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListOperationProcessDetailRequest} extends {@link RequestModel}
 *
 * <p>ListOperationProcessDetailRequest</p>
 */
public class ListOperationProcessDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCodes")
    private java.util.List<Integer> statusCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    private ListOperationProcessDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.statusCodes = builder.statusCodes;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationProcessDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statusCodes
     */
    public java.util.List<Integer> getStatusCodes() {
        return this.statusCodes;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<ListOperationProcessDetailRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private String lang; 
        private Integer pageSize; 
        private Long startTime; 
        private java.util.List<Integer> statusCodes; 
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationProcessDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.statusCodes = request.statusCodes;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731555850000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1731469330000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The subtask status codes.</p>
         */
        public Builder statusCodes(java.util.List<Integer> statusCodes) {
            this.putQueryParameter("StatusCodes", statusCodes);
            this.statusCodes = statusCodes;
            return this;
        }

        /**
         * <p>The IDs of operation tasks.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public ListOperationProcessDetailRequest build() {
            return new ListOperationProcessDetailRequest(this);
        } 

    } 

}
