// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubCrowdRequest} extends {@link RequestModel}
 *
 * <p>CreateSubCrowdRequest</p>
 */
public class CreateSubCrowdRequest extends Request {
    @Path
    @NameInMap("CrowdId")
    @Validation(required = true)
    private String crowdId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private String users;

    private CreateSubCrowdRequest(Builder builder) {
        super(builder);
        this.crowdId = builder.crowdId;
        this.instanceId = builder.instanceId;
        this.source = builder.source;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubCrowdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateSubCrowdRequest, Builder> {
        private String crowdId; 
        private String instanceId; 
        private String source; 
        private String users; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubCrowdRequest request) {
            super(request);
            this.crowdId = request.crowdId;
            this.instanceId = request.instanceId;
            this.source = request.source;
            this.users = request.users;
        } 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.putPathParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(String users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public CreateSubCrowdRequest build() {
            return new CreateSubCrowdRequest(this);
        } 

    } 

}
