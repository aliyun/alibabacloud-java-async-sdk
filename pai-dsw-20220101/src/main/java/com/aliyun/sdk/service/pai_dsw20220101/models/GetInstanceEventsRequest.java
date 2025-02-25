// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetInstanceEventsRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceEventsRequest</p>
 */
public class GetInstanceEventsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEventsNum")
    private Integer maxEventsNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetInstanceEventsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.maxEventsNum = builder.maxEventsNum;
        this.startTime = builder.startTime;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxEventsNum
     */
    public Integer getMaxEventsNum() {
        return this.maxEventsNum;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetInstanceEventsRequest, Builder> {
        private String instanceId; 
        private String endTime; 
        private Integer maxEventsNum; 
        private String startTime; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceEventsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.maxEventsNum = request.maxEventsNum;
            this.startTime = request.startTime;
            this.token = request.token;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MaxEventsNum.
         */
        public Builder maxEventsNum(Integer maxEventsNum) {
            this.putQueryParameter("MaxEventsNum", maxEventsNum);
            this.maxEventsNum = maxEventsNum;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetInstanceEventsRequest build() {
            return new GetInstanceEventsRequest(this);
        } 

    } 

}
