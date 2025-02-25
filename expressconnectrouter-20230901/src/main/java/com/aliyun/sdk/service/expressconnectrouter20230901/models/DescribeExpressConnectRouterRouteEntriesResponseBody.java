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
 * {@link DescribeExpressConnectRouterRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectRouterRouteEntriesResponseBody</p>
 */
public class DescribeExpressConnectRouterRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

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

    @com.aliyun.core.annotation.NameInMap("RouteEntriesList")
    private java.util.List<RouteEntriesList> routeEntriesList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeExpressConnectRouterRouteEntriesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeEntriesList = builder.routeEntriesList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectRouterRouteEntriesResponseBody create() {
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
     * @return routeEntriesList
     */
    public java.util.List<RouteEntriesList> getRouteEntriesList() {
        return this.routeEntriesList;
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
        private Integer httpStatusCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<RouteEntriesList> routeEntriesList; 
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
         * <p>IllegalParamFormat.EcrId</p>
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
         * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 10</p>
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
         * <p>gAAAAABkWwFTUMNCdWC0VMYOIylA56Hx6JUfCZlk5hQ5g_fnKmetN6303tqq5UJ2ouJzyT2fDOdzb-NqyEB5jcY8Z2euX7qHDA==</p>
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
         * <p>The route entries.</p>
         */
        public Builder routeEntriesList(java.util.List<RouteEntriesList> routeEntriesList) {
            this.routeEntriesList = routeEntriesList;
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
         * <p>The total number of route entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExpressConnectRouterRouteEntriesResponseBody build() {
            return new DescribeExpressConnectRouterRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpressConnectRouterRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpressConnectRouterRouteEntriesResponseBody</p>
     */
    public static class RouteEntriesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPath")
        private String asPath;

        @com.aliyun.core.annotation.NameInMap("Community")
        private String community;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("Med")
        private Long med;

        @com.aliyun.core.annotation.NameInMap("NexthopInstanceId")
        private String nexthopInstanceId;

        @com.aliyun.core.annotation.NameInMap("NexthopInstanceRegionId")
        private String nexthopInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RouteEntriesList(Builder builder) {
            this.asPath = builder.asPath;
            this.community = builder.community;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.med = builder.med;
            this.nexthopInstanceId = builder.nexthopInstanceId;
            this.nexthopInstanceRegionId = builder.nexthopInstanceRegionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntriesList create() {
            return builder().build();
        }

        /**
         * @return asPath
         */
        public String getAsPath() {
            return this.asPath;
        }

        /**
         * @return community
         */
        public String getCommunity() {
            return this.community;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return med
         */
        public Long getMed() {
            return this.med;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String asPath; 
            private String community; 
            private String destinationCidrBlock; 
            private Long med; 
            private String nexthopInstanceId; 
            private String nexthopInstanceRegionId; 
            private String status; 

            /**
             * <p>The AS path of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>[64993,64512]</p>
             */
            public Builder asPath(String asPath) {
                this.asPath = asPath;
                return this;
            }

            /**
             * <p>The community value that is carried in the BGP route.</p>
             * 
             * <strong>example:</strong>
             * <p>9001:9263</p>
             */
            public Builder community(String community) {
                this.community = community;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * Med.
             */
            public Builder med(Long med) {
                this.med = med;
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

            /**
             * <p>The state of the ECR.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RouteEntriesList build() {
                return new RouteEntriesList(this);
            } 

        } 

    }
}
