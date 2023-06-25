// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTestCaseFieldsRequest} extends {@link RequestModel}
 *
 * <p>ListTestCaseFieldsRequest</p>
 */
public class ListTestCaseFieldsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
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
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * spaceIdentifier.
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
