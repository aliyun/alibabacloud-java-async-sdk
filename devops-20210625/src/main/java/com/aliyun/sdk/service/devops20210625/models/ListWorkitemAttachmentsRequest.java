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
 * {@link ListWorkitemAttachmentsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkitemAttachmentsRequest</p>
 */
public class ListWorkitemAttachmentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
    private String workitemIdentifier;

    private ListWorkitemAttachmentsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.workitemIdentifier = builder.workitemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkitemAttachmentsRequest create() {
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
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static final class Builder extends Request.Builder<ListWorkitemAttachmentsRequest, Builder> {
        private String organizationId; 
        private String workitemIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkitemAttachmentsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.workitemIdentifier = request.workitemIdentifier;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * workitemIdentifier.
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putPathParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        @Override
        public ListWorkitemAttachmentsRequest build() {
            return new ListWorkitemAttachmentsRequest(this);
        } 

    } 

}
