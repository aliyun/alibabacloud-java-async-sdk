// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceUsageRequest</p>
 */
public class DescribeResourceUsageRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("Format")
    private String format;

    @Body
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Long pageSize;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    private DescribeResourceUsageRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.format = builder.format;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.spaceId = builder.spaceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeResourceUsageRequest, Builder> {
        private String endTime; 
        private String format; 
        private Long pageNumber; 
        private Long pageSize; 
        private String spaceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceUsageRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.format = request.format;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.spaceId = request.spaceId;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(String format) {
            this.putBodyParameter("Format", format);
            this.format = format;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeResourceUsageRequest build() {
            return new DescribeResourceUsageRequest(this);
        } 

    } 

}
