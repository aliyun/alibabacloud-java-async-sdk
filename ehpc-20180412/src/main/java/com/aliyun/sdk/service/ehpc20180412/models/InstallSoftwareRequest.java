// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallSoftwareRequest} extends {@link RequestModel}
 *
 * <p>InstallSoftwareRequest</p>
 */
public class InstallSoftwareRequest extends Request {
    @Query
    @NameInMap("Application")
    @Validation(required = true)
    private String application;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private InstallSoftwareRequest(Builder builder) {
        super(builder);
        this.application = builder.application;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallSoftwareRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<InstallSoftwareRequest, Builder> {
        private String application; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(InstallSoftwareRequest request) {
            super(request);
            this.application = request.application;
            this.clusterId = request.clusterId;
        } 

        /**
         * Application.
         */
        public Builder application(String application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public InstallSoftwareRequest build() {
            return new InstallSoftwareRequest(this);
        } 

    } 

}
