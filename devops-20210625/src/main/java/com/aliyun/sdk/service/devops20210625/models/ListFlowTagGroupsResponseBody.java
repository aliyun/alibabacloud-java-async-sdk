// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowTagGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowTagGroupsResponseBody</p>
 */
public class ListFlowTagGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("flowTagGroups")
    private java.util.List < FlowTagGroups> flowTagGroups;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListFlowTagGroupsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.flowTagGroups = builder.flowTagGroups;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowTagGroupsResponseBody create() {
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
     * @return flowTagGroups
     */
    public java.util.List < FlowTagGroups> getFlowTagGroups() {
        return this.flowTagGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.List < FlowTagGroups> flowTagGroups; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * flowTagGroups.
         */
        public Builder flowTagGroups(java.util.List < FlowTagGroups> flowTagGroups) {
            this.flowTagGroups = flowTagGroups;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFlowTagGroupsResponseBody build() {
            return new ListFlowTagGroupsResponseBody(this);
        } 

    } 

    public static class FlowTagGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creatorAccountId")
        private String creatorAccountId;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("modiferAccountId")
        private String modiferAccountId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private FlowTagGroups(Builder builder) {
            this.creatorAccountId = builder.creatorAccountId;
            this.id = builder.id;
            this.modiferAccountId = builder.modiferAccountId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowTagGroups create() {
            return builder().build();
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modiferAccountId
         */
        public String getModiferAccountId() {
            return this.modiferAccountId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String creatorAccountId; 
            private Long id; 
            private String modiferAccountId; 
            private String name; 

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modiferAccountId.
             */
            public Builder modiferAccountId(String modiferAccountId) {
                this.modiferAccountId = modiferAccountId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FlowTagGroups build() {
                return new FlowTagGroups(this);
            } 

        } 

    }
}
