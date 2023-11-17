// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePopApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePopApiResponseBody</p>
 */
public class DescribePopApiResponseBody extends TeaModel {
    @NameInMap("ApiName")
    private String apiName;

    @NameInMap("OpenApiMetaList")
    private java.util.List < OpenApiMetaList> openApiMetaList;

    @NameInMap("PopCode")
    private String popCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Version")
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
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            return this;
        }

        /**
         * OpenApiMetaList.
         */
        public Builder openApiMetaList(java.util.List < OpenApiMetaList> openApiMetaList) {
            this.openApiMetaList = openApiMetaList;
            return this;
        }

        /**
         * PopCode.
         */
        public Builder popCode(String popCode) {
            this.popCode = popCode;
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
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribePopApiResponseBody build() {
            return new DescribePopApiResponseBody(this);
        } 

    } 

    public static class OpenApiMetaList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ExampleValue")
        private String exampleValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("Required")
        private Boolean required;

        @NameInMap("Type")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
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
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * Type.
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
