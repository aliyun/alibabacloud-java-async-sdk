// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeSiteWafTopDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteWafTopDataRequest</p>
 */
public class DescribeSiteWafTopDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeSiteWafTopDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.fields = builder.fields;
        this.interval = builder.interval;
        this.limit = builder.limit;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteWafTopDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSiteWafTopDataRequest, Builder> {
        private String endTime; 
        private java.util.List<Fields> fields; 
        private String interval; 
        private String limit; 
        private String siteId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteWafTopDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.fields = request.fields;
            this.interval = request.interval;
            this.limit = request.limit;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-04-09T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The query metrics.</p>
         * <p>This parameter is required.</p>
         */
        public Builder fields(java.util.List<Fields> fields) {
            String fieldsShrink = shrink(fields, "Fields", "json");
            this.putQueryParameter("Fields", fieldsShrink);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The time granularity for querying data. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The number of top data entries to query.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
         * <p>If this parameter is left empty, user-level data is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1150376036*****</p>
         */
        public Builder siteId(String siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSiteWafTopDataRequest build() {
            return new DescribeSiteWafTopDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteWafTopDataRequest} extends {@link TeaModel}
     *
     * <p>DescribeSiteWafTopDataRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private java.util.List<String> dimension;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        private Fields(Builder builder) {
            this.dimension = builder.dimension;
            this.fieldName = builder.fieldName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public java.util.List<String> getDimension() {
            return this.dimension;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        public static final class Builder {
            private java.util.List<String> dimension; 
            private String fieldName; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.dimension = model.dimension;
                this.fieldName = model.fieldName;
            } 

            /**
             * <p>The query dimensions.</p>
             */
            public Builder dimension(java.util.List<String> dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The query metric value.</p>
             * <blockquote>
             * <p>For specific dimensions, see <a href="https://help.aliyun.com/document_detail/2878520.html">Data analytics field description</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Requests</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
