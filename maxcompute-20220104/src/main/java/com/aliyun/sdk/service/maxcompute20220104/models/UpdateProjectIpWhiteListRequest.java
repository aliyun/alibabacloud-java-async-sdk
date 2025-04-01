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
 * {@link UpdateProjectIpWhiteListRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectIpWhiteListRequest</p>
 */
public class UpdateProjectIpWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdateProjectIpWhiteListRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectIpWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateProjectIpWhiteListRequest, Builder> {
        private String projectName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectIpWhiteListRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.body = request.body;
        } 

        /**
         * <p>The name of the MaxCompute project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        public Builder projectName(String projectName) {
            this.putPathParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>json {&quot;ipWhiteList&quot;:{&quot;ipList&quot;: &quot;&quot;, // The IP address whitelists are of the STRING data type. Separate multiple IP address whitelists with commas (,). &quot;vpcIpList&quot;: &quot;&quot;, //} }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateProjectIpWhiteListRequest build() {
            return new UpdateProjectIpWhiteListRequest(this);
        } 

    } 

}
