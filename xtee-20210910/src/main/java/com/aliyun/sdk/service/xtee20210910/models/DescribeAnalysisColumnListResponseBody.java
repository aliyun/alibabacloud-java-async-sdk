// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnalysisColumnListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnalysisColumnListResponseBody</p>
 */
public class DescribeAnalysisColumnListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    private DescribeAnalysisColumnListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnalysisColumnListResponseBody create() {
        return builder().build();
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
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAnalysisColumnListResponseBody build() {
            return new DescribeAnalysisColumnListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("variableName")
        private String variableName;

        @com.aliyun.core.annotation.NameInMap("variableTitle")
        private String variableTitle;

        @com.aliyun.core.annotation.NameInMap("variableType")
        private String variableType;

        private ResultObject(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.isDefault = builder.isDefault;
            this.variableName = builder.variableName;
            this.variableTitle = builder.variableTitle;
            this.variableType = builder.variableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return variableName
         */
        public String getVariableName() {
            return this.variableName;
        }

        /**
         * @return variableTitle
         */
        public String getVariableTitle() {
            return this.variableTitle;
        }

        /**
         * @return variableType
         */
        public String getVariableType() {
            return this.variableType;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 
            private Boolean isDefault; 
            private String variableName; 
            private String variableTitle; 
            private String variableType; 

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * isDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * variableName.
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            /**
             * variableTitle.
             */
            public Builder variableTitle(String variableTitle) {
                this.variableTitle = variableTitle;
                return this;
            }

            /**
             * variableType.
             */
            public Builder variableType(String variableType) {
                this.variableType = variableType;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
