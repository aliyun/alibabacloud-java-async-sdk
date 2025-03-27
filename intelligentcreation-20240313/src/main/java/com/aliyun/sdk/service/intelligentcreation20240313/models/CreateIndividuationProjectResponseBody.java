// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateIndividuationProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIndividuationProjectResponseBody</p>
 */
public class CreateIndividuationProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateIndividuationProjectResponseBody(Builder builder) {
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIndividuationProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String projectId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateIndividuationProjectResponseBody model) {
            this.projectId = model.projectId;
            this.requestId = model.requestId;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4D902811-B75C-5D1B-8882-D515F8E2F977</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIndividuationProjectResponseBody build() {
            return new CreateIndividuationProjectResponseBody(this);
        } 

    } 

}
