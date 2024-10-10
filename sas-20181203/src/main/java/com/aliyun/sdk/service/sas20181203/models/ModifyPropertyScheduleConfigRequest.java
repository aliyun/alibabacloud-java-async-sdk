// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
