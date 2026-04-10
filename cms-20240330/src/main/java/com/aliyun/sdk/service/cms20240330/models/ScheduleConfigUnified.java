// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ScheduleConfigUnified} extends {@link TeaModel}
 *
 * <p>ScheduleConfigUnified</p>
 */
public class ScheduleConfigUnified extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("intervalSecs")
    private Integer intervalSecs;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ScheduleConfigUnified(Builder builder) {
        this.intervalSecs = builder.intervalSecs;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduleConfigUnified create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intervalSecs
     */
    public Integer getIntervalSecs() {
        return this.intervalSecs;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer intervalSecs; 
        private String type; 

        private Builder() {
        } 

        private Builder(ScheduleConfigUnified model) {
            this.intervalSecs = model.intervalSecs;
            this.type = model.type;
        } 

        /**
         * <p>调度间隔（秒），type=FIXED 时使用</p>
         */
        public Builder intervalSecs(Integer intervalSecs) {
            this.intervalSecs = intervalSecs;
            return this;
        }

        /**
         * <p>调度类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ScheduleConfigUnified build() {
            return new ScheduleConfigUnified(this);
        } 

    } 

}
