// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link PutProjectTransferAccelerationRequest} extends {@link RequestModel}
 *
 * <p>PutProjectTransferAccelerationRequest</p>
 */
public class PutProjectTransferAccelerationRequest extends Request {
    @Host
    @NameInMap("project")
    private String project;

    @Body
    @NameInMap("enabled")
    private Boolean enabled;

    private PutProjectTransferAccelerationRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProjectTransferAccelerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder extends Request.Builder<PutProjectTransferAccelerationRequest, Builder> {
        private String project; 
        private Boolean enabled; 

        private Builder() {
            super();
        } 

        private Builder(PutProjectTransferAccelerationRequest request) {
            super(request);
            this.project = request.project;
            this.enabled = request.enabled;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        @Override
        public PutProjectTransferAccelerationRequest build() {
            return new PutProjectTransferAccelerationRequest(this);
        } 

    } 

}
