// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.videoenhan20200320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceVideoTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceVideoTemplateResponseBody</p>
 */
public class QueryFaceVideoTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFaceVideoTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceVideoTemplateResponseBody create() {
        return builder().build();
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

        public QueryFaceVideoTemplateResponseBody build() {
            return new QueryFaceVideoTemplateResponseBody(this);
        } 

    } 

    public static class FaceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateFaceID")
        private String templateFaceID;

        @com.aliyun.core.annotation.NameInMap("TemplateFaceURL")
        private String templateFaceURL;

        private FaceInfos(Builder builder) {
            this.templateFaceID = builder.templateFaceID;
            this.templateFaceURL = builder.templateFaceURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceInfos create() {
            return builder().build();
        }

        /**
         * @return templateFaceID
         */
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

        /**
         * @return templateFaceURL
         */
        public String getTemplateFaceURL() {
            return this.templateFaceURL;
        }

        public static final class Builder {
            private String templateFaceID; 
            private String templateFaceURL; 

            /**
             * TemplateFaceID.
             */
            public Builder templateFaceID(String templateFaceID) {
                this.templateFaceID = templateFaceID;
                return this;
            }

            /**
             * TemplateFaceURL.
             */
            public Builder templateFaceURL(String templateFaceURL) {
                this.templateFaceURL = templateFaceURL;
                return this;
            }

            public FaceInfos build() {
                return new FaceInfos(this);
            } 

        } 

    }
    public static class Elements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FaceInfos")
        private java.util.List < FaceInfos> faceInfos;

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
        public java.util.List < FaceInfos> getFaceInfos() {
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
            private java.util.List < FaceInfos> faceInfos; 
            private String templateId; 
            private String templateURL; 
            private String updateTime; 
            private String userId; 

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
            public Builder faceInfos(java.util.List < FaceInfos> faceInfos) {
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Elements")
        private java.util.List < Elements> elements;

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
        public java.util.List < Elements> getElements() {
            return this.elements;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Elements> elements; 
            private Long total; 

            /**
             * Elements.
             */
            public Builder elements(java.util.List < Elements> elements) {
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
