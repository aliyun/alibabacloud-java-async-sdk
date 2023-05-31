// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPropertyScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPropertyScheduleConfigRequest</p>
 */
public class GetPropertyScheduleConfigRequest extends Request {
    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private GetPropertyScheduleConfigRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPropertyScheduleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetPropertyScheduleConfigRequest, Builder> {
        private String type; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetPropertyScheduleConfigRequest request) {
            super(request);
            this.type = request.type;
            this.uuid = request.uuid;
        } 

        /**
         * The type of the asset fingerprints. Valid values:
         * <p>
         * 
         * *   **scheduler_port_period**: listening port
         * *   **scheduler_process_period**: running process
         * *   **scheduler_account_period**: account
         * *   **scheduler_software_period**: software
         * *   **scheduler_cron_period**: scheduled task
         * *   **scheduler_sca_period**: middleware
         * *   **scheduler_autorun_period**: startup item
         * *   **scheduler_lkm_period**: kernel module
         * *   **scheduler_sca_proxy_period**: website
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUID of the server.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetPropertyScheduleConfigRequest build() {
            return new GetPropertyScheduleConfigRequest(this);
        } 

    } 

}
