// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link CreateDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosisRequest</p>
 */
public class CreateDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtFailureTime")
    private String gmtFailureTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProblemCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String problemCategory;

    private CreateDiagnosisRequest(Builder builder) {
        super(builder);
        this.gmtFailureTime = builder.gmtFailureTime;
        this.instanceId = builder.instanceId;
        this.problemCategory = builder.problemCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtFailureTime
     */
    public String getGmtFailureTime() {
        return this.gmtFailureTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return problemCategory
     */
    public String getProblemCategory() {
        return this.problemCategory;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosisRequest, Builder> {
        private String gmtFailureTime; 
        private String instanceId; 
        private String problemCategory; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosisRequest request) {
            super(request);
            this.gmtFailureTime = request.gmtFailureTime;
            this.instanceId = request.instanceId;
            this.problemCategory = request.problemCategory;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder gmtFailureTime(String gmtFailureTime) {
            this.putBodyParameter("GmtFailureTime", gmtFailureTime);
            this.gmtFailureTime = gmtFailureTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceStartFailed</p>
         */
        public Builder problemCategory(String problemCategory) {
            this.putBodyParameter("ProblemCategory", problemCategory);
            this.problemCategory = problemCategory;
            return this;
        }

        @Override
        public CreateDiagnosisRequest build() {
            return new CreateDiagnosisRequest(this);
        } 

    } 

}
