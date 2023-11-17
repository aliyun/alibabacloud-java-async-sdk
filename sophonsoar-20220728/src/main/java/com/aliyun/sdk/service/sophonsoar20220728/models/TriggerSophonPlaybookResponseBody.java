// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerSophonPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>TriggerSophonPlaybookResponseBody</p>
 */
public class TriggerSophonPlaybookResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TriggerSophonPlaybookResponseBody build() {
            return new TriggerSophonPlaybookResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("SophonTaskId")
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

            /**
             * SophonTaskId.
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
