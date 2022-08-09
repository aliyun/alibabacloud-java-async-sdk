// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReinitInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReinitInstanceRequest</p>
 */
public class ReinitInstanceRequest extends Request {
    @Body
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Password")
    private String password;

    private ReinitInstanceRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReinitInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<ReinitInstanceRequest, Builder> {
        private String imageId; 
        private String instanceId; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(ReinitInstanceRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.password = request.password;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        @Override
        public ReinitInstanceRequest build() {
            return new ReinitInstanceRequest(this);
        } 

    } 

}
