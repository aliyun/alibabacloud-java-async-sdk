// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AdvancePurgeObjectCacheRequest} extends {@link RequestModel}
 *
 * <p>AdvancePurgeObjectCacheRequest</p>
 */
public class AdvancePurgeObjectCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stations")
    private String stations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRangeBegin")
    private Integer timeRangeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeRangeEnd")
    private Integer timeRangeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AdvancePurgeObjectCacheRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.content = builder.content;
        this.force = builder.force;
        this.siteId = builder.siteId;
        this.stations = builder.stations;
        this.timeRangeBegin = builder.timeRangeBegin;
        this.timeRangeEnd = builder.timeRangeEnd;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdvancePurgeObjectCacheRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return stations
     */
    public String getStations() {
        return this.stations;
    }

    /**
     * @return timeRangeBegin
     */
    public Integer getTimeRangeBegin() {
        return this.timeRangeBegin;
    }

    /**
     * @return timeRangeEnd
     */
    public Integer getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AdvancePurgeObjectCacheRequest, Builder> {
        private String area; 
        private Content content; 
        private Boolean force; 
        private Long siteId; 
        private String stations; 
        private Integer timeRangeBegin; 
        private Integer timeRangeEnd; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AdvancePurgeObjectCacheRequest request) {
            super(request);
            this.area = request.area;
            this.content = request.content;
            this.force = request.force;
            this.siteId = request.siteId;
            this.stations = request.stations;
            this.timeRangeBegin = request.timeRangeBegin;
            this.timeRangeEnd = request.timeRangeEnd;
            this.type = request.type;
        } 

        /**
         * Area.
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(Content content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * Stations.
         */
        public Builder stations(String stations) {
            this.putQueryParameter("Stations", stations);
            this.stations = stations;
            return this;
        }

        /**
         * TimeRangeBegin.
         */
        public Builder timeRangeBegin(Integer timeRangeBegin) {
            this.putQueryParameter("TimeRangeBegin", timeRangeBegin);
            this.timeRangeBegin = timeRangeBegin;
            return this;
        }

        /**
         * TimeRangeEnd.
         */
        public Builder timeRangeEnd(Integer timeRangeEnd) {
            this.putQueryParameter("TimeRangeEnd", timeRangeEnd);
            this.timeRangeEnd = timeRangeEnd;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AdvancePurgeObjectCacheRequest build() {
            return new AdvancePurgeObjectCacheRequest(this);
        } 

    } 

    /**
     * 
     * {@link AdvancePurgeObjectCacheRequest} extends {@link TeaModel}
     *
     * <p>AdvancePurgeObjectCacheRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheTags")
        private java.util.List < String > cacheTags;

        @com.aliyun.core.annotation.NameInMap("Directories")
        private java.util.List < String > directories;

        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List < ? > files;

        @com.aliyun.core.annotation.NameInMap("Hostnames")
        private java.util.List < String > hostnames;

        @com.aliyun.core.annotation.NameInMap("IgnoreParams")
        private java.util.List < String > ignoreParams;

        @com.aliyun.core.annotation.NameInMap("PurgeAll")
        private Boolean purgeAll;

        private Content(Builder builder) {
            this.cacheTags = builder.cacheTags;
            this.directories = builder.directories;
            this.files = builder.files;
            this.hostnames = builder.hostnames;
            this.ignoreParams = builder.ignoreParams;
            this.purgeAll = builder.purgeAll;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cacheTags
         */
        public java.util.List < String > getCacheTags() {
            return this.cacheTags;
        }

        /**
         * @return directories
         */
        public java.util.List < String > getDirectories() {
            return this.directories;
        }

        /**
         * @return files
         */
        public java.util.List < ? > getFiles() {
            return this.files;
        }

        /**
         * @return hostnames
         */
        public java.util.List < String > getHostnames() {
            return this.hostnames;
        }

        /**
         * @return ignoreParams
         */
        public java.util.List < String > getIgnoreParams() {
            return this.ignoreParams;
        }

        /**
         * @return purgeAll
         */
        public Boolean getPurgeAll() {
            return this.purgeAll;
        }

        public static final class Builder {
            private java.util.List < String > cacheTags; 
            private java.util.List < String > directories; 
            private java.util.List < ? > files; 
            private java.util.List < String > hostnames; 
            private java.util.List < String > ignoreParams; 
            private Boolean purgeAll; 

            /**
             * CacheTags.
             */
            public Builder cacheTags(java.util.List < String > cacheTags) {
                this.cacheTags = cacheTags;
                return this;
            }

            /**
             * Directories.
             */
            public Builder directories(java.util.List < String > directories) {
                this.directories = directories;
                return this;
            }

            /**
             * Files.
             */
            public Builder files(java.util.List < ? > files) {
                this.files = files;
                return this;
            }

            /**
             * Hostnames.
             */
            public Builder hostnames(java.util.List < String > hostnames) {
                this.hostnames = hostnames;
                return this;
            }

            /**
             * IgnoreParams.
             */
            public Builder ignoreParams(java.util.List < String > ignoreParams) {
                this.ignoreParams = ignoreParams;
                return this;
            }

            /**
             * PurgeAll.
             */
            public Builder purgeAll(Boolean purgeAll) {
                this.purgeAll = purgeAll;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
