// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateByModelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplateByModelResponseBody</p>
 */
public class DescribeTemplateByModelResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTemplateByModelResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.items = builder.items;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateByModelResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < Items> items; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
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
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTemplateByModelResponseBody build() {
            return new DescribeTemplateByModelResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BasePicture")
        private String basePicture;

        @NameInMap("Brand")
        private String brand;

        @NameInMap("EslSize")
        private String eslSize;

        @NameInMap("EslType")
        private String eslType;

        @NameInMap("Height")
        private Long height;

        @NameInMap("Layout")
        private String layout;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateSceneId")
        private String templateSceneId;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("Width")
        private Long width;

        private Items(Builder builder) {
            this.basePicture = builder.basePicture;
            this.brand = builder.brand;
            this.eslSize = builder.eslSize;
            this.eslType = builder.eslType;
            this.height = builder.height;
            this.layout = builder.layout;
            this.scene = builder.scene;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateSceneId = builder.templateSceneId;
            this.templateVersion = builder.templateVersion;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return basePicture
         */
        public String getBasePicture() {
            return this.basePicture;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return eslSize
         */
        public String getEslSize() {
            return this.eslSize;
        }

        /**
         * @return eslType
         */
        public String getEslType() {
            return this.eslType;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return layout
         */
        public String getLayout() {
            return this.layout;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateSceneId
         */
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return width
         */
        public Long getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String basePicture; 
            private String brand; 
            private String eslSize; 
            private String eslType; 
            private Long height; 
            private String layout; 
            private String scene; 
            private String templateId; 
            private String templateName; 
            private String templateSceneId; 
            private String templateVersion; 
            private Long width; 

            /**
             * BasePicture.
             */
            public Builder basePicture(String basePicture) {
                this.basePicture = basePicture;
                return this;
            }

            /**
             * Brand.
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * EslSize.
             */
            public Builder eslSize(String eslSize) {
                this.eslSize = eslSize;
                return this;
            }

            /**
             * EslType.
             */
            public Builder eslType(String eslType) {
                this.eslType = eslType;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * Layout.
             */
            public Builder layout(String layout) {
                this.layout = layout;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateSceneId.
             */
            public Builder templateSceneId(String templateSceneId) {
                this.templateSceneId = templateSceneId;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Long width) {
                this.width = width;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
