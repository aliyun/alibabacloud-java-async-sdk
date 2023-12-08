// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTargetsForPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListTargetsForPolicyResponseBody</p>
 */
public class ListTargetsForPolicyResponseBody extends TeaModel {
    @NameInMap("IsRd")
    private Boolean isRd;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RdId")
    private String rdId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Targets")
    private java.util.List < Targets> targets;

    private ListTargetsForPolicyResponseBody(Builder builder) {
        this.isRd = builder.isRd;
        this.nextToken = builder.nextToken;
        this.rdId = builder.rdId;
        this.requestId = builder.requestId;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTargetsForPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return isRd
     */
    public Boolean getIsRd() {
        return this.isRd;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return rdId
     */
    public String getRdId() {
        return this.rdId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targets
     */
    public java.util.List < Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder {
        private Boolean isRd; 
        private String nextToken; 
        private String rdId; 
        private String requestId; 
        private java.util.List < Targets> targets; 

        /**
         * Indicates whether the object belongs to the resource directory. Valid values:
         * <p>
         * 
         * *   true: The object belongs to the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.
         * *   false: The object does not belong to the resource directory. This value is available if you use the Tag Policy feature in single-account mode.
         */
        public Builder isRd(Boolean isRd) {
            this.isRd = isRd;
            return this;
        }

        /**
         * Indicates whether the next query is required.
         * <p>
         * 
         * *   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.
         * *   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the resource directory.
         * <p>
         * 
         * >  This parameter is returned only if you use the Tag Policy feature in multi-account mode.
         */
        public Builder rdId(String rdId) {
            this.rdId = rdId;
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
         * The objects to which the tag policy is attached.
         */
        public Builder targets(java.util.List < Targets> targets) {
            this.targets = targets;
            return this;
        }

        public ListTargetsForPolicyResponseBody build() {
            return new ListTargetsForPolicyResponseBody(this);
        } 

    } 

    public static class Targets extends TeaModel {
        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetType")
        private Integer targetType;

        private Targets(Builder builder) {
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public Integer getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String targetId; 
            private Integer targetType; 

            /**
             * The ID of the object.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The type of the object. Valid values:
             * <p>
             * 
             * *   USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.
             * *   ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.
             * *   FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.
             * *   ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.
             */
            public Builder targetType(Integer targetType) {
                this.targetType = targetType;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
