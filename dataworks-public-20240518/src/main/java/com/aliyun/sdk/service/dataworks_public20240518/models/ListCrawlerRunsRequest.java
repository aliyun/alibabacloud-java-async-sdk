// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListCrawlerRunsRequest} extends {@link RequestModel}
 *
 * <p>ListCrawlerRunsRequest</p>
 */
public class ListCrawlerRunsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTimeFrom")
    private Long startTimeFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTimeTo")
    private Long startTimeTo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListCrawlerRunsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTimeFrom = builder.startTimeFrom;
        this.startTimeTo = builder.startTimeTo;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrawlerRunsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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

    /**
     * @return startTimeFrom
     */
    public Long getStartTimeFrom() {
        return this.startTimeFrom;
    }

    /**
     * @return startTimeTo
     */
    public Long getStartTimeTo() {
        return this.startTimeTo;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCrawlerRunsRequest, Builder> {
        private String regionId; 
        private Long id; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTimeFrom; 
        private Long startTimeTo; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListCrawlerRunsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTimeFrom = request.startTimeFrom;
            this.startTimeTo = request.startTimeTo;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the metadata crawler. You can call ListCrawlers to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The lower bound of the run start time, in millisecond-level UNIX timestamp. The value must be within the last 30 days. If not specified, the default value is 30 days before the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder startTimeFrom(Long startTimeFrom) {
            this.putBodyParameter("StartTimeFrom", startTimeFrom);
            this.startTimeFrom = startTimeFrom;
            return this;
        }

        /**
         * <p>The upper bound of the run start time, in millisecond-level UNIX timestamp. The value must be within the last 30 days. If not specified, the default value is the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710325405403</p>
         */
        public Builder startTimeTo(Long startTimeTo) {
            this.putBodyParameter("StartTimeTo", startTimeTo);
            this.startTimeTo = startTimeTo;
            return this;
        }

        /**
         * <p>The run status. Valid values: WAITING, RUNNING, SUCCESS, ERROR, SHUTDOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCrawlerRunsRequest build() {
            return new ListCrawlerRunsRequest(this);
        } 

    } 

}
