// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApsJobsRequest</p>
 */
public class DescribeApsJobsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApsJobName")
    private String apsJobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeStart")
    private String createTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeApsJobsRequest(Builder builder) {
        super(builder);
        this.apsJobName = builder.apsJobName;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apsJobName
     */
    public String getApsJobName() {
        return this.apsJobName;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeApsJobsRequest, Builder> {
        private String apsJobName; 
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApsJobsRequest request) {
            super(request);
            this.apsJobName = request.apsJobName;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * ApsJobName.
         */
        public Builder apsJobName(String apsJobName) {
            this.putBodyParameter("ApsJobName", apsJobName);
            this.apsJobName = apsJobName;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putBodyParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putBodyParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeApsJobsRequest build() {
            return new DescribeApsJobsRequest(this);
        } 

    } 

}
