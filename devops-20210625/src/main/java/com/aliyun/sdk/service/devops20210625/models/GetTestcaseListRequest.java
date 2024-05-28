// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTestcaseListRequest} extends {@link RequestModel}
 *
 * <p>GetTestcaseListRequest</p>
 */
public class GetTestcaseListRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conditions")
    private String conditions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryIdentifier")
    private String directoryIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxResult")
    private String maxResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceIdentifier;

    private GetTestcaseListRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.conditions = builder.conditions;
        this.directoryIdentifier = builder.directoryIdentifier;
        this.maxResult = builder.maxResult;
        this.nextToken = builder.nextToken;
        this.spaceIdentifier = builder.spaceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTestcaseListRequest create() {
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
     * @return conditions
     */
    public String getConditions() {
        return this.conditions;
    }

    /**
     * @return directoryIdentifier
     */
    public String getDirectoryIdentifier() {
        return this.directoryIdentifier;
    }

    /**
     * @return maxResult
     */
    public String getMaxResult() {
        return this.maxResult;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    public static final class Builder extends Request.Builder<GetTestcaseListRequest, Builder> {
        private String organizationId; 
        private String conditions; 
        private String directoryIdentifier; 
        private String maxResult; 
        private String nextToken; 
        private String spaceIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetTestcaseListRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.conditions = request.conditions;
            this.directoryIdentifier = request.directoryIdentifier;
            this.maxResult = request.maxResult;
            this.nextToken = request.nextToken;
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
         * conditions.
         */
        public Builder conditions(String conditions) {
            this.putBodyParameter("conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * directoryIdentifier.
         */
        public Builder directoryIdentifier(String directoryIdentifier) {
            this.putBodyParameter("directoryIdentifier", directoryIdentifier);
            this.directoryIdentifier = directoryIdentifier;
            return this;
        }

        /**
         * maxResult.
         */
        public Builder maxResult(String maxResult) {
            this.putBodyParameter("maxResult", maxResult);
            this.maxResult = maxResult;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * spaceIdentifier.
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putBodyParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        @Override
        public GetTestcaseListRequest build() {
            return new GetTestcaseListRequest(this);
        } 

    } 

}
