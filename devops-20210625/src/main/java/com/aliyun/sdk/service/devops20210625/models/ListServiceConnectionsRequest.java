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
 * {@link ListServiceConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceConnectionsRequest</p>
 */
public class ListServiceConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sericeConnectionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sericeConnectionType;

    private ListServiceConnectionsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.sericeConnectionType = builder.sericeConnectionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceConnectionsRequest create() {
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
     * @return sericeConnectionType
     */
    public String getSericeConnectionType() {
        return this.sericeConnectionType;
    }

    public static final class Builder extends Request.Builder<ListServiceConnectionsRequest, Builder> {
        private String organizationId; 
        private String sericeConnectionType; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceConnectionsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.sericeConnectionType = request.sericeConnectionType;
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
         * <p>codeup</p>
         */
        public Builder sericeConnectionType(String sericeConnectionType) {
            this.putQueryParameter("sericeConnectionType", sericeConnectionType);
            this.sericeConnectionType = sericeConnectionType;
            return this;
        }

        @Override
        public ListServiceConnectionsRequest build() {
            return new ListServiceConnectionsRequest(this);
        } 

    } 

}
