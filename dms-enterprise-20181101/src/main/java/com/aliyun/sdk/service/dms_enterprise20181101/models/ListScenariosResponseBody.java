// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListScenariosResponseBody} extends {@link TeaModel}
 *
 * <p>ListScenariosResponseBody</p>
 */
public class ListScenariosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScenarioList")
    private java.util.List < ScenarioList> scenarioList;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the returned business scenarios.</p>
         */
        public Builder scenarioList(java.util.List < ScenarioList> scenarioList) {
            this.scenarioList = scenarioList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListScenariosResponseBody build() {
            return new ListScenariosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScenariosResponseBody} extends {@link TeaModel}
     *
     * <p>ListScenariosResponseBody</p>
     */
    public static class ScenarioList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ScenarioName")
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
             * <p>The ID of the user who created the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>23***</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The description of the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>41***</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the business scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
