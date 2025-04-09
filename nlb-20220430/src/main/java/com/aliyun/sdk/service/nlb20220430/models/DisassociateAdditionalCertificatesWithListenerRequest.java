// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link DisassociateAdditionalCertificatesWithListenerRequest} extends {@link RequestModel}
 *
 * <p>DisassociateAdditionalCertificatesWithListenerRequest</p>
 */
public class DisassociateAdditionalCertificatesWithListenerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdditionalCertificateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> additionalCertificateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DisassociateAdditionalCertificatesWithListenerRequest(Builder builder) {
        super(builder);
        this.additionalCertificateIds = builder.additionalCertificateIds;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateAdditionalCertificatesWithListenerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalCertificateIds
     */
    public java.util.List<String> getAdditionalCertificateIds() {
        return this.additionalCertificateIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DisassociateAdditionalCertificatesWithListenerRequest, Builder> {
        private java.util.List<String> additionalCertificateIds; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateAdditionalCertificatesWithListenerRequest request) {
            super(request);
            this.additionalCertificateIds = request.additionalCertificateIds;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The additional certificates. You can disassociate up to 15 additional certificates in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder additionalCertificateIds(java.util.List<String> additionalCertificateIds) {
            this.putBodyParameter("AdditionalCertificateIds", additionalCertificateIds);
            this.additionalCertificateIds = additionalCertificateIds;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate this value. Ensure that the value is unique among all requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** <strong>RequestId</strong> is different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The listener ID. Only TCP/SSL listener IDs are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-bpn0kn908w4nbw****@80</p>
         */
        public Builder listenerId(String listenerId) {
            this.putBodyParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DisassociateAdditionalCertificatesWithListenerRequest build() {
            return new DisassociateAdditionalCertificatesWithListenerRequest(this);
        } 

    } 

}
