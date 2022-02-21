// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApmRequest} extends {@link RequestModel}
 *
 * <p>UpdateApmRequest</p>
 */
public class UpdateApmRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("outputES")
    private String outputES;

    @Body
    @NameInMap("outputESPassword")
    private String outputESPassword;

    @Body
    @NameInMap("outputESUserName")
    private String outputESUserName;

    @Body
    @NameInMap("token")
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

        private Builder(UpdateApmRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.description = response.description;
            this.outputES = response.outputES;
            this.outputESPassword = response.outputESPassword;
            this.outputESUserName = response.outputESUserName;
            this.token = response.token;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * apm实例名
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * es实例id
         */
        public Builder outputES(String outputES) {
            this.putBodyParameter("outputES", outputES);
            this.outputES = outputES;
            return this;
        }

        /**
         * es实例密码
         */
        public Builder outputESPassword(String outputESPassword) {
            this.putBodyParameter("outputESPassword", outputESPassword);
            this.outputESPassword = outputESPassword;
            return this;
        }

        /**
         * es实例用户名
         */
        public Builder outputESUserName(String outputESUserName) {
            this.putBodyParameter("outputESUserName", outputESUserName);
            this.outputESUserName = outputESUserName;
            return this;
        }

        /**
         * apm server密码
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
