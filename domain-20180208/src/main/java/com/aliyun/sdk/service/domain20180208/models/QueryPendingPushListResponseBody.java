// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link QueryPendingPushListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPendingPushListResponseBody</p>
 */
public class QueryPendingPushListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryPendingPushListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPendingPushListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private Long httpStatusCode; 
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryPendingPushListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>RAM鉴权失败时的标准化错误详情，JSON字符串，包含NoPermissionType、PolicyType、AuthPrincipalType、EncodedDiagnosticMessage等字段</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AuthAction&quot;:&quot;domain:QueryPendingPushList&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>是否允许重试</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>HTTP状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>本次返回的最大记录条数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>业务数据模块</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>获取下一页需用到的凭证</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lESTRpd5hnHNnmKOP/+w9F</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>唯一请求识别码</p>
         * 
         * <strong>example:</strong>
         * <p>2DEDFF32-7827-46B1-BE90-3DB8ABD91A58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>是否调用成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPendingPushListResponseBody build() {
            return new QueryPendingPushListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPendingPushListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPendingPushListResponseBody</p>
     */
    public static class PushList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainCount")
        private Integer domainCount;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("OutBizId")
        private String outBizId;

        @com.aliyun.core.annotation.NameInMap("PushNo")
        private String pushNo;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("SellerRemark")
        private String sellerRemark;

        @com.aliyun.core.annotation.NameInMap("TradeMoney")
        private String tradeMoney;

        private PushList(Builder builder) {
            this.domainCount = builder.domainCount;
            this.domainList = builder.domainList;
            this.expireTime = builder.expireTime;
            this.outBizId = builder.outBizId;
            this.pushNo = builder.pushNo;
            this.pushTime = builder.pushTime;
            this.sellerRemark = builder.sellerRemark;
            this.tradeMoney = builder.tradeMoney;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushList create() {
            return builder().build();
        }

        /**
         * @return domainCount
         */
        public Integer getDomainCount() {
            return this.domainCount;
        }

        /**
         * @return domainList
         */
        public String getDomainList() {
            return this.domainList;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return outBizId
         */
        public String getOutBizId() {
            return this.outBizId;
        }

        /**
         * @return pushNo
         */
        public String getPushNo() {
            return this.pushNo;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return sellerRemark
         */
        public String getSellerRemark() {
            return this.sellerRemark;
        }

        /**
         * @return tradeMoney
         */
        public String getTradeMoney() {
            return this.tradeMoney;
        }

        public static final class Builder {
            private Integer domainCount; 
            private String domainList; 
            private String expireTime; 
            private String outBizId; 
            private String pushNo; 
            private String pushTime; 
            private String sellerRemark; 
            private String tradeMoney; 

            private Builder() {
            } 

            private Builder(PushList model) {
                this.domainCount = model.domainCount;
                this.domainList = model.domainList;
                this.expireTime = model.expireTime;
                this.outBizId = model.outBizId;
                this.pushNo = model.pushNo;
                this.pushTime = model.pushTime;
                this.sellerRemark = model.sellerRemark;
                this.tradeMoney = model.tradeMoney;
            } 

            /**
             * <p>本次Push包含的域名数量</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder domainCount(Integer domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * <p>域名列表，逗号分隔摘要</p>
             * 
             * <strong>example:</strong>
             * <p>example.com,test.net</p>
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>超过该时间未操作将自动关闭</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-08T10:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>卖家发起时指定，用于双方业务关联</p>
             * 
             * <strong>example:</strong>
             * <p>biz_order_001</p>
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * <p>Push编号</p>
             * 
             * <strong>example:</strong>
             * <p>push_20250101_abc123</p>
             */
            public Builder pushNo(String pushNo) {
                this.pushNo = pushNo;
                return this;
            }

            /**
             * <p>Push发起时间</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T10:00:00Z</p>
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * <p>卖家发起Push时填写的备注信息</p>
             * 
             * <strong>example:</strong>
             * <p>代持域名转移，请尽快处理</p>
             */
            public Builder sellerRemark(String sellerRemark) {
                this.sellerRemark = sellerRemark;
                return this;
            }

            /**
             * <p>交易金额，0表示免费Push</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tradeMoney(String tradeMoney) {
                this.tradeMoney = tradeMoney;
                return this;
            }

            public PushList build() {
                return new PushList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPendingPushListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPendingPushListResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PushList")
        private java.util.List<PushList> pushList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Module(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pushList = builder.pushList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pushList
         */
        public java.util.List<PushList> getPushList() {
            return this.pushList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNum; 
            private Integer pageSize; 
            private java.util.List<PushList> pushList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pushList = model.pushList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>当前页码</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>每页大小</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>待接收Push列表</p>
             */
            public Builder pushList(java.util.List<PushList> pushList) {
                this.pushList = pushList;
                return this;
            }

            /**
             * <p>满足条件的总记录数</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
