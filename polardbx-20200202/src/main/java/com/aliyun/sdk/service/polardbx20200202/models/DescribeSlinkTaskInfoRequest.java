// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlinkTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlinkTaskInfoRequest</p>
 */
public class DescribeSlinkTaskInfoRequest extends Request {
    @Query
    @NameInMap("FailPageNumber")
    private Integer failPageNumber;

    @Query
    @NameInMap("FailPageSize")
    @Validation(maximum = 100, minimum = 5)
    private Integer failPageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SlinkTaskId")
    @Validation(required = true)
    private String slinkTaskId;

    @Query
    @NameInMap("SuccessPageNumber")
    private Long successPageNumber;

    @Query
    @NameInMap("SuccessPageSize")
    private Long successPageSize;

    private DescribeSlinkTaskInfoRequest(Builder builder) {
        super(builder);
        this.failPageNumber = builder.failPageNumber;
        this.failPageSize = builder.failPageSize;
        this.regionId = builder.regionId;
        this.slinkTaskId = builder.slinkTaskId;
        this.successPageNumber = builder.successPageNumber;
        this.successPageSize = builder.successPageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlinkTaskInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failPageNumber
     */
    public Integer getFailPageNumber() {
        return this.failPageNumber;
    }

    /**
     * @return failPageSize
     */
    public Integer getFailPageSize() {
        return this.failPageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slinkTaskId
     */
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    /**
     * @return successPageNumber
     */
    public Long getSuccessPageNumber() {
        return this.successPageNumber;
    }

    /**
     * @return successPageSize
     */
    public Long getSuccessPageSize() {
        return this.successPageSize;
    }

    public static final class Builder extends Request.Builder<DescribeSlinkTaskInfoRequest, Builder> {
        private Integer failPageNumber; 
        private Integer failPageSize; 
        private String regionId; 
        private String slinkTaskId; 
        private Long successPageNumber; 
        private Long successPageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlinkTaskInfoRequest response) {
            super(response);
            this.failPageNumber = response.failPageNumber;
            this.failPageSize = response.failPageSize;
            this.regionId = response.regionId;
            this.slinkTaskId = response.slinkTaskId;
            this.successPageNumber = response.successPageNumber;
            this.successPageSize = response.successPageSize;
        } 

        /**
         * FailPageNumber.
         */
        public Builder failPageNumber(Integer failPageNumber) {
            this.putQueryParameter("FailPageNumber", failPageNumber);
            this.failPageNumber = failPageNumber;
            return this;
        }

        /**
         * FailPageSize.
         */
        public Builder failPageSize(Integer failPageSize) {
            this.putQueryParameter("FailPageSize", failPageSize);
            this.failPageSize = failPageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SlinkTaskId.
         */
        public Builder slinkTaskId(String slinkTaskId) {
            this.putQueryParameter("SlinkTaskId", slinkTaskId);
            this.slinkTaskId = slinkTaskId;
            return this;
        }

        /**
         * SuccessPageNumber.
         */
        public Builder successPageNumber(Long successPageNumber) {
            this.putQueryParameter("SuccessPageNumber", successPageNumber);
            this.successPageNumber = successPageNumber;
            return this;
        }

        /**
         * SuccessPageSize.
         */
        public Builder successPageSize(Long successPageSize) {
            this.putQueryParameter("SuccessPageSize", successPageSize);
            this.successPageSize = successPageSize;
            return this;
        }

        @Override
        public DescribeSlinkTaskInfoRequest build() {
            return new DescribeSlinkTaskInfoRequest(this);
        } 

    } 

}
