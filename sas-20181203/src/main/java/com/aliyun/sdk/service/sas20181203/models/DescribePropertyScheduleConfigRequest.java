// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribePropertyScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScheduleConfigRequest</p>
 */
public class DescribePropertyScheduleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The type of the asset fingerprints. Valid values:</p>
         * <ul>
         * <li><strong>scheduler_port_period</strong>: listening port</li>
         * <li><strong>scheduler_process_period</strong>: running process</li>
         * <li><strong>scheduler_account_period</strong>: account</li>
         * <li><strong>scheduler_software_period</strong>: software</li>
         * <li><strong>scheduler_cron_period</strong>: scheduled task</li>
         * <li><strong>scheduler_sca_period</strong>: middleware</li>
         * <li><strong>scheduler_autorun_period</strong>: startup item</li>
         * <li><strong>scheduler_lkm_period</strong>: kernel module</li>
         * <li><strong>scheduler_sca_proxy_period</strong>: website</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scheduler_autorun_period</p>
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
