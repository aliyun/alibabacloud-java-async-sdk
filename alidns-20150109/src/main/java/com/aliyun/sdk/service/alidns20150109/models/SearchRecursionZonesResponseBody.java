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
 * {@link SearchRecursionZonesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchRecursionZonesResponseBody</p>
 */
public class SearchRecursionZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private Zones zones;

    private SearchRecursionZonesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchRecursionZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    /**
     * @return zones
     */
    public Zones getZones() {
        return this.zones;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 
        private Zones zones; 

        private Builder() {
        } 

        private Builder(SearchRecursionZonesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
            this.zones = model.zones;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Zones.
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public SearchRecursionZonesResponseBody build() {
            return new SearchRecursionZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchRecursionZonesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchRecursionZonesResponseBody</p>
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
     * {@link SearchRecursionZonesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchRecursionZonesResponseBody</p>
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
     * {@link SearchRecursionZonesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchRecursionZonesResponseBody</p>
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
    /**
     * 
     * {@link SearchRecursionZonesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchRecursionZonesResponseBody</p>
     */
    public static class Zone extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private Zone(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.creator = builder.creator;
            this.creatorSubType = builder.creatorSubType;
            this.creatorType = builder.creatorType;
            this.effectiveScopes = builder.effectiveScopes;
            this.proxyPattern = builder.proxyPattern;
            this.recordCount = builder.recordCount;
            this.remark = builder.remark;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
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
            private String updateTime; 
            private Long updateTimestamp; 
            private String zoneId; 
            private String zoneName; 

            private Builder() {
            } 

            private Builder(Zone model) {
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.creator = model.creator;
                this.creatorSubType = model.creatorSubType;
                this.creatorType = model.creatorType;
                this.effectiveScopes = model.effectiveScopes;
                this.proxyPattern = model.proxyPattern;
                this.recordCount = model.recordCount;
                this.remark = model.remark;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
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

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchRecursionZonesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchRecursionZonesResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zone")
        private java.util.List<Zone> zone;

        private Zones(Builder builder) {
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zone
         */
        public java.util.List<Zone> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List<Zone> zone; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.zone = model.zone;
            } 

            /**
             * Zone.
             */
            public Builder zone(java.util.List<Zone> zone) {
                this.zone = zone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}
