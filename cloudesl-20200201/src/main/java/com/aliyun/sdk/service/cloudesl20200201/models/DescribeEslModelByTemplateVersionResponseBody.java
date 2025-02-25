// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslModelByTemplateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEslModelByTemplateVersionResponseBody</p>
 */
public class DescribeEslModelByTemplateVersionResponseBody extends TeaModel {
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

    @NameInMap("EslModels")
    private java.util.List < EslModels> eslModels;

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

    private DescribeEslModelByTemplateVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.eslModels = builder.eslModels;
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

    public static DescribeEslModelByTemplateVersionResponseBody create() {
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
     * @return eslModels
     */
    public java.util.List < EslModels> getEslModels() {
        return this.eslModels;
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
        private java.util.List < EslModels> eslModels; 
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
         * EslModels.
         */
        public Builder eslModels(java.util.List < EslModels> eslModels) {
            this.eslModels = eslModels;
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

        public DescribeEslModelByTemplateVersionResponseBody build() {
            return new DescribeEslModelByTemplateVersionResponseBody(this);
        } 

    } 

    public static class EslModels extends TeaModel {
        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("EslPhysicalSize")
        private String eslPhysicalSize;

        @NameInMap("EslSize")
        private String eslSize;

        @NameInMap("Image")
        private String image;

        @NameInMap("ModelId")
        private String modelId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ScreenHeight")
        private Integer screenHeight;

        @NameInMap("ScreenWidth")
        private Integer screenWidth;

        @NameInMap("Vendor")
        private String vendor;

        private EslModels(Builder builder) {
            this.deviceType = builder.deviceType;
            this.eslPhysicalSize = builder.eslPhysicalSize;
            this.eslSize = builder.eslSize;
            this.image = builder.image;
            this.modelId = builder.modelId;
            this.name = builder.name;
            this.screenHeight = builder.screenHeight;
            this.screenWidth = builder.screenWidth;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EslModels create() {
            return builder().build();
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return eslPhysicalSize
         */
        public String getEslPhysicalSize() {
            return this.eslPhysicalSize;
        }

        /**
         * @return eslSize
         */
        public String getEslSize() {
            return this.eslSize;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return screenHeight
         */
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        /**
         * @return screenWidth
         */
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String deviceType; 
            private String eslPhysicalSize; 
            private String eslSize; 
            private String image; 
            private String modelId; 
            private String name; 
            private Integer screenHeight; 
            private Integer screenWidth; 
            private String vendor; 

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * EslPhysicalSize.
             */
            public Builder eslPhysicalSize(String eslPhysicalSize) {
                this.eslPhysicalSize = eslPhysicalSize;
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
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
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
             * ScreenHeight.
             */
            public Builder screenHeight(Integer screenHeight) {
                this.screenHeight = screenHeight;
                return this;
            }

            /**
             * ScreenWidth.
             */
            public Builder screenWidth(Integer screenWidth) {
                this.screenWidth = screenWidth;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public EslModels build() {
                return new EslModels(this);
            } 

        } 

    }
}
