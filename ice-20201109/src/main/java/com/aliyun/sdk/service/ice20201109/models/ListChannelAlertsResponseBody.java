// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListChannelAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChannelAlertsResponseBody</p>
 */
public class ListChannelAlertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ProgramAlerts")
    private java.util.List<ProgramAlerts> programAlerts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListChannelAlertsResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.programAlerts = builder.programAlerts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChannelAlertsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return programAlerts
     */
    public java.util.List<ProgramAlerts> getProgramAlerts() {
        return this.programAlerts;
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
        private Integer pageNo; 
        private Integer pageSize; 
        private java.util.List<ProgramAlerts> programAlerts; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProgramAlerts.
         */
        public Builder programAlerts(java.util.List<ProgramAlerts> programAlerts) {
            this.programAlerts = programAlerts;
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

        public ListChannelAlertsResponseBody build() {
            return new ListChannelAlertsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChannelAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListChannelAlertsResponseBody</p>
     */
    public static class ProgramAlerts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ProgramName")
        private String programName;

        private ProgramAlerts(Builder builder) {
            this.arn = builder.arn;
            this.category = builder.category;
            this.count = builder.count;
            this.gmtModified = builder.gmtModified;
            this.programName = builder.programName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgramAlerts create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return programName
         */
        public String getProgramName() {
            return this.programName;
        }

        public static final class Builder {
            private String arn; 
            private String category; 
            private Integer count; 
            private String gmtModified; 
            private String programName; 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ProgramName.
             */
            public Builder programName(String programName) {
                this.programName = programName;
                return this;
            }

            public ProgramAlerts build() {
                return new ProgramAlerts(this);
            } 

        } 

    }
}
