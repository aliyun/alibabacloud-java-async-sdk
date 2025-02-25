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
 * {@link DescribeDisabledExpressConnectRouterRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisabledExpressConnectRouterRouteEntriesResponseBody</p>
 */
public class DescribeDisabledExpressConnectRouterRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DisabledRouteEntryList")
    private java.util.List<DisabledRouteEntryList> disabledRouteEntryList;

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
    public java.util.List<DisabledRouteEntryList> getDisabledRouteEntryList() {
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
        private java.util.List<DisabledRouteEntryList> disabledRouteEntryList; 
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
         * <p>The routes that are queried.</p>
         */
        public Builder disabledRouteEntryList(java.util.List<DisabledRouteEntryList> disabledRouteEntryList) {
            this.disabledRouteEntryList = disabledRouteEntryList;
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
         * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsInstanceId</strong>, the request parameter <strong>DtsInstanceId</strong> is invalid.</p>
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
         * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 10.</p>
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
         * <li>If NextToken is empty, no next page exists.</li>
         * <li>If a value of NextToken is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gAAAAABkDTaRFnmxUoMLVOn8YTIgYFeL2ch8j0sJs8VCIU8SS5438m3D9X1VqspCcaUEHRN9I_AfVwMhZHAhcNivifK_OtQxJQ==</p>
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
         * <p>Indicates whether routes are disabled by the ECR. Valid values:</p>
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
         * <p>The total number of routes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody build() {
            return new DescribeDisabledExpressConnectRouterRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDisabledExpressConnectRouterRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDisabledExpressConnectRouterRouteEntriesResponseBody</p>
     */
    public static class DisabledRouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("EcrId")
        private String ecrId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("NexthopInstanceId")
        private String nexthopInstanceId;

        @com.aliyun.core.annotation.NameInMap("NexthopInstanceRegionId")
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
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.100.110/32</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
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
             * <p>The time when the route entry was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1682317345</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the next-hop instance.</p>
             * 
             * <strong>example:</strong>
             * <p>br-hp3u4u5f03tfuljis****</p>
             */
            public Builder nexthopInstanceId(String nexthopInstanceId) {
                this.nexthopInstanceId = nexthopInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the next-hop instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
