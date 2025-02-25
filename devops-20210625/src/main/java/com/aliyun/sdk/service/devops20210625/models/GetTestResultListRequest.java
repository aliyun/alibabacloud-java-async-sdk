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
 * {@link GetTestResultListRequest} extends {@link RequestModel}
 *
 * <p>GetTestResultListRequest</p>
 */
public class GetTestResultListRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("testPlanIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testPlanIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conditions")
    private String conditions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryIdentifier;

    private GetTestResultListRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.testPlanIdentifier = builder.testPlanIdentifier;
        this.conditions = builder.conditions;
        this.directoryIdentifier = builder.directoryIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTestResultListRequest create() {
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
     * @return testPlanIdentifier
     */
    public String getTestPlanIdentifier() {
        return this.testPlanIdentifier;
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

    public static final class Builder extends Request.Builder<GetTestResultListRequest, Builder> {
        private String organizationId; 
        private String testPlanIdentifier; 
        private String conditions; 
        private String directoryIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetTestResultListRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.testPlanIdentifier = request.testPlanIdentifier;
            this.conditions = request.conditions;
            this.directoryIdentifier = request.directoryIdentifier;
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
         */
        public Builder testPlanIdentifier(String testPlanIdentifier) {
            this.putPathParameter("testPlanIdentifier", testPlanIdentifier);
            this.testPlanIdentifier = testPlanIdentifier;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e27b8eace6501ce51cf5d56784</p>
         */
        public Builder directoryIdentifier(String directoryIdentifier) {
            this.putBodyParameter("directoryIdentifier", directoryIdentifier);
            this.directoryIdentifier = directoryIdentifier;
            return this;
        }

        @Override
        public GetTestResultListRequest build() {
            return new GetTestResultListRequest(this);
        } 

    } 

}
