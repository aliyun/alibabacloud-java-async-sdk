// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListMergeRequestFilesReadsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMergeRequestFilesReadsResponseBody</p>
 */
public class ListMergeRequestFilesReadsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListMergeRequestFilesReadsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMergeRequestFilesReadsResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
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
        private java.util.List<Result> result; 
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListMergeRequestFilesReadsResponseBody build() {
            return new ListMergeRequestFilesReadsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMergeRequestFilesReadsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMergeRequestFilesReadsResponseBody</p>
     */
    public static class ReadUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private ReadUsers(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadUsers create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String aliyunPk; 
            private String avatarUrl; 
            private String email; 
            private String name; 
            private String state; 
            private String username; 

            /**
             * aliyunPk.
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public ReadUsers build() {
                return new ReadUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMergeRequestFilesReadsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMergeRequestFilesReadsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deletedFile")
        private String deletedFile;

        @com.aliyun.core.annotation.NameInMap("newFile")
        private Boolean newFile;

        @com.aliyun.core.annotation.NameInMap("newFilePath")
        private String newFilePath;

        @com.aliyun.core.annotation.NameInMap("oldFilePath")
        private String oldFilePath;

        @com.aliyun.core.annotation.NameInMap("readUsers")
        private java.util.List<ReadUsers> readUsers;

        @com.aliyun.core.annotation.NameInMap("renamedFile")
        private String renamedFile;

        private Result(Builder builder) {
            this.deletedFile = builder.deletedFile;
            this.newFile = builder.newFile;
            this.newFilePath = builder.newFilePath;
            this.oldFilePath = builder.oldFilePath;
            this.readUsers = builder.readUsers;
            this.renamedFile = builder.renamedFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return deletedFile
         */
        public String getDeletedFile() {
            return this.deletedFile;
        }

        /**
         * @return newFile
         */
        public Boolean getNewFile() {
            return this.newFile;
        }

        /**
         * @return newFilePath
         */
        public String getNewFilePath() {
            return this.newFilePath;
        }

        /**
         * @return oldFilePath
         */
        public String getOldFilePath() {
            return this.oldFilePath;
        }

        /**
         * @return readUsers
         */
        public java.util.List<ReadUsers> getReadUsers() {
            return this.readUsers;
        }

        /**
         * @return renamedFile
         */
        public String getRenamedFile() {
            return this.renamedFile;
        }

        public static final class Builder {
            private String deletedFile; 
            private Boolean newFile; 
            private String newFilePath; 
            private String oldFilePath; 
            private java.util.List<ReadUsers> readUsers; 
            private String renamedFile; 

            /**
             * deletedFile.
             */
            public Builder deletedFile(String deletedFile) {
                this.deletedFile = deletedFile;
                return this;
            }

            /**
             * newFile.
             */
            public Builder newFile(Boolean newFile) {
                this.newFile = newFile;
                return this;
            }

            /**
             * newFilePath.
             */
            public Builder newFilePath(String newFilePath) {
                this.newFilePath = newFilePath;
                return this;
            }

            /**
             * oldFilePath.
             */
            public Builder oldFilePath(String oldFilePath) {
                this.oldFilePath = oldFilePath;
                return this;
            }

            /**
             * readUsers.
             */
            public Builder readUsers(java.util.List<ReadUsers> readUsers) {
                this.readUsers = readUsers;
                return this;
            }

            /**
             * renamedFile.
             */
            public Builder renamedFile(String renamedFile) {
                this.renamedFile = renamedFile;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
