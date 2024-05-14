// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDasProRequest} extends {@link RequestModel}
 *
 * <p>EnableDasProRequest</p>
 */
public class EnableDasProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlRetention")
    private Integer sqlRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private EnableDasProRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.sqlRetention = builder.sqlRetention;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableDasProRequest create() {
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
     * @return sqlRetention
     */
    public Integer getSqlRetention() {
        return this.sqlRetention;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<EnableDasProRequest, Builder> {
        private String instanceId; 
        private Integer sqlRetention; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(EnableDasProRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.sqlRetention = request.sqlRetention;
            this.userId = request.userId;
        } 

        /**
         * The database instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The storage duration of SQL Explorer data. Unit: day. Default value: **30**. Valid values:
         * <p>
         * 
         * *   **30**
         * *   **180**
         * *   **365**
         * *   **1095**
         * *   **1825**
         */
        public Builder sqlRetention(Integer sqlRetention) {
            this.putQueryParameter("SqlRetention", sqlRetention);
            this.sqlRetention = sqlRetention;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is used to create the database instance.
         * <p>
         * 
         * >  This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId when you call this operation.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public EnableDasProRequest build() {
            return new EnableDasProRequest(this);
        } 

    } 

}
