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
 * {@link BatchQueryReceivedPushStatusResponseBody} extends {@link TeaModel}
 *
 * <p>BatchQueryReceivedPushStatusResponseBody</p>
 */
public class BatchQueryReceivedPushStatusResponseBody extends TeaModel {
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

    private BatchQueryReceivedPushStatusResponseBody(Builder builder) {
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

    public static BatchQueryReceivedPushStatusResponseBody create() {
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

        private Builder(BatchQueryReceivedPushStatusResponseBody model) {
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
         * <p>{&quot;AuthAction&quot;:&quot;domain:BatchQueryReceivedPushStatus&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;}</p>
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
         * <p>50</p>
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
         * <p>12jkeb1</p>
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

        public BatchQueryReceivedPushStatusResponseBody build() {
            return new BatchQueryReceivedPushStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchQueryReceivedPushStatusResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryReceivedPushStatusResponseBody</p>
     */
    public static class PushResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainList")
        private String domainList;

        @com.aliyun.core.annotation.NameInMap("OutBizId")
        private String outBizId;

        @com.aliyun.core.annotation.NameInMap("PushNo")
        private String pushNo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        private PushResults(Builder builder) {
            this.domainList = builder.domainList;
            this.outBizId = builder.outBizId;
            this.pushNo = builder.pushNo;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResults create() {
            return builder().build();
        }

        /**
         * @return domainList
         */
        public String getDomainList() {
            return this.domainList;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private String domainList; 
            private String outBizId; 
            private String pushNo; 
            private String status; 
            private String statusDesc; 

            private Builder() {
            } 

            private Builder(PushResults model) {
                this.domainList = model.domainList;
                this.outBizId = model.outBizId;
                this.pushNo = model.pushNo;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
            } 

            /**
             * <p>域名列表，逗号分隔</p>
             * 
             * <strong>example:</strong>
             * <p>example.com,test.net</p>
             */
            public Builder domainList(String domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>外部业务ID，卖家发起时指定</p>
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
             * <p>枚举值：PENDING（待接收）、ACCEPTED（已接收）、REJECTED（已拒绝）、EXPIRED（已过期）、CANCELLED（已取消）</p>
             * 
             * <strong>example:</strong>
             * <p>ACCEPTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>状态描述，买家视角</p>
             * 
             * <strong>example:</strong>
             * <p>已接收</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public PushResults build() {
                return new PushResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchQueryReceivedPushStatusResponseBody} extends {@link TeaModel}
     *
     * <p>BatchQueryReceivedPushStatusResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushResults")
        private java.util.List<PushResults> pushResults;

        private Module(Builder builder) {
            this.pushResults = builder.pushResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return pushResults
         */
        public java.util.List<PushResults> getPushResults() {
            return this.pushResults;
        }

        public static final class Builder {
            private java.util.List<PushResults> pushResults; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.pushResults = model.pushResults;
            } 

            /**
             * <p>Push接收状态结果列表</p>
             */
            public Builder pushResults(java.util.List<PushResults> pushResults) {
                this.pushResults = pushResults;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
