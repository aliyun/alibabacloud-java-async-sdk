// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link GetUserByExtensionRequest} extends {@link RequestModel}
 *
 * <p>GetUserByExtensionRequest</p>
 */
public class GetUserByExtensionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extension")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetUserByExtensionRequest request) {
            super(request);
            this.extension = request.extension;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder extension(String extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
