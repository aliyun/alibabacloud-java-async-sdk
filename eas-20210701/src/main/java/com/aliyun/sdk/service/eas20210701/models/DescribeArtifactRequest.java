// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeArtifactRequest} extends {@link RequestModel}
 *
 * <p>DescribeArtifactRequest</p>
 */
public class DescribeArtifactRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ArtifactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactName;

    private DescribeArtifactRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.artifactName = builder.artifactName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeArtifactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return artifactName
     */
    public String getArtifactName() {
        return this.artifactName;
    }

    public static final class Builder extends Request.Builder<DescribeArtifactRequest, Builder> {
        private String clusterId; 
        private String artifactName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeArtifactRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.artifactName = request.artifactName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder artifactName(String artifactName) {
            this.putPathParameter("ArtifactName", artifactName);
            this.artifactName = artifactName;
            return this;
        }

        @Override
        public DescribeArtifactRequest build() {
            return new DescribeArtifactRequest(this);
        } 

    } 

}
