// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateDigitalEmployeeSkillResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDigitalEmployeeSkillResponseBody</p>
 */
public class CreateDigitalEmployeeSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    private CreateDigitalEmployeeSkillResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillName = builder.skillName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDigitalEmployeeSkillResponseBody create() {
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

        private Builder(CreateDigitalEmployeeSkillResponseBody model) {
            this.requestId = model.requestId;
            this.skillName = model.skillName;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
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

        public CreateDigitalEmployeeSkillResponseBody build() {
            return new CreateDigitalEmployeeSkillResponseBody(this);
        } 

    } 

}
