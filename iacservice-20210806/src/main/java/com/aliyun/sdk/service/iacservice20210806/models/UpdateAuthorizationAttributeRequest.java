// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * authorizationId.
         */
        public Builder authorizationId(String authorizationId) {
            this.putPathParameter("authorizationId", authorizationId);
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * dueTime.
         */
        public Builder dueTime(String dueTime) {
            this.putBodyParameter("dueTime", dueTime);
            this.dueTime = dueTime;
            return this;
        }

        /**
         * name.
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
