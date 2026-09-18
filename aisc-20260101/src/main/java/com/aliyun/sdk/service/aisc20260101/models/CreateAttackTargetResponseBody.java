// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link CreateAttackTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAttackTargetResponseBody</p>
 */
public class CreateAttackTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAttackTargetResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAttackTargetResponseBody create() {
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

        private Builder(CreateAttackTargetResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The operation result. Upon successful creation, the TargetId of the new scan target is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, used for troubleshooting and log tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAttackTargetResponseBody build() {
            return new CreateAttackTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAttackTargetResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAttackTargetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        private Data(Builder builder) {
            this.targetId = builder.targetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        public static final class Builder {
            private String targetId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.targetId = model.targetId;
            } 

            /**
             * <p>The unique identifier of the created scan target. You can use this value as the TargetId parameter in subsequent calls such as TestConnectivity and scan task creation.</p>
             * 
             * <strong>example:</strong>
             * <p>target-abc123def4567</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
