// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link GetModelInstanceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelInstanceInfoResponseBody</p>
 */
public class GetModelInstanceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EasServiceId")
    private String easServiceId;

    @com.aliyun.core.annotation.NameInMap("EasServiceName")
    private String easServiceName;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("HarmfulCategoryConfigInfoList")
    private java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("IsSupportImage")
    private Boolean isSupportImage;

    @com.aliyun.core.annotation.NameInMap("IsSupportText")
    private Boolean isSupportText;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ModelCallName")
    private String modelCallName;

    @com.aliyun.core.annotation.NameInMap("ModelCategoryId")
    private Long modelCategoryId;

    @com.aliyun.core.annotation.NameInMap("ModelInstanceId")
    private Long modelInstanceId;

    @com.aliyun.core.annotation.NameInMap("ModelSource")
    private Integer modelSource;

    @com.aliyun.core.annotation.NameInMap("ModelToken")
    private String modelToken;

    @com.aliyun.core.annotation.NameInMap("ModelUrl")
    private String modelUrl;

    @com.aliyun.core.annotation.NameInMap("ModelVpcUrl")
    private String modelVpcUrl;

    @com.aliyun.core.annotation.NameInMap("PromptAttackInfoList")
    private java.util.List<PromptAttackInfoList> promptAttackInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetModelInstanceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.easServiceId = builder.easServiceId;
        this.easServiceName = builder.easServiceName;
        this.gmtModified = builder.gmtModified;
        this.harmfulCategoryConfigInfoList = builder.harmfulCategoryConfigInfoList;
        this.httpStatusCode = builder.httpStatusCode;
        this.isSupportImage = builder.isSupportImage;
        this.isSupportText = builder.isSupportText;
        this.message = builder.message;
        this.modelCallName = builder.modelCallName;
        this.modelCategoryId = builder.modelCategoryId;
        this.modelInstanceId = builder.modelInstanceId;
        this.modelSource = builder.modelSource;
        this.modelToken = builder.modelToken;
        this.modelUrl = builder.modelUrl;
        this.modelVpcUrl = builder.modelVpcUrl;
        this.promptAttackInfoList = builder.promptAttackInfoList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelInstanceInfoResponseBody create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return easServiceId
     */
    public String getEasServiceId() {
        return this.easServiceId;
    }

    /**
     * @return easServiceName
     */
    public String getEasServiceName() {
        return this.easServiceName;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return harmfulCategoryConfigInfoList
     */
    public java.util.List<HarmfulCategoryConfigInfoList> getHarmfulCategoryConfigInfoList() {
        return this.harmfulCategoryConfigInfoList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return isSupportImage
     */
    public Boolean getIsSupportImage() {
        return this.isSupportImage;
    }

    /**
     * @return isSupportText
     */
    public Boolean getIsSupportText() {
        return this.isSupportText;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return modelCallName
     */
    public String getModelCallName() {
        return this.modelCallName;
    }

    /**
     * @return modelCategoryId
     */
    public Long getModelCategoryId() {
        return this.modelCategoryId;
    }

    /**
     * @return modelInstanceId
     */
    public Long getModelInstanceId() {
        return this.modelInstanceId;
    }

    /**
     * @return modelSource
     */
    public Integer getModelSource() {
        return this.modelSource;
    }

    /**
     * @return modelToken
     */
    public String getModelToken() {
        return this.modelToken;
    }

    /**
     * @return modelUrl
     */
    public String getModelUrl() {
        return this.modelUrl;
    }

    /**
     * @return modelVpcUrl
     */
    public String getModelVpcUrl() {
        return this.modelVpcUrl;
    }

    /**
     * @return promptAttackInfoList
     */
    public java.util.List<PromptAttackInfoList> getPromptAttackInfoList() {
        return this.promptAttackInfoList;
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
        private String description; 
        private String easServiceId; 
        private String easServiceName; 
        private Long gmtModified; 
        private java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList; 
        private Integer httpStatusCode; 
        private Boolean isSupportImage; 
        private Boolean isSupportText; 
        private String message; 
        private String modelCallName; 
        private Long modelCategoryId; 
        private Long modelInstanceId; 
        private Integer modelSource; 
        private String modelToken; 
        private String modelUrl; 
        private String modelVpcUrl; 
        private java.util.List<PromptAttackInfoList> promptAttackInfoList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetModelInstanceInfoResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.easServiceId = model.easServiceId;
            this.easServiceName = model.easServiceName;
            this.gmtModified = model.gmtModified;
            this.harmfulCategoryConfigInfoList = model.harmfulCategoryConfigInfoList;
            this.httpStatusCode = model.httpStatusCode;
            this.isSupportImage = model.isSupportImage;
            this.isSupportText = model.isSupportText;
            this.message = model.message;
            this.modelCallName = model.modelCallName;
            this.modelCategoryId = model.modelCategoryId;
            this.modelInstanceId = model.modelInstanceId;
            this.modelSource = model.modelSource;
            this.modelToken = model.modelToken;
            this.modelUrl = model.modelUrl;
            this.modelVpcUrl = model.modelVpcUrl;
            this.promptAttackInfoList = model.promptAttackInfoList;
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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EasServiceId.
         */
        public Builder easServiceId(String easServiceId) {
            this.easServiceId = easServiceId;
            return this;
        }

        /**
         * EasServiceName.
         */
        public Builder easServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * HarmfulCategoryConfigInfoList.
         */
        public Builder harmfulCategoryConfigInfoList(java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList) {
            this.harmfulCategoryConfigInfoList = harmfulCategoryConfigInfoList;
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
         * IsSupportImage.
         */
        public Builder isSupportImage(Boolean isSupportImage) {
            this.isSupportImage = isSupportImage;
            return this;
        }

        /**
         * IsSupportText.
         */
        public Builder isSupportText(Boolean isSupportText) {
            this.isSupportText = isSupportText;
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
         * ModelCallName.
         */
        public Builder modelCallName(String modelCallName) {
            this.modelCallName = modelCallName;
            return this;
        }

        /**
         * ModelCategoryId.
         */
        public Builder modelCategoryId(Long modelCategoryId) {
            this.modelCategoryId = modelCategoryId;
            return this;
        }

        /**
         * ModelInstanceId.
         */
        public Builder modelInstanceId(Long modelInstanceId) {
            this.modelInstanceId = modelInstanceId;
            return this;
        }

        /**
         * ModelSource.
         */
        public Builder modelSource(Integer modelSource) {
            this.modelSource = modelSource;
            return this;
        }

        /**
         * ModelToken.
         */
        public Builder modelToken(String modelToken) {
            this.modelToken = modelToken;
            return this;
        }

        /**
         * ModelUrl.
         */
        public Builder modelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }

        /**
         * ModelVpcUrl.
         */
        public Builder modelVpcUrl(String modelVpcUrl) {
            this.modelVpcUrl = modelVpcUrl;
            return this;
        }

        /**
         * PromptAttackInfoList.
         */
        public Builder promptAttackInfoList(java.util.List<PromptAttackInfoList> promptAttackInfoList) {
            this.promptAttackInfoList = promptAttackInfoList;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
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

        public GetModelInstanceInfoResponseBody build() {
            return new GetModelInstanceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInstanceInfoResponseBody</p>
     */
    public static class HarmfulCategoryConfigInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryLabel")
        private String categoryLabel;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private HarmfulCategoryConfigInfoList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryLabel = builder.categoryLabel;
            this.categoryType = builder.categoryType;
            this.inputOutputType = builder.inputOutputType;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HarmfulCategoryConfigInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryLabel
         */
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return inputOutputType
         */
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private Long categoryId; 
            private String categoryLabel; 
            private Integer categoryType; 
            private Integer inputOutputType; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(HarmfulCategoryConfigInfoList model) {
                this.categoryId = model.categoryId;
                this.categoryLabel = model.categoryLabel;
                this.categoryType = model.categoryType;
                this.inputOutputType = model.inputOutputType;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryLabel.
             */
            public Builder categoryLabel(String categoryLabel) {
                this.categoryLabel = categoryLabel;
                return this;
            }

            /**
             * CategoryType.
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * InputOutputType.
             */
            public Builder inputOutputType(Integer inputOutputType) {
                this.inputOutputType = inputOutputType;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            public HarmfulCategoryConfigInfoList build() {
                return new HarmfulCategoryConfigInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelInstanceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInstanceInfoResponseBody</p>
     */
    public static class PromptAttackInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryLabel")
        private String categoryLabel;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private PromptAttackInfoList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryLabel = builder.categoryLabel;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptAttackInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryLabel
         */
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private Long categoryId; 
            private String categoryLabel; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(PromptAttackInfoList model) {
                this.categoryId = model.categoryId;
                this.categoryLabel = model.categoryLabel;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryLabel.
             */
            public Builder categoryLabel(String categoryLabel) {
                this.categoryLabel = categoryLabel;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            public PromptAttackInfoList build() {
                return new PromptAttackInfoList(this);
            } 

        } 

    }
}
