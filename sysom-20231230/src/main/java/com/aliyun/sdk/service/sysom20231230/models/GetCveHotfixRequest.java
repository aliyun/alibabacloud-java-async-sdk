// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetCveHotfixRequest} extends {@link RequestModel}
 *
 * <p>GetCveHotfixRequest</p>
 */
public class GetCveHotfixRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cveIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> cveIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kernelVersions")
    private java.util.List<String> kernelVersions;

    private GetCveHotfixRequest(Builder builder) {
        super(builder);
        this.cveIds = builder.cveIds;
        this.kernelVersions = builder.kernelVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCveHotfixRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cveIds
     */
    public java.util.List<String> getCveIds() {
        return this.cveIds;
    }

    /**
     * @return kernelVersions
     */
    public java.util.List<String> getKernelVersions() {
        return this.kernelVersions;
    }

    public static final class Builder extends Request.Builder<GetCveHotfixRequest, Builder> {
        private java.util.List<String> cveIds; 
        private java.util.List<String> kernelVersions; 

        private Builder() {
            super();
        } 

        private Builder(GetCveHotfixRequest request) {
            super(request);
            this.cveIds = request.cveIds;
            this.kernelVersions = request.kernelVersions;
        } 

        /**
         * <p>The list of CVE IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder cveIds(java.util.List<String> cveIds) {
            this.putBodyParameter("cveIds", cveIds);
            this.cveIds = cveIds;
            return this;
        }

        /**
         * <p>The list of full kernel versions.</p>
         */
        public Builder kernelVersions(java.util.List<String> kernelVersions) {
            this.putBodyParameter("kernelVersions", kernelVersions);
            this.kernelVersions = kernelVersions;
            return this;
        }

        @Override
        public GetCveHotfixRequest build() {
            return new GetCveHotfixRequest(this);
        } 

    } 

}
