// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetLogviewDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetLogviewDownloadUrlRequest</p>
 */
public class GetLogviewDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("useVpcEndpoint")
    private Boolean useVpcEndpoint;

    private GetLogviewDownloadUrlRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.instance = builder.instance;
        this.useVpcEndpoint = builder.useVpcEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogviewDownloadUrlRequest create() {
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
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return useVpcEndpoint
     */
    public Boolean getUseVpcEndpoint() {
        return this.useVpcEndpoint;
    }

    public static final class Builder extends Request.Builder<GetLogviewDownloadUrlRequest, Builder> {
        private String project; 
        private String instance; 
        private Boolean useVpcEndpoint; 

        private Builder() {
            super();
        } 

        private Builder(GetLogviewDownloadUrlRequest request) {
            super(request);
            this.project = request.project;
            this.instance = request.instance;
            this.useVpcEndpoint = request.useVpcEndpoint;
        } 

        /**
         * <p>The name of the MaxCompute project. This parameter is used to specify the project to which the instance whose offline Logview is to be downloaded belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder project(String project) {
            this.putPathParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The ID of the MaxCompute instance. The instance must belong to the project specified by the project parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20260409110419512gx6ofeaj8fb</p>
         */
        public Builder instance(String instance) {
            this.putPathParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * <p>Specifies whether to use the OSS VPC endpoint to generate the download link. Valid values:</p>
         * <ul>
         * <li>false: Uses the default OSS endpoint.</li>
         * <li>true: Uses the OSS VPC endpoint configured on the server. The download client must have network access to this endpoint.
         * Default value: false. If this parameter is set to true and no OSS VPC endpoint is configured on the server, link generation fails and does not automatically fall back.</li>
         * </ul>
         */
        public Builder useVpcEndpoint(Boolean useVpcEndpoint) {
            this.putQueryParameter("useVpcEndpoint", useVpcEndpoint);
            this.useVpcEndpoint = useVpcEndpoint;
            return this;
        }

        @Override
        public GetLogviewDownloadUrlRequest build() {
            return new GetLogviewDownloadUrlRequest(this);
        } 

    } 

}
