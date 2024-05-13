// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOnlineDDLProgressRequest} extends {@link RequestModel}
 *
 * <p>GetOnlineDDLProgressRequest</p>
 */
public class GetOnlineDDLProgressRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobDetailId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobDetailId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetOnlineDDLProgressRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobDetailId = builder.jobDetailId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOnlineDDLProgressRequest create() {
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
     * @return jobDetailId
     */
    public Long getJobDetailId() {
        return this.jobDetailId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetOnlineDDLProgressRequest, Builder> {
        private String regionId; 
        private Long jobDetailId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetOnlineDDLProgressRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobDetailId = request.jobDetailId;
            this.tid = request.tid;
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
         * The ID of the OnlineDDL SQL task details. You can call the [ListDBTaskSQLJobDetail](~~207073~~) operation to obtain the task detail ID.
         */
        public Builder jobDetailId(Long jobDetailId) {
            this.putQueryParameter("JobDetailId", jobDetailId);
            this.jobDetailId = jobDetailId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetOnlineDDLProgressRequest build() {
            return new GetOnlineDDLProgressRequest(this);
        } 

    } 

}
