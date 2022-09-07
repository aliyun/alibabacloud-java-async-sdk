// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorEIPsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorEIPsResponseBody</p>
 */
public class ListIoTCloudConnectorEIPsResponseBody extends TeaModel {
    @NameInMap("EIPs")
    private java.util.List < String > EIPs;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIoTCloudConnectorEIPsResponseBody(Builder builder) {
        this.EIPs = builder.EIPs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorEIPsResponseBody create() {
        return builder().build();
    }

    /**
     * @return EIPs
     */
    public java.util.List < String > getEIPs() {
        return this.EIPs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > EIPs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * EIPs.
         */
        public Builder EIPs(java.util.List < String > EIPs) {
            this.EIPs = EIPs;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIoTCloudConnectorEIPsResponseBody build() {
            return new ListIoTCloudConnectorEIPsResponseBody(this);
        } 

    } 

}
