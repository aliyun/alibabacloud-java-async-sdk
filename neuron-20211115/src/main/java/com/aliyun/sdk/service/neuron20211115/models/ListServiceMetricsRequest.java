// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListServiceMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceMetricsRequest</p>
 */
public class ListServiceMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("intervalInSec")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer intervalInSec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("measures")
    private String measures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topicId")
    private Long topicId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListServiceMetricsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.env = builder.env;
        this.groupId = builder.groupId;
        this.intervalInSec = builder.intervalInSec;
        this.ip = builder.ip;
        this.measures = builder.measures;
        this.serviceGroupId = builder.serviceGroupId;
        this.startTime = builder.startTime;
        this.topicId = builder.topicId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return intervalInSec
     */
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return measures
     */
    public String getMeasures() {
        return this.measures;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return topicId
     */
    public Long getTopicId() {
        return this.topicId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListServiceMetricsRequest, Builder> {
        private String endTime; 
        private String env; 
        private Long groupId; 
        private Integer intervalInSec; 
        private String ip; 
        private String measures; 
        private Long serviceGroupId; 
        private String startTime; 
        private Long topicId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceMetricsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.env = request.env;
            this.groupId = request.groupId;
            this.intervalInSec = request.intervalInSec;
            this.ip = request.ip;
            this.measures = request.measures;
            this.serviceGroupId = request.serviceGroupId;
            this.startTime = request.startTime;
            this.topicId = request.topicId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder env(String env) {
            this.putQueryParameter("env", env);
            this.env = env;
            return this;
        }

        /**
         * groupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder intervalInSec(Integer intervalInSec) {
            this.putQueryParameter("intervalInSec", intervalInSec);
            this.intervalInSec = intervalInSec;
            return this;
        }

        /**
         * ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * measures.
         */
        public Builder measures(String measures) {
            this.putQueryParameter("measures", measures);
            this.measures = measures;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putQueryParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * topicId.
         */
        public Builder topicId(Long topicId) {
            this.putQueryParameter("topicId", topicId);
            this.topicId = topicId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListServiceMetricsRequest build() {
            return new ListServiceMetricsRequest(this);
        } 

    } 

}
