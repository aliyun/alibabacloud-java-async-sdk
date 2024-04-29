// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCoordinateTicketRequest} extends {@link RequestModel}
 *
 * <p>GetCoordinateTicketRequest</p>
 */
public class GetCoordinateTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userType;

    private GetCoordinateTicketRequest(Builder builder) {
        super(builder);
        this.coId = builder.coId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCoordinateTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coId
     */
    public String getCoId() {
        return this.coId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<GetCoordinateTicketRequest, Builder> {
        private String coId; 
        private String endUserId; 
        private String regionId; 
        private String taskId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(GetCoordinateTicketRequest request) {
            super(request);
            this.coId = request.coId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.taskId = request.taskId;
            this.userType = request.userType;
        } 

        /**
         * The ID of the stream collaboration. You can obtain the value of this parameter based on the value of `Coid` that is returned by the `ApplyCoordinationForMonitoring` operation.
         */
        public Builder coId(String coId) {
            this.putQueryParameter("CoId", coId);
            this.coId = coId;
            return this;
        }

        /**
         * The name of the convenience user account. If you initiate the request as an administrator, you do not need to specify this parameter.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~436773~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the cloud computer connection task. The first time you initiate the request, you do not need to specify the ID of the cloud computer connection task. If no ticket is returned after you initiate the first request, you must specify the value of taskId that is returned for the first request in the subsequent request.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The type of the user.
         * <p>
         * 
         * Set the value to TENANT_ADMIN.
         * 
         * *   The value of
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     TENANT_ADMIN
         * 
         *     <!-- -->
         * 
         *     specifies an administrator.
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public GetCoordinateTicketRequest build() {
            return new GetCoordinateTicketRequest(this);
        } 

    } 

}
