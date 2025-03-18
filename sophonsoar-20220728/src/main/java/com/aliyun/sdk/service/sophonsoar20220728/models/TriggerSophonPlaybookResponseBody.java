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
 * {@link TriggerSophonPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>TriggerSophonPlaybookResponseBody</p>
 */
public class TriggerSophonPlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TriggerSophonPlaybookResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerSophonPlaybookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TriggerSophonPlaybookResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details that is returned after the command or playbook is triggered.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0DFC9403-54EB-5672-B690-9AA93C9EBB54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TriggerSophonPlaybookResponseBody build() {
            return new TriggerSophonPlaybookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TriggerSophonPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>TriggerSophonPlaybookResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SophonTaskId")
        private String sophonTaskId;

        private Data(Builder builder) {
            this.sophonTaskId = builder.sophonTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sophonTaskId
         */
        public String getSophonTaskId() {
            return this.sophonTaskId;
        }

        public static final class Builder {
            private String sophonTaskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sophonTaskId = model.sophonTaskId;
            } 

            /**
             * <p>The custom ID. If you do not specify this parameter when the playbook is triggered, a random ID is generated for fault locating and troubleshooting.</p>
             * 
             * <strong>example:</strong>
             * <p>a7c6d055-a72f-4676-bc89-3cd9edc0284c</p>
             */
            public Builder sophonTaskId(String sophonTaskId) {
                this.sophonTaskId = sophonTaskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
