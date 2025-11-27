// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link CreateActionPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateActionPlanResponseBody</p>
 */
public class CreateActionPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionPlanId")
    private String actionPlanId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateActionPlanResponseBody(Builder builder) {
        this.actionPlanId = builder.actionPlanId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateActionPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionPlanId
     */
    public String getActionPlanId() {
        return this.actionPlanId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String actionPlanId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateActionPlanResponseBody model) {
            this.actionPlanId = model.actionPlanId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-hz036ubmx2qmw93k****</p>
         */
        public Builder actionPlanId(String actionPlanId) {
            this.actionPlanId = actionPlanId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateActionPlanResponseBody build() {
            return new CreateActionPlanResponseBody(this);
        } 

    } 

}
