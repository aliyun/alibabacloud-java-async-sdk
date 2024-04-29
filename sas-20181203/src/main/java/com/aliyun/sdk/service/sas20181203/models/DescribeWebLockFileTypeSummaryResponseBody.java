// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockFileTypeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockFileTypeSummaryResponseBody</p>
 */
public class DescribeWebLockFileTypeSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebLockFileTypeSummaryResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockFileTypeSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
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
        private java.util.List < List> list; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array that consists of events on web tamper proofing returned.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of events on web tamper proofing.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockFileTypeSummaryResponseBody build() {
            return new DescribeWebLockFileTypeSummaryResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.count = builder.count;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String type; 

            /**
             * The number of attempts.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The type of the protected file. Valid values:
             * <p>
             * 
             * *   **php**: PHP file
             * *   **jsp**: JSP file
             * *   **asp**: ASP file
             * *   **aspx**: ASPX file
             * *   **js**: JS file
             * *   **cgi**: CGI file
             * *   **html**: HTML file
             * *   **htm**: HTM file
             * *   **xml**: XML file
             * *   **shtml**: SHTML file
             * *   **shtm**: SHTM file
             * *   **jpg**: JPG file
             * *   **gif**: GIF file
             * *   **png**: PNG file
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
