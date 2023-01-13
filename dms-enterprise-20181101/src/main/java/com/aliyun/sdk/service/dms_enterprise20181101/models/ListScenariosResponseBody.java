// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenariosResponseBody} extends {@link TeaModel}
 *
 * <p>ListScenariosResponseBody</p>
 */
public class ListScenariosResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScenarioList")
    private java.util.List < ScenarioList> scenarioList;

    @NameInMap("Success")
    private Boolean success;

    private ListScenariosResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.scenarioList = builder.scenarioList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScenariosResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenarioList
     */
    public java.util.List < ScenarioList> getScenarioList() {
        return this.scenarioList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < ScenarioList> scenarioList; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the returned business scenarios.
         */
        public Builder scenarioList(java.util.List < ScenarioList> scenarioList) {
            this.scenarioList = scenarioList;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListScenariosResponseBody build() {
            return new ListScenariosResponseBody(this);
        } 

    } 

    public static class ScenarioList extends TeaModel {
        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ScenarioName")
        private String scenarioName;

        private ScenarioList(Builder builder) {
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.id = builder.id;
            this.scenarioName = builder.scenarioName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenarioList create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
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
        public Long getId() {
            return this.id;
        }

        /**
         * @return scenarioName
         */
        public String getScenarioName() {
            return this.scenarioName;
        }

        public static final class Builder {
            private String creatorId; 
            private String description; 
            private Long id; 
            private String scenarioName; 

            /**
             * The ID of the user who created the business scenario.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The description of the business scenario.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the business scenario.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the business scenario.
             */
            public Builder scenarioName(String scenarioName) {
                this.scenarioName = scenarioName;
                return this;
            }

            public ScenarioList build() {
                return new ScenarioList(this);
            } 

        } 

    }
}
