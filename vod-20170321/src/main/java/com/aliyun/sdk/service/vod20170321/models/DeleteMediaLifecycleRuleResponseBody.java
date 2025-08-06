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
 * {@link DeleteMediaLifecycleRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMediaLifecycleRuleResponseBody</p>
 */
public class DeleteMediaLifecycleRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForbiddenRuleIds")
    private java.util.List<String> forbiddenRuleIds;

    @com.aliyun.core.annotation.NameInMap("NonExistRuleIds")
    private java.util.List<String> nonExistRuleIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMediaLifecycleRuleResponseBody(Builder builder) {
        this.forbiddenRuleIds = builder.forbiddenRuleIds;
        this.nonExistRuleIds = builder.nonExistRuleIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaLifecycleRuleResponseBody create() {
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

        private Builder(DeleteMediaLifecycleRuleResponseBody model) {
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

        public DeleteMediaLifecycleRuleResponseBody build() {
            return new DeleteMediaLifecycleRuleResponseBody(this);
        } 

    } 

}
