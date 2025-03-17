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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAlertsResponseBody model) {
            this.alerts = model.alerts;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The alerts.</p>
         */
        public Builder alerts(java.util.List<Alerts> alerts) {
            this.alerts = alerts;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p><strong>Request ID</strong></p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxxx-xxxxx-xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

            private Builder() {
            } 

            private Builder(Alerts model) {
                this.category = model.category;
                this.code = model.code;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.message = model.message;
                this.relatedResourceArns = model.relatedResourceArns;
                this.resourceArn = model.resourceArn;
            } 

            /**
             * <p>The alert type.</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ScheduleError</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the alert was received in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-16T10:03Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the alert was modified in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-16T10:03Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ARN of the related resource.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ims:mediaweaver:<regionId>:<userId>:vodSource/mySourceLocation/MySource</p>
             */
            public Builder relatedResourceArns(String relatedResourceArns) {
                this.relatedResourceArns = relatedResourceArns;
                return this;
            }

            /**
             * <p>The ARN of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ims:mediaweaver:<regionId>:<userId>:vodSource/mySourceLocation/MySource</p>
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
