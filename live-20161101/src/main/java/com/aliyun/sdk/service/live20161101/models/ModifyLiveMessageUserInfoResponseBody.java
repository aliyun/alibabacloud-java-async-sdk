// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveMessageUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLiveMessageUserInfoResponseBody</p>
 */
public class ModifyLiveMessageUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailList")
    private java.util.List<FailList> failList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessList")
    private java.util.List<SuccessList> successList;

    private ModifyLiveMessageUserInfoResponseBody(Builder builder) {
        this.failList = builder.failList;
        this.requestId = builder.requestId;
        this.successList = builder.successList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageUserInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failList
     */
    public java.util.List<FailList> getFailList() {
        return this.failList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successList
     */
    public java.util.List<SuccessList> getSuccessList() {
        return this.successList;
    }

    public static final class Builder {
        private java.util.List<FailList> failList; 
        private String requestId; 
        private java.util.List<SuccessList> successList; 

        private Builder() {
        } 

        private Builder(ModifyLiveMessageUserInfoResponseBody model) {
            this.failList = model.failList;
            this.requestId = model.requestId;
            this.successList = model.successList;
        } 

        /**
         * <p>The users whose information failed to be modified.</p>
         */
        public Builder failList(java.util.List<FailList> failList) {
            this.failList = failList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3271ACD2-F143-1204-AFDB-9A87C131****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The users whose information was modified.</p>
         */
        public Builder successList(java.util.List<SuccessList> successList) {
            this.successList = successList;
            return this;
        }

        public ModifyLiveMessageUserInfoResponseBody build() {
            return new ModifyLiveMessageUserInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyLiveMessageUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyLiveMessageUserInfoResponseBody</p>
     */
    public static class FailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private FailList(Builder builder) {
            this.code = builder.code;
            this.groupId = builder.groupId;
            this.reason = builder.reason;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Integer code; 
            private String groupId; 
            private String reason; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(FailList model) {
                this.code = model.code;
                this.groupId = model.groupId;
                this.reason = model.reason;
                this.success = model.success;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>440</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the group to which the user belongs. For failed modification, the information of the user is not updated when you query the users in the group. You can try again after you check the failure reason and fix the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>grouptest2</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The reason why the information of the user failed to be modified.</p>
             * 
             * <strong>example:</strong>
             * <p>group not exists or already deleted</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Indicates whether the group to which the user belongs is modified. In this case, the group is not modified.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public FailList build() {
                return new FailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyLiveMessageUserInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyLiveMessageUserInfoResponseBody</p>
     */
    public static class SuccessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private SuccessList(Builder builder) {
            this.groupId = builder.groupId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String groupId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(SuccessList model) {
                this.groupId = model.groupId;
                this.success = model.success;
            } 

            /**
             * <p>The ID of the group to which the user belongs. For successful modification, the information of the user is updated when you query the users in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>grouptest1</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the group to which the user belongs is modified. In this case, the group is modified.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public SuccessList build() {
                return new SuccessList(this);
            } 

        } 

    }
}
