// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableDasProRequest} extends {@link RequestModel}
 *
 * <p>DisableDasProRequest</p>
 */
public class DisableDasProRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private DisableDasProRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableDasProRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DisableDasProRequest, Builder> {
        private String instanceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DisableDasProRequest request) {
            super(request);
            this.instanceId = request.instanceId;
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
         * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
         * <blockquote>
         * <p> This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId that you set when you call this operation.</p>
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
        public DisableDasProRequest build() {
            return new DisableDasProRequest(this);
        } 

    } 

}
