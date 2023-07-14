// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTraceAppByNameRequest} extends {@link RequestModel}
 *
 * <p>SearchTraceAppByNameRequest</p>
 */
public class SearchTraceAppByNameRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("TraceAppName")
    private String traceAppName;

    private SearchTraceAppByNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tags = builder.tags;
        this.traceAppName = builder.traceAppName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTraceAppByNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return traceAppName
     */
    public String getTraceAppName() {
        return this.traceAppName;
    }

    public static final class Builder extends Request.Builder<SearchTraceAppByNameRequest, Builder> {
        private String regionId; 
        private java.util.List < Tags> tags; 
        private String traceAppName; 

        private Builder() {
            super();
        } 

        private Builder(SearchTraceAppByNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.tags = request.tags;
            this.traceAppName = request.traceAppName;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The name of the application.
         * <p>
         * 
         * > If you do not specify this parameter, all application monitoring tasks in the specified region are queried.
         */
        public Builder traceAppName(String traceAppName) {
            this.putQueryParameter("TraceAppName", traceAppName);
            this.traceAppName = traceAppName;
            return this;
        }

        @Override
        public SearchTraceAppByNameRequest build() {
            return new SearchTraceAppByNameRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
