// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFullRequestSampleByInstanceIdRequest} extends {@link RequestModel}
 *
 * <p>GetFullRequestSampleByInstanceIdRequest</p>
 */
public class GetFullRequestSampleByInstanceIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long end;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SqlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long start;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetFullRequestSampleByInstanceIdRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.role = builder.role;
        this.sqlId = builder.sqlId;
        this.start = builder.start;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFullRequestSampleByInstanceIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetFullRequestSampleByInstanceIdRequest, Builder> {
        private Long end; 
        private String instanceId; 
        private String role; 
        private String sqlId; 
        private Long start; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetFullRequestSampleByInstanceIdRequest request) {
            super(request);
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.role = request.role;
            this.sqlId = request.sqlId;
            this.start = request.start;
            this.userId = request.userId;
        } 

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. The interval between the start time and the end time must be equal to or greater than 1 hour.
         */
        public Builder end(Long end) {
            this.putBodyParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The role of the PolarDB-X 2.0 node. Valid values:
         * <p>
         * 
         * *   **polarx_cn**: compute node.
         * *   **polarx_en**: data node.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * The SQL statement ID.
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The start time must be within the storage duration of the SQL Explorer feature of the database instance, and can be up to 90 days earlier than the current time.
         */
        public Builder start(Long start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is used to create the database instance.
         * <p>
         * 
         * >  This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId when you call this operation.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetFullRequestSampleByInstanceIdRequest build() {
            return new GetFullRequestSampleByInstanceIdRequest(this);
        } 

    } 

}
