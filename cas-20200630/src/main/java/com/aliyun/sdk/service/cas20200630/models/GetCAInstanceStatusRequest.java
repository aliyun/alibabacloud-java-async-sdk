// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link GetCAInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetCAInstanceStatusRequest</p>
 */
public class GetCAInstanceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private GetCAInstanceStatusRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCAInstanceStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCAInstanceStatusRequest, Builder> {
        private String identifier; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCAInstanceStatusRequest request) {
            super(request);
            this.identifier = request.identifier;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The unique identifier of the client certificate or server-side certificate to query.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/330884.html">ListClientCertificate</a> to query the unique identifiers of all client certificates and server-side certificates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>160ae6bb538d538c70c01f81dcf2****</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The ID of the private CA instance to query.</p>
         * <blockquote>
         * <p>After you purchase a private CA instance in the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">CAS console</a>, you can go to the <strong>Private Certificates</strong> page and view the <strong>details</strong> of the instance to obtain its ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cas-member-0hmi****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetCAInstanceStatusRequest build() {
            return new GetCAInstanceStatusRequest(this);
        } 

    } 

}
