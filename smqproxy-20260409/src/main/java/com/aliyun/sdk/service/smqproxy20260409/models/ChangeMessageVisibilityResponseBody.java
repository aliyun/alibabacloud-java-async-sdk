// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409.models;

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
 * {@link ChangeMessageVisibilityResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeMessageVisibilityResponseBody</p>
 */
public class ChangeMessageVisibilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextVisibleTime")
    private Long nextVisibleTime;

    @com.aliyun.core.annotation.NameInMap("ReceiptHandle")
    private String receiptHandle;

    private ChangeMessageVisibilityResponseBody(Builder builder) {
        this.nextVisibleTime = builder.nextVisibleTime;
        this.receiptHandle = builder.receiptHandle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeMessageVisibilityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextVisibleTime
     */
    public Long getNextVisibleTime() {
        return this.nextVisibleTime;
    }

    /**
     * @return receiptHandle
     */
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    public static final class Builder {
        private Long nextVisibleTime; 
        private String receiptHandle; 

        private Builder() {
        } 

        private Builder(ChangeMessageVisibilityResponseBody model) {
            this.nextVisibleTime = model.nextVisibleTime;
            this.receiptHandle = model.receiptHandle;
        } 

        /**
         * <p>The time when the message can be consumed again (millisecond-level timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1250700979348</p>
         */
        public Builder nextVisibleTime(Long nextVisibleTime) {
            this.nextVisibleTime = nextVisibleTime;
            return this;
        }

        /**
         * <p>The new temporary handle. Use this new handle for subsequent delete or modification operations. This handle is valid before NextVisibleTime.</p>
         * 
         * <strong>example:</strong>
         * <p>TbZj6wDWli+9CEauMZc8ZRv37sIW2iJKq3M9Mx/TS1</p>
         */
        public Builder receiptHandle(String receiptHandle) {
            this.receiptHandle = receiptHandle;
            return this;
        }

        public ChangeMessageVisibilityResponseBody build() {
            return new ChangeMessageVisibilityResponseBody(this);
        } 

    } 

}
