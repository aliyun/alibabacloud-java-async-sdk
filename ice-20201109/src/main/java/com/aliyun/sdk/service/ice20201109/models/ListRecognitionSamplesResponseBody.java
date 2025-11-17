// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListRecognitionSamplesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecognitionSamplesResponseBody</p>
 */
public class ListRecognitionSamplesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Samples")
    private Samples samples;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRecognitionSamplesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.samples = builder.samples;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecognitionSamplesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return samples
     */
    public Samples getSamples() {
        return this.samples;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Samples samples; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRecognitionSamplesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.samples = model.samples;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-xxxx-xxxxx-xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The samples.</p>
         */
        public Builder samples(Samples samples) {
            this.samples = samples;
            return this;
        }

        /**
         * <p>The total number of samples.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecognitionSamplesResponseBody build() {
            return new ListRecognitionSamplesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecognitionSamplesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecognitionSamplesResponseBody</p>
     */
    public static class Sample extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("SampleId")
        private String sampleId;

        private Sample(Builder builder) {
            this.entityId = builder.entityId;
            this.imageUrl = builder.imageUrl;
            this.libId = builder.libId;
            this.sampleId = builder.sampleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sample create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return sampleId
         */
        public String getSampleId() {
            return this.sampleId;
        }

        public static final class Builder {
            private String entityId; 
            private String imageUrl; 
            private String libId; 
            private String sampleId; 

            private Builder() {
            } 

            private Builder(Sample model) {
                this.entityId = model.entityId;
                this.imageUrl = model.imageUrl;
                this.libId = model.libId;
                this.sampleId = model.sampleId;
            } 

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The URL of the image sample.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/sample.png">https://example.com/sample.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * LibId.
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>The sample ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxxxxxxxx</p>
             */
            public Builder sampleId(String sampleId) {
                this.sampleId = sampleId;
                return this;
            }

            public Sample build() {
                return new Sample(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecognitionSamplesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecognitionSamplesResponseBody</p>
     */
    public static class Samples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sample")
        private java.util.List<Sample> sample;

        private Samples(Builder builder) {
            this.sample = builder.sample;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Samples create() {
            return builder().build();
        }

        /**
         * @return sample
         */
        public java.util.List<Sample> getSample() {
            return this.sample;
        }

        public static final class Builder {
            private java.util.List<Sample> sample; 

            private Builder() {
            } 

            private Builder(Samples model) {
                this.sample = model.sample;
            } 

            /**
             * Sample.
             */
            public Builder sample(java.util.List<Sample> sample) {
                this.sample = sample;
                return this;
            }

            public Samples build() {
                return new Samples(this);
            } 

        } 

    }
}
