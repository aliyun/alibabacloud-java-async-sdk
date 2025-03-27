// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeFreeUserEventTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFreeUserEventTypesResponseBody</p>
 */
public class DescribeFreeUserEventTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFreeUserEventTypesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFreeUserEventTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFreeUserEventTypesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The types of security events on which basic detection is performed.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B9D6AD11-DD3D-5A27-B1D9-8A37F7777196</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFreeUserEventTypesResponseBody build() {
            return new DescribeFreeUserEventTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFreeUserEventTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFreeUserEventTypesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventNum")
        private String eventNum;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        private Data(Builder builder) {
            this.eventNum = builder.eventNum;
            this.eventType = builder.eventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventNum
         */
        public String getEventNum() {
            return this.eventNum;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        public static final class Builder {
            private String eventNum; 
            private String eventType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventNum = model.eventNum;
                this.eventType = model.eventType;
            } 

            /**
             * <p>The number of security events.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder eventNum(String eventNum) {
                this.eventNum = eventNum;
                return this;
            }

            /**
             * <p>The type of the security event.</p>
             * 
             * <strong>example:</strong>
             * <p>SMSInterfaceAbuse</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
