// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNisInspectionTaskReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNisInspectionTaskReportsResponseBody</p>
 */
public class ListNisInspectionTaskReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InspectionReportList")
    private java.util.List < InspectionReportList> inspectionReportList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNisInspectionTaskReportsResponseBody(Builder builder) {
        this.inspectionReportList = builder.inspectionReportList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNisInspectionTaskReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return inspectionReportList
     */
    public java.util.List < InspectionReportList> getInspectionReportList() {
        return this.inspectionReportList;
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
        private java.util.List < InspectionReportList> inspectionReportList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InspectionReportList.
         */
        public Builder inspectionReportList(java.util.List < InspectionReportList> inspectionReportList) {
            this.inspectionReportList = inspectionReportList;
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

        public ListNisInspectionTaskReportsResponseBody build() {
            return new ListNisInspectionTaskReportsResponseBody(this);
        } 

    } 

    public static class InspectionReportList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InspectionReportId")
        private String inspectionReportId;

        private InspectionReportList(Builder builder) {
            this.inspectionReportId = builder.inspectionReportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionReportList create() {
            return builder().build();
        }

        /**
         * @return inspectionReportId
         */
        public String getInspectionReportId() {
            return this.inspectionReportId;
        }

        public static final class Builder {
            private String inspectionReportId; 

            /**
             * InspectionReportId.
             */
            public Builder inspectionReportId(String inspectionReportId) {
                this.inspectionReportId = inspectionReportId;
                return this;
            }

            public InspectionReportList build() {
                return new InspectionReportList(this);
            } 

        } 

    }
}
