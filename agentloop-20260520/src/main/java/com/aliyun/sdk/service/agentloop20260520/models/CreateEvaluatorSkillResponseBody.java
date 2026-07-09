// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateEvaluatorSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEvaluatorSkillResponseBody</p>
 */
public class CreateEvaluatorSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    private CreateEvaluatorSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEvaluatorSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    public static final class Builder {
        private String requestId; 
        private String skillName; 

        private Builder() {
        } 

        private Builder(CreateEvaluatorSkillResponseBody model) {
            this.requestId = model.requestId;
            this.skillName = model.skillName;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * skillName.
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        public CreateEvaluatorSkillResponseBody build() {
            return new CreateEvaluatorSkillResponseBody(this);
        } 

    } 

}
