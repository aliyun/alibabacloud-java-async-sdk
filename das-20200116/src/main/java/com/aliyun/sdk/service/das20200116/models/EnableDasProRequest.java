// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDasProRequest} extends {@link RequestModel}
 *
 * <p>EnableDasProRequest</p>
 */
public class EnableDasProRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SqlRetention")
    private Integer sqlRetention;

    @Query
    @NameInMap("UserId")
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

        private Builder(EnableDasProRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.sqlRetention = response.sqlRetention;
            this.userId = response.userId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SqlRetention.
         */
        public Builder sqlRetention(Integer sqlRetention) {
            this.putQueryParameter("SqlRetention", sqlRetention);
            this.sqlRetention = sqlRetention;
            return this;
        }

        /**
         * UserId.
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
