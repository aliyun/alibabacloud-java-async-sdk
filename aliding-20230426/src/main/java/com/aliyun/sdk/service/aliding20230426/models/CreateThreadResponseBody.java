// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateThreadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateThreadResponseBody</p>
 */
public class CreateThreadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("thread")
    private Thread thread;

    private CreateThreadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.thread = builder.thread;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThreadResponseBody create() {
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
     * @return thread
     */
    public Thread getThread() {
        return this.thread;
    }

    public static final class Builder {
        private String requestId; 
        private Thread thread; 

        private Builder() {
        } 

        private Builder(CreateThreadResponseBody model) {
            this.requestId = model.requestId;
            this.thread = model.thread;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * thread.
         */
        public Builder thread(Thread thread) {
            this.thread = thread;
            return this;
        }

        public CreateThreadResponseBody build() {
            return new CreateThreadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateThreadResponseBody} extends {@link TeaModel}
     *
     * <p>CreateThreadResponseBody</p>
     */
    public static class Thread extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createAt")
        private Long createAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        private Thread(Builder builder) {
            this.createAt = builder.createAt;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thread create() {
            return builder().build();
        }

        /**
         * @return createAt
         */
        public Long getCreateAt() {
            return this.createAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private Long createAt; 
            private String id; 

            private Builder() {
            } 

            private Builder(Thread model) {
                this.createAt = model.createAt;
                this.id = model.id;
            } 

            /**
             * createAt.
             */
            public Builder createAt(Long createAt) {
                this.createAt = createAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Thread build() {
                return new Thread(this);
            } 

        } 

    }
}
