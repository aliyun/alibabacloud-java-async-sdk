// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
    private java.util.List<BodyParams> bodyParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HeadParams")
    private java.util.List<HeadParams> headParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PathParams")
    private java.util.List<PathParams> pathParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryParam")
    private java.util.List<QueryParam> queryParam;

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
    public java.util.List<BodyParams> getBodyParams() {
        return this.bodyParams;
    }

    /**
     * @return headParams
     */
    public java.util.List<HeadParams> getHeadParams() {
        return this.headParams;
    }

    /**
     * @return pathParams
     */
    public java.util.List<PathParams> getPathParams() {
        return this.pathParams;
    }

    /**
     * @return queryParam
     */
    public java.util.List<QueryParam> getQueryParam() {
        return this.queryParam;
    }

    public static final class Builder extends Request.Builder<TestDataServiceApiRequest, Builder> {
        private String regionId; 
        private Long apiId; 
        private String bodyContent; 
        private java.util.List<BodyParams> bodyParams; 
        private java.util.List<HeadParams> headParams; 
        private java.util.List<PathParams> pathParams; 
        private java.util.List<QueryParam> queryParam; 

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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the DataService Studio API on which the test is performed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12343</p>
         */
        public Builder apiId(Long apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The data of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;test&quot;}</p>
         */
        public Builder bodyContent(String bodyContent) {
            this.putBodyParameter("BodyContent", bodyContent);
            this.bodyContent = bodyContent;
            return this;
        }

        /**
         * <p>The request parameters that are contained in the request body.</p>
         */
        public Builder bodyParams(java.util.List<BodyParams> bodyParams) {
            this.putBodyParameter("BodyParams", bodyParams);
            this.bodyParams = bodyParams;
            return this;
        }

        /**
         * <p>The request parameters that are contained in the request header.</p>
         */
        public Builder headParams(java.util.List<HeadParams> headParams) {
            this.putBodyParameter("HeadParams", headParams);
            this.headParams = headParams;
            return this;
        }

        /**
         * <p>The request parameters that are contained in the request path.</p>
         */
        public Builder pathParams(java.util.List<PathParams> pathParams) {
            this.putBodyParameter("PathParams", pathParams);
            this.pathParams = pathParams;
            return this;
        }

        /**
         * <p>The request parameters that are contained in the query.</p>
         */
        public Builder queryParam(java.util.List<QueryParam> queryParam) {
            this.putBodyParameter("QueryParam", queryParam);
            this.queryParam = queryParam;
            return this;
        }

        @Override
        public TestDataServiceApiRequest build() {
            return new TestDataServiceApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link TestDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>TestDataServiceApiRequest</p>
     */
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
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link TestDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>TestDataServiceApiRequest</p>
     */
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
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>requestId</p>
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd</p>
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
    /**
     * 
     * {@link TestDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>TestDataServiceApiRequest</p>
     */
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
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>path1</p>
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
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
    /**
     * 
     * {@link TestDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>TestDataServiceApiRequest</p>
     */
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
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder paramKey(String paramKey) {
                this.paramKey = paramKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
