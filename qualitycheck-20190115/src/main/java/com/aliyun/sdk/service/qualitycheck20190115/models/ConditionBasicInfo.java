// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConditionBasicInfo} extends {@link TeaModel}
 *
 * <p>ConditionBasicInfo</p>
 */
public class ConditionBasicInfo extends TeaModel {
    @NameInMap("Check_range")
    private CheckRange checkRange;

    @NameInMap("Cid")
    private String cid;

    @NameInMap("Exclusion")
    private Integer exclusion;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Lambda")
    private String lambda;

    @NameInMap("Name")
    private String name;

    @NameInMap("Operators")
    private java.util.List < OperatorBasicInfo > operators;

    @NameInMap("Rid")
    private String rid;

    @NameInMap("UserGroup")
    private String userGroup;

    private ConditionBasicInfo(Builder builder) {
        this.checkRange = builder.checkRange;
        this.cid = builder.cid;
        this.exclusion = builder.exclusion;
        this.id = builder.id;
        this.lambda = builder.lambda;
        this.name = builder.name;
        this.operators = builder.operators;
        this.rid = builder.rid;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConditionBasicInfo create() {
        return builder().build();
    }

    /**
     * @return checkRange
     */
    public CheckRange getCheckRange() {
        return this.checkRange;
    }

    /**
     * @return cid
     */
    public String getCid() {
        return this.cid;
    }

    /**
     * @return exclusion
     */
    public Integer getExclusion() {
        return this.exclusion;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lambda
     */
    public String getLambda() {
        return this.lambda;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operators
     */
    public java.util.List < OperatorBasicInfo > getOperators() {
        return this.operators;
    }

    /**
     * @return rid
     */
    public String getRid() {
        return this.rid;
    }

    /**
     * @return userGroup
     */
    public String getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder {
        private CheckRange checkRange; 
        private String cid; 
        private Integer exclusion; 
        private Long id; 
        private String lambda; 
        private String name; 
        private java.util.List < OperatorBasicInfo > operators; 
        private String rid; 
        private String userGroup; 

        /**
         * 检测范围
         */
        public Builder checkRange(CheckRange checkRange) {
            this.checkRange = checkRange;
            return this;
        }

        /**
         * 条件id，可能是db中的主键，也可能是转换成的a, b, c
         */
        public Builder cid(String cid) {
            this.cid = cid;
            return this;
        }

        /**
         * 排除
         */
        public Builder exclusion(Integer exclusion) {
            this.exclusion = exclusion;
            return this;
        }

        /**
         * 在db中的主键
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Lambda表达式：例如:a&&b
         */
        public Builder lambda(String lambda) {
            this.lambda = lambda;
            return this;
        }

        /**
         * 条件名
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 算子列表
         */
        public Builder operators(java.util.List < OperatorBasicInfo > operators) {
            this.operators = operators;
            return this;
        }

        /**
         * 条件所属的规则id
         */
        public Builder rid(String rid) {
            this.rid = rid;
            return this;
        }

        /**
         * 用户组
         */
        public Builder userGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public ConditionBasicInfo build() {
            return new ConditionBasicInfo(this);
        } 

    } 

    public static class Anchor extends TeaModel {
        @NameInMap("Cid")
        private String cid;

        @NameInMap("Hit_time")
        private Integer hitTime;

        @NameInMap("Location")
        private String location;

        private Anchor(Builder builder) {
            this.cid = builder.cid;
            this.hitTime = builder.hitTime;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Anchor create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public String getCid() {
            return this.cid;
        }

        /**
         * @return hitTime
         */
        public Integer getHitTime() {
            return this.hitTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String cid; 
            private Integer hitTime; 
            private String location; 

            /**
             * 条件ID
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * 命中次数
             */
            public Builder hitTime(Integer hitTime) {
                this.hitTime = hitTime;
                return this;
            }

            /**
             * 位置
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public Anchor build() {
                return new Anchor(this);
            } 

        } 

    }
    public static class Range extends TeaModel {
        @NameInMap("From")
        private Integer from;

        @NameInMap("To")
        private Integer to;

        private Range(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Integer getTo() {
            return this.to;
        }

        public static final class Builder {
            private Integer from; 
            private Integer to; 

            /**
             * 对话开始索引
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * 对话结束索引
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            public Range build() {
                return new Range(this);
            } 

        } 

    }
    public static class CheckRange extends TeaModel {
        @NameInMap("Absolute")
        private Boolean absolute;

        @NameInMap("AllSentencesSatisfy")
        private Boolean allSentencesSatisfy;

        @NameInMap("Anchor")
        private Anchor anchor;

        @NameInMap("Range")
        private Range range;

        @NameInMap("Role")
        private String role;

        @NameInMap("RoleId")
        private Integer roleId;

        private CheckRange(Builder builder) {
            this.absolute = builder.absolute;
            this.allSentencesSatisfy = builder.allSentencesSatisfy;
            this.anchor = builder.anchor;
            this.range = builder.range;
            this.role = builder.role;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRange create() {
            return builder().build();
        }

        /**
         * @return absolute
         */
        public Boolean getAbsolute() {
            return this.absolute;
        }

        /**
         * @return allSentencesSatisfy
         */
        public Boolean getAllSentencesSatisfy() {
            return this.allSentencesSatisfy;
        }

        /**
         * @return anchor
         */
        public Anchor getAnchor() {
            return this.anchor;
        }

        /**
         * @return range
         */
        public Range getRange() {
            return this.range;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return roleId
         */
        public Integer getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private Boolean absolute; 
            private Boolean allSentencesSatisfy; 
            private Anchor anchor; 
            private Range range; 
            private String role; 
            private Integer roleId; 

            /**
             * false: 相对位置; 会结合anchor以及角色来决定句子位置
             */
            public Builder absolute(Boolean absolute) {
                this.absolute = absolute;
                return this;
            }

            /**
             * true: 每句话都必须满足条件；
             */
            public Builder allSentencesSatisfy(Boolean allSentencesSatisfy) {
                this.allSentencesSatisfy = allSentencesSatisfy;
                return this;
            }

            /**
             * 前置后置条件
             */
            public Builder anchor(Anchor anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * 相对范围
             */
            public Builder range(Range range) {
                this.range = range;
                return this;
            }

            /**
             * 对应 RoleType.type
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 对应 RoleType.id
             */
            public Builder roleId(Integer roleId) {
                this.roleId = roleId;
                return this;
            }

            public CheckRange build() {
                return new CheckRange(this);
            } 

        } 

    }
}
