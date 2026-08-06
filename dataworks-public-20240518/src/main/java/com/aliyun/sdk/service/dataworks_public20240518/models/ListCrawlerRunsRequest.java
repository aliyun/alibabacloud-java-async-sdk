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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTimeFrom.
         */
        public Builder startTimeFrom(Long startTimeFrom) {
            this.putBodyParameter("StartTimeFrom", startTimeFrom);
            this.startTimeFrom = startTimeFrom;
            return this;
        }

        /**
         * StartTimeTo.
         */
        public Builder startTimeTo(Long startTimeTo) {
            this.putBodyParameter("StartTimeTo", startTimeTo);
            this.startTimeTo = startTimeTo;
            return this;
        }

        /**
         * Status.
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
