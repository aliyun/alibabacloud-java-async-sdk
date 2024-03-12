// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceGrantedToExpressConnectRouterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceGrantedToExpressConnectRouterResponseBody</p>
 */
public class DescribeInstanceGrantedToExpressConnectRouterResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("EcrGrantedInstanceList")
    private java.util.List < EcrGrantedInstanceList> ecrGrantedInstanceList;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceGrantedToExpressConnectRouterResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.ecrGrantedInstanceList = builder.ecrGrantedInstanceList;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceGrantedToExpressConnectRouterResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return ecrGrantedInstanceList
     */
    public java.util.List < EcrGrantedInstanceList> getEcrGrantedInstanceList() {
        return this.ecrGrantedInstanceList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List < EcrGrantedInstanceList> ecrGrantedInstanceList; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * EcrGrantedInstanceList.
         */
        public Builder ecrGrantedInstanceList(java.util.List < EcrGrantedInstanceList> ecrGrantedInstanceList) {
            this.ecrGrantedInstanceList = ecrGrantedInstanceList;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBody build() {
            return new DescribeInstanceGrantedToExpressConnectRouterResponseBody(this);
        } 

    } 

    public static class EcrGrantedInstanceList extends TeaModel {
        @NameInMap("EcrId")
        private String ecrId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GrantId")
        private String grantId;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeOwnerBid")
        private String nodeOwnerBid;

        @NameInMap("NodeOwnerUid")
        private Long nodeOwnerUid;

        @NameInMap("NodeRegionId")
        private String nodeRegionId;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Status")
        private String status;

        private EcrGrantedInstanceList(Builder builder) {
            this.ecrId = builder.ecrId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.grantId = builder.grantId;
            this.nodeId = builder.nodeId;
            this.nodeOwnerBid = builder.nodeOwnerBid;
            this.nodeOwnerUid = builder.nodeOwnerUid;
            this.nodeRegionId = builder.nodeRegionId;
            this.nodeType = builder.nodeType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcrGrantedInstanceList create() {
            return builder().build();
        }

        /**
         * @return ecrId
         */
        public String getEcrId() {
            return this.ecrId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return grantId
         */
        public String getGrantId() {
            return this.grantId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeOwnerBid
         */
        public String getNodeOwnerBid() {
            return this.nodeOwnerBid;
        }

        /**
         * @return nodeOwnerUid
         */
        public Long getNodeOwnerUid() {
            return this.nodeOwnerUid;
        }

        /**
         * @return nodeRegionId
         */
        public String getNodeRegionId() {
            return this.nodeRegionId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ecrId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String grantId; 
            private String nodeId; 
            private String nodeOwnerBid; 
            private Long nodeOwnerUid; 
            private String nodeRegionId; 
            private String nodeType; 
            private String status; 

            /**
             * EcrId.
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GrantId.
             */
            public Builder grantId(String grantId) {
                this.grantId = grantId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeOwnerBid.
             */
            public Builder nodeOwnerBid(String nodeOwnerBid) {
                this.nodeOwnerBid = nodeOwnerBid;
                return this;
            }

            /**
             * NodeOwnerUid.
             */
            public Builder nodeOwnerUid(Long nodeOwnerUid) {
                this.nodeOwnerUid = nodeOwnerUid;
                return this;
            }

            /**
             * NodeRegionId.
             */
            public Builder nodeRegionId(String nodeRegionId) {
                this.nodeRegionId = nodeRegionId;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EcrGrantedInstanceList build() {
                return new EcrGrantedInstanceList(this);
            } 

        } 

    }
}
