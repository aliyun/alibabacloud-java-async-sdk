// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransferableSkillGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransferableSkillGroupsResponseBody</p>
 */
public class ListTransferableSkillGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SkillGroups")
    private java.util.List < SkillGroups> skillGroups;

    @NameInMap("Success")
    private Boolean success;

    private ListTransferableSkillGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.skillGroups = builder.skillGroups;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransferableSkillGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return skillGroups
     */
    public java.util.List < SkillGroups> getSkillGroups() {
        return this.skillGroups;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List < SkillGroups> skillGroups; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * SkillGroups.
         */
        public Builder skillGroups(java.util.List < SkillGroups> skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTransferableSkillGroupsResponseBody build() {
            return new ListTransferableSkillGroupsResponseBody(this);
        } 

    } 

    public static class SkillGroups extends TeaModel {
        @NameInMap("AccQueueName")
        private String accQueueName;

        @NameInMap("AccSkillGroupName")
        private String accSkillGroupName;

        @NameInMap("AllowPrivateOutboundNumber")
        private Boolean allowPrivateOutboundNumber;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RoutingStrategy")
        private String routingStrategy;

        @NameInMap("SkillGroupDescription")
        private String skillGroupDescription;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("SkillGroupName")
        private String skillGroupName;

        @NameInMap("UserCount")
        private Integer userCount;

        private SkillGroups(Builder builder) {
            this.accQueueName = builder.accQueueName;
            this.accSkillGroupName = builder.accSkillGroupName;
            this.allowPrivateOutboundNumber = builder.allowPrivateOutboundNumber;
            this.instanceId = builder.instanceId;
            this.routingStrategy = builder.routingStrategy;
            this.skillGroupDescription = builder.skillGroupDescription;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroups create() {
            return builder().build();
        }

        /**
         * @return accQueueName
         */
        public String getAccQueueName() {
            return this.accQueueName;
        }

        /**
         * @return accSkillGroupName
         */
        public String getAccSkillGroupName() {
            return this.accSkillGroupName;
        }

        /**
         * @return allowPrivateOutboundNumber
         */
        public Boolean getAllowPrivateOutboundNumber() {
            return this.allowPrivateOutboundNumber;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return routingStrategy
         */
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        /**
         * @return skillGroupDescription
         */
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private String accQueueName; 
            private String accSkillGroupName; 
            private Boolean allowPrivateOutboundNumber; 
            private String instanceId; 
            private String routingStrategy; 
            private String skillGroupDescription; 
            private String skillGroupId; 
            private String skillGroupName; 
            private Integer userCount; 

            /**
             * AccQueueName.
             */
            public Builder accQueueName(String accQueueName) {
                this.accQueueName = accQueueName;
                return this;
            }

            /**
             * AccSkillGroupName.
             */
            public Builder accSkillGroupName(String accSkillGroupName) {
                this.accSkillGroupName = accSkillGroupName;
                return this;
            }

            /**
             * AllowPrivateOutboundNumber.
             */
            public Builder allowPrivateOutboundNumber(Boolean allowPrivateOutboundNumber) {
                this.allowPrivateOutboundNumber = allowPrivateOutboundNumber;
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
             * RoutingStrategy.
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
                return this;
            }

            /**
             * SkillGroupDescription.
             */
            public Builder skillGroupDescription(String skillGroupDescription) {
                this.skillGroupDescription = skillGroupDescription;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            public SkillGroups build() {
                return new SkillGroups(this);
            } 

        } 

    }
}
