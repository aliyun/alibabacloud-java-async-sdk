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
 * {@link ModifyPropertyScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyPropertyScheduleConfigRequest</p>
 */
public class ModifyPropertyScheduleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyPropertyScheduleConfigRequest(Builder builder) {
        super(builder);
        this.scheduleTime = builder.scheduleTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPropertyScheduleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyPropertyScheduleConfigRequest, Builder> {
        private String scheduleTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPropertyScheduleConfigRequest request) {
            super(request);
            this.scheduleTime = request.scheduleTime;
            this.type = request.type;
        } 

        /**
         * <p>The new collection frequency of asset fingerprints. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.</li>
         * <li><strong>1</strong>: collects asset fingerprints once an hour.</li>
         * <li><strong>3</strong>: collects asset fingerprints once every 3 hours.</li>
         * <li><strong>12</strong>: collects asset fingerprints once every 12 hours.</li>
         * <li><strong>24</strong>: collects asset fingerprints once a day.</li>
         * <li><strong>168</strong>: collects asset fingerprints once every 7 days.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder scheduleTime(String scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * <p>The type of the asset fingerprints for which you want to modify the collection frequency. Valid values:</p>
         * <ul>
         * <li><strong>scheduler_port_period</strong>: listening port</li>
         * <li><strong>scheduler_process_period</strong>: running process</li>
         * <li><strong>scheduler_account_period</strong>: account</li>
         * <li><strong>scheduler_software_period</strong>: software</li>
         * <li><strong>scheduler_cron_period</strong>: scheduled task</li>
         * <li><strong>scheduler_sca_period</strong>: middleware, database, or web service</li>
         * <li><strong>scheduler_autorun_period</strong>: startup item</li>
         * <li><strong>scheduler_lkm_period</strong>: kernel module</li>
         * <li><strong>scheduler_sca_proxy_period</strong>: website</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scheduler_port_period</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyPropertyScheduleConfigRequest build() {
            return new ModifyPropertyScheduleConfigRequest(this);
        } 

    } 

}
