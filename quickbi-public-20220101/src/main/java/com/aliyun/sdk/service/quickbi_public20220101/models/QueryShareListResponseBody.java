// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryShareListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryShareListResponseBody</p>
 */
public class QueryShareListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryShareListResponseBody build() {
            return new QueryShareListResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AuthPoint")
        private Integer authPoint;

        @NameInMap("ExpireDate")
        private Long expireDate;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("ShareId")
        private String shareId;

        @NameInMap("ShareToId")
        private String shareToId;

        @NameInMap("ShareToName")
        private String shareToName;

        @NameInMap("ShareToType")
        private Integer shareToType;

        @NameInMap("ShareType")
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

            /**
             * AuthPoint.
             */
            public Builder authPoint(Integer authPoint) {
                this.authPoint = authPoint;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * ShareId.
             */
            public Builder shareId(String shareId) {
                this.shareId = shareId;
                return this;
            }

            /**
             * ShareToId.
             */
            public Builder shareToId(String shareToId) {
                this.shareToId = shareToId;
                return this;
            }

            /**
             * ShareToName.
             */
            public Builder shareToName(String shareToName) {
                this.shareToName = shareToName;
                return this;
            }

            /**
             * ShareToType.
             */
            public Builder shareToType(Integer shareToType) {
                this.shareToType = shareToType;
                return this;
            }

            /**
             * ShareType.
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
