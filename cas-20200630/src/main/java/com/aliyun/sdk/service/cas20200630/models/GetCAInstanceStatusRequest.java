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
         * <p>The unique identifier of the certificate.</p>
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
         * <p>The ID of the private CA instance.</p>
         * <blockquote>
         * <p> After you purchase a private CA instance by using the <a href="https://yundun.console.aliyun.com/?p=cas#/pca/rootlist">SSL Certificates Service console</a>, you can click <strong>Details</strong> for the private CA instance on the <strong>Private Certificates</strong> page to query the ID of the private CA instance.</p>
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
