// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryMauReportDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMauReportDataResponseBody</p>
 */
public class QueryMauReportDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("MauReportDataModel")
    private java.util.List<MauReportDataModel> mauReportDataModel;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryMauReportDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.mauReportDataModel = builder.mauReportDataModel;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMauReportDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return mauReportDataModel
     */
    public java.util.List<MauReportDataModel> getMauReportDataModel() {
        return this.mauReportDataModel;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List<MauReportDataModel> mauReportDataModel; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryMauReportDataResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.mauReportDataModel = model.mauReportDataModel;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of <code>200</code> indicates that the request is successful. Other values indicate that the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of monthly active user report data.</p>
         */
        public Builder mauReportDataModel(java.util.List<MauReportDataModel> mauReportDataModel) {
            this.mauReportDataModel = mauReportDataModel;
            return this;
        }

        /**
         * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number corresponding to the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page used in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMauReportDataResponseBody build() {
            return new QueryMauReportDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMauReportDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMauReportDataResponseBody</p>
     */
    public static class MauReportDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("Mau")
        private Long mau;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StatDate")
        private String statDate;

        @com.aliyun.core.annotation.NameInMap("StatMonth")
        private String statMonth;

        private MauReportDataModel(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.mau = builder.mau;
            this.regionId = builder.regionId;
            this.statDate = builder.statDate;
            this.statMonth = builder.statMonth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MauReportDataModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return mau
         */
        public Long getMau() {
            return this.mau;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return statDate
         */
        public String getStatDate() {
            return this.statDate;
        }

        /**
         * @return statMonth
         */
        public String getStatMonth() {
            return this.statMonth;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private Long mau; 
            private String regionId; 
            private String statDate; 
            private String statMonth; 

            private Builder() {
            } 

            private Builder(MauReportDataModel model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.mau = model.mau;
                this.regionId = model.regionId;
                this.statDate = model.statDate;
                this.statMonth = model.statMonth;
            } 

            /**
             * <p>The ID of the app instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The number of monthly active users in the statistical month. Unit: users.</p>
             * 
             * <strong>example:</strong>
             * <p>286</p>
             */
            public Builder mau(Long mau) {
                this.mau = mau;
                return this;
            }

            /**
             * <p>The ID of the business region to which the report data belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The statistical cutoff date used for the month. Format: <code>yyyy-MM-dd</code>. For the last month, the date is usually the day before the requested <code>EndDate</code>. The date is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-29</p>
             */
            public Builder statDate(String statDate) {
                this.statDate = statDate;
                return this;
            }

            /**
             * <p>The statistical month. Format: <code>yyyy-MM</code>. The month is interpreted as a natural month in the Asia/Shanghai (UTC+8) time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09</p>
             */
            public Builder statMonth(String statMonth) {
                this.statMonth = statMonth;
                return this;
            }

            public MauReportDataModel build() {
                return new MauReportDataModel(this);
            } 

        } 

    }
}
