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
 * {@link DescribeExpressConnectRouterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectRouterResponseBody</p>
 */
public class DescribeExpressConnectRouterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("EcrList")
    private java.util.List<EcrList> ecrList;

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

    private DescribeExpressConnectRouterResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.ecrList = builder.ecrList;
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

    public static DescribeExpressConnectRouterResponseBody create() {
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
     * @return ecrList
     */
    public java.util.List<EcrList> getEcrList() {
        return this.ecrList;
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
        private java.util.List<EcrList> ecrList; 
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
         * <p>The ECRs.</p>
         */
        public Builder ecrList(java.util.List<EcrList> ecrList) {
            this.ecrList = ecrList;
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
         * <p>10</p>
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
         * <li>If NextToken is empty, no next page exists.</li>
         * <li>If a value of NextToken is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2w6Olxc+cMPjUtUMpttDGZkffvHCfhBKKNEyCVaq+WUEzuUWpp9+QOApNf6g==</p>
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
         * <p>The total number of ECRs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExpressConnectRouterResponseBody build() {
            return new DescribeExpressConnectRouterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressConnectRouterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectRouterResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExpressConnectRouterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectRouterResponseBody</p>
     */
    public static class EcrList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlibabaSideAsn")
        private Long alibabaSideAsn;

        @com.aliyun.core.annotation.NameInMap("BizStatus")
        private String bizStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private EcrList(Builder builder) {
            this.alibabaSideAsn = builder.alibabaSideAsn;
            this.bizStatus = builder.bizStatus;
            this.description = builder.description;
            this.ecrId = builder.ecrId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcrList create() {
            return builder().build();
        }

        /**
         * @return alibabaSideAsn
         */
        public Long getAlibabaSideAsn() {
            return this.alibabaSideAsn;
        }

        /**
         * @return bizStatus
         */
        public String getBizStatus() {
            return this.bizStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long alibabaSideAsn; 
            private String bizStatus; 
            private String description; 
            private String ecrId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private Long ownerId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The autonomous system number (ASN) of the ECR.</p>
             * 
             * <strong>example:</strong>
             * <p>45104</p>
             */
            public Builder alibabaSideAsn(Long alibabaSideAsn) {
                this.alibabaSideAsn = alibabaSideAsn;
                return this;
            }

            /**
             * <p>The business state of the ECR. Valid values:</p>
             * <ul>
             * <li><strong>Normal:</strong> The ECR is running as expected.</li>
             * <li><strong>FinancialLocked</strong>: The ECR is locked due to overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder bizStatus(String bizStatus) {
                this.bizStatus = bizStatus;
                return this;
            }

            /**
             * <p>The description of the ECR.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

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
             * <p>The time when the ECR was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-16T01:44:50Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the ECR was modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-16T01:44:50Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The name of the ECR.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the ECR.</p>
             * 
             * <strong>example:</strong>
             * <p>170646818729****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the ECR belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzuscospt****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The deployment state of the ECR. Valid values:</p>
             * <ul>
             * <li><strong>ACTIVE</strong>: The ECR is created.</li>
             * <li><strong>UPDATING</strong>: The ECR is being modified.</li>
             * <li><strong>ASSOCIATING</strong>: The ECR is being associated with resources.</li>
             * <li><strong>DISSOCIATING</strong>: The resource is being disassociated from resources.</li>
             * <li><strong>LOCKED_ATTACHING</strong>: The ECR is locked because it is being associated with an external system.</li>
             * <li><strong>LOCKED_DETACHING</strong>: The ECR is locked because it is being disassociated from an external system.</li>
             * <li><strong>RECLAIMING</strong>: The ECR is waiting to release resources.</li>
             * <li><strong>DELETING</strong>: The ECR is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public EcrList build() {
                return new EcrList(this);
            } 

        } 

    }
}
