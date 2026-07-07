// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link CreateTenantSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTenantSkillResponseBody</p>
 */
public class CreateTenantSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    private CreateTenantSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantSkillResponseBody create() {
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

        private Builder(CreateTenantSkillResponseBody model) {
            this.requestId = model.requestId;
            this.skillId = model.skillId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SkillId.
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        public CreateTenantSkillResponseBody build() {
            return new CreateTenantSkillResponseBody(this);
        } 

    } 

}
