// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCensResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCensResponseBody</p>
 */
public class DescribeCensResponseBody extends TeaModel {
    @NameInMap("Cens")
    private Cens cens;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;


    private DescribeCensResponseBody(Builder builder) {
        this.cens = builder.cens;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCensResponseBody create() {
        return builder().build();
    }

    /**
     * @return cens
     */
    public Cens getCens() {
        return this.cens;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Cens cens; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Cens.</p>
         */
        public Builder cens(Cens cens) {
            this.cens = cens;
            return this;
        }

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCensResponseBody build() {
            return new DescribeCensResponseBody(this);
        } 

    } 

    public static class CenBandwidthPackageIds extends TeaModel {
        @NameInMap("CenBandwidthPackageId")
        private java.util.List < String > cenBandwidthPackageId;


        private CenBandwidthPackageIds(Builder builder) {
            this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenBandwidthPackageIds create() {
            return builder().build();
        }

        /**
         * @return cenBandwidthPackageId
         */
        public java.util.List < String > getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

        public static final class Builder {
            private java.util.List < String > cenBandwidthPackageId; 

            /**
             * <p>CenBandwidthPackageId.</p>
             */
            public Builder cenBandwidthPackageId(java.util.List < String > cenBandwidthPackageId) {
                this.cenBandwidthPackageId = cenBandwidthPackageId;
                return this;
            }

            public CenBandwidthPackageIds build() {
                return new CenBandwidthPackageIds(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;


        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * <p>Key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;


        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * <p>Tag.</p>
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Cen extends TeaModel {
        @NameInMap("CenBandwidthPackageIds")
        private CenBandwidthPackageIds cenBandwidthPackageIds;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProtectionLevel")
        private String protectionLevel;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;


        private Cen(Builder builder) {
            this.cenBandwidthPackageIds = builder.cenBandwidthPackageIds;
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.name = builder.name;
            this.protectionLevel = builder.protectionLevel;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cen create() {
            return builder().build();
        }

        /**
         * @return cenBandwidthPackageIds
         */
        public CenBandwidthPackageIds getCenBandwidthPackageIds() {
            return this.cenBandwidthPackageIds;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protectionLevel
         */
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private CenBandwidthPackageIds cenBandwidthPackageIds; 
            private String cenId; 
            private String creationTime; 
            private String description; 
            private String name; 
            private String protectionLevel; 
            private String status; 
            private Tags tags; 

            /**
             * <p>CenBandwidthPackageIds.</p>
             */
            public Builder cenBandwidthPackageIds(CenBandwidthPackageIds cenBandwidthPackageIds) {
                this.cenBandwidthPackageIds = cenBandwidthPackageIds;
                return this;
            }

            /**
             * <p>CenId.</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>CreationTime.</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>ProtectionLevel.</p>
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public Cen build() {
                return new Cen(this);
            } 

        } 

    }
    public static class Cens extends TeaModel {
        @NameInMap("Cen")
        private java.util.List < Cen> cen;


        private Cens(Builder builder) {
            this.cen = builder.cen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cens create() {
            return builder().build();
        }

        /**
         * @return cen
         */
        public java.util.List < Cen> getCen() {
            return this.cen;
        }

        public static final class Builder {
            private java.util.List < Cen> cen; 

            /**
             * <p>Cen.</p>
             */
            public Builder cen(java.util.List < Cen> cen) {
                this.cen = cen;
                return this;
            }

            public Cens build() {
                return new Cens(this);
            } 

        } 

    }
}
