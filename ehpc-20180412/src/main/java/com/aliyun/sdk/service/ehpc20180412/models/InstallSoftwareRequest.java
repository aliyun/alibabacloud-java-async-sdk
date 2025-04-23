// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link InstallSoftwareRequest} extends {@link RequestModel}
 *
 * <p>InstallSoftwareRequest</p>
 */
public class InstallSoftwareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Application")
    @com.aliyun.core.annotation.Validation(required = true)
    private String application;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the software that you want to install.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87216.html">ListSoftwares</a> operation to query the software that can be installed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ABYSS_2.1.5</p>
         */
        public Builder application(String application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
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
