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
 * {@link DescribeExpressConnectRouterAssociationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectRouterAssociationResponseBody</p>
 */
public class DescribeExpressConnectRouterAssociationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AssociationList")
    private java.util.List<AssociationList> associationList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

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

    private DescribeExpressConnectRouterAssociationResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.associationList = builder.associationList;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
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

    public static DescribeExpressConnectRouterAssociationResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return associationList
     */
    public java.util.List<AssociationList> getAssociationList() {
        return this.associationList;
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
        private java.util.List<AssociationList> associationList; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
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
         * <p>The associated resources.</p>
         */
        public Builder associationList(java.util.List<AssociationList> associationList) {
            this.associationList = associationList;
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
         * <p>IllegalParamFormat.EcrId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of DynamicMessage is <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The param format of EcrId **** is illegal.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
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
         * <p>20</p>
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
         * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05130E79-588D-5C40-A718-C4863A59****</p>
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
         * <p>The total number of associated resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExpressConnectRouterAssociationResponseBody build() {
            return new DescribeExpressConnectRouterAssociationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressConnectRouterAssociationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectRouterAssociationResponseBody</p>
     */
    public static class AssociationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedPrefixes")
        private java.util.List<String> allowedPrefixes;

        @com.aliyun.core.annotation.NameInMap("AllowedPrefixesMode")
        private String allowedPrefixesMode;

        @com.aliyun.core.annotation.NameInMap("AssociationId")
        private String associationId;

        @com.aliyun.core.annotation.NameInMap("AssociationNodeType")
        private String associationNodeType;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterOwnerId")
        private Long transitRouterOwnerId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
        private Long vpcOwnerId;

        private AssociationList(Builder builder) {
            this.allowedPrefixes = builder.allowedPrefixes;
            this.allowedPrefixesMode = builder.allowedPrefixesMode;
            this.associationId = builder.associationId;
            this.associationNodeType = builder.associationNodeType;
            this.cenId = builder.cenId;
            this.description = builder.description;
            this.ecrId = builder.ecrId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterOwnerId = builder.transitRouterOwnerId;
            this.vpcId = builder.vpcId;
            this.vpcOwnerId = builder.vpcOwnerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociationList create() {
            return builder().build();
        }

        /**
         * @return allowedPrefixes
         */
        public java.util.List<String> getAllowedPrefixes() {
            return this.allowedPrefixes;
        }

        /**
         * @return allowedPrefixesMode
         */
        public String getAllowedPrefixesMode() {
            return this.allowedPrefixesMode;
        }

        /**
         * @return associationId
         */
        public String getAssociationId() {
            return this.associationId;
        }

        /**
         * @return associationNodeType
         */
        public String getAssociationNodeType() {
            return this.associationNodeType;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
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
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterOwnerId
         */
        public Long getTransitRouterOwnerId() {
            return this.transitRouterOwnerId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcOwnerId
         */
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        public static final class Builder {
            private java.util.List<String> allowedPrefixes; 
            private String allowedPrefixesMode; 
            private String associationId; 
            private String associationNodeType; 
            private String cenId; 
            private String description; 
            private String ecrId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long ownerId; 
            private String regionId; 
            private String status; 
            private String transitRouterId; 
            private Long transitRouterOwnerId; 
            private String vpcId; 
            private Long vpcOwnerId; 

            /**
             * <p>The allowed route prefixes.</p>
             */
            public Builder allowedPrefixes(java.util.List<String> allowedPrefixes) {
                this.allowedPrefixes = allowedPrefixes;
                return this;
            }

            /**
             * AllowedPrefixesMode.
             */
            public Builder allowedPrefixesMode(String allowedPrefixesMode) {
                this.allowedPrefixesMode = allowedPrefixesMode;
                return this;
            }

            /**
             * <p>The ID of the association between the ECR and the VPC or TR.</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-assoc-9p2qxx5phpca2m****</p>
             */
            public Builder associationId(String associationId) {
                this.associationId = associationId;
                return this;
            }

            /**
             * <p>The type of the associated resource. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>TR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder associationNodeType(String associationNodeType) {
                this.associationNodeType = associationNodeType;
                return this;
            }

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-5510frtx8zi54q****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ECR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecr-fu8rszhgv7623c****</p>
             */
            public Builder ecrId(String ecrId) {
                this.ecrId = ecrId;
                return this;
            }

            /**
             * <p>The time when the association was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-09T12:18:23Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the association was modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-09T12:18:23Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>167509154715****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The region ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The deployment state of the associated resource. Valid values:</p>
             * <ul>
             * <li><strong>CREATING</strong>: The resource is being created.</li>
             * <li><strong>ACTIVE</strong>: The resource is created.</li>
             * <li><strong>INACTIVE</strong>: The TR is pending to be associated with the ECR.</li>
             * <li><strong>ASSOCIATING</strong>: The resource is being associated.</li>
             * <li><strong>DISSOCIATING</strong>: The resource is being disassociated.</li>
             * <li><strong>UPDATING</strong>: The resource is being modified.</li>
             * <li><strong>DELETING</strong>: The resource is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The TR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-2ze4i71c6be454e2l****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the TR.</p>
             * 
             * <strong>example:</strong>
             * <p>189159362009****</p>
             */
            public Builder transitRouterOwnerId(Long transitRouterOwnerId) {
                this.transitRouterOwnerId = transitRouterOwnerId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zeeaxet4i2j1a7n7****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>146757288406****</p>
             */
            public Builder vpcOwnerId(Long vpcOwnerId) {
                this.vpcOwnerId = vpcOwnerId;
                return this;
            }

            public AssociationList build() {
                return new AssociationList(this);
            } 

        } 

    }
}
