// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomOcrTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomOcrTemplateResponseBody</p>
 */
public class DescribeCustomOcrTemplateResponseBody extends TeaModel {
    @NameInMap("OcrTemplateList")
    private java.util.List < OcrTemplateList> ocrTemplateList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCustomOcrTemplateResponseBody(Builder builder) {
        this.ocrTemplateList = builder.ocrTemplateList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomOcrTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return ocrTemplateList
     */
    public java.util.List < OcrTemplateList> getOcrTemplateList() {
        return this.ocrTemplateList;
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
        private java.util.List < OcrTemplateList> ocrTemplateList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * OcrTemplateList.
         */
        public Builder ocrTemplateList(java.util.List < OcrTemplateList> ocrTemplateList) {
            this.ocrTemplateList = ocrTemplateList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCustomOcrTemplateResponseBody build() {
            return new DescribeCustomOcrTemplateResponseBody(this);
        } 

    } 

    public static class RecognizeArea extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Name")
        private String name;

        @NameInMap("Width")
        private Integer width;

        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private RecognizeArea(Builder builder) {
            this.height = builder.height;
            this.name = builder.name;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecognizeArea create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer height; 
            private String name; 
            private Integer width; 
            private Integer x; 
            private Integer y; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public RecognizeArea build() {
                return new RecognizeArea(this);
            } 

        } 

    }
    public static class ReferArea extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Name")
        private String name;

        @NameInMap("Width")
        private Integer width;

        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private ReferArea(Builder builder) {
            this.height = builder.height;
            this.name = builder.name;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferArea create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer height; 
            private String name; 
            private Integer width; 
            private Integer x; 
            private Integer y; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public ReferArea build() {
                return new ReferArea(this);
            } 

        } 

    }
    public static class OcrTemplateList extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("ImgUrl")
        private String imgUrl;

        @NameInMap("Name")
        private String name;

        @NameInMap("RecognizeArea")
        private java.util.List < RecognizeArea> recognizeArea;

        @NameInMap("ReferArea")
        private java.util.List < ReferArea> referArea;

        @NameInMap("Status")
        private Integer status;

        private OcrTemplateList(Builder builder) {
            this.id = builder.id;
            this.imgUrl = builder.imgUrl;
            this.name = builder.name;
            this.recognizeArea = builder.recognizeArea;
            this.referArea = builder.referArea;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OcrTemplateList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return imgUrl
         */
        public String getImgUrl() {
            return this.imgUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recognizeArea
         */
        public java.util.List < RecognizeArea> getRecognizeArea() {
            return this.recognizeArea;
        }

        /**
         * @return referArea
         */
        public java.util.List < ReferArea> getReferArea() {
            return this.referArea;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long id; 
            private String imgUrl; 
            private String name; 
            private java.util.List < RecognizeArea> recognizeArea; 
            private java.util.List < ReferArea> referArea; 
            private Integer status; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ImgUrl.
             */
            public Builder imgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RecognizeArea.
             */
            public Builder recognizeArea(java.util.List < RecognizeArea> recognizeArea) {
                this.recognizeArea = recognizeArea;
                return this;
            }

            /**
             * ReferArea.
             */
            public Builder referArea(java.util.List < ReferArea> referArea) {
                this.referArea = referArea;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public OcrTemplateList build() {
                return new OcrTemplateList(this);
            } 

        } 

    }
}
