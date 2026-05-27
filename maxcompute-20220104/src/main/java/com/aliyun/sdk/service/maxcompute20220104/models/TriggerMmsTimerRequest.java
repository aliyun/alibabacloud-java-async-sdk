// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link TriggerMmsTimerRequest} extends {@link RequestModel}
 *
 * <p>TriggerMmsTimerRequest</p>
 */
public class TriggerMmsTimerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("timerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timerId;

    private TriggerMmsTimerRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.timerId = builder.timerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerMmsTimerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return timerId
     */
    public Long getTimerId() {
        return this.timerId;
    }

    public static final class Builder extends Request.Builder<TriggerMmsTimerRequest, Builder> {
        private Long sourceId; 
        private Long timerId; 

        private Builder() {
            super();
        } 

        private Builder(TriggerMmsTimerRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.timerId = request.timerId;
        } 

        /**
         * <p>datasource id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000014</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>timer id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timerId(Long timerId) {
            this.putPathParameter("timerId", timerId);
            this.timerId = timerId;
            return this;
        }

        @Override
        public TriggerMmsTimerRequest build() {
            return new TriggerMmsTimerRequest(this);
        } 

    } 

}
