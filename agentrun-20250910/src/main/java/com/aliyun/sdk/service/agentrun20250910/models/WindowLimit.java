// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link WindowLimit} extends {@link TeaModel}
 *
 * <p>WindowLimit</p>
 */
public class WindowLimit extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("durationSecs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long durationSecs;

    @com.aliyun.core.annotation.NameInMap("limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limit;

    private WindowLimit(Builder builder) {
        this.durationSecs = builder.durationSecs;
        this.limit = builder.limit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WindowLimit create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationSecs
     */
    public Long getDurationSecs() {
        return this.durationSecs;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    public static final class Builder {
        private Long durationSecs; 
        private Long limit; 

        private Builder() {
        } 

        private Builder(WindowLimit model) {
            this.durationSecs = model.durationSecs;
            this.limit = model.limit;
        } 

        /**
         * <p>限流时间窗口的持续时间，单位为秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder durationSecs(Long durationSecs) {
            this.durationSecs = durationSecs;
            return this;
        }

        /**
         * <p>在指定时间窗口内允许的最大请求数量</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public WindowLimit build() {
            return new WindowLimit(this);
        } 

    } 

}
