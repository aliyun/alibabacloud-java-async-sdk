// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDataCorrectSQLJobRequest} extends {@link RequestModel}
 *
 * <p>RestartDataCorrectSQLJobRequest</p>
 */
public class RestartDataCorrectSQLJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private RestartDataCorrectSQLJobRequest(Builder builder) {
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

    public static RestartDataCorrectSQLJobRequest create() {
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

    public static final class Builder extends Request.Builder<RestartDataCorrectSQLJobRequest, Builder> {
        private String regionId; 
        private Long jobId; 
        private Long orderId; 
        private Long tid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RestartDataCorrectSQLJobRequest request) {
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
         * The ID of the SQL task. You can call the [GetDataCorrectTaskDetail](~~208481~~) and [ListDBTaskSQLJob](~~207049~~) operations to obtain the value of this parameter.
         * <p>
         * 
         * If the Type parameter is set to SINGLE, you must pass the value of the JobId parameter to confirm the ID of the SQL task that you want to rerun.
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
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The type of the rerun operation. Valid values:
         * <p>
         * 
         * *   **ALL**: reruns all SQL tasks.
         * *   **SINGLE**: reruns a single SQL task.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public RestartDataCorrectSQLJobRequest build() {
            return new RestartDataCorrectSQLJobRequest(this);
        } 

    } 

}
