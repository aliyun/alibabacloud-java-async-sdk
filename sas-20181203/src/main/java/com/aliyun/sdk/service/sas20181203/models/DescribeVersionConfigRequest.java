// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeVersionConfigRequest</p>
 */
public class DescribeVersionConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private String resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeVersionConfigRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeVersionConfigRequest, Builder> {
        private String resourceDirectoryAccountId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVersionConfigRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account that uses Security Center.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/28681.html">GetUser</a> operation to query the IDs of Alibaba Cloud accounts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeVersionConfigRequest build() {
            return new DescribeVersionConfigRequest(this);
        } 

    } 

}
