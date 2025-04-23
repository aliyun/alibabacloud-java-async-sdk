// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link UpdateAuthorizationAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationAttributeRequest</p>
 */
public class UpdateAuthorizationAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("authorizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dueTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dueTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UpdateAuthorizationAttributeRequest(Builder builder) {
        super(builder);
        this.authorizationId = builder.authorizationId;
        this.dueTime = builder.dueTime;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationId
     */
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    /**
     * @return dueTime
     */
    public String getDueTime() {
        return this.dueTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorizationAttributeRequest, Builder> {
        private String authorizationId; 
        private String dueTime; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationAttributeRequest request) {
            super(request);
            this.authorizationId = request.authorizationId;
            this.dueTime = request.dueTime;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auth-1525e992f1b621ba86575aa4d32</p>
         */
        public Builder authorizationId(String authorizationId) {
            this.putPathParameter("authorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dueTime(String dueTime) {
            this.putBodyParameter("dueTime", dueTime);
            this.dueTime = dueTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateAuthorizationAttributeRequest build() {
            return new UpdateAuthorizationAttributeRequest(this);
        } 

    } 

}
