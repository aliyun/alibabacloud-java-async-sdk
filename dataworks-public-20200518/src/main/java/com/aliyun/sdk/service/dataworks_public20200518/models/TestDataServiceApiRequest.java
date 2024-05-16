// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>TestDataServiceApiRequest</p>
 */
public class TestDataServiceApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyContent")
    private String bodyContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyParams")
    private java.util.List < BodyParams> bodyParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HeadParams")
    private java.util.List < HeadParams> headParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PathParams")
    private java.util.List < PathParams> pathParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryParam")
    private java.util.List < QueryParam> queryParam;

    private TestDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiId = builder.apiId;
        this.bodyContent = builder.bodyContent;
        this.bodyParams = builder.bodyParams;
        this.headParams = builder.headParams;
        this.pathParams = builder.pathParams;
        this.queryParam = builder.queryParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestDataServiceApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiId
     */
    public Long getApiId() {
        return this.apiId;
    }

    /**
     * @return bodyContent
     */
    public String getBodyContent() {
        return this.bodyContent;
    }

    /**
     * @return bodyParams
     */
    public java.util.List < BodyParams> getBodyParams() {
        return this.bodyParams;
    }

    /**
     * @return headParams
     */
    public java.util.List < HeadParams> getHeadParams() {
        return this.headParams;
    }

    /**
     * @return pathParams
     */
    public java.util.List < PathParams> getPathParams() {
        return this.pathParams;
    }

    /**
     * @return queryParam
     */
    public java.util.List < QueryParam> getQueryParam() {
        return this.queryParam;
    }

    public static final class Builder extends Request.Builder<TestDataServiceApiRequest, Builder> {
        private String regionId; 
        private Long apiId; 
        private String bodyContent; 
        private java.util.List < BodyParams> bodyParams; 
        private java.util.List < HeadParams> headParams; 
        private java.util.List < PathParams> pathParams; 
        private java.util.List < QueryParam> queryParam; 

        private Builder() {
            super();
        } 

        private Builder(TestDataServiceApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiId = request.apiId;
            this.bodyContent = request.bodyContent;
            this.bodyParams = request.bodyParams;
            this.headParams = request.headParams;
            this.pathParams = request.pathParams;
            this.queryParam = request.queryParam;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the DataService Studio API on which the test is performed.
         */
        public Builder apiId(Long apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The data of the request body.
         */
        public Builder bodyContent(String bodyContent) {
            this.putBodyParameter("BodyContent", bodyContent);
            this.bodyContent = bodyContent;
            return this;
        }

        /**
         * The request parameters that are contained in the request body.
         */
        public Builder bodyParams(java.util.List < BodyParams> bodyParams) {
            this.putBodyParameter("BodyParams", bodyParams);
            this.bodyParams = bodyParams;
            return this;
        }

        /**
         * The request parameters that are contained in the request header.
         */
        public Builder headParams(java.util.List < HeadParams> headParams) {
            this.putBodyParameter("HeadParams", headParams);
            this.headParams = headParams;
            return this;
        }

        /**
         * The request parameters that are contained in the request path.
         */
        public Builder pathParams(java.util.List < PathParams> pathParams) {
            this.putBodyParameter("PathParams", pathParams);
            this.pathParams = pathParams;
            return this;
        }

        /**
         * The request parameters that are contained in the query.
         */
        public Builder queryParam(java.util.List < QueryParam> queryParam) {
            this.putBodyParameter("QueryParam", queryParam);
            this.queryParam = queryParam;
            return this;
        }

        @Override
        public TestDataServiceApiRequest build() {
            return new TestDataServiceApiRequest(this);
        } 

    } 

    public static class BodyParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamKey")
        private String paramKey;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private BodyParams(Builder builder) {
            this.paramKey = builder.paramKey;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyParams create() {
            return builder().build();
        }

        /**
         * @return paramKey
         */
        public String getParamKey() {
            return this.paramKey;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String paramKey; 
            private String paramValue; 

            /**
             * The name of the parameter.
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public BodyParams build() {
                return new BodyParams(this);
            } 

        } 

    }
    public static class HeadParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamKey")
        private String paramKey;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private HeadParams(Builder builder) {
            this.paramKey = builder.paramKey;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeadParams create() {
            return builder().build();
        }

        /**
         * @return paramKey
         */
        public String getParamKey() {
            return this.paramKey;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String paramKey; 
            private String paramValue; 

            /**
             * The name of the parameter.
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public HeadParams build() {
                return new HeadParams(this);
            } 

        } 

    }
    public static class PathParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamKey")
        private String paramKey;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private PathParams(Builder builder) {
            this.paramKey = builder.paramKey;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathParams create() {
            return builder().build();
        }

        /**
         * @return paramKey
         */
        public String getParamKey() {
            return this.paramKey;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String paramKey; 
            private String paramValue; 

            /**
             * The name of the parameter.
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public PathParams build() {
                return new PathParams(this);
            } 

        } 

    }
    public static class QueryParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamKey")
        private String paramKey;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private QueryParam(Builder builder) {
            this.paramKey = builder.paramKey;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryParam create() {
            return builder().build();
        }

        /**
         * @return paramKey
         */
        public String getParamKey() {
            return this.paramKey;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String paramKey; 
            private String paramValue; 

            /**
             * The name of the parameter.
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public QueryParam build() {
                return new QueryParam(this);
            } 

        } 

    }
}
