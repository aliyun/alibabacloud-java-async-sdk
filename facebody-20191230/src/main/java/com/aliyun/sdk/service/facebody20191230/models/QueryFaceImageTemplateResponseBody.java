// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

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
 * {@link QueryFaceImageTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceImageTemplateResponseBody</p>
 */
public class QueryFaceImageTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFaceImageTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceImageTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryFaceImageTemplateResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFaceImageTemplateResponseBody build() {
            return new QueryFaceImageTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaceImageTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceImageTemplateResponseBody</p>
     */
    public static class FaceRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        @com.aliyun.core.annotation.NameInMap("X")
        private String x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private String y;

        private FaceRect(Builder builder) {
            this.height = builder.height;
            this.width = builder.width;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceRect create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private String height; 
            private String width; 
            private String x; 
            private String y; 

            private Builder() {
            } 

            private Builder(FaceRect model) {
                this.height = model.height;
                this.width = model.width;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public FaceRect build() {
                return new FaceRect(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFaceImageTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceImageTemplateResponseBody</p>
     */
    public static class FaceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceRect")
        private FaceRect faceRect;

        @com.aliyun.core.annotation.NameInMap("TemplateFaceID")
        private String templateFaceID;

        private FaceInfos(Builder builder) {
            this.faceRect = builder.faceRect;
            this.templateFaceID = builder.templateFaceID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceInfos create() {
            return builder().build();
        }

        /**
         * @return faceRect
         */
        public FaceRect getFaceRect() {
            return this.faceRect;
        }

        /**
         * @return templateFaceID
         */
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

        public static final class Builder {
            private FaceRect faceRect; 
            private String templateFaceID; 

            private Builder() {
            } 

            private Builder(FaceInfos model) {
                this.faceRect = model.faceRect;
                this.templateFaceID = model.templateFaceID;
            } 

            /**
             * FaceRect.
             */
            public Builder faceRect(FaceRect faceRect) {
                this.faceRect = faceRect;
                return this;
            }

            /**
             * TemplateFaceID.
             */
            public Builder templateFaceID(String templateFaceID) {
                this.templateFaceID = templateFaceID;
                return this;
            }

            public FaceInfos build() {
                return new FaceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFaceImageTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceImageTemplateResponseBody</p>
     */
    public static class Elements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FaceInfos")
        private java.util.List<FaceInfos> faceInfos;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateURL")
        private String templateURL;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Elements(Builder builder) {
            this.createTime = builder.createTime;
            this.faceInfos = builder.faceInfos;
            this.templateId = builder.templateId;
            this.templateURL = builder.templateURL;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Elements create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return faceInfos
         */
        public java.util.List<FaceInfos> getFaceInfos() {
            return this.faceInfos;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateURL
         */
        public String getTemplateURL() {
            return this.templateURL;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<FaceInfos> faceInfos; 
            private String templateId; 
            private String templateURL; 
            private String updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Elements model) {
                this.createTime = model.createTime;
                this.faceInfos = model.faceInfos;
                this.templateId = model.templateId;
                this.templateURL = model.templateURL;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FaceInfos.
             */
            public Builder faceInfos(java.util.List<FaceInfos> faceInfos) {
                this.faceInfos = faceInfos;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateURL.
             */
            public Builder templateURL(String templateURL) {
                this.templateURL = templateURL;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Elements build() {
                return new Elements(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFaceImageTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceImageTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Elements")
        private java.util.List<Elements> elements;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.elements = builder.elements;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return elements
         */
        public java.util.List<Elements> getElements() {
            return this.elements;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Elements> elements; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.elements = model.elements;
                this.total = model.total;
            } 

            /**
             * Elements.
             */
            public Builder elements(java.util.List<Elements> elements) {
                this.elements = elements;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
