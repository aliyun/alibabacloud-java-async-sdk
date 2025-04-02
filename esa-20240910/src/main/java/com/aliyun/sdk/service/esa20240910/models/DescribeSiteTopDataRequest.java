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
 * {@link DescribeSiteTopDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteTopDataRequest</p>
 */
public class DescribeSiteTopDataRequest extends Request {
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

    private DescribeSiteTopDataRequest(Builder builder) {
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

    public static DescribeSiteTopDataRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSiteTopDataRequest, Builder> {
        private String endTime; 
        private java.util.List<Fields> fields; 
        private String interval; 
        private String limit; 
        private String siteId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteTopDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.fields = request.fields;
            this.interval = request.interval;
            this.limit = request.limit;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fields(java.util.List<Fields> fields) {
            String fieldsShrink = shrink(fields, "Fields", "json");
            this.putQueryParameter("Fields", fieldsShrink);
            this.fields = fields;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(String siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSiteTopDataRequest build() {
            return new DescribeSiteTopDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteTopDataRequest} extends {@link TeaModel}
     *
     * <p>DescribeSiteTopDataRequest</p>
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
             * Dimension.
             */
            public Builder dimension(java.util.List<String> dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * FieldName.
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
