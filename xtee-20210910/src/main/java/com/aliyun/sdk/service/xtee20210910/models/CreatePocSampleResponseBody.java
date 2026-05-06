// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CreatePocSampleResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePocSampleResponseBody</p>
 */
public class CreatePocSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private CreatePocSampleResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePocSampleResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(CreatePocSampleResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public CreatePocSampleResponseBody build() {
            return new CreatePocSampleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePocSampleResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePocSampleResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasWarnings")
        private Boolean hasWarnings;

        @com.aliyun.core.annotation.NameInMap("SampleId")
        private Integer sampleId;

        @com.aliyun.core.annotation.NameInMap("SampleName")
        private String sampleName;

        @com.aliyun.core.annotation.NameInMap("Tab")
        private String tab;

        @com.aliyun.core.annotation.NameInMap("WarningMessage")
        private String warningMessage;

        private ResultObject(Builder builder) {
            this.hasWarnings = builder.hasWarnings;
            this.sampleId = builder.sampleId;
            this.sampleName = builder.sampleName;
            this.tab = builder.tab;
            this.warningMessage = builder.warningMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return hasWarnings
         */
        public Boolean getHasWarnings() {
            return this.hasWarnings;
        }

        /**
         * @return sampleId
         */
        public Integer getSampleId() {
            return this.sampleId;
        }

        /**
         * @return sampleName
         */
        public String getSampleName() {
            return this.sampleName;
        }

        /**
         * @return tab
         */
        public String getTab() {
            return this.tab;
        }

        /**
         * @return warningMessage
         */
        public String getWarningMessage() {
            return this.warningMessage;
        }

        public static final class Builder {
            private Boolean hasWarnings; 
            private Integer sampleId; 
            private String sampleName; 
            private String tab; 
            private String warningMessage; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.hasWarnings = model.hasWarnings;
                this.sampleId = model.sampleId;
                this.sampleName = model.sampleName;
                this.tab = model.tab;
                this.warningMessage = model.warningMessage;
            } 

            /**
             * HasWarnings.
             */
            public Builder hasWarnings(Boolean hasWarnings) {
                this.hasWarnings = hasWarnings;
                return this;
            }

            /**
             * SampleId.
             */
            public Builder sampleId(Integer sampleId) {
                this.sampleId = sampleId;
                return this;
            }

            /**
             * SampleName.
             */
            public Builder sampleName(String sampleName) {
                this.sampleName = sampleName;
                return this;
            }

            /**
             * Tab.
             */
            public Builder tab(String tab) {
                this.tab = tab;
                return this;
            }

            /**
             * WarningMessage.
             */
            public Builder warningMessage(String warningMessage) {
                this.warningMessage = warningMessage;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
