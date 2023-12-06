// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFoundationReferenceRequest} extends {@link RequestModel}
 *
 * <p>UpdateFoundationReferenceRequest</p>
 */
public class UpdateFoundationReferenceRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("clusterConfig")
    @Validation(required = true)
    private String clusterConfig;

    private UpdateFoundationReferenceRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.clusterConfig = builder.clusterConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFoundationReferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return clusterConfig
     */
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    public static final class Builder extends Request.Builder<UpdateFoundationReferenceRequest, Builder> {
        private String uid; 
        private String clusterConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFoundationReferenceRequest request) {
            super(request);
            this.uid = request.uid;
            this.clusterConfig = request.clusterConfig;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * clusterConfig.
         */
        public Builder clusterConfig(String clusterConfig) {
            this.putBodyParameter("clusterConfig", clusterConfig);
            this.clusterConfig = clusterConfig;
            return this;
        }

        @Override
        public UpdateFoundationReferenceRequest build() {
            return new UpdateFoundationReferenceRequest(this);
        } 

    } 

}
