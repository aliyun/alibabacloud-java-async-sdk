// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgDesensPlanQueryListResponseBody} extends {@link TeaModel}
 *
 * <p>DsgDesensPlanQueryListResponseBody</p>
 */
public class DsgDesensPlanQueryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageData")
    private PageData pageData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DsgDesensPlanQueryListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageData = builder.pageData;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgDesensPlanQueryListResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageData
     */
    public PageData getPageData() {
        return this.pageData;
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
        private Integer httpStatusCode; 
        private PageData pageData; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageData(PageData pageData) {
            this.pageData = pageData;
            return this;
        }

        /**
         * The request ID. You can use the ID to locate logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DsgDesensPlanQueryListResponseBody build() {
            return new DsgDesensPlanQueryListResponseBody(this);
        } 

    } 

    public static class DesensPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesensPlanType")
        private String desensPlanType;

        @com.aliyun.core.annotation.NameInMap("ExtParam")
        private java.util.Map < String, ? > extParam;

        private DesensPlan(Builder builder) {
            this.desensPlanType = builder.desensPlanType;
            this.extParam = builder.extParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesensPlan create() {
            return builder().build();
        }

        /**
         * @return desensPlanType
         */
        public String getDesensPlanType() {
            return this.desensPlanType;
        }

        /**
         * @return extParam
         */
        public java.util.Map < String, ? > getExtParam() {
            return this.extParam;
        }

        public static final class Builder {
            private String desensPlanType; 
            private java.util.Map < String, ? > extParam; 

            /**
             * The type of the data masking rule.
             */
            public Builder desensPlanType(String desensPlanType) {
                this.desensPlanType = desensPlanType;
                return this;
            }

            /**
             * The parameters for the data masking rule. For more information about the parameters, see the [DsgDesensPlanAddOrUpdate](~~2786295~~) API reference.
             */
            public Builder extParam(java.util.Map < String, ? > extParam) {
                this.extParam = extParam;
                return this;
            }

            public DesensPlan build() {
                return new DesensPlan(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckWatermark")
        private Boolean checkWatermark;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DesenMode")
        private String desenMode;

        @com.aliyun.core.annotation.NameInMap("DesensPlan")
        private DesensPlan desensPlan;

        @com.aliyun.core.annotation.NameInMap("DesensRule")
        private String desensRule;

        @com.aliyun.core.annotation.NameInMap("DesensWay")
        private String desensWay;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SceneCode")
        private String sceneCode;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.checkWatermark = builder.checkWatermark;
            this.dataType = builder.dataType;
            this.desenMode = builder.desenMode;
            this.desensPlan = builder.desensPlan;
            this.desensRule = builder.desensRule;
            this.desensWay = builder.desensWay;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.owner = builder.owner;
            this.ruleName = builder.ruleName;
            this.sceneCode = builder.sceneCode;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkWatermark
         */
        public Boolean getCheckWatermark() {
            return this.checkWatermark;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return desenMode
         */
        public String getDesenMode() {
            return this.desenMode;
        }

        /**
         * @return desensPlan
         */
        public DesensPlan getDesensPlan() {
            return this.desensPlan;
        }

        /**
         * @return desensRule
         */
        public String getDesensRule() {
            return this.desensRule;
        }

        /**
         * @return desensWay
         */
        public String getDesensWay() {
            return this.desensWay;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sceneCode
         */
        public String getSceneCode() {
            return this.sceneCode;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean checkWatermark; 
            private String dataType; 
            private String desenMode; 
            private DesensPlan desensPlan; 
            private String desensRule; 
            private String desensWay; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String owner; 
            private String ruleName; 
            private String sceneCode; 
            private String sceneName; 
            private Integer status; 

            /**
             * Indicates whether a watermark is added. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder checkWatermark(Boolean checkWatermark) {
                this.checkWatermark = checkWatermark;
                return this;
            }

            /**
             * The sensitive field type.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * The type of the data masking method.
             */
            public Builder desenMode(String desenMode) {
                this.desenMode = desenMode;
                return this;
            }

            /**
             * The details of the data masking rule.
             */
            public Builder desensPlan(DesensPlan desensPlan) {
                this.desensPlan = desensPlan;
                return this;
            }

            /**
             * The data masking rule.
             */
            public Builder desensRule(String desensRule) {
                this.desensRule = desensRule;
                return this;
            }

            /**
             * The data masking method.
             */
            public Builder desensWay(String desensWay) {
                this.desensWay = desensWay;
                return this;
            }

            /**
             * The time when the data masking rule was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the data masking rule was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the data masking rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The owner of the data masking rule.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The name of the data masking rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The code of the level-1 data masking scenario to which the rule belongs. Valid values:
             * <p>
             * 
             * *   dataworks_display_desense_code: masking of displayed data in DataStudio and Data Map
             * *   maxcompute_desense_code: data masking at the MaxCompute compute engine layer
             * *   maxcompute_new_desense_code: data masking at the MaxCompute compute engine layer (new)
             * *   hologres_display_desense_code: data masking at the Hologres compute engine layer
             * *   dataworks_data_integration_desense_code: static data masking in Data Integration
             * *   dataworks_analysis_desense_code: masking of displayed data in DataAnalysis
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * The name of the level-2 data masking scenario to which the data masking rule belongs.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * The status of the data masking rule. Valid values:
             * <p>
             * 
             * *   0: expired
             * *   1: effective
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List < Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageData(Builder builder) {
            this.data = builder.data;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The information about the data masking rule.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of data masking rules.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
}
