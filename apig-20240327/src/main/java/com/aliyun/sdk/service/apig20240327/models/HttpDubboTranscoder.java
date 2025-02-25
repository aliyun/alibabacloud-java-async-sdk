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

    @com.aliyun.core.annotation.NameInMap("mothedMapList")
    private java.util.List<MothedMapList> mothedMapList;

    private HttpDubboTranscoder(Builder builder) {
        this.dubboServiceGroup = builder.dubboServiceGroup;
        this.dubboServiceName = builder.dubboServiceName;
        this.dubboServiceVersion = builder.dubboServiceVersion;
        this.mothedMapList = builder.mothedMapList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpDubboTranscoder create() {
        return builder().build();
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
     * @return mothedMapList
     */
    public java.util.List<MothedMapList> getMothedMapList() {
        return this.mothedMapList;
    }

    public static final class Builder {
        private String dubboServiceGroup; 
        private String dubboServiceName; 
        private String dubboServiceVersion; 
        private java.util.List<MothedMapList> mothedMapList; 

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
         * mothedMapList.
         */
        public Builder mothedMapList(java.util.List<MothedMapList> mothedMapList) {
            this.mothedMapList = mothedMapList;
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
    public static class MothedMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dubboMothedName")
        private String dubboMothedName;

        @com.aliyun.core.annotation.NameInMap("httpMothed")
        private String httpMothed;

        @com.aliyun.core.annotation.NameInMap("mothedpath")
        private String mothedpath;

        @com.aliyun.core.annotation.NameInMap("paramMapsList")
        private java.util.List<ParamMapsList> paramMapsList;

        @com.aliyun.core.annotation.NameInMap("passThroughAllHeaders")
        private String passThroughAllHeaders;

        @com.aliyun.core.annotation.NameInMap("passThroughList")
        private java.util.List<String> passThroughList;

        private MothedMapList(Builder builder) {
            this.dubboMothedName = builder.dubboMothedName;
            this.httpMothed = builder.httpMothed;
            this.mothedpath = builder.mothedpath;
            this.paramMapsList = builder.paramMapsList;
            this.passThroughAllHeaders = builder.passThroughAllHeaders;
            this.passThroughList = builder.passThroughList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MothedMapList create() {
            return builder().build();
        }

        /**
         * @return dubboMothedName
         */
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        /**
         * @return httpMothed
         */
        public String getHttpMothed() {
            return this.httpMothed;
        }

        /**
         * @return mothedpath
         */
        public String getMothedpath() {
            return this.mothedpath;
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
            private String dubboMothedName; 
            private String httpMothed; 
            private String mothedpath; 
            private java.util.List<ParamMapsList> paramMapsList; 
            private String passThroughAllHeaders; 
            private java.util.List<String> passThroughList; 

            /**
             * dubboMothedName.
             */
            public Builder dubboMothedName(String dubboMothedName) {
                this.dubboMothedName = dubboMothedName;
                return this;
            }

            /**
             * httpMothed.
             */
            public Builder httpMothed(String httpMothed) {
                this.httpMothed = httpMothed;
                return this;
            }

            /**
             * mothedpath.
             */
            public Builder mothedpath(String mothedpath) {
                this.mothedpath = mothedpath;
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

            public MothedMapList build() {
                return new MothedMapList(this);
            } 

        } 

    }
}
