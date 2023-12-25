// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableApplicationMonitorRequest} extends {@link RequestModel}
 *
 * <p>DisableApplicationMonitorRequest</p>
 */
public class DisableApplicationMonitorRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DisableApplicationMonitorRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableApplicationMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<DisableApplicationMonitorRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DisableApplicationMonitorRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.taskId = request.taskId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         * 
         * >  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The region ID of the Global Accelerator (GA) instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the origin probing task that you want to disable.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DisableApplicationMonitorRequest build() {
            return new DisableApplicationMonitorRequest(this);
        } 

    } 

}
