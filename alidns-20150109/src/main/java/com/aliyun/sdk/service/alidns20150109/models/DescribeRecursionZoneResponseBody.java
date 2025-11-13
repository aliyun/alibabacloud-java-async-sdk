// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeRecursionZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecursionZoneResponseBody</p>
 */
public class DescribeRecursionZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("CreatorSubType")
    private String creatorSubType;

    @com.aliyun.core.annotation.NameInMap("CreatorType")
    private String creatorType;

    @com.aliyun.core.annotation.NameInMap("EffectiveScopes")
    private EffectiveScopes effectiveScopes;

    @com.aliyun.core.annotation.NameInMap("ProxyPattern")
    private String proxyPattern;

    @com.aliyun.core.annotation.NameInMap("RecordCount")
    private Integer recordCount;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private DescribeRecursionZoneResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.creator = builder.creator;
        this.creatorSubType = builder.creatorSubType;
        this.creatorType = builder.creatorType;
        this.effectiveScopes = builder.effectiveScopes;
        this.proxyPattern = builder.proxyPattern;
        this.recordCount = builder.recordCount;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
        this.userId = builder.userId;
        this.zoneId = builder.zoneId;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecursionZoneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return creatorSubType
     */
    public String getCreatorSubType() {
        return this.creatorSubType;
    }

    /**
     * @return creatorType
     */
    public String getCreatorType() {
        return this.creatorType;
    }

    /**
     * @return effectiveScopes
     */
    public EffectiveScopes getEffectiveScopes() {
        return this.effectiveScopes;
    }

    /**
     * @return proxyPattern
     */
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    /**
     * @return recordCount
     */
    public Integer getRecordCount() {
        return this.recordCount;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder {
        private String createTime; 
        private Long createTimestamp; 
        private String creator; 
        private String creatorSubType; 
        private String creatorType; 
        private EffectiveScopes effectiveScopes; 
        private String proxyPattern; 
        private Integer recordCount; 
        private String remark; 
        private String requestId; 
        private String updateTime; 
        private Long updateTimestamp; 
        private String userId; 
        private String zoneId; 
        private String zoneName; 

        private Builder() {
        } 

        private Builder(DescribeRecursionZoneResponseBody model) {
            this.createTime = model.createTime;
            this.createTimestamp = model.createTimestamp;
            this.creator = model.creator;
            this.creatorSubType = model.creatorSubType;
            this.creatorType = model.creatorType;
            this.effectiveScopes = model.effectiveScopes;
            this.proxyPattern = model.proxyPattern;
            this.recordCount = model.recordCount;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.updateTime = model.updateTime;
            this.updateTimestamp = model.updateTimestamp;
            this.userId = model.userId;
            this.zoneId = model.zoneId;
            this.zoneName = model.zoneName;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * CreatorSubType.
         */
        public Builder creatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }

        /**
         * CreatorType.
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * EffectiveScopes.
         */
        public Builder effectiveScopes(EffectiveScopes effectiveScopes) {
            this.effectiveScopes = effectiveScopes;
            return this;
        }

        /**
         * ProxyPattern.
         */
        public Builder proxyPattern(String proxyPattern) {
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * RecordCount.
         */
        public Builder recordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        public DescribeRecursionZoneResponseBody build() {
            return new DescribeRecursionZoneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecursionZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecursionZoneResponseBody</p>
     */
    public static class Scopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Scope")
        private java.util.List<String> scope;

        private Scopes(Builder builder) {
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scopes create() {
            return builder().build();
        }

        /**
         * @return scope
         */
        public java.util.List<String> getScope() {
            return this.scope;
        }

        public static final class Builder {
            private java.util.List<String> scope; 

            private Builder() {
            } 

            private Builder(Scopes model) {
                this.scope = model.scope;
            } 

            /**
             * Scope.
             */
            public Builder scope(java.util.List<String> scope) {
                this.scope = scope;
                return this;
            }

            public Scopes build() {
                return new Scopes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecursionZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecursionZoneResponseBody</p>
     */
    public static class EffectiveScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveType")
        private String effectiveType;

        @com.aliyun.core.annotation.NameInMap("Scopes")
        private Scopes scopes;

        private EffectiveScope(Builder builder) {
            this.effectiveType = builder.effectiveType;
            this.scopes = builder.scopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveScope create() {
            return builder().build();
        }

        /**
         * @return effectiveType
         */
        public String getEffectiveType() {
            return this.effectiveType;
        }

        /**
         * @return scopes
         */
        public Scopes getScopes() {
            return this.scopes;
        }

        public static final class Builder {
            private String effectiveType; 
            private Scopes scopes; 

            private Builder() {
            } 

            private Builder(EffectiveScope model) {
                this.effectiveType = model.effectiveType;
                this.scopes = model.scopes;
            } 

            /**
             * EffectiveType.
             */
            public Builder effectiveType(String effectiveType) {
                this.effectiveType = effectiveType;
                return this;
            }

            /**
             * Scopes.
             */
            public Builder scopes(Scopes scopes) {
                this.scopes = scopes;
                return this;
            }

            public EffectiveScope build() {
                return new EffectiveScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRecursionZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecursionZoneResponseBody</p>
     */
    public static class EffectiveScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveScope")
        private java.util.List<EffectiveScope> effectiveScope;

        private EffectiveScopes(Builder builder) {
            this.effectiveScope = builder.effectiveScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveScopes create() {
            return builder().build();
        }

        /**
         * @return effectiveScope
         */
        public java.util.List<EffectiveScope> getEffectiveScope() {
            return this.effectiveScope;
        }

        public static final class Builder {
            private java.util.List<EffectiveScope> effectiveScope; 

            private Builder() {
            } 

            private Builder(EffectiveScopes model) {
                this.effectiveScope = model.effectiveScope;
            } 

            /**
             * EffectiveScope.
             */
            public Builder effectiveScope(java.util.List<EffectiveScope> effectiveScope) {
                this.effectiveScope = effectiveScope;
                return this;
            }

            public EffectiveScopes build() {
                return new EffectiveScopes(this);
            } 

        } 

    }
}
