// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetStandardWordRootResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardWordRootResponseBody</p>
 */
public class GetStandardWordRootResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WordRootInfo")
    private WordRootInfo wordRootInfo;

    private GetStandardWordRootResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.wordRootInfo = builder.wordRootInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardWordRootResponseBody create() {
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

    /**
     * @return wordRootInfo
     */
    public WordRootInfo getWordRootInfo() {
        return this.wordRootInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private WordRootInfo wordRootInfo; 

        private Builder() {
        } 

        private Builder(GetStandardWordRootResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.wordRootInfo = model.wordRootInfo;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        /**
         * WordRootInfo.
         */
        public Builder wordRootInfo(WordRootInfo wordRootInfo) {
            this.wordRootInfo = wordRootInfo;
            return this;
        }

        public GetStandardWordRootResponseBody build() {
            return new GetStandardWordRootResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardWordRootResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardWordRootResponseBody</p>
     */
    public static class WordRootInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abbreviation")
        private String abbreviation;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private WordRootInfo(Builder builder) {
            this.abbreviation = builder.abbreviation;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.fullName = builder.fullName;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordRootInfo create() {
            return builder().build();
        }

        /**
         * @return abbreviation
         */
        public String getAbbreviation() {
            return this.abbreviation;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String abbreviation; 
            private String createTime; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private String fullName; 
            private String lastModifier; 
            private String lastModifierName; 
            private String modifyTime; 
            private String name; 

            private Builder() {
            } 

            private Builder(WordRootInfo model) {
                this.abbreviation = model.abbreviation;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.fullName = model.fullName;
                this.lastModifier = model.lastModifier;
                this.lastModifierName = model.lastModifierName;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
            } 

            /**
             * Abbreviation.
             */
            public Builder abbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
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
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LastModifierName.
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WordRootInfo build() {
                return new WordRootInfo(this);
            } 

        } 

    }
}
