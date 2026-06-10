// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSkillResponseBody</p>
 */
public class CreateSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    private CreateSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillResponseBody create() {
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
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    public static final class Builder {
        private String requestId; 
        private String skillId; 

        private Builder() {
        } 

        private Builder(CreateSkillResponseBody model) {
            this.requestId = model.requestId;
            this.skillId = model.skillId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A17F9930-E2DC-5E87-B6D6-B0BCD2B00834</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Skill ID</p>
         * 
         * <strong>example:</strong>
         * <p>s-051j4ot2aerr5dyc4</p>
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        public CreateSkillResponseBody build() {
            return new CreateSkillResponseBody(this);
        } 

    } 

}
