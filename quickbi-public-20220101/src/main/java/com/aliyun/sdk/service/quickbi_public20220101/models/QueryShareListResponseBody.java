// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryShareListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryShareListResponseBody</p>
 */
public class QueryShareListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryShareListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShareListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryShareListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DC4E1E63-B337-44F8-8C22-6F00DF67E2C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the list of objects to which the work has been shared.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryShareListResponseBody build() {
            return new QueryShareListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryShareListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryShareListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthPoint")
        private Integer authPoint;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private Long expireDate;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("ShareId")
        private String shareId;

        @com.aliyun.core.annotation.NameInMap("ShareToId")
        private String shareToId;

        @com.aliyun.core.annotation.NameInMap("ShareToName")
        private String shareToName;

        @com.aliyun.core.annotation.NameInMap("ShareToType")
        private Integer shareToType;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        private Result(Builder builder) {
            this.authPoint = builder.authPoint;
            this.expireDate = builder.expireDate;
            this.reportId = builder.reportId;
            this.shareId = builder.shareId;
            this.shareToId = builder.shareToId;
            this.shareToName = builder.shareToName;
            this.shareToType = builder.shareToType;
            this.shareType = builder.shareType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authPoint
         */
        public Integer getAuthPoint() {
            return this.authPoint;
        }

        /**
         * @return expireDate
         */
        public Long getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return shareId
         */
        public String getShareId() {
            return this.shareId;
        }

        /**
         * @return shareToId
         */
        public String getShareToId() {
            return this.shareToId;
        }

        /**
         * @return shareToName
         */
        public String getShareToName() {
            return this.shareToName;
        }

        /**
         * @return shareToType
         */
        public Integer getShareToType() {
            return this.shareToType;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
        }

        public static final class Builder {
            private Integer authPoint; 
            private Long expireDate; 
            private String reportId; 
            private String shareId; 
            private String shareToId; 
            private String shareToName; 
            private Integer shareToType; 
            private String shareType; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authPoint = model.authPoint;
                this.expireDate = model.expireDate;
                this.reportId = model.reportId;
                this.shareId = model.shareId;
                this.shareToId = model.shareToId;
                this.shareToName = model.shareToName;
                this.shareToType = model.shareToType;
                this.shareType = model.shareType;
            } 

            /**
             * <p>Sharing permissions. Possible values:</p>
             * <ul>
             * <li>1: View only</li>
             * <li>3: View and export</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authPoint(Integer authPoint) {
                this.authPoint = authPoint;
                return this;
            }

            /**
             * <p>The timestamp in milliseconds indicating the expiration time of the authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>1640102400000</p>
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The ID of the work.</p>
             * 
             * <strong>example:</strong>
             * <p>6b407e50-e774-406b-9956-da2425c2****</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The ID of the sharing configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>0ab9659e-29cf-47d7-a364-3a91553b****</p>
             */
            public Builder shareId(String shareId) {
                this.shareId = shareId;
                return this;
            }

            /**
             * <p>The ID of the sharing target, which could be a user ID or a group ID in Quick BI.</p>
             * <ul>
             * <li>When ShareToType=2 (all members within an organization), ShareToId is the organization ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
             */
            public Builder shareToId(String shareToId) {
                this.shareToId = shareToId;
                return this;
            }

            /**
             * <p>The name of the sharing target.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder shareToName(String shareToName) {
                this.shareToName = shareToName;
                return this;
            }

            /**
             * <p>The type of sharing. Possible values:</p>
             * <ul>
             * <li>0: User</li>
             * <li>1: Group</li>
             * <li>2: Organization</li>
             * <li>3: Space</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder shareToType(Integer shareToType) {
                this.shareToType = shareToType;
                return this;
            }

            /**
             * <p>The type of the shared work. The value range includes: </p>
             * <ul>
             * <li>dataProduct: Data Portal </li>
             * <li>dashboard: Dashboard </li>
             * <li>report: Spreadsheet </li>
             * <li>dashboardOfflineQuery: Self-service Data Extraction </li>
             * <li>ANALYSIS: Ad-hoc Analysis </li>
             * <li>DATAFORM: Data Entry </li>
             * <li>SCREEN: Data Visualization Screen</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dashboard</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
