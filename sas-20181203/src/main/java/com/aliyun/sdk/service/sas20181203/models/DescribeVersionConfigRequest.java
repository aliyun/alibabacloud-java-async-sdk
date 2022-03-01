// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeVersionConfigRequest</p>
 */
public class DescribeVersionConfigRequest extends Request {
    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private String resourceDirectoryAccountId;

    @Query
    @NameInMap("SourceIp")
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

        private Builder(DescribeVersionConfigRequest response) {
            super(response);
            this.resourceDirectoryAccountId = response.resourceDirectoryAccountId;
            this.sourceIp = response.sourceIp;
        } 

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * SourceIp.
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
