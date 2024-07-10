// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebApplicationRevisionRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebApplicationRevisionRequest</p>
 */
public class DescribeWebApplicationRevisionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RevisionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String revisionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    private DescribeWebApplicationRevisionRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.revisionId = builder.revisionId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebApplicationRevisionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<DescribeWebApplicationRevisionRequest, Builder> {
        private String applicationId; 
        private String revisionId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebApplicationRevisionRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.revisionId = request.revisionId;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * RevisionId.
         */
        public Builder revisionId(String revisionId) {
            this.putPathParameter("RevisionId", revisionId);
            this.revisionId = revisionId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public DescribeWebApplicationRevisionRequest build() {
            return new DescribeWebApplicationRevisionRequest(this);
        } 

    } 

}
