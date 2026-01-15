// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeCustomerModuleMetaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerModuleMetaInfoResponseBody</p>
 */
public class DescribeCustomerModuleMetaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomerModuleMetaInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerModuleMetaInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Long httpStatusCode; 
        private String requestId; 
        private ResultObject resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCustomerModuleMetaInfoResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomerModuleMetaInfoResponseBody build() {
            return new DescribeCustomerModuleMetaInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomerModuleMetaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerModuleMetaInfoResponseBody</p>
     */
    public static class FeatureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private FeatureList(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.featureName = builder.featureName;
            this.featureType = builder.featureType;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureList create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return featureType
         */
        public String getFeatureType() {
            return this.featureType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String defaultValue; 
            private String featureName; 
            private String featureType; 
            private String name; 

            private Builder() {
            } 

            private Builder(FeatureList model) {
                this.defaultValue = model.defaultValue;
                this.featureName = model.featureName;
                this.featureType = model.featureType;
                this.name = model.name;
            } 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * FeatureType.
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FeatureList build() {
                return new FeatureList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomerModuleMetaInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerModuleMetaInfoResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureList")
        private java.util.List<FeatureList> featureList;

        @com.aliyun.core.annotation.NameInMap("FeatureTemplate")
        private String featureTemplate;

        private ResultObject(Builder builder) {
            this.featureList = builder.featureList;
            this.featureTemplate = builder.featureTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return featureList
         */
        public java.util.List<FeatureList> getFeatureList() {
            return this.featureList;
        }

        /**
         * @return featureTemplate
         */
        public String getFeatureTemplate() {
            return this.featureTemplate;
        }

        public static final class Builder {
            private java.util.List<FeatureList> featureList; 
            private String featureTemplate; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.featureList = model.featureList;
                this.featureTemplate = model.featureTemplate;
            } 

            /**
             * FeatureList.
             */
            public Builder featureList(java.util.List<FeatureList> featureList) {
                this.featureList = featureList;
                return this;
            }

            /**
             * FeatureTemplate.
             */
            public Builder featureTemplate(String featureTemplate) {
                this.featureTemplate = featureTemplate;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
