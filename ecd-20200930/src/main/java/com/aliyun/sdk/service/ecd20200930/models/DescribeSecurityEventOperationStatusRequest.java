// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityEventOperationStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityEventOperationStatusRequest</p>
 */
public class DescribeSecurityEventOperationStatusRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityEventId")
    @Validation(required = true)
    private java.util.List < String > securityEventId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private DescribeSecurityEventOperationStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.securityEventId = builder.securityEventId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventOperationStatusRequest create() {
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
     * @return securityEventId
     */
    public java.util.List < String > getSecurityEventId() {
        return this.securityEventId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityEventOperationStatusRequest, Builder> {
        private String regionId; 
        private java.util.List < String > securityEventId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventOperationStatusRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.securityEventId = response.securityEventId;
            this.taskId = response.taskId;
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
         * SecurityEventId.
         */
        public Builder securityEventId(java.util.List < String > securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeSecurityEventOperationStatusRequest build() {
            return new DescribeSecurityEventOperationStatusRequest(this);
        } 

    } 

}
