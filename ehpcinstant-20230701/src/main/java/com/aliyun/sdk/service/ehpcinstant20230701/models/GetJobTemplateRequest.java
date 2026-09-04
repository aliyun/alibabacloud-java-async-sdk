// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link GetJobTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetJobTemplateRequest</p>
 */
public class GetJobTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobTemplateId;

    private GetJobTemplateRequest(Builder builder) {
        super(builder);
        this.jobTemplateId = builder.jobTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobTemplateId
     */
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    public static final class Builder extends Request.Builder<GetJobTemplateRequest, Builder> {
        private String jobTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(GetJobTemplateRequest request) {
            super(request);
            this.jobTemplateId = request.jobTemplateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jt-xxxx</p>
         */
        public Builder jobTemplateId(String jobTemplateId) {
            this.putQueryParameter("JobTemplateId", jobTemplateId);
            this.jobTemplateId = jobTemplateId;
            return this;
        }

        @Override
        public GetJobTemplateRequest build() {
            return new GetJobTemplateRequest(this);
        } 

    } 

}
