// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePopApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePopApiResponseBody</p>
 */
public class DescribePopApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiName")
    private String apiName;

    @com.aliyun.core.annotation.NameInMap("OpenApiMetaList")
    private java.util.List < OpenApiMetaList> openApiMetaList;

    @com.aliyun.core.annotation.NameInMap("PopCode")
    private String popCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DescribePopApiResponseBody(Builder builder) {
        this.apiName = builder.apiName;
        this.openApiMetaList = builder.openApiMetaList;
        this.popCode = builder.popCode;
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePopApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return openApiMetaList
     */
    public java.util.List < OpenApiMetaList> getOpenApiMetaList() {
        return this.openApiMetaList;
    }

    /**
     * @return popCode
     */
    public String getPopCode() {
        return this.popCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String apiName; 
        private java.util.List < OpenApiMetaList> openApiMetaList; 
        private String popCode; 
        private String requestId; 
        private String version; 

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>AddAssetCleanConfig</p>
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * <p>The information about the API.</p>
         */
        public Builder openApiMetaList(java.util.List < OpenApiMetaList> openApiMetaList) {
            this.openApiMetaList = openApiMetaList;
            return this;
        }

        /**
         * <p>The POP code of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Sas</p>
         */
        public Builder popCode(String popCode) {
            this.popCode = popCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A01B0BA-CFC4-5813-9EB0-A5DA15FA95AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-10</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribePopApiResponseBody build() {
            return new DescribePopApiResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePopApiResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePopApiResponseBody</p>
     */
    public static class OpenApiMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OpenApiMetaList(Builder builder) {
            this.description = builder.description;
            this.exampleValue = builder.exampleValue;
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenApiMetaList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return exampleValue
         */
        public String getExampleValue() {
            return this.exampleValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String exampleValue; 
            private String name; 
            private Boolean required; 
            private String type; 

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>demo parameter</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The example value.</p>
             * 
             * <strong>example:</strong>
             * <p>12.xx.xx.xx</p>
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>DescribePopApi</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The data type of the parameter field. Valid values:</p>
             * <ul>
             * <li><strong>string</strong></li>
             * <li><strong>boolean</strong></li>
             * <li><strong>integer</strong></li>
             * <li><strong>long</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OpenApiMetaList build() {
                return new OpenApiMetaList(this);
            } 

        } 

    }
}
