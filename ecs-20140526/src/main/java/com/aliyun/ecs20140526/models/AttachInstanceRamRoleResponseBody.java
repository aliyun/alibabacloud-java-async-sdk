// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("FailCount")
    private Integer failCount;

    @NameInMap("AttachInstanceRamRoleResults")
    private AttachInstanceRamRoleResults attachInstanceRamRoleResults;

    private AttachInstanceRamRoleResponseBody(Builder builder) {
        this.ramRoleName = builder.ramRoleName;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.failCount = builder.failCount;
        this.attachInstanceRamRoleResults = builder.attachInstanceRamRoleResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstanceRamRoleResponseBody create() {
        return builder().build();
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

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return attachInstanceRamRoleResults
     */
    public AttachInstanceRamRoleResults getAttachInstanceRamRoleResults() {
        return this.attachInstanceRamRoleResults;
    }

    public static final class Builder {
        private String ramRoleName; 
        private String requestId; 
        private Integer totalCount; 
        private Integer failCount; 
        private AttachInstanceRamRoleResults attachInstanceRamRoleResults; 

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
         * The total number of RAM roles granted to the instance.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of failures to grant the instance RAM role.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * The information set of the instance RAM role type (AttachInstanceRamRoleResult).
         */
        public Builder attachInstanceRamRoleResults(AttachInstanceRamRoleResults attachInstanceRamRoleResults) {
            this.attachInstanceRamRoleResults = attachInstanceRamRoleResults;
            return this;
        }

        public AttachInstanceRamRoleResponseBody build() {
            return new AttachInstanceRamRoleResponseBody(this);
        } 

    } 

    public static class AttachInstanceRamRoleResult extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Success")
        private Boolean success;

        private AttachInstanceRamRoleResult(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.instanceId = builder.instanceId;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private String instanceId; 
            private Boolean success; 

            /**
             * Determines whether the instance RAM role is granted. A value of 200 indicates that the application is successfully granted. A value other than 200 indicates that the application fails. For more information, see error codes.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Determines whether the instance RAM role is granted. If the return value is Success, the authorization is successful. If the return value is other, the authorization fails. For more information, see error codes.
             */
            public Builder message(String message) {
                this.message = message;
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
             * Indicates whether the instance RAM role is granted.
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
