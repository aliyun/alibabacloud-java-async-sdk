// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteScanResultDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteScanResultDetailResponseBody</p>
 */
public class DescribeWebsiteScanResultDetailResponseBody extends TeaModel {
    @NameInMap("Baseline")
    private String baseline;

    @NameInMap("Content")
    private String content;

    @NameInMap("HitKeywords")
    private java.util.List < String > hitKeywords;

    @NameInMap("ImageScanResults")
    private java.util.List < ImageScanResults> imageScanResults;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("TamperedSource")
    private String tamperedSource;

    private DescribeWebsiteScanResultDetailResponseBody(Builder builder) {
        this.baseline = builder.baseline;
        this.content = builder.content;
        this.hitKeywords = builder.hitKeywords;
        this.imageScanResults = builder.imageScanResults;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.tamperedSource = builder.tamperedSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteScanResultDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return baseline
     */
    public String getBaseline() {
        return this.baseline;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return hitKeywords
     */
    public java.util.List < String > getHitKeywords() {
        return this.hitKeywords;
    }

    /**
     * @return imageScanResults
     */
    public java.util.List < ImageScanResults> getImageScanResults() {
        return this.imageScanResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tamperedSource
     */
    public String getTamperedSource() {
        return this.tamperedSource;
    }

    public static final class Builder {
        private String baseline; 
        private String content; 
        private java.util.List < String > hitKeywords; 
        private java.util.List < ImageScanResults> imageScanResults; 
        private String requestId; 
        private String resourceType; 
        private String tamperedSource; 

        /**
         * Baseline.
         */
        public Builder baseline(String baseline) {
            this.baseline = baseline;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * HitKeywords.
         */
        public Builder hitKeywords(java.util.List < String > hitKeywords) {
            this.hitKeywords = hitKeywords;
            return this;
        }

        /**
         * ImageScanResults.
         */
        public Builder imageScanResults(java.util.List < ImageScanResults> imageScanResults) {
            this.imageScanResults = imageScanResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TamperedSource.
         */
        public Builder tamperedSource(String tamperedSource) {
            this.tamperedSource = tamperedSource;
            return this;
        }

        public DescribeWebsiteScanResultDetailResponseBody build() {
            return new DescribeWebsiteScanResultDetailResponseBody(this);
        } 

    } 

    public static class ImageScanResults extends TeaModel {
        @NameInMap("Labels")
        private java.util.List < String > labels;

        @NameInMap("Url")
        private String url;

        private ImageScanResults(Builder builder) {
            this.labels = builder.labels;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageScanResults create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List < String > getLabels() {
            return this.labels;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List < String > labels; 
            private String url; 

            /**
             * Labels.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageScanResults build() {
                return new ImageScanResults(this);
            } 

        } 

    }
}
