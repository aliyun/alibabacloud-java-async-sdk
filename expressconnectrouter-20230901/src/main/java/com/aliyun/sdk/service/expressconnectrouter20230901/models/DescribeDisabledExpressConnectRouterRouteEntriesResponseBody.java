// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisabledExpressConnectRouterRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisabledExpressConnectRouterRouteEntriesResponseBody</p>
 */
public class DescribeDisabledExpressConnectRouterRouteEntriesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("DisabledRouteEntryList")
    private java.util.List < DisabledRouteEntryList> disabledRouteEntryList;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

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

    private DescribeDisabledExpressConnectRouterRouteEntriesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.disabledRouteEntryList = builder.disabledRouteEntryList;
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

    public static DescribeDisabledExpressConnectRouterRouteEntriesResponseBody create() {
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
     * @return disabledRouteEntryList
     */
    public java.util.List < DisabledRouteEntryList> getDisabledRouteEntryList() {
        return this.disabledRouteEntryList;
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
        private String code; 
        private java.util.List < DisabledRouteEntryList> disabledRouteEntryList; 
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
         * DisabledRouteEntryList.
         */
        public Builder disabledRouteEntryList(java.util.List < DisabledRouteEntryList> disabledRouteEntryList) {
            this.disabledRouteEntryList = disabledRouteEntryList;
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

        public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody build() {
            return new DescribeDisabledExpressConnectRouterRouteEntriesResponseBody(this);
        } 

    } 

    public static class DisabledRouteEntryList extends TeaModel {
        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("EcrId")
        private String ecrId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("NexthopInstanceId")
        private String nexthopInstanceId;

        @NameInMap("NexthopInstanceRegionId")
        private String nexthopInstanceRegionId;

        private DisabledRouteEntryList(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.ecrId = builder.ecrId;
            this.gmtCreate = builder.gmtCreate;
            this.nexthopInstanceId = builder.nexthopInstanceId;
            this.nexthopInstanceRegionId = builder.nexthopInstanceRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisabledRouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
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
         * @return nexthopInstanceId
         */
        public String getNexthopInstanceId() {
            return this.nexthopInstanceId;
        }

        /**
         * @return nexthopInstanceRegionId
         */
        public String getNexthopInstanceRegionId() {
            return this.nexthopInstanceRegionId;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String ecrId; 
            private String gmtCreate; 
            private String nexthopInstanceId; 
            private String nexthopInstanceRegionId; 

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

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
             * NexthopInstanceId.
             */
            public Builder nexthopInstanceId(String nexthopInstanceId) {
                this.nexthopInstanceId = nexthopInstanceId;
                return this;
            }

            /**
             * NexthopInstanceRegionId.
             */
            public Builder nexthopInstanceRegionId(String nexthopInstanceRegionId) {
                this.nexthopInstanceRegionId = nexthopInstanceRegionId;
                return this;
            }

            public DisabledRouteEntryList build() {
                return new DisabledRouteEntryList(this);
            } 

        } 

    }
}
