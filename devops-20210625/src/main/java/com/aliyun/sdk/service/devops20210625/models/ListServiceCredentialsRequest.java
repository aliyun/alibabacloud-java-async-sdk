// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListServiceCredentialsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceCredentialsRequest</p>
 */
public class ListServiceCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceCredentialType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCredentialType;

    private ListServiceCredentialsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.serviceCredentialType = builder.serviceCredentialType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceCredentialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return serviceCredentialType
     */
    public String getServiceCredentialType() {
        return this.serviceCredentialType;
    }

    public static final class Builder extends Request.Builder<ListServiceCredentialsRequest, Builder> {
        private String organizationId; 
        private String serviceCredentialType; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceCredentialsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.serviceCredentialType = request.serviceCredentialType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>username_password</p>
         */
        public Builder serviceCredentialType(String serviceCredentialType) {
            this.putQueryParameter("serviceCredentialType", serviceCredentialType);
            this.serviceCredentialType = serviceCredentialType;
            return this;
        }

        @Override
        public ListServiceCredentialsRequest build() {
            return new ListServiceCredentialsRequest(this);
        } 

    } 

}
