// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityCheckSchemeResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityCheckSchemeResponseBody</p>
 */
public class GetQualityCheckSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("Messages")
    private Messages messages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public Messages getMessages() {
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
        private Messages messages; 
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
        public Builder messages(Messages messages) {
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

    public static class RuleIds extends TeaModel {
        @NameInMap("RuleId")
        private java.util.List < String > ruleId;

        private RuleIds(Builder builder) {
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleIds create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public java.util.List < String > getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private java.util.List < String > ruleId; 

            /**
             * RuleId.
             */
            public Builder ruleId(java.util.List < String > ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public RuleIds build() {
                return new RuleIds(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @NameInMap("RuleList")
        private java.util.List < String > ruleList;

        private RuleList(Builder builder) {
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return ruleList
         */
        public java.util.List < String > getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private java.util.List < String > ruleList; 

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List < String > ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    public static class SchemeCheckTypeList extends TeaModel {
        @NameInMap("CheckName")
        private String checkName;

        @NameInMap("CheckType")
        private Long checkType;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("SchemeId")
        private Long schemeId;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("SourceScore")
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
    public static class DataSchemeCheckTypeList extends TeaModel {
        @NameInMap("SchemeCheckTypeList")
        private java.util.List < SchemeCheckTypeList> schemeCheckTypeList;

        private DataSchemeCheckTypeList(Builder builder) {
            this.schemeCheckTypeList = builder.schemeCheckTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSchemeCheckTypeList create() {
            return builder().build();
        }

        /**
         * @return schemeCheckTypeList
         */
        public java.util.List < SchemeCheckTypeList> getSchemeCheckTypeList() {
            return this.schemeCheckTypeList;
        }

        public static final class Builder {
            private java.util.List < SchemeCheckTypeList> schemeCheckTypeList; 

            /**
             * SchemeCheckTypeList.
             */
            public Builder schemeCheckTypeList(java.util.List < SchemeCheckTypeList> schemeCheckTypeList) {
                this.schemeCheckTypeList = schemeCheckTypeList;
                return this;
            }

            public DataSchemeCheckTypeList build() {
                return new DataSchemeCheckTypeList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("DataType")
        private Integer dataType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublishContent")
        private String publishContent;

        @NameInMap("RuleIds")
        private RuleIds ruleIds;

        @NameInMap("RuleList")
        private RuleList ruleList;

        @NameInMap("SchemeCheckTypeList")
        private DataSchemeCheckTypeList schemeCheckTypeList;

        @NameInMap("SchemeId")
        private Long schemeId;

        @NameInMap("SchemeTemplateId")
        private Long schemeTemplateId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TemplateType")
        private Integer templateType;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateUserName")
        private String updateUserName;

        @NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.createUserName = builder.createUserName;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.name = builder.name;
            this.publishContent = builder.publishContent;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishContent
         */
        public String getPublishContent() {
            return this.publishContent;
        }

        /**
         * @return ruleIds
         */
        public RuleIds getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return ruleList
         */
        public RuleList getRuleList() {
            return this.ruleList;
        }

        /**
         * @return schemeCheckTypeList
         */
        public DataSchemeCheckTypeList getSchemeCheckTypeList() {
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
            private String name; 
            private String publishContent; 
            private RuleIds ruleIds; 
            private RuleList ruleList; 
            private DataSchemeCheckTypeList schemeCheckTypeList; 
            private Long schemeId; 
            private Long schemeTemplateId; 
            private Integer status; 
            private Integer templateType; 
            private Integer type; 
            private String updateTime; 
            private String updateUserName; 
            private Long version; 

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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PublishContent.
             */
            public Builder publishContent(String publishContent) {
                this.publishContent = publishContent;
                return this;
            }

            /**
             * RuleIds.
             */
            public Builder ruleIds(RuleIds ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(RuleList ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * SchemeCheckTypeList.
             */
            public Builder schemeCheckTypeList(DataSchemeCheckTypeList schemeCheckTypeList) {
                this.schemeCheckTypeList = schemeCheckTypeList;
                return this;
            }

            /**
             * 质检方案id
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
    public static class Messages extends TeaModel {
        @NameInMap("Message")
        private java.util.List < String > message;

        private Messages(Builder builder) {
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public java.util.List < String > getMessage() {
            return this.message;
        }

        public static final class Builder {
            private java.util.List < String > message; 

            /**
             * Message.
             */
            public Builder message(java.util.List < String > message) {
                this.message = message;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
