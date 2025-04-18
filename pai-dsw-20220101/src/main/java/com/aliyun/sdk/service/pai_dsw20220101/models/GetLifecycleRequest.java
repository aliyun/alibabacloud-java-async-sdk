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
 * {@link GetLifecycleRequest} extends {@link RequestModel}
 *
 * <p>GetLifecycleRequest</p>
 */
public class GetLifecycleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionNumber")
    private Integer sessionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetLifecycleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.order = builder.order;
        this.sessionNumber = builder.sessionNumber;
        this.startTime = builder.startTime;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLifecycleRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sessionNumber
     */
    public Integer getSessionNumber() {
        return this.sessionNumber;
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

    public static final class Builder extends Request.Builder<GetLifecycleRequest, Builder> {
        private String instanceId; 
        private String endTime; 
        private Integer limit; 
        private String order; 
        private Integer sessionNumber; 
        private String startTime; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetLifecycleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.order = request.order;
            this.sessionNumber = request.sessionNumber;
            this.startTime = request.startTime;
            this.token = request.token;
        } 

        /**
         * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/470439.html">ListInstances</a> to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-9698d842b6***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T15:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of sessions to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The sorting order of the results. Valid values:</p>
         * <ul>
         * <li>ASC: sorted by time in ascending order.</li>
         * <li>DESC: sorted by time in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>A session refers to the process of an instance from startup to failure or shutdown. The sessionNumber indicates the offset value for the instance&quot;s session sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sessionNumber(Integer sessionNumber) {
            this.putQueryParameter("SessionNumber", sessionNumber);
            this.sessionNumber = sessionNumber;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T15:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The token used to share the URL.</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetLifecycleRequest build() {
            return new GetLifecycleRequest(this);
        } 

    } 

}
