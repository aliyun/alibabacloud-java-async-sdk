// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryFaceUserResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceUserResponseBody</p>
 */
public class QueryFaceUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryFaceUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryFaceUserResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A13279A-5640-45E7-87AA-83750541AD0E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryFaceUserResponseBody build() {
            return new QueryFaceUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaceUserResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceUserResponseBody</p>
     */
    public static class FeatureDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgorithmName")
        private String algorithmName;

        @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
        private String algorithmProvider;

        @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
        private String algorithmVersion;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FaceMd5")
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

            private Builder() {
            } 

            private Builder(FeatureDTOList model) {
                this.algorithmName = model.algorithmName;
                this.algorithmProvider = model.algorithmProvider;
                this.algorithmVersion = model.algorithmVersion;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.faceMd5 = model.faceMd5;
            } 

            /**
             * <p>The name of the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAlgorithmName</p>
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * <p>The provider of the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAlgorithmProvider</p>
             */
            public Builder algorithmProvider(String algorithmProvider) {
                this.algorithmProvider = algorithmProvider;
                return this;
            }

            /**
             * <p>The version of the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAlgorithmVersion</p>
             */
            public Builder algorithmVersion(String algorithmVersion) {
                this.algorithmVersion = algorithmVersion;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The MD5 hash of the face.</p>
             * 
             * <strong>example:</strong>
             * <p>TestFaceMd5</p>
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
    /**
     * 
     * {@link QueryFaceUserResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceUserResponseBody</p>
     */
    public static class FacePicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceMd5")
        private String faceMd5;

        @com.aliyun.core.annotation.NameInMap("FaceUrl")
        private String faceUrl;

        @com.aliyun.core.annotation.NameInMap("FeatureDTOList")
        private java.util.List<FeatureDTOList> featureDTOList;

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
        public java.util.List<FeatureDTOList> getFeatureDTOList() {
            return this.featureDTOList;
        }

        public static final class Builder {
            private String faceMd5; 
            private String faceUrl; 
            private java.util.List<FeatureDTOList> featureDTOList; 

            private Builder() {
            } 

            private Builder(FacePicList model) {
                this.faceMd5 = model.faceMd5;
                this.faceUrl = model.faceUrl;
                this.featureDTOList = model.featureDTOList;
            } 

            /**
             * <p>The MD5 hash of the photo.</p>
             * 
             * <strong>example:</strong>
             * <p>TestFaceMd5</p>
             */
            public Builder faceMd5(String faceMd5) {
                this.faceMd5 = faceMd5;
                return this;
            }

            /**
             * <p>The URL of the photo.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.com/xxx.jpg">https://test.com/xxx.jpg</a></p>
             */
            public Builder faceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
                return this;
            }

            /**
             * <p>The list of face feature values.</p>
             */
            public Builder featureDTOList(java.util.List<FeatureDTOList> featureDTOList) {
                this.featureDTOList = featureDTOList;
                return this;
            }

            public FacePicList build() {
                return new FacePicList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFaceUserResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomUserId")
        private String customUserId;

        @com.aliyun.core.annotation.NameInMap("FacePicList")
        private java.util.List<FacePicList> facePicList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.customUserId = builder.customUserId;
            this.facePicList = builder.facePicList;
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
         * @return customUserId
         */
        public String getCustomUserId() {
            return this.customUserId;
        }

        /**
         * @return facePicList
         */
        public java.util.List<FacePicList> getFacePicList() {
            return this.facePicList;
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
            private String customUserId; 
            private java.util.List<FacePicList> facePicList; 
            private String name; 
            private String params; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customUserId = model.customUserId;
                this.facePicList = model.facePicList;
                this.name = model.name;
                this.params = model.params;
                this.userId = model.userId;
            } 

            /**
             * <p>The user ID in the caller\&quot;s system.</p>
             * 
             * <strong>example:</strong>
             * <p>TestCustomUserId</p>
             */
            public Builder customUserId(String customUserId) {
                this.customUserId = customUserId;
                return this;
            }

            /**
             * <p>The list of face photo information.</p>
             */
            public Builder facePicList(java.util.List<FacePicList> facePicList) {
                this.facePicList = facePicList;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>TestName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;age&quot;:28, &quot;sex&quot;:&quot;male&quot;}</p>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TestUserId</p>
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
