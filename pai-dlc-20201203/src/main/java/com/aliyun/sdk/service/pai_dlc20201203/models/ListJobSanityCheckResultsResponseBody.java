// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListJobSanityCheckResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobSanityCheckResultsResponseBody</p>
 */
public class ListJobSanityCheckResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestID")
    private String requestID;

    @com.aliyun.core.annotation.NameInMap("SanityCheckResults")
    private java.util.List<java.util.List<SanityCheckResultItem>> sanityCheckResults;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobSanityCheckResultsResponseBody(Builder builder) {
        this.requestID = builder.requestID;
        this.sanityCheckResults = builder.sanityCheckResults;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobSanityCheckResultsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestID
     */
    public String getRequestID() {
        return this.requestID;
    }

    /**
     * @return sanityCheckResults
     */
    public java.util.List<java.util.List<SanityCheckResultItem>> getSanityCheckResults() {
        return this.sanityCheckResults;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestID; 
        private java.util.List<java.util.List<SanityCheckResultItem>> sanityCheckResults; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListJobSanityCheckResultsResponseBody model) {
            this.requestID = model.requestID;
            this.sanityCheckResults = model.sanityCheckResults;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AC9xxx-3xxx-5xxx2-xxxx-FA5</p>
         */
        public Builder requestID(String requestID) {
            this.requestID = requestID;
            return this;
        }

        /**
         * <p>The sanity check results.</p>
         */
        public Builder sanityCheckResults(java.util.List<java.util.List<SanityCheckResultItem>> sanityCheckResults) {
            this.sanityCheckResults = sanityCheckResults;
            return this;
        }

        /**
         * <p>The total number of results that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobSanityCheckResultsResponseBody build() {
            return new ListJobSanityCheckResultsResponseBody(this);
        } 

    } 

}
