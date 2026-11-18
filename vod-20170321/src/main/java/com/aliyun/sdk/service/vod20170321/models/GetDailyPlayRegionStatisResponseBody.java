// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDailyPlayRegionStatisResponseBody} extends {@link TeaModel}
 *
 * <p>GetDailyPlayRegionStatisResponseBody</p>
 */
public class GetDailyPlayRegionStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DailyPlayRegionStatisList")
    private java.util.List<DailyPlayRegionStatisList> dailyPlayRegionStatisList;

    @com.aliyun.core.annotation.NameInMap("EmptyDates")
    private java.util.List<String> emptyDates;

    @com.aliyun.core.annotation.NameInMap("FailDates")
    private java.util.List<String> failDates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDailyPlayRegionStatisResponseBody(Builder builder) {
        this.dailyPlayRegionStatisList = builder.dailyPlayRegionStatisList;
        this.emptyDates = builder.emptyDates;
        this.failDates = builder.failDates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDailyPlayRegionStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyPlayRegionStatisList
     */
    public java.util.List<DailyPlayRegionStatisList> getDailyPlayRegionStatisList() {
        return this.dailyPlayRegionStatisList;
    }

    /**
     * @return emptyDates
     */
    public java.util.List<String> getEmptyDates() {
        return this.emptyDates;
    }

    /**
     * @return failDates
     */
    public java.util.List<String> getFailDates() {
        return this.failDates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DailyPlayRegionStatisList> dailyPlayRegionStatisList; 
        private java.util.List<String> emptyDates; 
        private java.util.List<String> failDates; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDailyPlayRegionStatisResponseBody model) {
            this.dailyPlayRegionStatisList = model.dailyPlayRegionStatisList;
            this.emptyDates = model.emptyDates;
            this.failDates = model.failDates;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The CSV file information returned.</p>
         */
        public Builder dailyPlayRegionStatisList(java.util.List<DailyPlayRegionStatisList> dailyPlayRegionStatisList) {
            this.dailyPlayRegionStatisList = dailyPlayRegionStatisList;
            return this;
        }

        /**
         * <p>If no playback data exists on a specific day, the date is displayed in this field.</p>
         */
        public Builder emptyDates(java.util.List<String> emptyDates) {
            this.emptyDates = emptyDates;
            return this;
        }

        /**
         * <p>If the playback data export fails on a specific day, the date is displayed in this field.</p>
         */
        public Builder failDates(java.util.List<String> failDates) {
            this.failDates = failDates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67720502-CDDB-3F1C-8A91-12258*******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDailyPlayRegionStatisResponseBody build() {
            return new GetDailyPlayRegionStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDailyPlayRegionStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDailyPlayRegionStatisResponseBody</p>
     */
    public static class DailyPlayRegionStatisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        private DailyPlayRegionStatisList(Builder builder) {
            this.date = builder.date;
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyPlayRegionStatisList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private String date; 
            private String fileUrl; 

            private Builder() {
            } 

            private Builder(DailyPlayRegionStatisList model) {
                this.date = model.date;
                this.fileUrl = model.fileUrl;
            } 

            /**
             * <p>The playback date, in days. Format: yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-20</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The download URL of the CSV file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outin-e70266d4ed*******0163e1403e7.oss-cn-shanghai.aliyuncs.com/dataexport/play/cn_hangzhou_20250320_video_traffic.csv">https://outin-e70266d4ed*******0163e1403e7.oss-cn-shanghai.aliyuncs.com/dataexport/play/cn_hangzhou_20250320_video_traffic.csv</a>?*******</p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public DailyPlayRegionStatisList build() {
                return new DailyPlayRegionStatisList(this);
            } 

        } 

    }
}
