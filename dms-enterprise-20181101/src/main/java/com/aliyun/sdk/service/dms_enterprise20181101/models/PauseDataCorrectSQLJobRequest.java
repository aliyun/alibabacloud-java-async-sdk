// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseDataCorrectSQLJobRequest} extends {@link RequestModel}
 *
 * <p>PauseDataCorrectSQLJobRequest</p>
 */
public class PauseDataCorrectSQLJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    private Long jobId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private PauseDataCorrectSQLJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseDataCorrectSQLJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<PauseDataCorrectSQLJobRequest, Builder> {
        private Long jobId; 
        private Long orderId; 
        private String regionId; 
        private Long tid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(PauseDataCorrectSQLJobRequest response) {
            super(response);
            this.jobId = response.jobId;
            this.orderId = response.orderId;
            this.regionId = response.regionId;
            this.tid = response.tid;
            this.type = response.type;
        } 

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public PauseDataCorrectSQLJobRequest build() {
            return new PauseDataCorrectSQLJobRequest(this);
        } 

    } 

}
