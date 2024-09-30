// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTargetsForPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListTargetsForPolicyResponseBody</p>
 */
public class ListTargetsForPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsRd")
    private Boolean isRd;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RdId")
    private String rdId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Targets")
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
         * <p>Indicates whether the object belongs to the resource directory. Valid values:</p>
         * <ul>
         * <li>true: The object belongs to the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
         * <li>false: The object does not belong to the resource directory. This value is available if you use the Tag Policy feature in single-account mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isRd(Boolean isRd) {
            this.isRd = isRd;
            return this;
        }

        /**
         * <p>Indicates whether the next query is required.</p>
         * <ul>
         * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
         * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the resource directory.</p>
         * <blockquote>
         * <p> This parameter is returned only if you use the Tag Policy feature in multi-account mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rd-3G****</p>
         */
        public Builder rdId(String rdId) {
            this.rdId = rdId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2EE71C8D-6DB8-56AC-8B05-3D4C0116E6A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The objects to which the tag policy is attached.</p>
         */
        public Builder targets(java.util.List < Targets> targets) {
            this.targets = targets;
            return this;
        }

        public ListTargetsForPolicyResponseBody build() {
            return new ListTargetsForPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTargetsForPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListTargetsForPolicyResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
             * <p>The ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>195320939469****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <ul>
             * <li>USER: the current logon account. This value is available if you use the Tag Policy feature in single-account mode.</li>
             * <li>ROOT: the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * <li>FOLDER: a folder other than the Root folder in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * <li>ACCOUNT: a member in the resource directory. This value is available if you use the Tag Policy feature in multi-account mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACCOUNT</p>
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
