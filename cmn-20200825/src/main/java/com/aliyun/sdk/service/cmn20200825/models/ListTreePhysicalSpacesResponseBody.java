// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTreePhysicalSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTreePhysicalSpacesResponseBody</p>
 */
public class ListTreePhysicalSpacesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("PhysicalSpaces")
    private java.util.List < PhysicalSpaceDto > physicalSpaces;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTreePhysicalSpacesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalSpaces = builder.physicalSpaces;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTreePhysicalSpacesResponseBody create() {
        return builder().build();
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
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return physicalSpaces
     */
    public java.util.List < PhysicalSpaceDto > getPhysicalSpaces() {
        return this.physicalSpaces;
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
        private Integer maxResults; 
        private Integer nextToken; 
        private java.util.List < PhysicalSpaceDto > physicalSpaces; 
        private String requestId; 
        private Integer totalCount; 

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
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PhysicalSpaces.
         */
        public Builder physicalSpaces(java.util.List < PhysicalSpaceDto > physicalSpaces) {
            this.physicalSpaces = physicalSpaces;
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

        public ListTreePhysicalSpacesResponseBody build() {
            return new ListTreePhysicalSpacesResponseBody(this);
        } 

    } 

}
