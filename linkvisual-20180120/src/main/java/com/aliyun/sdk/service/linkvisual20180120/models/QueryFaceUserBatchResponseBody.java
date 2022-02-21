// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserBatchResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceUserBatchResponseBody</p>
 */
public class QueryFaceUserBatchResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryFaceUserBatchResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceUserBatchResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryFaceUserBatchResponseBody build() {
            return new QueryFaceUserBatchResponseBody(this);
        } 

    } 

    public static class FeatureDTOList extends TeaModel {
        @NameInMap("AlgorithmName")
        private String algorithmName;

        @NameInMap("AlgorithmProvider")
        private String algorithmProvider;

        @NameInMap("AlgorithmVersion")
        private String algorithmVersion;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("FaceMd5")
        private String faceMd5;

        private FeatureDTOList(Builder builder) {
            this.algorithmName = builder.algorithmName;
            this.algorithmProvider = builder.algorithmProvider;
            this.algorithmVersion = builder.algorithmVersion;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.faceMd5 = builder.faceMd5;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureDTOList create() {
            return builder().build();
        }

        /**
         * @return algorithmName
         */
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        /**
         * @return algorithmProvider
         */
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        /**
         * @return algorithmVersion
         */
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return faceMd5
         */
        public String getFaceMd5() {
            return this.faceMd5;
        }

        public static final class Builder {
            private String algorithmName; 
            private String algorithmProvider; 
            private String algorithmVersion; 
            private String errorCode; 
            private String errorMessage; 
            private String faceMd5; 

            /**
             * AlgorithmName.
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * AlgorithmProvider.
             */
            public Builder algorithmProvider(String algorithmProvider) {
                this.algorithmProvider = algorithmProvider;
                return this;
            }

            /**
             * AlgorithmVersion.
             */
            public Builder algorithmVersion(String algorithmVersion) {
                this.algorithmVersion = algorithmVersion;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FaceMd5.
             */
            public Builder faceMd5(String faceMd5) {
                this.faceMd5 = faceMd5;
                return this;
            }

            public FeatureDTOList build() {
                return new FeatureDTOList(this);
            } 

        } 

    }
    public static class FacePicList extends TeaModel {
        @NameInMap("FaceMd5")
        private String faceMd5;

        @NameInMap("FaceUrl")
        private String faceUrl;

        @NameInMap("FeatureDTOList")
        private java.util.List < FeatureDTOList> featureDTOList;

        private FacePicList(Builder builder) {
            this.faceMd5 = builder.faceMd5;
            this.faceUrl = builder.faceUrl;
            this.featureDTOList = builder.featureDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FacePicList create() {
            return builder().build();
        }

        /**
         * @return faceMd5
         */
        public String getFaceMd5() {
            return this.faceMd5;
        }

        /**
         * @return faceUrl
         */
        public String getFaceUrl() {
            return this.faceUrl;
        }

        /**
         * @return featureDTOList
         */
        public java.util.List < FeatureDTOList> getFeatureDTOList() {
            return this.featureDTOList;
        }

        public static final class Builder {
            private String faceMd5; 
            private String faceUrl; 
            private java.util.List < FeatureDTOList> featureDTOList; 

            /**
             * FaceMd5.
             */
            public Builder faceMd5(String faceMd5) {
                this.faceMd5 = faceMd5;
                return this;
            }

            /**
             * FaceUrl.
             */
            public Builder faceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
                return this;
            }

            /**
             * FeatureDTOList.
             */
            public Builder featureDTOList(java.util.List < FeatureDTOList> featureDTOList) {
                this.featureDTOList = featureDTOList;
                return this;
            }

            public FacePicList build() {
                return new FacePicList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CustomUserId")
        private String customUserId;

        @NameInMap("FacePicList")
        private java.util.List < FacePicList> facePicList;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Params")
        private String params;

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.customUserId = builder.customUserId;
            this.facePicList = builder.facePicList;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.params = builder.params;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customUserId
         */
        public String getCustomUserId() {
            return this.customUserId;
        }

        /**
         * @return facePicList
         */
        public java.util.List < FacePicList> getFacePicList() {
            return this.facePicList;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long createTime; 
            private String customUserId; 
            private java.util.List < FacePicList> facePicList; 
            private Long modifyTime; 
            private String name; 
            private String params; 
            private String userId; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomUserId.
             */
            public Builder customUserId(String customUserId) {
                this.customUserId = customUserId;
                return this;
            }

            /**
             * FacePicList.
             */
            public Builder facePicList(java.util.List < FacePicList> facePicList) {
                this.facePicList = facePicList;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
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
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
