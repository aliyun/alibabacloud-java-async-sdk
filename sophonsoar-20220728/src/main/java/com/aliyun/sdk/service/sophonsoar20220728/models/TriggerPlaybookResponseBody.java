// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link TriggerPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>TriggerPlaybookResponseBody</p>
 */
public class TriggerPlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TriggerUuid")
    private String triggerUuid;

    private TriggerPlaybookResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.triggerUuid = builder.triggerUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerPlaybookResponseBody create() {
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
     * @return triggerUuid
     */
    public String getTriggerUuid() {
        return this.triggerUuid;
    }

    public static final class Builder {
        private String requestId; 
        private String triggerUuid; 

        private Builder() {
        } 

        private Builder(TriggerPlaybookResponseBody model) {
            this.requestId = model.requestId;
            this.triggerUuid = model.triggerUuid;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD5A8DB6-A42C-532B-BCE8-83E69550CD59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The running UUID of the playbook. This parameter is used to query the running result of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>55E63C57-D6C8-5036-A770-5CB10AC807AA</p>
         */
        public Builder triggerUuid(String triggerUuid) {
            this.triggerUuid = triggerUuid;
            return this;
        }

        public TriggerPlaybookResponseBody build() {
            return new TriggerPlaybookResponseBody(this);
        } 

    } 

}
