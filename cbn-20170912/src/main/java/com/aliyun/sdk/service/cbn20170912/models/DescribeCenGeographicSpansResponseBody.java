// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCenGeographicSpansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenGeographicSpansResponseBody</p>
 */
public class DescribeCenGeographicSpansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GeographicSpanModels")
    private GeographicSpanModels geographicSpanModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenGeographicSpansResponseBody(Builder builder) {
        this.geographicSpanModels = builder.geographicSpanModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenGeographicSpansResponseBody create() {
        return builder().build();
    }

    /**
     * @return geographicSpanModels
     */
    public GeographicSpanModels getGeographicSpanModels() {
        return this.geographicSpanModels;
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
        private GeographicSpanModels geographicSpanModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>A list of areas.</p>
         */
        public Builder geographicSpanModels(GeographicSpanModels geographicSpanModels) {
            this.geographicSpanModels = geographicSpanModels;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>09780287-BC24-4164-8334-773432E32696</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenGeographicSpansResponseBody build() {
            return new DescribeCenGeographicSpansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenGeographicSpansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenGeographicSpansResponseBody</p>
     */
    public static class GeographicSpanModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GeographicSpanId")
        private String geographicSpanId;

        @com.aliyun.core.annotation.NameInMap("LocalGeoRegionId")
        private String localGeoRegionId;

        @com.aliyun.core.annotation.NameInMap("OppositeGeoRegionId")
        private String oppositeGeoRegionId;

        private GeographicSpanModel(Builder builder) {
            this.geographicSpanId = builder.geographicSpanId;
            this.localGeoRegionId = builder.localGeoRegionId;
            this.oppositeGeoRegionId = builder.oppositeGeoRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeographicSpanModel create() {
            return builder().build();
        }

        /**
         * @return geographicSpanId
         */
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        /**
         * @return localGeoRegionId
         */
        public String getLocalGeoRegionId() {
            return this.localGeoRegionId;
        }

        /**
         * @return oppositeGeoRegionId
         */
        public String getOppositeGeoRegionId() {
            return this.oppositeGeoRegionId;
        }

        public static final class Builder {
            private String geographicSpanId; 
            private String localGeoRegionId; 
            private String oppositeGeoRegionId; 

            /**
             * <p>The ID of the pair of connected areas.</p>
             * 
             * <strong>example:</strong>
             * <p>china_asia-pacific</p>
             */
            public Builder geographicSpanId(String geographicSpanId) {
                this.geographicSpanId = geographicSpanId;
                return this;
            }

            /**
             * <p>The ID of the local area.</p>
             * 
             * <strong>example:</strong>
             * <p>asia-pacific</p>
             */
            public Builder localGeoRegionId(String localGeoRegionId) {
                this.localGeoRegionId = localGeoRegionId;
                return this;
            }

            /**
             * <p>The ID of the peer area.</p>
             * 
             * <strong>example:</strong>
             * <p>china</p>
             */
            public Builder oppositeGeoRegionId(String oppositeGeoRegionId) {
                this.oppositeGeoRegionId = oppositeGeoRegionId;
                return this;
            }

            public GeographicSpanModel build() {
                return new GeographicSpanModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenGeographicSpansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenGeographicSpansResponseBody</p>
     */
    public static class GeographicSpanModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GeographicSpanModel")
        private java.util.List < GeographicSpanModel> geographicSpanModel;

        private GeographicSpanModels(Builder builder) {
            this.geographicSpanModel = builder.geographicSpanModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeographicSpanModels create() {
            return builder().build();
        }

        /**
         * @return geographicSpanModel
         */
        public java.util.List < GeographicSpanModel> getGeographicSpanModel() {
            return this.geographicSpanModel;
        }

        public static final class Builder {
            private java.util.List < GeographicSpanModel> geographicSpanModel; 

            /**
             * GeographicSpanModel.
             */
            public Builder geographicSpanModel(java.util.List < GeographicSpanModel> geographicSpanModel) {
                this.geographicSpanModel = geographicSpanModel;
                return this;
            }

            public GeographicSpanModels build() {
                return new GeographicSpanModels(this);
            } 

        } 

    }
}
