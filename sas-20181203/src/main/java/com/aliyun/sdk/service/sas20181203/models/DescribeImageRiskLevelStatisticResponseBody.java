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
 * {@link DescribeImageRiskLevelStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageRiskLevelStatisticResponseBody</p>
 */
public class DescribeImageRiskLevelStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageRiskLevelList")
    private java.util.List<ImageRiskLevelList> imageRiskLevelList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageRiskLevelStatisticResponseBody(Builder builder) {
        this.imageRiskLevelList = builder.imageRiskLevelList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRiskLevelStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageRiskLevelList
     */
    public java.util.List<ImageRiskLevelList> getImageRiskLevelList() {
        return this.imageRiskLevelList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ImageRiskLevelList> imageRiskLevelList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImageRiskLevelStatisticResponseBody model) {
            this.imageRiskLevelList = model.imageRiskLevelList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about risks at the image level. The risks include vulnerabilities, baselines risks, and malicious file risks.</p>
         */
        public Builder imageRiskLevelList(java.util.List<ImageRiskLevelList> imageRiskLevelList) {
            this.imageRiskLevelList = imageRiskLevelList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A60DA4EC-7CD8-577D-AD73-******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageRiskLevelStatisticResponseBody build() {
            return new DescribeImageRiskLevelStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageRiskLevelStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageRiskLevelStatisticResponseBody</p>
     */
    public static class ImageRiskLevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cnt")
        private Integer cnt;

        @com.aliyun.core.annotation.NameInMap("ImageRiskLevel")
        private String imageRiskLevel;

        private ImageRiskLevelList(Builder builder) {
            this.cnt = builder.cnt;
            this.imageRiskLevel = builder.imageRiskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRiskLevelList create() {
            return builder().build();
        }

        /**
         * @return cnt
         */
        public Integer getCnt() {
            return this.cnt;
        }

        /**
         * @return imageRiskLevel
         */
        public String getImageRiskLevel() {
            return this.imageRiskLevel;
        }

        public static final class Builder {
            private Integer cnt; 
            private String imageRiskLevel; 

            private Builder() {
            } 

            private Builder(ImageRiskLevelList model) {
                this.cnt = model.cnt;
                this.imageRiskLevel = model.imageRiskLevel;
            } 

            /**
             * <p>The number of images at the risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder cnt(Integer cnt) {
                this.cnt = cnt;
                return this;
            }

            /**
             * <p>The risk level of the image. Valid values:</p>
             * <ul>
             * <li><strong>3</strong>: high risk.</li>
             * <li><strong>2</strong>: medium risk.</li>
             * <li><strong>1</strong>: low risk.</li>
             * <li><strong>0</strong>: no risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder imageRiskLevel(String imageRiskLevel) {
                this.imageRiskLevel = imageRiskLevel;
                return this;
            }

            public ImageRiskLevelList build() {
                return new ImageRiskLevelList(this);
            } 

        } 

    }
}
