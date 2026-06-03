// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link GetSchemeResponseBody} extends {@link TeaModel}
 *
 * <p>GetSchemeResponseBody</p>
 */
public class GetSchemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSchemeResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSchemeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public GetSchemeResponseBody build() {
            return new GetSchemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSchemeResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchemeResponseBody</p>
     */
    public static class ScenesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScenesId")
        private Long scenesId;

        @com.aliyun.core.annotation.NameInMap("ScenesName")
        private String scenesName;

        private ScenesList(Builder builder) {
            this.scenesId = builder.scenesId;
            this.scenesName = builder.scenesName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenesList create() {
            return builder().build();
        }

        /**
         * @return scenesId
         */
        public Long getScenesId() {
            return this.scenesId;
        }

        /**
         * @return scenesName
         */
        public String getScenesName() {
            return this.scenesName;
        }

        public static final class Builder {
            private Long scenesId; 
            private String scenesName; 

            private Builder() {
            } 

            private Builder(ScenesList model) {
                this.scenesId = model.scenesId;
                this.scenesName = model.scenesName;
            } 

            /**
             * ScenesId.
             */
            public Builder scenesId(Long scenesId) {
                this.scenesId = scenesId;
                return this;
            }

            /**
             * ScenesName.
             */
            public Builder scenesName(String scenesName) {
                this.scenesName = scenesName;
                return this;
            }

            public ScenesList build() {
                return new ScenesList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSchemeResponseBody} extends {@link TeaModel}
     *
     * <p>GetSchemeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditDesc")
        private String auditDesc;

        @com.aliyun.core.annotation.NameInMap("AuditTime")
        private Long auditTime;

        @com.aliyun.core.annotation.NameInMap("BusinessTypeList")
        private java.util.List<Integer> businessTypeList;

        @com.aliyun.core.annotation.NameInMap("CompanyId")
        private Long companyId;

        @com.aliyun.core.annotation.NameInMap("CycleList")
        private java.util.List<String> cycleList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IndustryId")
        private String industryId;

        @com.aliyun.core.annotation.NameInMap("ScenesList")
        private java.util.List<ScenesList> scenesList;

        @com.aliyun.core.annotation.NameInMap("SchemeId")
        private Long schemeId;

        @com.aliyun.core.annotation.NameInMap("SchemeName")
        private String schemeName;

        @com.aliyun.core.annotation.NameInMap("SchemeType")
        private Integer schemeType;

        @com.aliyun.core.annotation.NameInMap("Statement")
        private String statement;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private Data(Builder builder) {
            this.auditDesc = builder.auditDesc;
            this.auditTime = builder.auditTime;
            this.businessTypeList = builder.businessTypeList;
            this.companyId = builder.companyId;
            this.cycleList = builder.cycleList;
            this.description = builder.description;
            this.industryId = builder.industryId;
            this.scenesList = builder.scenesList;
            this.schemeId = builder.schemeId;
            this.schemeName = builder.schemeName;
            this.schemeType = builder.schemeType;
            this.statement = builder.statement;
            this.status = builder.status;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditDesc
         */
        public String getAuditDesc() {
            return this.auditDesc;
        }

        /**
         * @return auditTime
         */
        public Long getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return businessTypeList
         */
        public java.util.List<Integer> getBusinessTypeList() {
            return this.businessTypeList;
        }

        /**
         * @return companyId
         */
        public Long getCompanyId() {
            return this.companyId;
        }

        /**
         * @return cycleList
         */
        public java.util.List<String> getCycleList() {
            return this.cycleList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return industryId
         */
        public String getIndustryId() {
            return this.industryId;
        }

        /**
         * @return scenesList
         */
        public java.util.List<ScenesList> getScenesList() {
            return this.scenesList;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        /**
         * @return schemeName
         */
        public String getSchemeName() {
            return this.schemeName;
        }

        /**
         * @return schemeType
         */
        public Integer getSchemeType() {
            return this.schemeType;
        }

        /**
         * @return statement
         */
        public String getStatement() {
            return this.statement;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String auditDesc; 
            private Long auditTime; 
            private java.util.List<Integer> businessTypeList; 
            private Long companyId; 
            private java.util.List<String> cycleList; 
            private String description; 
            private String industryId; 
            private java.util.List<ScenesList> scenesList; 
            private Long schemeId; 
            private String schemeName; 
            private Integer schemeType; 
            private String statement; 
            private Integer status; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditDesc = model.auditDesc;
                this.auditTime = model.auditTime;
                this.businessTypeList = model.businessTypeList;
                this.companyId = model.companyId;
                this.cycleList = model.cycleList;
                this.description = model.description;
                this.industryId = model.industryId;
                this.scenesList = model.scenesList;
                this.schemeId = model.schemeId;
                this.schemeName = model.schemeName;
                this.schemeType = model.schemeType;
                this.statement = model.statement;
                this.status = model.status;
                this.templateId = model.templateId;
            } 

            /**
             * AuditDesc.
             */
            public Builder auditDesc(String auditDesc) {
                this.auditDesc = auditDesc;
                return this;
            }

            /**
             * AuditTime.
             */
            public Builder auditTime(Long auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * BusinessTypeList.
             */
            public Builder businessTypeList(java.util.List<Integer> businessTypeList) {
                this.businessTypeList = businessTypeList;
                return this;
            }

            /**
             * CompanyId.
             */
            public Builder companyId(Long companyId) {
                this.companyId = companyId;
                return this;
            }

            /**
             * CycleList.
             */
            public Builder cycleList(java.util.List<String> cycleList) {
                this.cycleList = cycleList;
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
             * IndustryId.
             */
            public Builder industryId(String industryId) {
                this.industryId = industryId;
                return this;
            }

            /**
             * ScenesList.
             */
            public Builder scenesList(java.util.List<ScenesList> scenesList) {
                this.scenesList = scenesList;
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
             * SchemeName.
             */
            public Builder schemeName(String schemeName) {
                this.schemeName = schemeName;
                return this;
            }

            /**
             * SchemeType.
             */
            public Builder schemeType(Integer schemeType) {
                this.schemeType = schemeType;
                return this;
            }

            /**
             * Statement.
             */
            public Builder statement(String statement) {
                this.statement = statement;
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
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
