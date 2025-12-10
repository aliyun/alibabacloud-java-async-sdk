// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link CreateExperimentMigrateValidationRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentMigrateValidationRequest</p>
 */
public class CreateExperimentMigrateValidationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceExpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceExpId;

    private CreateExperimentMigrateValidationRequest(Builder builder) {
        super(builder);
        this.sourceExpId = builder.sourceExpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentMigrateValidationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceExpId
     */
    public Long getSourceExpId() {
        return this.sourceExpId;
    }

    public static final class Builder extends Request.Builder<CreateExperimentMigrateValidationRequest, Builder> {
        private Long sourceExpId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentMigrateValidationRequest request) {
            super(request);
            this.sourceExpId = request.sourceExpId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder sourceExpId(Long sourceExpId) {
            this.putQueryParameter("SourceExpId", sourceExpId);
            this.sourceExpId = sourceExpId;
            return this;
        }

        @Override
        public CreateExperimentMigrateValidationRequest build() {
            return new CreateExperimentMigrateValidationRequest(this);
        } 

    } 

}
