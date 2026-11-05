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
 * {@link CreatePolarClawSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolarClawSkillResponseBody</p>
 */
public class CreatePolarClawSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsUpdate")
    private String isUpdate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    private CreatePolarClawSkillResponseBody(Builder builder) {
        this.isUpdate = builder.isUpdate;
        this.requestId = builder.requestId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isUpdate
     */
    public String getIsUpdate() {
        return this.isUpdate;
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
        private String isUpdate; 
        private String requestId; 
        private String skillName; 

        private Builder() {
        } 

        private Builder(CreatePolarClawSkillResponseBody model) {
            this.isUpdate = model.isUpdate;
            this.requestId = model.requestId;
            this.skillName = model.skillName;
        } 

        /**
         * IsUpdate.
         */
        public Builder isUpdate(String isUpdate) {
            this.isUpdate = isUpdate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SkillName.
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        public CreatePolarClawSkillResponseBody build() {
            return new CreatePolarClawSkillResponseBody(this);
        } 

    } 

}
