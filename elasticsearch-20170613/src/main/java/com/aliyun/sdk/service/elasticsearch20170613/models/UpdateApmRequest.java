// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateApmRequest} extends {@link RequestModel}
 *
 * <p>UpdateApmRequest</p>
 */
public class UpdateApmRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputES")
    private String outputES;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputESPassword")
    private String outputESPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputESUserName")
    private String outputESUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    private UpdateApmRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.description = builder.description;
        this.outputES = builder.outputES;
        this.outputESPassword = builder.outputESPassword;
        this.outputESUserName = builder.outputESUserName;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApmRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return outputES
     */
    public String getOutputES() {
        return this.outputES;
    }

    /**
     * @return outputESPassword
     */
    public String getOutputESPassword() {
        return this.outputESPassword;
    }

    /**
     * @return outputESUserName
     */
    public String getOutputESUserName() {
        return this.outputESUserName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<UpdateApmRequest, Builder> {
        private String instanceId; 
        private String description; 
        private String outputES; 
        private String outputESPassword; 
        private String outputESUserName; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApmRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.description = request.description;
            this.outputES = request.outputES;
            this.outputESPassword = request.outputESPassword;
            this.outputESUserName = request.outputESUserName;
            this.token = request.token;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apm-cn-i7m2fuae****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * outputES.
         */
        public Builder outputES(String outputES) {
            this.putBodyParameter("outputES", outputES);
            this.outputES = outputES;
            return this;
        }

        /**
         * outputESPassword.
         */
        public Builder outputESPassword(String outputESPassword) {
            this.putBodyParameter("outputESPassword", outputESPassword);
            this.outputESPassword = outputESPassword;
            return this;
        }

        /**
         * outputESUserName.
         */
        public Builder outputESUserName(String outputESUserName) {
            this.putBodyParameter("outputESUserName", outputESUserName);
            this.outputESUserName = outputESUserName;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.putBodyParameter("token", token);
            this.token = token;
            return this;
        }

        @Override
        public UpdateApmRequest build() {
            return new UpdateApmRequest(this);
        } 

    } 

}
