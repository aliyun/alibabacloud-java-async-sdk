// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    @com.aliyun.core.annotation.Validation(required = true)
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertIds")
    private String alertIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertRule")
    private String alertRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalUnit")
    private String intervalUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspCity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ispCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("caller")
    private String caller;

    private CreateTaskRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.alertIds = builder.alertIds;
        this.alertRule = builder.alertRule;
        this.interval = builder.interval;
        this.intervalUnit = builder.intervalUnit;
        this.ispCity = builder.ispCity;
        this.options = builder.options;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
        this.caller = builder.caller;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return alertIds
     */
    public String getAlertIds() {
        return this.alertIds;
    }

    /**
     * @return alertRule
     */
    public String getAlertRule() {
        return this.alertRule;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return intervalUnit
     */
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * @return ispCity
     */
    public String getIspCity() {
        return this.ispCity;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    public static final class Builder extends Request.Builder<CreateTaskRequest, Builder> {
        private String address; 
        private String alertIds; 
        private String alertRule; 
        private String interval; 
        private String intervalUnit; 
        private String ispCity; 
        private String options; 
        private String taskName; 
        private String taskType; 
        private String caller; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskRequest request) {
            super(request);
            this.address = request.address;
            this.alertIds = request.alertIds;
            this.alertRule = request.alertRule;
            this.interval = request.interval;
            this.intervalUnit = request.intervalUnit;
            this.ispCity = request.ispCity;
            this.options = request.options;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
            this.caller = request.caller;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * AlertIds.
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * AlertRule.
         */
        public Builder alertRule(String alertRule) {
            this.putQueryParameter("AlertRule", alertRule);
            this.alertRule = alertRule;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * IntervalUnit.
         */
        public Builder intervalUnit(String intervalUnit) {
            this.putQueryParameter("IntervalUnit", intervalUnit);
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
         */
        public Builder ispCity(String ispCity) {
            this.putQueryParameter("IspCity", ispCity);
            this.ispCity = ispCity;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunTest</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>1.http
         * 2.ping
         * 3.tcp
         * 4.udp
         * 5.dns
         * 6.smtp
         * 7.pop3
         * 8.ftp</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("caller", caller);
            this.caller = caller;
            return this;
        }

        @Override
        public CreateTaskRequest build() {
            return new CreateTaskRequest(this);
        } 

    } 

}
