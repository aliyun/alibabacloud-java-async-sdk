// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
         * <p>The database instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The storage duration of SQL Explorer data. Unit: day. Default value: <strong>30</strong>. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>180</strong></li>
         * <li><strong>365</strong></li>
         * <li><strong>1095</strong></li>
         * <li><strong>1825</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder sqlRetention(Integer sqlRetention) {
            this.putQueryParameter("SqlRetention", sqlRetention);
            this.sqlRetention = sqlRetention;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
         * <blockquote>
         * <p> This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>196278346919****</p>
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
