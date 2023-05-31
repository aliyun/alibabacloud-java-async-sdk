// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScheduleConfigRequest</p>
 */
public class DescribePropertyScheduleConfigRequest extends Request {
    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribePropertyScheduleConfigRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyScheduleConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePropertyScheduleConfigRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyScheduleConfigRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * The type of the asset fingerprints to query. Valid values:
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

        @Override
        public DescribePropertyScheduleConfigRequest build() {
            return new DescribePropertyScheduleConfigRequest(this);
        } 

    } 

}
