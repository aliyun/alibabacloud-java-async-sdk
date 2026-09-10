// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarAgentUserSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarAgentUserSessionsResponseBody</p>
 */
public class DescribePolarAgentUserSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolarAgentUserSessionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarAgentUserSessionsResponseBody create() {
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

        private Builder(DescribePolarAgentUserSessionsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result set.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E2FDB684-751D-424D-98B9-704BEA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolarAgentUserSessionsResponseBody build() {
            return new DescribePolarAgentUserSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarAgentUserSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarAgentUserSessionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private Long sessionStatus;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.sessionId = builder.sessionId;
            this.sessionStatus = builder.sessionStatus;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sessionStatus
         */
        public Long getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String sessionId; 
            private Long sessionStatus; 
            private String title; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sessionId = model.sessionId;
                this.sessionStatus = model.sessionStatus;
                this.title = model.title;
            } 

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>01IC17MLISBB98SL345H7B5AES1E8VB1</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The status of the session. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: Active</p>
             * </li>
             * <li><p><strong>0</strong>: Closed</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sessionStatus(Long sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * <p>The content.</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
