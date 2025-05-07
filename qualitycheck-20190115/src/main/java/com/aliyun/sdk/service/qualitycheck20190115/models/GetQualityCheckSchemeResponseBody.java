// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetQualityCheckSchemeResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityCheckSchemeResponseBody</p>
 */
public class GetQualityCheckSchemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<String> messages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityCheckSchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.messages = builder.messages;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityCheckSchemeResponseBody create() {
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
     * @return data
     */
    public Data getData() {
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
     * @return messages
     */
    public java.util.List<String> getMessages() {
        return this.messages;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> messages; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityCheckSchemeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.messages = model.messages;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(Data data) {
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
         * Messages.
         */
        public Builder messages(java.util.List<String> messages) {
            this.messages = messages;
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

        public GetQualityCheckSchemeResponseBody build() {
            return new GetQualityCheckSchemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityCheckSchemeResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityCheckSchemeResponseBody</p>
     */
    public static class SchemeCheckTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckName")
        private String checkName;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Long checkType;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("SchemeId")
        private Long schemeId;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("SourceScore")
        private Integer sourceScore;

        private SchemeCheckTypeList(Builder builder) {
            this.checkName = builder.checkName;
            this.checkType = builder.checkType;
            this.enable = builder.enable;
            this.schemeId = builder.schemeId;
            this.score = builder.score;
            this.sourceScore = builder.sourceScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeCheckTypeList create() {
            return builder().build();
        }

        /**
         * @return checkName
         */
        public String getCheckName() {
            return this.checkName;
        }

        /**
         * @return checkType
         */
        public Long getCheckType() {
            return this.checkType;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return sourceScore
         */
        public Integer getSourceScore() {
            return this.sourceScore;
        }

        public static final class Builder {
            private String checkName; 
            private Long checkType; 
            private Integer enable; 
            private Long schemeId; 
            private Integer score; 
            private Integer sourceScore; 

            private Builder() {
            } 

            private Builder(SchemeCheckTypeList model) {
                this.checkName = model.checkName;
                this.checkType = model.checkType;
                this.enable = model.enable;
                this.schemeId = model.schemeId;
                this.score = model.score;
                this.sourceScore = model.sourceScore;
            } 

            /**
             * CheckName.
             */
            public Builder checkName(String checkName) {
                this.checkName = checkName;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(Long checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * SchemeId.
             */
            public Builder schemeId(Long schemeId) {
                this.schemeId = schemeId;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * SourceScore.
             */
            public Builder sourceScore(Integer sourceScore) {
                this.sourceScore = sourceScore;
                return this;
            }

            public SchemeCheckTypeList build() {
                return new SchemeCheckTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityCheckSchemeResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityCheckSchemeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private Integer dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InitScore")
        private String initScore;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private java.util.List<String> ruleIds;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RulesInfo> ruleList;

        @com.aliyun.core.annotation.NameInMap("SchemeCheckTypeList")
        private java.util.List<SchemeCheckTypeList> schemeCheckTypeList;

        @com.aliyun.core.annotation.NameInMap("SchemeId")
        private Long schemeId;

        @com.aliyun.core.annotation.NameInMap("SchemeTemplateId")
        private Long schemeTemplateId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private Integer templateType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateUserName")
        private String updateUserName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.createUserName = builder.createUserName;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.initScore = builder.initScore;
            this.name = builder.name;
            this.ruleIds = builder.ruleIds;
            this.ruleList = builder.ruleList;
            this.schemeCheckTypeList = builder.schemeCheckTypeList;
            this.schemeId = builder.schemeId;
            this.schemeTemplateId = builder.schemeTemplateId;
            this.status = builder.status;
            this.templateType = builder.templateType;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateUserName = builder.updateUserName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return initScore
         */
        public String getInitScore() {
            return this.initScore;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleIds
         */
        public java.util.List<String> getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return ruleList
         */
        public java.util.List<RulesInfo> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return schemeCheckTypeList
         */
        public java.util.List<SchemeCheckTypeList> getSchemeCheckTypeList() {
            return this.schemeCheckTypeList;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        /**
         * @return schemeTemplateId
         */
        public Long getSchemeTemplateId() {
            return this.schemeTemplateId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateType
         */
        public Integer getTemplateType() {
            return this.templateType;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUserName
         */
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String createUserName; 
            private Integer dataType; 
            private String description; 
            private String initScore; 
            private String name; 
            private java.util.List<String> ruleIds; 
            private java.util.List<RulesInfo> ruleList; 
            private java.util.List<SchemeCheckTypeList> schemeCheckTypeList; 
            private Long schemeId; 
            private Long schemeTemplateId; 
            private Integer status; 
            private Integer templateType; 
            private Integer type; 
            private String updateTime; 
            private String updateUserName; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.createUserName = model.createUserName;
                this.dataType = model.dataType;
                this.description = model.description;
                this.initScore = model.initScore;
                this.name = model.name;
                this.ruleIds = model.ruleIds;
                this.ruleList = model.ruleList;
                this.schemeCheckTypeList = model.schemeCheckTypeList;
                this.schemeId = model.schemeId;
                this.schemeTemplateId = model.schemeTemplateId;
                this.status = model.status;
                this.templateType = model.templateType;
                this.type = model.type;
                this.updateTime = model.updateTime;
                this.updateUserName = model.updateUserName;
                this.version = model.version;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
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
             * InitScore.
             */
            public Builder initScore(String initScore) {
                this.initScore = initScore;
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
             * RuleIds.
             */
            public Builder ruleIds(java.util.List<String> ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List<RulesInfo> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * SchemeCheckTypeList.
             */
            public Builder schemeCheckTypeList(java.util.List<SchemeCheckTypeList> schemeCheckTypeList) {
                this.schemeCheckTypeList = schemeCheckTypeList;
                return this;
            }

            /**
             * SchemeId.
             */
            public Builder schemeId(Long schemeId) {
                this.schemeId = schemeId;
                return this;
            }

            /**
             * SchemeTemplateId.
             */
            public Builder schemeTemplateId(Long schemeTemplateId) {
                this.schemeTemplateId = schemeTemplateId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(Integer templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
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
             * UpdateUserName.
             */
            public Builder updateUserName(String updateUserName) {
                this.updateUserName = updateUserName;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
