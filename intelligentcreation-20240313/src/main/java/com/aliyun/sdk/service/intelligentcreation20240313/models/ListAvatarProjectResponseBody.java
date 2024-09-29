// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAvatarProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvatarProjectResponseBody</p>
 */
public class ListAvatarProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryAvatarProjectResultList")
    private java.util.List < QueryAvatarProjectResultList> queryAvatarProjectResultList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListAvatarProjectResponseBody(Builder builder) {
        this.queryAvatarProjectResultList = builder.queryAvatarProjectResultList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvatarProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryAvatarProjectResultList
     */
    public java.util.List < QueryAvatarProjectResultList> getQueryAvatarProjectResultList() {
        return this.queryAvatarProjectResultList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < QueryAvatarProjectResultList> queryAvatarProjectResultList; 
        private String requestId; 

        /**
         * queryAvatarProjectResultList.
         */
        public Builder queryAvatarProjectResultList(java.util.List < QueryAvatarProjectResultList> queryAvatarProjectResultList) {
            this.queryAvatarProjectResultList = queryAvatarProjectResultList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAvatarProjectResponseBody build() {
            return new ListAvatarProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvatarProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvatarProjectResponseBody</p>
     */
    public static class QueryAvatarProjectResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private QueryAvatarProjectResultList(Builder builder) {
            this.agentId = builder.agentId;
            this.errorMsg = builder.errorMsg;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryAvatarProjectResultList create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String agentId; 
            private String errorMsg; 
            private String projectId; 
            private String projectName; 
            private String status; 

            /**
             * agentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * errorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * projectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QueryAvatarProjectResultList build() {
                return new QueryAvatarProjectResultList(this);
            } 

        } 

    }
}
