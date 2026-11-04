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
 * {@link DeletePolarClawSkillResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePolarClawSkillResponseBody</p>
 */
public class DeletePolarClawSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    private DeletePolarClawSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarClawSkillResponseBody create() {
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

        private Builder(DeletePolarClawSkillResponseBody model) {
            this.requestId = model.requestId;
            this.skillName = model.skillName;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclawhub</p>
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        public DeletePolarClawSkillResponseBody build() {
            return new DeletePolarClawSkillResponseBody(this);
        } 

    } 

}
