// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserByExtensionRequest} extends {@link RequestModel}
 *
 * <p>GetUserByExtensionRequest</p>
 */
public class GetUserByExtensionRequest extends Request {
    @Query
    @NameInMap("Extension")
    @Validation(required = true)
    private String extension;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetUserByExtensionRequest(Builder builder) {
        super(builder);
        this.extension = builder.extension;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserByExtensionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetUserByExtensionRequest, Builder> {
        private String extension; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserByExtensionRequest response) {
            super(response);
            this.extension = response.extension;
            this.instanceId = response.instanceId;
        } 

        /**
         * Extension.
         */
        public Builder extension(String extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetUserByExtensionRequest build() {
            return new GetUserByExtensionRequest(this);
        } 

    } 

}
