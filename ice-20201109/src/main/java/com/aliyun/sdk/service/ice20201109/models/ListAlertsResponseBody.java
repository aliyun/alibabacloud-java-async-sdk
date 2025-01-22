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
 * {@link ListAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertsResponseBody</p>
 */
public class ListAlertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Alerts")
    private java.util.List<Alerts> alerts;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAlertsResponseBody(Builder builder) {
        this.alerts = builder.alerts;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsResponseBody create() {
        return builder().build();
    }

    /**
     * @return alerts
     */
    public java.util.List<Alerts> getAlerts() {
        return this.alerts;
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
        private java.util.List<Alerts> alerts; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Alerts.
         */
        public Builder alerts(java.util.List<Alerts> alerts) {
            this.alerts = alerts;
            return this;
        }

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

        public ListAlertsResponseBody build() {
            return new ListAlertsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertsResponseBody</p>
     */
    public static class Alerts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RelatedResourceArns")
        private String relatedResourceArns;

        @com.aliyun.core.annotation.NameInMap("ResourceArn")
        private String resourceArn;

        private Alerts(Builder builder) {
            this.category = builder.category;
            this.code = builder.code;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.message = builder.message;
            this.relatedResourceArns = builder.relatedResourceArns;
            this.resourceArn = builder.resourceArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alerts create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return relatedResourceArns
         */
        public String getRelatedResourceArns() {
            return this.relatedResourceArns;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
        }

        public static final class Builder {
            private String category; 
            private String code; 
            private String gmtCreate; 
            private String gmtModified; 
            private String message; 
            private String relatedResourceArns; 
            private String resourceArn; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RelatedResourceArns.
             */
            public Builder relatedResourceArns(String relatedResourceArns) {
                this.relatedResourceArns = relatedResourceArns;
                return this;
            }

            /**
             * ResourceArn.
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            public Alerts build() {
                return new Alerts(this);
            } 

        } 

    }
}
