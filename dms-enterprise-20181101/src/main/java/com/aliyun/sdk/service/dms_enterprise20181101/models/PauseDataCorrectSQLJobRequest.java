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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("JobId")
    private Long jobId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

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
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
        this.orderId = builder.orderId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private Long jobId; 
        private Long orderId; 
        private Long tid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(PauseDataCorrectSQLJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
            this.orderId = request.orderId;
            this.tid = request.tid;
            this.type = request.type;
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
         * The ID of the SQL task. You can call the [GetDataCorrectTaskDetail](~~208481~~) or [ListDBTaskSQLJob](~~207049~~) operation to obtain the value of this parameter.
         * <p>
         * 
         * >  If Type is set to SINGLE, you must pass in the value of JobId to confirm the ID of the SQL task that you want to pause.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the data change ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the data change ticket.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * The tenant ID. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The type of the pause operation. Valid values:
         * <p>
         * 
         * *   ALL: pauses all SQL tasks.
         * *   SINGLE: pauses a single SQL task.
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
