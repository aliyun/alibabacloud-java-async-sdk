// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link ConditionBasicInfo} extends {@link TeaModel}
 *
 * <p>ConditionBasicInfo</p>
 */
public class ConditionBasicInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Check_range")
    private CheckRange checkRange;

    @com.aliyun.core.annotation.NameInMap("Cid")
    private String cid;

    @com.aliyun.core.annotation.NameInMap("Exclusion")
    private Integer exclusion;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Lambda")
    private String lambda;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Operators")
    private java.util.List<OperatorBasicInfo> operators;

    @com.aliyun.core.annotation.NameInMap("Rid")
    private String rid;

    @com.aliyun.core.annotation.NameInMap("UserGroup")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<OperatorBasicInfo> getOperators() {
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
        private java.util.List<OperatorBasicInfo> operators; 
        private String rid; 
        private String userGroup; 

        private Builder() {
        } 

        private Builder(ConditionBasicInfo model) {
            this.checkRange = model.checkRange;
            this.cid = model.cid;
            this.exclusion = model.exclusion;
            this.id = model.id;
            this.lambda = model.lambda;
            this.name = model.name;
            this.operators = model.operators;
            this.rid = model.rid;
            this.userGroup = model.userGroup;
        } 

        /**
         * Check_range.
         */
        public Builder checkRange(CheckRange checkRange) {
            this.checkRange = checkRange;
            return this;
        }

        /**
         * Cid.
         */
        public Builder cid(String cid) {
            this.cid = cid;
            return this;
        }

        /**
         * Exclusion.
         */
        public Builder exclusion(Integer exclusion) {
            this.exclusion = exclusion;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Lambda.
         */
        public Builder lambda(String lambda) {
            this.lambda = lambda;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Operators.
         */
        public Builder operators(java.util.List<OperatorBasicInfo> operators) {
            this.operators = operators;
            return this;
        }

        /**
         * Rid.
         */
        public Builder rid(String rid) {
            this.rid = rid;
            return this;
        }

        /**
         * UserGroup.
         */
        public Builder userGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public ConditionBasicInfo build() {
            return new ConditionBasicInfo(this);
        } 

    } 

    /**
     * 
     * {@link ConditionBasicInfo} extends {@link TeaModel}
     *
     * <p>ConditionBasicInfo</p>
     */
    public static class Anchor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private String cid;

        @com.aliyun.core.annotation.NameInMap("Hit_time")
        private Integer hitTime;

        @com.aliyun.core.annotation.NameInMap("Location")
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

            private Builder() {
            } 

            private Builder(Anchor model) {
                this.cid = model.cid;
                this.hitTime = model.hitTime;
                this.location = model.location;
            } 

            /**
             * Cid.
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * Hit_time.
             */
            public Builder hitTime(Integer hitTime) {
                this.hitTime = hitTime;
                return this;
            }

            /**
             * Location.
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
    /**
     * 
     * {@link ConditionBasicInfo} extends {@link TeaModel}
     *
     * <p>ConditionBasicInfo</p>
     */
    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("To")
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

            private Builder() {
            } 

            private Builder(Range model) {
                this.from = model.from;
                this.to = model.to;
            } 

            /**
             * From.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * To.
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
    /**
     * 
     * {@link ConditionBasicInfo} extends {@link TeaModel}
     *
     * <p>ConditionBasicInfo</p>
     */
    public static class CheckRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Absolute")
        private Boolean absolute;

        @com.aliyun.core.annotation.NameInMap("AllSentencesSatisfy")
        private Boolean allSentencesSatisfy;

        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Anchor anchor;

        @com.aliyun.core.annotation.NameInMap("Range")
        private Range range;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("RoleId")
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

            private Builder() {
            } 

            private Builder(CheckRange model) {
                this.absolute = model.absolute;
                this.allSentencesSatisfy = model.allSentencesSatisfy;
                this.anchor = model.anchor;
                this.range = model.range;
                this.role = model.role;
                this.roleId = model.roleId;
            } 

            /**
             * Absolute.
             */
            public Builder absolute(Boolean absolute) {
                this.absolute = absolute;
                return this;
            }

            /**
             * AllSentencesSatisfy.
             */
            public Builder allSentencesSatisfy(Boolean allSentencesSatisfy) {
                this.allSentencesSatisfy = allSentencesSatisfy;
                return this;
            }

            /**
             * Anchor.
             */
            public Builder anchor(Anchor anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(Range range) {
                this.range = range;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * RoleId.
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
