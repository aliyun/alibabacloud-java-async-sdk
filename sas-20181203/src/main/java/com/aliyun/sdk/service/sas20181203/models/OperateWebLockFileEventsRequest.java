// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link OperateWebLockFileEventsRequest} extends {@link RequestModel}
 *
 * <p>OperateWebLockFileEventsRequest</p>
 */
public class OperateWebLockFileEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DealAll")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dealAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> eventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationCode;

    private OperateWebLockFileEventsRequest(Builder builder) {
        super(builder);
        this.dealAll = builder.dealAll;
        this.eventIds = builder.eventIds;
        this.operationCode = builder.operationCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateWebLockFileEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dealAll
     */
    public Integer getDealAll() {
        return this.dealAll;
    }

    /**
     * @return eventIds
     */
    public java.util.List<Long> getEventIds() {
        return this.eventIds;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    public static final class Builder extends Request.Builder<OperateWebLockFileEventsRequest, Builder> {
        private Integer dealAll; 
        private java.util.List<Long> eventIds; 
        private String operationCode; 

        private Builder() {
            super();
        } 

        private Builder(OperateWebLockFileEventsRequest request) {
            super(request);
            this.dealAll = request.dealAll;
            this.eventIds = request.eventIds;
            this.operationCode = request.operationCode;
        } 

        /**
         * <p>Specifies whether to handle all alert events that are generated for web tamper proofing. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dealAll(Integer dealAll) {
            this.putQueryParameter("DealAll", dealAll);
            this.dealAll = dealAll;
            return this;
        }

        /**
         * <p>The IDs of alert events.</p>
         * <p>This parameter is required.</p>
         */
        public Builder eventIds(java.util.List<Long> eventIds) {
            this.putQueryParameter("EventIds", eventIds);
            this.eventIds = eventIds;
            return this;
        }

        /**
         * <p>The operation that you want to perform on the alert events. Valid values:</p>
         * <ul>
         * <li><strong>mark_mis_info</strong>: marks the alert events as false positives</li>
         * <li><strong>rm_mark_mis_info</strong>: cancels marking the alerts events as false positives</li>
         * <li><strong>offline_handled</strong>: marks the alert events as handled offline</li>
         * <li><strong>whitelist</strong>: adds the alert events to the whitelist</li>
         * <li><strong>rm_whitelist</strong>: cancels adding the alert events to the whitelist</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>whitelist</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        @Override
        public OperateWebLockFileEventsRequest build() {
            return new OperateWebLockFileEventsRequest(this);
        } 

    } 

}
