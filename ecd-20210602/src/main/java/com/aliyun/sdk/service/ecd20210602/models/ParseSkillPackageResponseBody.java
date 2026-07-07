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
 * {@link ParseSkillPackageResponseBody} extends {@link TeaModel}
 *
 * <p>ParseSkillPackageResponseBody</p>
 */
public class ParseSkillPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskKey")
    private String taskKey;

    private ParseSkillPackageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskKey = builder.taskKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ParseSkillPackageResponseBody create() {
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
     * @return taskKey
     */
    public String getTaskKey() {
        return this.taskKey;
    }

    public static final class Builder {
        private String requestId; 
        private String taskKey; 

        private Builder() {
        } 

        private Builder(ParseSkillPackageResponseBody model) {
            this.requestId = model.requestId;
            this.taskKey = model.taskKey;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskKey.
         */
        public Builder taskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }

        public ParseSkillPackageResponseBody build() {
            return new ParseSkillPackageResponseBody(this);
        } 

    } 

}
