// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetAddonReleaseRequest} extends {@link RequestModel}
 *
 * <p>GetAddonReleaseRequest</p>
 */
public class GetAddonReleaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("releaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String releaseName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private GetAddonReleaseRequest(Builder builder) {
        super(builder);
        this.releaseName = builder.releaseName;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAddonReleaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<GetAddonReleaseRequest, Builder> {
        private String releaseName; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(GetAddonReleaseRequest request) {
            super(request);
            this.releaseName = request.releaseName;
            this.policyId = request.policyId;
        } 

        /**
         * <p>The name of the AddonRelease.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-gpu-integration-name</p>
         */
        public Builder releaseName(String releaseName) {
            this.putPathParameter("releaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        /**
         * <p>Environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxx</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public GetAddonReleaseRequest build() {
            return new GetAddonReleaseRequest(this);
        } 

    } 

}
