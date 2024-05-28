// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCompareDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCompareDetailResponseBody</p>
 */
public class GetCompareDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetCompareDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCompareDetailResponseBody create() {
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
    public Result getResult() {
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
        private Result result; 
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
        public Builder result(Result result) {
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

        public GetCompareDetailResponseBody build() {
            return new GetCompareDetailResponseBody(this);
        } 

    } 

    public static class Author extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Author(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Author create() {
            return builder().build();
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 

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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
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

            public Author build() {
                return new Author(this);
            } 

        } 

    }
    public static class Committer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Committer(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Committer create() {
            return builder().build();
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
         * @return id
         */
        public Long getId() {
            return this.id;
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
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 

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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
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

            public Committer build() {
                return new Committer(this);
            } 

        } 

    }
    public static class Commits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private Author author;

        @com.aliyun.core.annotation.NameInMap("authorEmail")
        private String authorEmail;

        @com.aliyun.core.annotation.NameInMap("authorName")
        private String authorName;

        @com.aliyun.core.annotation.NameInMap("authoredDate")
        private String authoredDate;

        @com.aliyun.core.annotation.NameInMap("commentsCount")
        private Long commentsCount;

        @com.aliyun.core.annotation.NameInMap("committedDate")
        private String committedDate;

        @com.aliyun.core.annotation.NameInMap("committer")
        private Committer committer;

        @com.aliyun.core.annotation.NameInMap("committerEmail")
        private String committerEmail;

        @com.aliyun.core.annotation.NameInMap("committerName")
        private String committerName;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("parentIds")
        private java.util.List < String > parentIds;

        @com.aliyun.core.annotation.NameInMap("shortId")
        private String shortId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Commits(Builder builder) {
            this.author = builder.author;
            this.authorEmail = builder.authorEmail;
            this.authorName = builder.authorName;
            this.authoredDate = builder.authoredDate;
            this.commentsCount = builder.commentsCount;
            this.committedDate = builder.committedDate;
            this.committer = builder.committer;
            this.committerEmail = builder.committerEmail;
            this.committerName = builder.committerName;
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.message = builder.message;
            this.parentIds = builder.parentIds;
            this.shortId = builder.shortId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commits create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public Author getAuthor() {
            return this.author;
        }

        /**
         * @return authorEmail
         */
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        /**
         * @return authorName
         */
        public String getAuthorName() {
            return this.authorName;
        }

        /**
         * @return authoredDate
         */
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        /**
         * @return commentsCount
         */
        public Long getCommentsCount() {
            return this.commentsCount;
        }

        /**
         * @return committedDate
         */
        public String getCommittedDate() {
            return this.committedDate;
        }

        /**
         * @return committer
         */
        public Committer getCommitter() {
            return this.committer;
        }

        /**
         * @return committerEmail
         */
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        /**
         * @return committerName
         */
        public String getCommitterName() {
            return this.committerName;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return parentIds
         */
        public java.util.List < String > getParentIds() {
            return this.parentIds;
        }

        /**
         * @return shortId
         */
        public String getShortId() {
            return this.shortId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Author author; 
            private String authorEmail; 
            private String authorName; 
            private String authoredDate; 
            private Long commentsCount; 
            private String committedDate; 
            private Committer committer; 
            private String committerEmail; 
            private String committerName; 
            private String createdAt; 
            private String id; 
            private String message; 
            private java.util.List < String > parentIds; 
            private String shortId; 
            private String title; 

            /**
             * author.
             */
            public Builder author(Author author) {
                this.author = author;
                return this;
            }

            /**
             * authorEmail.
             */
            public Builder authorEmail(String authorEmail) {
                this.authorEmail = authorEmail;
                return this;
            }

            /**
             * authorName.
             */
            public Builder authorName(String authorName) {
                this.authorName = authorName;
                return this;
            }

            /**
             * authoredDate.
             */
            public Builder authoredDate(String authoredDate) {
                this.authoredDate = authoredDate;
                return this;
            }

            /**
             * commentsCount.
             */
            public Builder commentsCount(Long commentsCount) {
                this.commentsCount = commentsCount;
                return this;
            }

            /**
             * committedDate.
             */
            public Builder committedDate(String committedDate) {
                this.committedDate = committedDate;
                return this;
            }

            /**
             * committer.
             */
            public Builder committer(Committer committer) {
                this.committer = committer;
                return this;
            }

            /**
             * committerEmail.
             */
            public Builder committerEmail(String committerEmail) {
                this.committerEmail = committerEmail;
                return this;
            }

            /**
             * committerName.
             */
            public Builder committerName(String committerName) {
                this.committerName = committerName;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * parentIds.
             */
            public Builder parentIds(java.util.List < String > parentIds) {
                this.parentIds = parentIds;
                return this;
            }

            /**
             * shortId.
             */
            public Builder shortId(String shortId) {
                this.shortId = shortId;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Commits build() {
                return new Commits(this);
            } 

        } 

    }
    public static class Diffs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aMode")
        private String aMode;

        @com.aliyun.core.annotation.NameInMap("bMode")
        private String bMode;

        @com.aliyun.core.annotation.NameInMap("deletedFile")
        private Boolean deletedFile;

        @com.aliyun.core.annotation.NameInMap("diff")
        private String diff;

        @com.aliyun.core.annotation.NameInMap("isBinary")
        private Boolean isBinary;

        @com.aliyun.core.annotation.NameInMap("isNewLfs")
        private Boolean isNewLfs;

        @com.aliyun.core.annotation.NameInMap("isOldLfs")
        private Boolean isOldLfs;

        @com.aliyun.core.annotation.NameInMap("newFile")
        private Boolean newFile;

        @com.aliyun.core.annotation.NameInMap("newId")
        private String newId;

        @com.aliyun.core.annotation.NameInMap("newPath")
        private String newPath;

        @com.aliyun.core.annotation.NameInMap("oldId")
        private String oldId;

        @com.aliyun.core.annotation.NameInMap("oldPath")
        private String oldPath;

        @com.aliyun.core.annotation.NameInMap("renamedFile")
        private Boolean renamedFile;

        private Diffs(Builder builder) {
            this.aMode = builder.aMode;
            this.bMode = builder.bMode;
            this.deletedFile = builder.deletedFile;
            this.diff = builder.diff;
            this.isBinary = builder.isBinary;
            this.isNewLfs = builder.isNewLfs;
            this.isOldLfs = builder.isOldLfs;
            this.newFile = builder.newFile;
            this.newId = builder.newId;
            this.newPath = builder.newPath;
            this.oldId = builder.oldId;
            this.oldPath = builder.oldPath;
            this.renamedFile = builder.renamedFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diffs create() {
            return builder().build();
        }

        /**
         * @return aMode
         */
        public String getAMode() {
            return this.aMode;
        }

        /**
         * @return bMode
         */
        public String getBMode() {
            return this.bMode;
        }

        /**
         * @return deletedFile
         */
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        /**
         * @return diff
         */
        public String getDiff() {
            return this.diff;
        }

        /**
         * @return isBinary
         */
        public Boolean getIsBinary() {
            return this.isBinary;
        }

        /**
         * @return isNewLfs
         */
        public Boolean getIsNewLfs() {
            return this.isNewLfs;
        }

        /**
         * @return isOldLfs
         */
        public Boolean getIsOldLfs() {
            return this.isOldLfs;
        }

        /**
         * @return newFile
         */
        public Boolean getNewFile() {
            return this.newFile;
        }

        /**
         * @return newId
         */
        public String getNewId() {
            return this.newId;
        }

        /**
         * @return newPath
         */
        public String getNewPath() {
            return this.newPath;
        }

        /**
         * @return oldId
         */
        public String getOldId() {
            return this.oldId;
        }

        /**
         * @return oldPath
         */
        public String getOldPath() {
            return this.oldPath;
        }

        /**
         * @return renamedFile
         */
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public static final class Builder {
            private String aMode; 
            private String bMode; 
            private Boolean deletedFile; 
            private String diff; 
            private Boolean isBinary; 
            private Boolean isNewLfs; 
            private Boolean isOldLfs; 
            private Boolean newFile; 
            private String newId; 
            private String newPath; 
            private String oldId; 
            private String oldPath; 
            private Boolean renamedFile; 

            /**
             * aMode.
             */
            public Builder aMode(String aMode) {
                this.aMode = aMode;
                return this;
            }

            /**
             * bMode.
             */
            public Builder bMode(String bMode) {
                this.bMode = bMode;
                return this;
            }

            /**
             * deletedFile.
             */
            public Builder deletedFile(Boolean deletedFile) {
                this.deletedFile = deletedFile;
                return this;
            }

            /**
             * diff.
             */
            public Builder diff(String diff) {
                this.diff = diff;
                return this;
            }

            /**
             * isBinary.
             */
            public Builder isBinary(Boolean isBinary) {
                this.isBinary = isBinary;
                return this;
            }

            /**
             * isNewLfs.
             */
            public Builder isNewLfs(Boolean isNewLfs) {
                this.isNewLfs = isNewLfs;
                return this;
            }

            /**
             * isOldLfs.
             */
            public Builder isOldLfs(Boolean isOldLfs) {
                this.isOldLfs = isOldLfs;
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
             * newId.
             */
            public Builder newId(String newId) {
                this.newId = newId;
                return this;
            }

            /**
             * newPath.
             */
            public Builder newPath(String newPath) {
                this.newPath = newPath;
                return this;
            }

            /**
             * oldId.
             */
            public Builder oldId(String oldId) {
                this.oldId = oldId;
                return this;
            }

            /**
             * oldPath.
             */
            public Builder oldPath(String oldPath) {
                this.oldPath = oldPath;
                return this;
            }

            /**
             * renamedFile.
             */
            public Builder renamedFile(Boolean renamedFile) {
                this.renamedFile = renamedFile;
                return this;
            }

            public Diffs build() {
                return new Diffs(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commits")
        private java.util.List < Commits> commits;

        @com.aliyun.core.annotation.NameInMap("diffs")
        private java.util.List < Diffs> diffs;

        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List < String > messages;

        private Result(Builder builder) {
            this.commits = builder.commits;
            this.diffs = builder.diffs;
            this.messages = builder.messages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return commits
         */
        public java.util.List < Commits> getCommits() {
            return this.commits;
        }

        /**
         * @return diffs
         */
        public java.util.List < Diffs> getDiffs() {
            return this.diffs;
        }

        /**
         * @return messages
         */
        public java.util.List < String > getMessages() {
            return this.messages;
        }

        public static final class Builder {
            private java.util.List < Commits> commits; 
            private java.util.List < Diffs> diffs; 
            private java.util.List < String > messages; 

            /**
             * commits.
             */
            public Builder commits(java.util.List < Commits> commits) {
                this.commits = commits;
                return this;
            }

            /**
             * diffs.
             */
            public Builder diffs(java.util.List < Diffs> diffs) {
                this.diffs = diffs;
                return this;
            }

            /**
             * messages.
             */
            public Builder messages(java.util.List < String > messages) {
                this.messages = messages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
