// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateMediaLifecycleRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaLifecycleRuleResponseBody</p>
 */
public class UpdateMediaLifecycleRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenRuleIds")
    private java.util.List<String> forbiddenRuleIds;

    @com.aliyun.core.annotation.NameInMap("NonExistRuleIds")
    private java.util.List<String> nonExistRuleIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateMediaLifecycleRuleResponseBody(Builder builder) {
        this.forbiddenRuleIds = builder.forbiddenRuleIds;
        this.nonExistRuleIds = builder.nonExistRuleIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaLifecycleRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forbiddenRuleIds
     */
    public java.util.List<String> getForbiddenRuleIds() {
        return this.forbiddenRuleIds;
    }

    /**
     * @return nonExistRuleIds
     */
    public java.util.List<String> getNonExistRuleIds() {
        return this.nonExistRuleIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> forbiddenRuleIds; 
        private java.util.List<String> nonExistRuleIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateMediaLifecycleRuleResponseBody model) {
            this.forbiddenRuleIds = model.forbiddenRuleIds;
            this.nonExistRuleIds = model.nonExistRuleIds;
            this.requestId = model.requestId;
        } 

        /**
         * ForbiddenRuleIds.
         */
        public Builder forbiddenRuleIds(java.util.List<String> forbiddenRuleIds) {
            this.forbiddenRuleIds = forbiddenRuleIds;
            return this;
        }

        /**
         * NonExistRuleIds.
         */
        public Builder nonExistRuleIds(java.util.List<String> nonExistRuleIds) {
            this.nonExistRuleIds = nonExistRuleIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateMediaLifecycleRuleResponseBody build() {
            return new UpdateMediaLifecycleRuleResponseBody(this);
        } 

    } 

}
