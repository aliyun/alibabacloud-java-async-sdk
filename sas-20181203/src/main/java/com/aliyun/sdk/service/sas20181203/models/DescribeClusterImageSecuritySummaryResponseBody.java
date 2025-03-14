// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeClusterImageSecuritySummaryResponseBody model) {
            this.clusterImageEvent = model.clusterImageEvent;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the image-related security events.</p>
         */
        public Builder clusterImageEvent(ClusterImageEvent clusterImageEvent) {
            this.clusterImageEvent = clusterImageEvent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterImageSecuritySummaryResponseBody build() {
            return new DescribeClusterImageSecuritySummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterImageSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterImageSecuritySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ImageBaseline model) {
                this.count = model.count;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of baselines.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
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
    /**
     * 
     * {@link DescribeClusterImageSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterImageSecuritySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ImageCveVul model) {
                this.count = model.count;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
             * <li><strong>nntf</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
             * <li><strong>later</strong>: low. You can ignore the vulnerability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>later</p>
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
    /**
     * 
     * {@link DescribeClusterImageSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterImageSecuritySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ImageMaliciousFile model) {
                this.count = model.count;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of malicious samples.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
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
    /**
     * 
     * {@link DescribeClusterImageSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterImageSecuritySummaryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ImageScaVul model) {
                this.count = model.count;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The number of image application vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
             * <li><strong>nntf</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
             * <li><strong>later</strong>: low. You can ignore the vulnerability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>later</p>
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
    /**
     * 
     * {@link DescribeClusterImageSecuritySummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterImageSecuritySummaryResponseBody</p>
     */
    public static class ClusterImageEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageBaseline")
        private java.util.List<ImageBaseline> imageBaseline;

        @com.aliyun.core.annotation.NameInMap("ImageCveVul")
        private java.util.List<ImageCveVul> imageCveVul;

        @com.aliyun.core.annotation.NameInMap("ImageMaliciousFile")
        private java.util.List<ImageMaliciousFile> imageMaliciousFile;

        @com.aliyun.core.annotation.NameInMap("ImageScaVul")
        private java.util.List<ImageScaVul> imageScaVul;

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
        public java.util.List<ImageBaseline> getImageBaseline() {
            return this.imageBaseline;
        }

        /**
         * @return imageCveVul
         */
        public java.util.List<ImageCveVul> getImageCveVul() {
            return this.imageCveVul;
        }

        /**
         * @return imageMaliciousFile
         */
        public java.util.List<ImageMaliciousFile> getImageMaliciousFile() {
            return this.imageMaliciousFile;
        }

        /**
         * @return imageScaVul
         */
        public java.util.List<ImageScaVul> getImageScaVul() {
            return this.imageScaVul;
        }

        public static final class Builder {
            private java.util.List<ImageBaseline> imageBaseline; 
            private java.util.List<ImageCveVul> imageCveVul; 
            private java.util.List<ImageMaliciousFile> imageMaliciousFile; 
            private java.util.List<ImageScaVul> imageScaVul; 

            private Builder() {
            } 

            private Builder(ClusterImageEvent model) {
                this.imageBaseline = model.imageBaseline;
                this.imageCveVul = model.imageCveVul;
                this.imageMaliciousFile = model.imageMaliciousFile;
                this.imageScaVul = model.imageScaVul;
            } 

            /**
             * <p>The information about image baseline risks.</p>
             */
            public Builder imageBaseline(java.util.List<ImageBaseline> imageBaseline) {
                this.imageBaseline = imageBaseline;
                return this;
            }

            /**
             * <p>The information about image system vulnerabilities.</p>
             */
            public Builder imageCveVul(java.util.List<ImageCveVul> imageCveVul) {
                this.imageCveVul = imageCveVul;
                return this;
            }

            /**
             * <p>The information about malicious image samples.</p>
             */
            public Builder imageMaliciousFile(java.util.List<ImageMaliciousFile> imageMaliciousFile) {
                this.imageMaliciousFile = imageMaliciousFile;
                return this;
            }

            /**
             * <p>The information about image application vulnerabilities.</p>
             */
            public Builder imageScaVul(java.util.List<ImageScaVul> imageScaVul) {
                this.imageScaVul = imageScaVul;
                return this;
            }

            public ClusterImageEvent build() {
                return new ClusterImageEvent(this);
            } 

        } 

    }
}
