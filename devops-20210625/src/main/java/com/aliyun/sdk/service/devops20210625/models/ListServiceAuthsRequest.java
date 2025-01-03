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
 * {@link ListServiceAuthsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceAuthsRequest</p>
 */
public class ListServiceAuthsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceAuthType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceAuthType;

    private ListServiceAuthsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.serviceAuthType = builder.serviceAuthType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceAuthsRequest create() {
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
     * @return serviceAuthType
     */
    public String getServiceAuthType() {
        return this.serviceAuthType;
    }

    public static final class Builder extends Request.Builder<ListServiceAuthsRequest, Builder> {
        private String organizationId; 
        private String serviceAuthType; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceAuthsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.serviceAuthType = request.serviceAuthType;
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
         * <p>RAM</p>
         */
        public Builder serviceAuthType(String serviceAuthType) {
            this.putQueryParameter("serviceAuthType", serviceAuthType);
            this.serviceAuthType = serviceAuthType;
            return this;
        }

        @Override
        public ListServiceAuthsRequest build() {
            return new ListServiceAuthsRequest(this);
        } 

    } 

}
