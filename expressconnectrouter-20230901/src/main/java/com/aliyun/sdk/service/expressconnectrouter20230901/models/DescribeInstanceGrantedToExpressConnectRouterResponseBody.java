// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link DescribeInstanceGrantedToExpressConnectRouterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceGrantedToExpressConnectRouterResponseBody</p>
 */
public class DescribeInstanceGrantedToExpressConnectRouterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("EcrGrantedInstanceList")
    private java.util.List<EcrGrantedInstanceList> ecrGrantedInstanceList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<EcrGrantedInstanceList> getEcrGrantedInstanceList() {
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
        private java.util.List<EcrGrantedInstanceList> ecrGrantedInstanceList; 
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>Authentication is failed for ****</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>IllegalParamFormat.Name</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The param format of Name **** is illegal.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The network instances whose permissions are granted to the ECR.</p>
         */
        public Builder ecrGrantedInstanceList(java.util.List<EcrGrantedInstanceList> ecrGrantedInstanceList) {
            this.ecrGrantedInstanceList = ecrGrantedInstanceList;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFlMqGuJ10uN3l+FX/cBrGDNXUOUifNeOuAJlT4dc3vsWD6DsNSFAC2FtpeH5QOSG2WFdyRoun7gSLCm5o69YnAQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of network instances whose permissions are granted to the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBody build() {
            return new DescribeInstanceGrantedToExpressConnectRouterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceGrantedToExpressConnectRouterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceGrantedToExpressConnectRouterResponseBody</p>
     */
    public static class EcrGrantedInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("EcrOwnerAliUid")
        private String ecrOwnerAliUid;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GrantId")
        private String grantId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeOwnerBid")
        private String nodeOwnerBid;

        @com.aliyun.core.annotation.NameInMap("NodeOwnerUid")
        private Long nodeOwnerUid;

        @com.aliyun.core.annotation.NameInMap("NodeRegionId")
        private String nodeRegionId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EcrGrantedInstanceList(Builder builder) {
            this.ecrId = builder.ecrId;
            this.ecrOwnerAliUid = builder.ecrOwnerAliUid;
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
         * @return ecrOwnerAliUid
         */
        public String getEcrOwnerAliUid() {
            return this.ecrOwnerAliUid;
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
            private String ecrOwnerAliUid; 
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
             * <p>The ECR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-mezk2idmsd0vx2****</p>
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * EcrOwnerAliUid.
             */
            public Builder ecrOwnerAliUid(String ecrOwnerAliUid) {
                this.ecrOwnerAliUid = ecrOwnerAliUid;
                return this;
            }

            /**
             * <p>The time when the network instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1669023139000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the network instance was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1669023139000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The authorization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gr-8gdelo13mi99g1****</p>
             */
            public Builder grantId(String grantId) {
                this.grantId = grantId;
                return this;
            }

            /**
             * <p>The ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-j6cwxhgg0s5nuephp****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud enterprise account that owns the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder nodeOwnerBid(String nodeOwnerBid) {
                this.nodeOwnerBid = nodeOwnerBid;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>129845258050****</p>
             */
            public Builder nodeOwnerUid(Long nodeOwnerUid) {
                this.nodeOwnerUid = nodeOwnerUid;
                return this;
            }

            /**
             * <p>The region ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder nodeRegionId(String nodeRegionId) {
                this.nodeRegionId = nodeRegionId;
                return this;
            }

            /**
             * <p>The type of the network instance. Valid values:</p>
             * <ul>
             * <li><strong>VBR</strong></li>
             * <li><strong>VPC</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VBR</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The state of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
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
