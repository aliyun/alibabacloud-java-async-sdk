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
 * {@link GetPropertyScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>GetPropertyScheduleConfigRequest</p>
 */
public class GetPropertyScheduleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
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
         * 
         * <strong>example:</strong>
         * <p>scheduler_sca_period</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUID of the server.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
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
