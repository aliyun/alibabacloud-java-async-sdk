// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstanceRamRoleResponseBody} extends {@link TeaModel}
 *
 * <p>AttachInstanceRamRoleResponseBody</p>
 */
public class AttachInstanceRamRoleResponseBody extends TeaModel {
    @NameInMap("AttachInstanceRamRoleResults")
    private AttachInstanceRamRoleResults attachInstanceRamRoleResults;

    @NameInMap("FailCount")
    private Integer failCount;

    @NameInMap("RamRoleName")
    private String ramRoleName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private AttachInstanceRamRoleResponseBody(Builder builder) {
        this.attachInstanceRamRoleResults = builder.attachInstanceRamRoleResults;
        this.failCount = builder.failCount;
        this.ramRoleName = builder.ramRoleName;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstanceRamRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return attachInstanceRamRoleResults
     */
    public AttachInstanceRamRoleResults getAttachInstanceRamRoleResults() {
        return this.attachInstanceRamRoleResults;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AttachInstanceRamRoleResults attachInstanceRamRoleResults; 
        private Integer failCount; 
        private String ramRoleName; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the results of attaching the instance RAM role.
         */
        public Builder attachInstanceRamRoleResults(AttachInstanceRamRoleResults attachInstanceRamRoleResults) {
            this.attachInstanceRamRoleResults = attachInstanceRamRoleResults;
            return this;
        }

        /**
         * The number of the instances to which the instance RAM role failed to be attached.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * The name of the instance RAM role.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of instances to which you attempted to attach the instance RAM role.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public AttachInstanceRamRoleResponseBody build() {
            return new AttachInstanceRamRoleResponseBody(this);
        } 

    } 

    public static class AttachInstanceRamRoleResult extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
        private Boolean success;

        private AttachInstanceRamRoleResult(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachInstanceRamRoleResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String instanceId; 
            private String message; 
            private Boolean success; 

            /**
             * Indicates whether the instance RAM role was attached. If the instance RAM role was attached, 200 is returned. If the instance RAM role failed to be attached, any other value is returned. For more information, see the "Error codes" section.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the instance RAM role was attached. If the instance RAM role was attached, success is returned. If the instance RAM role failed to be attached, any other value is returned. For more information, see the "Error codes" section.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Indicates whether the instance RAM role was attached.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public AttachInstanceRamRoleResult build() {
                return new AttachInstanceRamRoleResult(this);
            } 

        } 

    }
    public static class AttachInstanceRamRoleResults extends TeaModel {
        @NameInMap("AttachInstanceRamRoleResult")
        private java.util.List < AttachInstanceRamRoleResult> attachInstanceRamRoleResult;

        private AttachInstanceRamRoleResults(Builder builder) {
            this.attachInstanceRamRoleResult = builder.attachInstanceRamRoleResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachInstanceRamRoleResults create() {
            return builder().build();
        }

        /**
         * @return attachInstanceRamRoleResult
         */
        public java.util.List < AttachInstanceRamRoleResult> getAttachInstanceRamRoleResult() {
            return this.attachInstanceRamRoleResult;
        }

        public static final class Builder {
            private java.util.List < AttachInstanceRamRoleResult> attachInstanceRamRoleResult; 

            /**
             * AttachInstanceRamRoleResult.
             */
            public Builder attachInstanceRamRoleResult(java.util.List < AttachInstanceRamRoleResult> attachInstanceRamRoleResult) {
                this.attachInstanceRamRoleResult = attachInstanceRamRoleResult;
                return this;
            }

            public AttachInstanceRamRoleResults build() {
                return new AttachInstanceRamRoleResults(this);
            } 

        } 

    }
}
