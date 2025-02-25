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
 * {@link ListTestCaseFieldsRequest} extends {@link RequestModel}
 *
 * <p>ListTestCaseFieldsRequest</p>
 */
public class ListTestCaseFieldsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceIdentifier;

    private ListTestCaseFieldsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.spaceIdentifier = builder.spaceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTestCaseFieldsRequest create() {
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
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public static final class Builder extends Request.Builder<ListTestCaseFieldsRequest, Builder> {
        private String organizationId; 
        private String spaceIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(ListTestCaseFieldsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.spaceIdentifier = request.spaceIdentifier;
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
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putQueryParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        @Override
        public ListTestCaseFieldsRequest build() {
            return new ListTestCaseFieldsRequest(this);
        } 

    } 

}
