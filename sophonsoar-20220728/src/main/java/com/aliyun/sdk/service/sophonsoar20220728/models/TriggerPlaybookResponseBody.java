// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>TriggerPlaybookResponseBody</p>
 */
public class TriggerPlaybookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TriggerUuid")
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

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The running UUID of the playbook. This parameter is used to query the running result of the playbook.
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
