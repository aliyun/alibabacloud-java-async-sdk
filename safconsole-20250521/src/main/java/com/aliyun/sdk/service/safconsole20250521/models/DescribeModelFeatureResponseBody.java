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
 * {@link DescribeModelFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelFeatureResponseBody</p>
 */
public class DescribeModelFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeModelFeatureResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelFeatureResponseBody create() {
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
    public java.util.List<ResultObject> getResultObject() {
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
        private java.util.List<ResultObject> resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeModelFeatureResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Call succeeded.</li>
         * <li><strong>false</strong>: Call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeModelFeatureResponseBody build() {
            return new DescribeModelFeatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelFeatureResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FeatureType")
        private String featureType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ResultObject(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.featureName = builder.featureName;
            this.featureType = builder.featureType;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
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

            private Builder(ResultObject model) {
                this.defaultValue = model.defaultValue;
                this.featureName = model.featureName;
                this.featureType = model.featureType;
                this.name = model.name;
            } 

            /**
             * <p>Default value of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>Feature mapping name.</p>
             * 
             * <strong>example:</strong>
             * <p>f1</p>
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * <p>Feature type.</p>
             * 
             * <strong>example:</strong>
             * <p>double</p>
             */
            public Builder featureType(String featureType) {
                this.featureType = featureType;
                return this;
            }

            /**
             * <p>Feature name.</p>
             * 
             * <strong>example:</strong>
             * <p>f1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
