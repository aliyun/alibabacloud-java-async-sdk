// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreatePolarClawSkillTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolarClawSkillTemplateResponseBody</p>
 */
public class CreatePolarClawSkillTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillTemplateId")
    private String skillTemplateId;

    private CreatePolarClawSkillTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillTemplateId = builder.skillTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawSkillTemplateResponseBody create() {
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
     * @return skillTemplateId
     */
    public String getSkillTemplateId() {
        return this.skillTemplateId;
    }

    public static final class Builder {
        private String requestId; 
        private String skillTemplateId; 

        private Builder() {
        } 

        private Builder(CreatePolarClawSkillTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.skillTemplateId = model.skillTemplateId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The skill template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pcpg-skill-**************</p>
         */
        public Builder skillTemplateId(String skillTemplateId) {
            this.skillTemplateId = skillTemplateId;
            return this;
        }

        public CreatePolarClawSkillTemplateResponseBody build() {
            return new CreatePolarClawSkillTemplateResponseBody(this);
        } 

    } 

}
