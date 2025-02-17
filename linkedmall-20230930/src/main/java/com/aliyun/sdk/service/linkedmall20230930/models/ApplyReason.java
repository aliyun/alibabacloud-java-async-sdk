// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ApplyReason} extends {@link TeaModel}
 *
 * <p>ApplyReason</p>
 */
public class ApplyReason extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("reasonTextId")
    private Long reasonTextId;

    @com.aliyun.core.annotation.NameInMap("reasonTips")
    private String reasonTips;

    private ApplyReason(Builder builder) {
        this.reasonTextId = builder.reasonTextId;
        this.reasonTips = builder.reasonTips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyReason create() {
        return builder().build();
    }

    /**
     * @return reasonTextId
     */
    public Long getReasonTextId() {
        return this.reasonTextId;
    }

    /**
     * @return reasonTips
     */
    public String getReasonTips() {
        return this.reasonTips;
    }

    public static final class Builder {
        private Long reasonTextId; 
        private String reasonTips; 

        /**
         * reasonTextId.
         */
        public Builder reasonTextId(Long reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }

        /**
         * reasonTips.
         */
        public Builder reasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }

        public ApplyReason build() {
            return new ApplyReason(this);
        } 

    } 

}
