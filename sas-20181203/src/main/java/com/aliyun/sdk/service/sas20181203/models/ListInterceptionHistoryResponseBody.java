// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterceptionHistoryResponseBody</p>
 */
public class ListInterceptionHistoryResponseBody extends TeaModel {
    @NameInMap("InterceptionHistoryList")
    private java.util.List < InterceptionHistoryList> interceptionHistoryList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListInterceptionHistoryResponseBody(Builder builder) {
        this.interceptionHistoryList = builder.interceptionHistoryList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return interceptionHistoryList
     */
    public java.util.List < InterceptionHistoryList> getInterceptionHistoryList() {
        return this.interceptionHistoryList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InterceptionHistoryList> interceptionHistoryList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * InterceptionHistoryList.
         */
        public Builder interceptionHistoryList(java.util.List < InterceptionHistoryList> interceptionHistoryList) {
            this.interceptionHistoryList = interceptionHistoryList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInterceptionHistoryResponseBody build() {
            return new ListInterceptionHistoryResponseBody(this);
        } 

    } 

    public static class InterceptionHistoryList extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("DstAppName")
        private String dstAppName;

        @NameInMap("DstNamespace")
        private String dstNamespace;

        @NameInMap("DstPort")
        private Long dstPort;

        @NameInMap("DstRuleTargetName")
        private String dstRuleTargetName;

        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InterceptionName")
        private Long interceptionName;

        @NameInMap("InterceptionType")
        private Integer interceptionType;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("RealDstAppName")
        private String realDstAppName;

        @NameInMap("RealDstImageName")
        private String realDstImageName;

        @NameInMap("RealDstNamespace")
        private String realDstNamespace;

        @NameInMap("RealDstPodName")
        private String realDstPodName;

        @NameInMap("RealInterceptionType")
        private Integer realInterceptionType;

        @NameInMap("RealSrcAppName")
        private String realSrcAppName;

        @NameInMap("RealSrcImageName")
        private String realSrcImageName;

        @NameInMap("RealSrcNamespace")
        private String realSrcNamespace;

        @NameInMap("RealSrcPodName")
        private String realSrcPodName;

        @NameInMap("RiskLevel")
        private Long riskLevel;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("SrcAppName")
        private String srcAppName;

        @NameInMap("SrcNamespace")
        private String srcNamespace;

        @NameInMap("SrcRuleTargetName")
        private String srcRuleTargetName;

        @NameInMap("Status")
        private Long status;

        @NameInMap("TryCount")
        private Integer tryCount;

        private InterceptionHistoryList(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.dstAppName = builder.dstAppName;
            this.dstNamespace = builder.dstNamespace;
            this.dstPort = builder.dstPort;
            this.dstRuleTargetName = builder.dstRuleTargetName;
            this.firstTime = builder.firstTime;
            this.id = builder.id;
            this.interceptionName = builder.interceptionName;
            this.interceptionType = builder.interceptionType;
            this.lastTime = builder.lastTime;
            this.realDstAppName = builder.realDstAppName;
            this.realDstImageName = builder.realDstImageName;
            this.realDstNamespace = builder.realDstNamespace;
            this.realDstPodName = builder.realDstPodName;
            this.realInterceptionType = builder.realInterceptionType;
            this.realSrcAppName = builder.realSrcAppName;
            this.realSrcImageName = builder.realSrcImageName;
            this.realSrcNamespace = builder.realSrcNamespace;
            this.realSrcPodName = builder.realSrcPodName;
            this.riskLevel = builder.riskLevel;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.srcAppName = builder.srcAppName;
            this.srcNamespace = builder.srcNamespace;
            this.srcRuleTargetName = builder.srcRuleTargetName;
            this.status = builder.status;
            this.tryCount = builder.tryCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InterceptionHistoryList create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return dstAppName
         */
        public String getDstAppName() {
            return this.dstAppName;
        }

        /**
         * @return dstNamespace
         */
        public String getDstNamespace() {
            return this.dstNamespace;
        }

        /**
         * @return dstPort
         */
        public Long getDstPort() {
            return this.dstPort;
        }

        /**
         * @return dstRuleTargetName
         */
        public String getDstRuleTargetName() {
            return this.dstRuleTargetName;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return interceptionName
         */
        public Long getInterceptionName() {
            return this.interceptionName;
        }

        /**
         * @return interceptionType
         */
        public Integer getInterceptionType() {
            return this.interceptionType;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return realDstAppName
         */
        public String getRealDstAppName() {
            return this.realDstAppName;
        }

        /**
         * @return realDstImageName
         */
        public String getRealDstImageName() {
            return this.realDstImageName;
        }

        /**
         * @return realDstNamespace
         */
        public String getRealDstNamespace() {
            return this.realDstNamespace;
        }

        /**
         * @return realDstPodName
         */
        public String getRealDstPodName() {
            return this.realDstPodName;
        }

        /**
         * @return realInterceptionType
         */
        public Integer getRealInterceptionType() {
            return this.realInterceptionType;
        }

        /**
         * @return realSrcAppName
         */
        public String getRealSrcAppName() {
            return this.realSrcAppName;
        }

        /**
         * @return realSrcImageName
         */
        public String getRealSrcImageName() {
            return this.realSrcImageName;
        }

        /**
         * @return realSrcNamespace
         */
        public String getRealSrcNamespace() {
            return this.realSrcNamespace;
        }

        /**
         * @return realSrcPodName
         */
        public String getRealSrcPodName() {
            return this.realSrcPodName;
        }

        /**
         * @return riskLevel
         */
        public Long getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return srcAppName
         */
        public String getSrcAppName() {
            return this.srcAppName;
        }

        /**
         * @return srcNamespace
         */
        public String getSrcNamespace() {
            return this.srcNamespace;
        }

        /**
         * @return srcRuleTargetName
         */
        public String getSrcRuleTargetName() {
            return this.srcRuleTargetName;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return tryCount
         */
        public Integer getTryCount() {
            return this.tryCount;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String dstAppName; 
            private String dstNamespace; 
            private Long dstPort; 
            private String dstRuleTargetName; 
            private Long firstTime; 
            private Long id; 
            private Long interceptionName; 
            private Integer interceptionType; 
            private Long lastTime; 
            private String realDstAppName; 
            private String realDstImageName; 
            private String realDstNamespace; 
            private String realDstPodName; 
            private Integer realInterceptionType; 
            private String realSrcAppName; 
            private String realSrcImageName; 
            private String realSrcNamespace; 
            private String realSrcPodName; 
            private Long riskLevel; 
            private Long ruleId; 
            private String ruleName; 
            private String srcAppName; 
            private String srcNamespace; 
            private String srcRuleTargetName; 
            private Long status; 
            private Integer tryCount; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * DstAppName.
             */
            public Builder dstAppName(String dstAppName) {
                this.dstAppName = dstAppName;
                return this;
            }

            /**
             * DstNamespace.
             */
            public Builder dstNamespace(String dstNamespace) {
                this.dstNamespace = dstNamespace;
                return this;
            }

            /**
             * DstPort.
             */
            public Builder dstPort(Long dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * DstRuleTargetName.
             */
            public Builder dstRuleTargetName(String dstRuleTargetName) {
                this.dstRuleTargetName = dstRuleTargetName;
                return this;
            }

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
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
             * InterceptionName.
             */
            public Builder interceptionName(Long interceptionName) {
                this.interceptionName = interceptionName;
                return this;
            }

            /**
             * InterceptionType.
             */
            public Builder interceptionType(Integer interceptionType) {
                this.interceptionType = interceptionType;
                return this;
            }

            /**
             * LastTime.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * RealDstAppName.
             */
            public Builder realDstAppName(String realDstAppName) {
                this.realDstAppName = realDstAppName;
                return this;
            }

            /**
             * RealDstImageName.
             */
            public Builder realDstImageName(String realDstImageName) {
                this.realDstImageName = realDstImageName;
                return this;
            }

            /**
             * RealDstNamespace.
             */
            public Builder realDstNamespace(String realDstNamespace) {
                this.realDstNamespace = realDstNamespace;
                return this;
            }

            /**
             * RealDstPodName.
             */
            public Builder realDstPodName(String realDstPodName) {
                this.realDstPodName = realDstPodName;
                return this;
            }

            /**
             * RealInterceptionType.
             */
            public Builder realInterceptionType(Integer realInterceptionType) {
                this.realInterceptionType = realInterceptionType;
                return this;
            }

            /**
             * RealSrcAppName.
             */
            public Builder realSrcAppName(String realSrcAppName) {
                this.realSrcAppName = realSrcAppName;
                return this;
            }

            /**
             * RealSrcImageName.
             */
            public Builder realSrcImageName(String realSrcImageName) {
                this.realSrcImageName = realSrcImageName;
                return this;
            }

            /**
             * RealSrcNamespace.
             */
            public Builder realSrcNamespace(String realSrcNamespace) {
                this.realSrcNamespace = realSrcNamespace;
                return this;
            }

            /**
             * RealSrcPodName.
             */
            public Builder realSrcPodName(String realSrcPodName) {
                this.realSrcPodName = realSrcPodName;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(Long riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SrcAppName.
             */
            public Builder srcAppName(String srcAppName) {
                this.srcAppName = srcAppName;
                return this;
            }

            /**
             * SrcNamespace.
             */
            public Builder srcNamespace(String srcNamespace) {
                this.srcNamespace = srcNamespace;
                return this;
            }

            /**
             * SrcRuleTargetName.
             */
            public Builder srcRuleTargetName(String srcRuleTargetName) {
                this.srcRuleTargetName = srcRuleTargetName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TryCount.
             */
            public Builder tryCount(Integer tryCount) {
                this.tryCount = tryCount;
                return this;
            }

            public InterceptionHistoryList build() {
                return new InterceptionHistoryList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
