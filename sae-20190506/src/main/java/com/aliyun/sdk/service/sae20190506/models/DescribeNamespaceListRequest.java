// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespaceListRequest</p>
 */
public class DescribeNamespaceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainCustom")
    private Boolean containCustom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HybridCloudExclude")
    private Boolean hybridCloudExclude;

    private DescribeNamespaceListRequest(Builder builder) {
        super(builder);
        this.containCustom = builder.containCustom;
        this.hybridCloudExclude = builder.hybridCloudExclude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespaceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containCustom
     */
    public Boolean getContainCustom() {
        return this.containCustom;
    }

    /**
     * @return hybridCloudExclude
     */
    public Boolean getHybridCloudExclude() {
        return this.hybridCloudExclude;
    }

    public static final class Builder extends Request.Builder<DescribeNamespaceListRequest, Builder> {
        private Boolean containCustom; 
        private Boolean hybridCloudExclude; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespaceListRequest request) {
            super(request);
            this.containCustom = request.containCustom;
            this.hybridCloudExclude = request.hybridCloudExclude;
        } 

        /**
         * Specifies whether to return custom namespaces. Valid values:
         * <p>
         * 
         * *   **true**: The system returns custom namespaces.
         * *   **false**: The system does not return custom namespaces.
         */
        public Builder containCustom(Boolean containCustom) {
            this.putQueryParameter("ContainCustom", containCustom);
            this.containCustom = containCustom;
            return this;
        }

        /**
         * Specifies whether to exclude hybrid cloud namespaces from the result. Valid values:
         * <p>
         * 
         * - **true**: The system excludes hybrid cloud namespaces from the result.
         * - **false**: The system does not exclude hybrid cloud namespaces from the result.
         */
        public Builder hybridCloudExclude(Boolean hybridCloudExclude) {
            this.putQueryParameter("HybridCloudExclude", hybridCloudExclude);
            this.hybridCloudExclude = hybridCloudExclude;
            return this;
        }

        @Override
        public DescribeNamespaceListRequest build() {
            return new DescribeNamespaceListRequest(this);
        } 

    } 

}
