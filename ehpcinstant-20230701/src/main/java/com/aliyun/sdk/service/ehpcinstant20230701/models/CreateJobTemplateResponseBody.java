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
 * {@link CreateJobTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJobTemplateResponseBody</p>
 */
public class CreateJobTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobTemplateId")
    private String jobTemplateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateJobTemplateResponseBody(Builder builder) {
        this.jobTemplateId = builder.jobTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobTemplateId
     */
    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobTemplateId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateJobTemplateResponseBody model) {
            this.jobTemplateId = model.jobTemplateId;
            this.requestId = model.requestId;
        } 

        /**
         * JobTemplateId.
         */
        public Builder jobTemplateId(String jobTemplateId) {
            this.jobTemplateId = jobTemplateId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateJobTemplateResponseBody build() {
            return new CreateJobTemplateResponseBody(this);
        } 

    } 

}
