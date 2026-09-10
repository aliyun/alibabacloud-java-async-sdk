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
 * {@link UpdateNotifyStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateNotifyStrategyResponseBody</p>
 */
public class UpdateNotifyStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("notifyStrategyId")
    private String notifyStrategyId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateNotifyStrategyResponseBody(Builder builder) {
        this.notifyStrategyId = builder.notifyStrategyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNotifyStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notifyStrategyId
     */
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String notifyStrategyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateNotifyStrategyResponseBody model) {
            this.notifyStrategyId = model.notifyStrategyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The UUID of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>12312-31-23-123-1-23123</p>
         */
        public Builder notifyStrategyId(String notifyStrategyId) {
            this.notifyStrategyId = notifyStrategyId;
            return this;
        }

        /**
         * <p>The unique ID of the request, which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateNotifyStrategyResponseBody build() {
            return new UpdateNotifyStrategyResponseBody(this);
        } 

    } 

}
