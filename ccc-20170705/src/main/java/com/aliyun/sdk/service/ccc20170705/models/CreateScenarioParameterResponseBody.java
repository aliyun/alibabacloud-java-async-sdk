// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScenarioParameterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScenarioParameterResponseBody</p>
 */
public class CreateScenarioParameterResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScenarioParameters")
    private java.util.List < ScenarioParameters> scenarioParameters;

    @NameInMap("Success")
    private Boolean success;

    private CreateScenarioParameterResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scenarioParameters = builder.scenarioParameters;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScenarioParameterResponseBody create() {
        return builder().build();
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
    public Integer getHttpStatusCode() {
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
     * @return scenarioParameters
     */
    public java.util.List < ScenarioParameters> getScenarioParameters() {
        return this.scenarioParameters;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List < ScenarioParameters> scenarioParameters; 
        private Boolean success; 

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
        public Builder httpStatusCode(Integer httpStatusCode) {
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
         * ScenarioParameters.
         */
        public Builder scenarioParameters(java.util.List < ScenarioParameters> scenarioParameters) {
            this.scenarioParameters = scenarioParameters;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateScenarioParameterResponseBody build() {
            return new CreateScenarioParameterResponseBody(this);
        } 

    } 

    public static class ScenarioParameters extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("ScenarioId")
        private String scenarioId;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private Integer type;

        private ScenarioParameters(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.scenarioId = builder.scenarioId;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenarioParameters create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String id; 
            private String name; 
            private String scenarioId; 
            private String title; 
            private Integer type; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * ScenarioId.
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ScenarioParameters build() {
                return new ScenarioParameters(this);
            } 

        } 

    }
}
