// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListTransferableSkillGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransferableSkillGroupsResponseBody</p>
 */
public class ListTransferableSkillGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillGroups")
    private java.util.List<SkillGroups> skillGroups;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<SkillGroups> getSkillGroups() {
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
        private java.util.List<SkillGroups> skillGroups; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTransferableSkillGroupsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.skillGroups = model.skillGroups;
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
        public Builder skillGroups(java.util.List<SkillGroups> skillGroups) {
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

    /**
     * 
     * {@link ListTransferableSkillGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransferableSkillGroupsResponseBody</p>
     */
    public static class SkillGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccQueueName")
        private String accQueueName;

        @com.aliyun.core.annotation.NameInMap("AccSkillGroupName")
        private String accSkillGroupName;

        @com.aliyun.core.annotation.NameInMap("AllowPrivateOutboundNumber")
        private Boolean allowPrivateOutboundNumber;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
        private String routingStrategy;

        @com.aliyun.core.annotation.NameInMap("SkillGroupDescription")
        private String skillGroupDescription;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        @com.aliyun.core.annotation.NameInMap("UserCount")
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

            private Builder() {
            } 

            private Builder(SkillGroups model) {
                this.accQueueName = model.accQueueName;
                this.accSkillGroupName = model.accSkillGroupName;
                this.allowPrivateOutboundNumber = model.allowPrivateOutboundNumber;
                this.instanceId = model.instanceId;
                this.routingStrategy = model.routingStrategy;
                this.skillGroupDescription = model.skillGroupDescription;
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
                this.userCount = model.userCount;
            } 

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
