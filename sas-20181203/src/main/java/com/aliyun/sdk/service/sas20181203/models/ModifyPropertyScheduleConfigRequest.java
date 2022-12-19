// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPropertyScheduleConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyPropertyScheduleConfigRequest</p>
 */
public class ModifyPropertyScheduleConfigRequest extends Request {
    @Query
    @NameInMap("ScheduleTime")
    @Validation(required = true)
    private String scheduleTime;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * The new collection frequency of asset fingerprints. Valid values:
         * <p>
         * 
         * *   **0**: disabled, which indicates that the asset fingerprints are not automatically or periodically collected.
         * *   **1**: collects asset fingerprints once an hour.
         * *   **3**: collects asset fingerprints once every 3 hours.
         * *   **12**: collects asset fingerprints once every 12 hours.
         * *   **24**: collects asset fingerprints once a day.
         * *   **168**: collects asset fingerprints once every 7 days.
         */
        public Builder scheduleTime(String scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * The type of the asset fingerprints for which you want to modify the collection frequency. Valid values:
         * <p>
         * 
         * *   **scheduler\_port_period**: listening port
         * *   **scheduler\_process_period**: running process
         * *   **scheduler\_account_period**: account
         * *   **scheduler\_software_period**: software
         * *   **scheduler\_cron_period**: scheduled task
         * *   **scheduler\_sca_period**: middleware, database, or web service
         * *   **scheduler\_autorun_period**: startup item
         * *   **scheduler\_lkm_period**: kernel module
         * *   **scheduler\_sca\_proxy_period**: website
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
