// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link VideoDRMLicenseRequest} extends {@link RequestModel}
 *
 * <p>VideoDRMLicenseRequest</p>
 */
public class VideoDRMLicenseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drmType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drmType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("licenseRequest")
    private String licenseRequest;

    private VideoDRMLicenseRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.drmType = builder.drmType;
        this.licenseRequest = builder.licenseRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoDRMLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return drmType
     */
    public String getDrmType() {
        return this.drmType;
    }

    /**
     * @return licenseRequest
     */
    public String getLicenseRequest() {
        return this.licenseRequest;
    }

    public static final class Builder extends Request.Builder<VideoDRMLicenseRequest, Builder> {
        private String domainId; 
        private String drmType; 
        private String licenseRequest; 

        private Builder() {
            super();
        } 

        private Builder(VideoDRMLicenseRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.drmType = request.drmType;
            this.licenseRequest = request.licenseRequest;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The type of DRM encryption.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>fairplay</li>
         * <li>widevine</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>widevine</p>
         */
        public Builder drmType(String drmType) {
            this.putBodyParameter("drmType", drmType);
            this.drmType = drmType;
            return this;
        }

        /**
         * <p>The request that is initiated to obtain the license.</p>
         * 
         * <strong>example:</strong>
         * <p>CAES6B8SQgpACioSENGxDhqCLIVwwCBOyPayyWoSENGxDhqCLIVwwCBOyPayyWpI88aJmwYQARoQdRV32</p>
         */
        public Builder licenseRequest(String licenseRequest) {
            this.putBodyParameter("licenseRequest", licenseRequest);
            this.licenseRequest = licenseRequest;
            return this;
        }

        @Override
        public VideoDRMLicenseRequest build() {
            return new VideoDRMLicenseRequest(this);
        } 

    } 

}
