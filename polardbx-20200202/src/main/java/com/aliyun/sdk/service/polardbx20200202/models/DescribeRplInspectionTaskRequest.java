// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeRplInspectionTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeRplInspectionTaskRequest</p>
 */
public class DescribeRplInspectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailPageNumber")
    private Integer failPageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailPageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 5)
    private Integer failPageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    private String slinkTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuccessPageNumber")
    private Long successPageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuccessPageSize")
    private Long successPageSize;

    private DescribeRplInspectionTaskRequest(Builder builder) {
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

    public static DescribeRplInspectionTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRplInspectionTaskRequest, Builder> {
        private Integer failPageNumber; 
        private Integer failPageSize; 
        private String regionId; 
        private String slinkTaskId; 
        private Long successPageNumber; 
        private Long successPageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRplInspectionTaskRequest request) {
            super(request);
            this.failPageNumber = request.failPageNumber;
            this.failPageSize = request.failPageSize;
            this.regionId = request.regionId;
            this.slinkTaskId = request.slinkTaskId;
            this.successPageNumber = request.successPageNumber;
            this.successPageSize = request.successPageSize;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
        public DescribeRplInspectionTaskRequest build() {
            return new DescribeRplInspectionTaskRequest(this);
        } 

    } 

}
