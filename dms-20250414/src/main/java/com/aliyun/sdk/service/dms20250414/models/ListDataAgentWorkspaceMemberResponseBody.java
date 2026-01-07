// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentWorkspaceMemberResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentWorkspaceMemberResponseBody</p>
 */
public class ListDataAgentWorkspaceMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataAgentWorkspaceMemberResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentWorkspaceMemberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataAgentWorkspaceMemberResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataAgentWorkspaceMemberResponseBody build() {
            return new ListDataAgentWorkspaceMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentWorkspaceMemberResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentWorkspaceMemberResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private String joinTime;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RunningTaskNumber")
        private Long runningTaskNumber;

        @com.aliyun.core.annotation.NameInMap("TotalTaskNumber")
        private Long totalTaskNumber;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Content(Builder builder) {
            this.joinTime = builder.joinTime;
            this.memberId = builder.memberId;
            this.roleName = builder.roleName;
            this.runningTaskNumber = builder.runningTaskNumber;
            this.totalTaskNumber = builder.totalTaskNumber;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return joinTime
         */
        public String getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return runningTaskNumber
         */
        public Long getRunningTaskNumber() {
            return this.runningTaskNumber;
        }

        /**
         * @return totalTaskNumber
         */
        public Long getTotalTaskNumber() {
            return this.totalTaskNumber;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String joinTime; 
            private String memberId; 
            private String roleName; 
            private Long runningTaskNumber; 
            private Long totalTaskNumber; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.joinTime = model.joinTime;
                this.memberId = model.memberId;
                this.roleName = model.roleName;
                this.runningTaskNumber = model.runningTaskNumber;
                this.totalTaskNumber = model.totalTaskNumber;
                this.userName = model.userName;
            } 

            /**
             * JoinTime.
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RunningTaskNumber.
             */
            public Builder runningTaskNumber(Long runningTaskNumber) {
                this.runningTaskNumber = runningTaskNumber;
                return this;
            }

            /**
             * TotalTaskNumber.
             */
            public Builder totalTaskNumber(Long totalTaskNumber) {
                this.totalTaskNumber = totalTaskNumber;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataAgentWorkspaceMemberResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentWorkspaceMemberResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Long totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Long totalPages;

        private Data(Builder builder) {
            this.content = builder.content;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalElements
         */
        public Long getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Integer maxResults; 
            private String nextToken; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalElements; 
            private Long totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalElements.
             */
            public Builder totalElements(Long totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
