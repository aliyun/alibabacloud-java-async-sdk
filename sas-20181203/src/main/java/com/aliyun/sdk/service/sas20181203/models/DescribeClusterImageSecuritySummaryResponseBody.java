// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterImageSecuritySummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterImageSecuritySummaryResponseBody</p>
 */
public class DescribeClusterImageSecuritySummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterImageEvent")
    private ClusterImageEvent clusterImageEvent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterImageSecuritySummaryResponseBody(Builder builder) {
        this.clusterImageEvent = builder.clusterImageEvent;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterImageSecuritySummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterImageEvent
     */
    public ClusterImageEvent getClusterImageEvent() {
        return this.clusterImageEvent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterImageEvent clusterImageEvent; 
        private String requestId; 

        /**
         * The information about the image-related security events.
         */
        public Builder clusterImageEvent(ClusterImageEvent clusterImageEvent) {
            this.clusterImageEvent = clusterImageEvent;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterImageSecuritySummaryResponseBody build() {
            return new DescribeClusterImageSecuritySummaryResponseBody(this);
        } 

    } 

    public static class ImageBaseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private ImageBaseline(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageBaseline create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long count; 
            private String riskLevel; 

            /**
             * The number of baselines.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ImageBaseline build() {
                return new ImageBaseline(this);
            } 

        } 

    }
    public static class ImageCveVul extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private ImageCveVul(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCveVul create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long count; 
            private String riskLevel; 

            /**
             * The number of vulnerabilities.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The alert level. Valid values:
             * <p>
             * 
             * *   **asap**: high. You must fix the vulnerability at the earliest opportunity.
             * *   **nntf**: medium. You can fix the vulnerability based on your business requirements.
             * *   **later**: low. You can ignore the vulnerability.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ImageCveVul build() {
                return new ImageCveVul(this);
            } 

        } 

    }
    public static class ImageMaliciousFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private ImageMaliciousFile(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageMaliciousFile create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long count; 
            private String riskLevel; 

            /**
             * The number of malicious samples.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ImageMaliciousFile build() {
                return new ImageMaliciousFile(this);
            } 

        } 

    }
    public static class ImageScaVul extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private ImageScaVul(Builder builder) {
            this.count = builder.count;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageScaVul create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private Long count; 
            private String riskLevel; 

            /**
             * The number of image application vulnerabilities.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The alert level. Valid values:
             * <p>
             * 
             * *   **asap**: high. You must fix the vulnerability at the earliest opportunity.
             * *   **nntf**: medium. You can fix the vulnerability based on your business requirements.
             * *   **later**: low. You can ignore the vulnerability.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public ImageScaVul build() {
                return new ImageScaVul(this);
            } 

        } 

    }
    public static class ClusterImageEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageBaseline")
        private java.util.List < ImageBaseline> imageBaseline;

        @com.aliyun.core.annotation.NameInMap("ImageCveVul")
        private java.util.List < ImageCveVul> imageCveVul;

        @com.aliyun.core.annotation.NameInMap("ImageMaliciousFile")
        private java.util.List < ImageMaliciousFile> imageMaliciousFile;

        @com.aliyun.core.annotation.NameInMap("ImageScaVul")
        private java.util.List < ImageScaVul> imageScaVul;

        private ClusterImageEvent(Builder builder) {
            this.imageBaseline = builder.imageBaseline;
            this.imageCveVul = builder.imageCveVul;
            this.imageMaliciousFile = builder.imageMaliciousFile;
            this.imageScaVul = builder.imageScaVul;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterImageEvent create() {
            return builder().build();
        }

        /**
         * @return imageBaseline
         */
        public java.util.List < ImageBaseline> getImageBaseline() {
            return this.imageBaseline;
        }

        /**
         * @return imageCveVul
         */
        public java.util.List < ImageCveVul> getImageCveVul() {
            return this.imageCveVul;
        }

        /**
         * @return imageMaliciousFile
         */
        public java.util.List < ImageMaliciousFile> getImageMaliciousFile() {
            return this.imageMaliciousFile;
        }

        /**
         * @return imageScaVul
         */
        public java.util.List < ImageScaVul> getImageScaVul() {
            return this.imageScaVul;
        }

        public static final class Builder {
            private java.util.List < ImageBaseline> imageBaseline; 
            private java.util.List < ImageCveVul> imageCveVul; 
            private java.util.List < ImageMaliciousFile> imageMaliciousFile; 
            private java.util.List < ImageScaVul> imageScaVul; 

            /**
             * The information about image baseline risks.
             */
            public Builder imageBaseline(java.util.List < ImageBaseline> imageBaseline) {
                this.imageBaseline = imageBaseline;
                return this;
            }

            /**
             * The information about image system vulnerabilities.
             */
            public Builder imageCveVul(java.util.List < ImageCveVul> imageCveVul) {
                this.imageCveVul = imageCveVul;
                return this;
            }

            /**
             * The information about malicious image samples.
             */
            public Builder imageMaliciousFile(java.util.List < ImageMaliciousFile> imageMaliciousFile) {
                this.imageMaliciousFile = imageMaliciousFile;
                return this;
            }

            /**
             * The information about image application vulnerabilities.
             */
            public Builder imageScaVul(java.util.List < ImageScaVul> imageScaVul) {
                this.imageScaVul = imageScaVul;
                return this;
            }

            public ClusterImageEvent build() {
                return new ClusterImageEvent(this);
            } 

        } 

    }
}
