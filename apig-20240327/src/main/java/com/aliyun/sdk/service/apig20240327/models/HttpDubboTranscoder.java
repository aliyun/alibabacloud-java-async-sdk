// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpDubboTranscoder} extends {@link TeaModel}
 *
 * <p>HttpDubboTranscoder</p>
 */
public class HttpDubboTranscoder extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dubboServiceGroup")
    private String dubboServiceGroup;

    @com.aliyun.core.annotation.NameInMap("dubboServiceName")
    private String dubboServiceName;

    @com.aliyun.core.annotation.NameInMap("dubboServiceVersion")
    private String dubboServiceVersion;

    @com.aliyun.core.annotation.NameInMap("methodMapList")
    private java.util.List<MethodMapList> methodMapList;

    private HttpDubboTranscoder(Builder builder) {
        this.dubboServiceGroup = builder.dubboServiceGroup;
        this.dubboServiceName = builder.dubboServiceName;
        this.dubboServiceVersion = builder.dubboServiceVersion;
        this.methodMapList = builder.methodMapList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpDubboTranscoder create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dubboServiceGroup
     */
    public String getDubboServiceGroup() {
        return this.dubboServiceGroup;
    }

    /**
     * @return dubboServiceName
     */
    public String getDubboServiceName() {
        return this.dubboServiceName;
    }

    /**
     * @return dubboServiceVersion
     */
    public String getDubboServiceVersion() {
        return this.dubboServiceVersion;
    }

    /**
     * @return methodMapList
     */
    public java.util.List<MethodMapList> getMethodMapList() {
        return this.methodMapList;
    }

    public static final class Builder {
        private String dubboServiceGroup; 
        private String dubboServiceName; 
        private String dubboServiceVersion; 
        private java.util.List<MethodMapList> methodMapList; 

        private Builder() {
        } 

        private Builder(HttpDubboTranscoder model) {
            this.dubboServiceGroup = model.dubboServiceGroup;
            this.dubboServiceName = model.dubboServiceName;
            this.dubboServiceVersion = model.dubboServiceVersion;
            this.methodMapList = model.methodMapList;
        } 

        /**
         * dubboServiceGroup.
         */
        public Builder dubboServiceGroup(String dubboServiceGroup) {
            this.dubboServiceGroup = dubboServiceGroup;
            return this;
        }

        /**
         * dubboServiceName.
         */
        public Builder dubboServiceName(String dubboServiceName) {
            this.dubboServiceName = dubboServiceName;
            return this;
        }

        /**
         * dubboServiceVersion.
         */
        public Builder dubboServiceVersion(String dubboServiceVersion) {
            this.dubboServiceVersion = dubboServiceVersion;
            return this;
        }

        /**
         * methodMapList.
         */
        public Builder methodMapList(java.util.List<MethodMapList> methodMapList) {
            this.methodMapList = methodMapList;
            return this;
        }

        public HttpDubboTranscoder build() {
            return new HttpDubboTranscoder(this);
        } 

    } 

    /**
     * 
     * {@link HttpDubboTranscoder} extends {@link TeaModel}
     *
     * <p>HttpDubboTranscoder</p>
     */
    public static class ParamMapsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extractKey")
        private String extractKey;

        @com.aliyun.core.annotation.NameInMap("extractKeySpec")
        private String extractKeySpec;

        @com.aliyun.core.annotation.NameInMap("mappingType")
        private String mappingType;

        private ParamMapsList(Builder builder) {
            this.extractKey = builder.extractKey;
            this.extractKeySpec = builder.extractKeySpec;
            this.mappingType = builder.mappingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamMapsList create() {
            return builder().build();
        }

        /**
         * @return extractKey
         */
        public String getExtractKey() {
            return this.extractKey;
        }

        /**
         * @return extractKeySpec
         */
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        /**
         * @return mappingType
         */
        public String getMappingType() {
            return this.mappingType;
        }

        public static final class Builder {
            private String extractKey; 
            private String extractKeySpec; 
            private String mappingType; 

            private Builder() {
            } 

            private Builder(ParamMapsList model) {
                this.extractKey = model.extractKey;
                this.extractKeySpec = model.extractKeySpec;
                this.mappingType = model.mappingType;
            } 

            /**
             * extractKey.
             */
            public Builder extractKey(String extractKey) {
                this.extractKey = extractKey;
                return this;
            }

            /**
             * extractKeySpec.
             */
            public Builder extractKeySpec(String extractKeySpec) {
                this.extractKeySpec = extractKeySpec;
                return this;
            }

            /**
             * mappingType.
             */
            public Builder mappingType(String mappingType) {
                this.mappingType = mappingType;
                return this;
            }

            public ParamMapsList build() {
                return new ParamMapsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpDubboTranscoder} extends {@link TeaModel}
     *
     * <p>HttpDubboTranscoder</p>
     */
    public static class MethodMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dubboMethodName")
        private String dubboMethodName;

        @com.aliyun.core.annotation.NameInMap("httpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("methodPath")
        private String methodPath;

        @com.aliyun.core.annotation.NameInMap("paramMapsList")
        private java.util.List<ParamMapsList> paramMapsList;

        @com.aliyun.core.annotation.NameInMap("passThroughAllHeaders")
        private String passThroughAllHeaders;

        @com.aliyun.core.annotation.NameInMap("passThroughList")
        private java.util.List<String> passThroughList;

        private MethodMapList(Builder builder) {
            this.dubboMethodName = builder.dubboMethodName;
            this.httpMethod = builder.httpMethod;
            this.methodPath = builder.methodPath;
            this.paramMapsList = builder.paramMapsList;
            this.passThroughAllHeaders = builder.passThroughAllHeaders;
            this.passThroughList = builder.passThroughList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MethodMapList create() {
            return builder().build();
        }

        /**
         * @return dubboMethodName
         */
        public String getDubboMethodName() {
            return this.dubboMethodName;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return methodPath
         */
        public String getMethodPath() {
            return this.methodPath;
        }

        /**
         * @return paramMapsList
         */
        public java.util.List<ParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        /**
         * @return passThroughAllHeaders
         */
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        /**
         * @return passThroughList
         */
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

        public static final class Builder {
            private String dubboMethodName; 
            private String httpMethod; 
            private String methodPath; 
            private java.util.List<ParamMapsList> paramMapsList; 
            private String passThroughAllHeaders; 
            private java.util.List<String> passThroughList; 

            private Builder() {
            } 

            private Builder(MethodMapList model) {
                this.dubboMethodName = model.dubboMethodName;
                this.httpMethod = model.httpMethod;
                this.methodPath = model.methodPath;
                this.paramMapsList = model.paramMapsList;
                this.passThroughAllHeaders = model.passThroughAllHeaders;
                this.passThroughList = model.passThroughList;
            } 

            /**
             * dubboMethodName.
             */
            public Builder dubboMethodName(String dubboMethodName) {
                this.dubboMethodName = dubboMethodName;
                return this;
            }

            /**
             * httpMethod.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * methodPath.
             */
            public Builder methodPath(String methodPath) {
                this.methodPath = methodPath;
                return this;
            }

            /**
             * paramMapsList.
             */
            public Builder paramMapsList(java.util.List<ParamMapsList> paramMapsList) {
                this.paramMapsList = paramMapsList;
                return this;
            }

            /**
             * passThroughAllHeaders.
             */
            public Builder passThroughAllHeaders(String passThroughAllHeaders) {
                this.passThroughAllHeaders = passThroughAllHeaders;
                return this;
            }

            /**
             * passThroughList.
             */
            public Builder passThroughList(java.util.List<String> passThroughList) {
                this.passThroughList = passThroughList;
                return this;
            }

            public MethodMapList build() {
                return new MethodMapList(this);
            } 

        } 

    }
}
