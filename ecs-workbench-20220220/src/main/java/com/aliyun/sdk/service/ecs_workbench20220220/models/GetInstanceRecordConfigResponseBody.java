// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220.models;

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
 * {@link GetInstanceRecordConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceRecordConfigResponseBody</p>
 */
public class GetInstanceRecordConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private Root root;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceRecordConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.root = builder.root;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceRecordConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return root
     */
    public Root getRoot() {
        return this.root;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Root root; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceRecordConfigResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.root = model.root;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Root.
         */
        public Builder root(Root root) {
            this.root = root;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceRecordConfigResponseBody build() {
            return new GetInstanceRecordConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceRecordConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceRecordConfigResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpirationDays")
        private Integer expirationDays;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("RecordStorageTarget")
        private String recordStorageTarget;

        private Root(Builder builder) {
            this.expirationDays = builder.expirationDays;
            this.instanceId = builder.instanceId;
            this.parentId = builder.parentId;
            this.recordStorageTarget = builder.recordStorageTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Root create() {
            return builder().build();
        }

        /**
         * @return expirationDays
         */
        public Integer getExpirationDays() {
            return this.expirationDays;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return recordStorageTarget
         */
        public String getRecordStorageTarget() {
            return this.recordStorageTarget;
        }

        public static final class Builder {
            private Integer expirationDays; 
            private String instanceId; 
            private String parentId; 
            private String recordStorageTarget; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.expirationDays = model.expirationDays;
                this.instanceId = model.instanceId;
                this.parentId = model.parentId;
                this.recordStorageTarget = model.recordStorageTarget;
            } 

            /**
             * ExpirationDays.
             */
            public Builder expirationDays(Integer expirationDays) {
                this.expirationDays = expirationDays;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * RecordStorageTarget.
             */
            public Builder recordStorageTarget(String recordStorageTarget) {
                this.recordStorageTarget = recordStorageTarget;
                return this;
            }

            public Root build() {
                return new Root(this);
            } 

        } 

    }
}
