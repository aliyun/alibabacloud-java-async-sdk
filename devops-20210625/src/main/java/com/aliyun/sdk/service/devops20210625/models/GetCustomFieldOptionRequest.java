// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomFieldOptionRequest} extends {@link RequestModel}
 *
 * <p>GetCustomFieldOptionRequest</p>
 */
public class GetCustomFieldOptionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("fieldId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spaceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workitemTypeIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemTypeIdentifier;

    private GetCustomFieldOptionRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.fieldId = builder.fieldId;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.spaceType = builder.spaceType;
        this.workitemTypeIdentifier = builder.workitemTypeIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomFieldOptionRequest create() {
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
     * @return fieldId
     */
    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    /**
     * @return workitemTypeIdentifier
     */
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

    public static final class Builder extends Request.Builder<GetCustomFieldOptionRequest, Builder> {
        private String organizationId; 
        private String fieldId; 
        private String spaceIdentifier; 
        private String spaceType; 
        private String workitemTypeIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomFieldOptionRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.fieldId = request.fieldId;
            this.spaceIdentifier = request.spaceIdentifier;
            this.spaceType = request.spaceType;
            this.workitemTypeIdentifier = request.workitemTypeIdentifier;
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
         * fieldId.
         */
        public Builder fieldId(String fieldId) {
            this.putPathParameter("fieldId", fieldId);
            this.fieldId = fieldId;
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

        /**
         * spaceType.
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        /**
         * workitemTypeIdentifier.
         */
        public Builder workitemTypeIdentifier(String workitemTypeIdentifier) {
            this.putQueryParameter("workitemTypeIdentifier", workitemTypeIdentifier);
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }

        @Override
        public GetCustomFieldOptionRequest build() {
            return new GetCustomFieldOptionRequest(this);
        } 

    } 

}
