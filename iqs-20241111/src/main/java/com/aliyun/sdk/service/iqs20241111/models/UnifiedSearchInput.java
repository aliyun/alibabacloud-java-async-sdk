// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link UnifiedSearchInput} extends {@link TeaModel}
 *
 * <p>UnifiedSearchInput</p>
 */
public class UnifiedSearchInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("advancedParams")
    private java.util.Map<String, ?> advancedParams;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("contents")
    private RequestContents contents;

    @com.aliyun.core.annotation.NameInMap("engineType")
    private String engineType;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("locationInfo")
    private LocationInfo locationInfo;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private UnifiedSearchInput(Builder builder) {
        this.advancedParams = builder.advancedParams;
        this.category = builder.category;
        this.contents = builder.contents;
        this.engineType = builder.engineType;
        this.location = builder.location;
        this.locationInfo = builder.locationInfo;
        this.query = builder.query;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedSearchInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedParams
     */
    public java.util.Map<String, ?> getAdvancedParams() {
        return this.advancedParams;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return contents
     */
    public RequestContents getContents() {
        return this.contents;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return locationInfo
     */
    public LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private java.util.Map<String, ?> advancedParams; 
        private String category; 
        private RequestContents contents; 
        private String engineType; 
        private String location; 
        private LocationInfo locationInfo; 
        private String query; 
        private String timeRange; 

        private Builder() {
        } 

        private Builder(UnifiedSearchInput model) {
            this.advancedParams = model.advancedParams;
            this.category = model.category;
            this.contents = model.contents;
            this.engineType = model.engineType;
            this.location = model.location;
            this.locationInfo = model.locationInfo;
            this.query = model.query;
            this.timeRange = model.timeRange;
        } 

        /**
         * <p>The advanced search parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;numResults&quot;:&quot;10&quot;}</p>
         */
        public Builder advancedParams(java.util.Map<String, ?> advancedParams) {
            this.advancedParams = advancedParams;
            return this;
        }

        /**
         * <p>The query category. If specified, only search results from sites of the corresponding category are returned. Separate multiple categories with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>medical</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The options for controlling the returned content.</p>
         */
        public Builder contents(RequestContents contents) {
            this.contents = contents;
            return this;
        }

        /**
         * <p>The engine type. Default value: Generic. Valid values: Generic, GenericAdvanced. GenericAdvanced is billed separately and returns more records.</p>
         * 
         * <strong>example:</strong>
         * <p>Generic</p>
         */
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The location parameter. Use locationInfo to specify a city or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>60.194.214.228</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The location information, used for scenario-based searches such as weather.</p>
         */
        public Builder locationInfo(LocationInfo locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }

        /**
         * <p>The query content. The length limit is 1 to 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Apsara Conference</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The publication time range for the content.</p>
         * 
         * <strong>example:</strong>
         * <p>NoLimit</p>
         */
        public Builder timeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public UnifiedSearchInput build() {
            return new UnifiedSearchInput(this);
        } 

    } 

}
