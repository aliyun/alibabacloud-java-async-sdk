// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeWebLockFileTypeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockFileTypeSummaryResponseBody</p>
 */
public class DescribeWebLockFileTypeSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
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
        private java.util.List<List> list; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeWebLockFileTypeSummaryResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>An array that consists of events on web tamper proofing returned.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4BB99533-4FDC-5B9C-A5E4-5AE3E9BE5C78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of events on web tamper proofing.</p>
         * 
         * <strong>example:</strong>
         * <p>639</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockFileTypeSummaryResponseBody build() {
            return new DescribeWebLockFileTypeSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebLockFileTypeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebLockFileTypeSummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(List model) {
                this.count = model.count;
                this.type = model.type;
            } 

            /**
             * <p>The number of attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The type of the protected file. Valid values:</p>
             * <ul>
             * <li><strong>php</strong>: PHP file</li>
             * <li><strong>jsp</strong>: JSP file</li>
             * <li><strong>asp</strong>: ASP file</li>
             * <li><strong>aspx</strong>: ASPX file</li>
             * <li><strong>js</strong>: JS file</li>
             * <li><strong>cgi</strong>: CGI file</li>
             * <li><strong>html</strong>: HTML file</li>
             * <li><strong>htm</strong>: HTM file</li>
             * <li><strong>xml</strong>: XML file</li>
             * <li><strong>shtml</strong>: SHTML file</li>
             * <li><strong>shtm</strong>: SHTM file</li>
             * <li><strong>jpg</strong>: JPG file</li>
             * <li><strong>gif</strong>: GIF file</li>
             * <li><strong>png</strong>: PNG file</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>jsp</p>
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
