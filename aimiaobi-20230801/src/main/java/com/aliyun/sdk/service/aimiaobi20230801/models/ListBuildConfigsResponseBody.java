// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBuildConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBuildConfigsResponseBody</p>
 */
public class ListBuildConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListBuildConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBuildConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBuildConfigsResponseBody build() {
            return new ListBuildConfigsResponseBody(this);
        } 

    } 

    public static class Keywords extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Key")
        private String key;

        private Keywords(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keywords create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String description; 
            private String key; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Keywords build() {
                return new Keywords(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BuildIn")
        private Boolean buildIn;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Keywords")
        private java.util.List < Keywords> keywords;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("TagDescription")
        private String tagDescription;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateUser")
        private String updateUser;

        private Data(Builder builder) {
            this.buildIn = builder.buildIn;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.id = builder.id;
            this.keywords = builder.keywords;
            this.tag = builder.tag;
            this.tagDescription = builder.tagDescription;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateUser = builder.updateUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return buildIn
         */
        public Boolean getBuildIn() {
            return this.buildIn;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return keywords
         */
        public java.util.List < Keywords> getKeywords() {
            return this.keywords;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagDescription
         */
        public String getTagDescription() {
            return this.tagDescription;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUser
         */
        public String getUpdateUser() {
            return this.updateUser;
        }

        public static final class Builder {
            private Boolean buildIn; 
            private String createTime; 
            private String createUser; 
            private Long id; 
            private java.util.List < Keywords> keywords; 
            private String tag; 
            private String tagDescription; 
            private String type; 
            private String updateTime; 
            private String updateUser; 

            /**
             * BuildIn.
             */
            public Builder buildIn(Boolean buildIn) {
                this.buildIn = buildIn;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List < Keywords> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * TagDescription.
             */
            public Builder tagDescription(String tagDescription) {
                this.tagDescription = tagDescription;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUser.
             */
            public Builder updateUser(String updateUser) {
                this.updateUser = updateUser;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
