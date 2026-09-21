// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateSystemPropertyTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateSystemPropertyTemplateRequest</p>
 */
public class CreateSystemPropertyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAuto")
    private Boolean enableAuto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemPropertyInfo")
    private SystemPropertyInfo systemPropertyInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private CreateSystemPropertyTemplateRequest(Builder builder) {
        super(builder);
        this.enableAuto = builder.enableAuto;
        this.filePath = builder.filePath;
        this.systemPropertyInfo = builder.systemPropertyInfo;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSystemPropertyTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableAuto
     */
    public Boolean getEnableAuto() {
        return this.enableAuto;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return systemPropertyInfo
     */
    public SystemPropertyInfo getSystemPropertyInfo() {
        return this.systemPropertyInfo;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<CreateSystemPropertyTemplateRequest, Builder> {
        private Boolean enableAuto; 
        private String filePath; 
        private SystemPropertyInfo systemPropertyInfo; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSystemPropertyTemplateRequest request) {
            super(request);
            this.enableAuto = request.enableAuto;
            this.filePath = request.filePath;
            this.systemPropertyInfo = request.systemPropertyInfo;
            this.templateName = request.templateName;
        } 

        /**
         * <p>Specifies whether to automatically generate preset system properties.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAuto(Boolean enableAuto) {
            this.putQueryParameter("EnableAuto", enableAuto);
            this.enableAuto = enableAuto;
            return this;
        }

        /**
         * <p>The URL of the property template file. The API parses the file synchronously. An error is returned if the file format is invalid.</p>
         * <blockquote>
         * <p>The file must be in the following format: <code>{ &quot;properties&quot;:{&quot;key1&quot;:&quot;value1&quot;}}</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://filepath****.com">https://filepath****.com</a></p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>The information about the system property template.</p>
         */
        public Builder systemPropertyInfo(SystemPropertyInfo systemPropertyInfo) {
            String systemPropertyInfoShrink = shrink(systemPropertyInfo, "SystemPropertyInfo", "json");
            this.putQueryParameter("SystemPropertyInfo", systemPropertyInfoShrink);
            this.systemPropertyInfo = systemPropertyInfo;
            return this;
        }

        /**
         * <p>The name of the template. The name must meet the following requirements:</p>
         * <ul>
         * <li><p>Be 2 to 32 characters in length.</p>
         * </li>
         * <li><p>Start with an uppercase or lowercase letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * <li><p>Contain letters, digits, colons (:), underscores (_), and hyphens (-). Periods (.) are not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Template1</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreateSystemPropertyTemplateRequest build() {
            return new CreateSystemPropertyTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSystemPropertyTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateSystemPropertyTemplateRequest</p>
     */
    public static class CustomPropertyInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyName")
        private String propertyName;

        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        private CustomPropertyInfos(Builder builder) {
            this.propertyName = builder.propertyName;
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPropertyInfos create() {
            return builder().build();
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private String propertyName; 
            private String propertyValue; 

            private Builder() {
            } 

            private Builder(CustomPropertyInfos model) {
                this.propertyName = model.propertyName;
                this.propertyValue = model.propertyValue;
            } 

            /**
             * <p>The key of the custom property.</p>
             * 
             * <strong>example:</strong>
             * <p>propKey</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * <p>The value of the custom property.</p>
             * 
             * <strong>example:</strong>
             * <p>propValue</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public CustomPropertyInfos build() {
                return new CustomPropertyInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSystemPropertyTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateSystemPropertyTemplateRequest</p>
     */
    public static class SystemPropertyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPropertyInfos")
        private java.util.List<CustomPropertyInfos> customPropertyInfos;

        @com.aliyun.core.annotation.NameInMap("RoBootloader")
        private String roBootloader;

        @com.aliyun.core.annotation.NameInMap("RoBuildDisplayId")
        private String roBuildDisplayId;

        @com.aliyun.core.annotation.NameInMap("RoBuildFingerprint")
        private String roBuildFingerprint;

        @com.aliyun.core.annotation.NameInMap("RoBuildHost")
        private String roBuildHost;

        @com.aliyun.core.annotation.NameInMap("RoBuildId")
        private String roBuildId;

        @com.aliyun.core.annotation.NameInMap("RoBuildProduct")
        private String roBuildProduct;

        @com.aliyun.core.annotation.NameInMap("RoBuildTags")
        private String roBuildTags;

        @com.aliyun.core.annotation.NameInMap("RoBuildType")
        private String roBuildType;

        @com.aliyun.core.annotation.NameInMap("RoBuildUser")
        private String roBuildUser;

        @com.aliyun.core.annotation.NameInMap("RoProductBoard")
        private String roProductBoard;

        @com.aliyun.core.annotation.NameInMap("RoProductBrand")
        private String roProductBrand;

        @com.aliyun.core.annotation.NameInMap("RoProductDevice")
        private String roProductDevice;

        @com.aliyun.core.annotation.NameInMap("RoProductManufacturer")
        private String roProductManufacturer;

        @com.aliyun.core.annotation.NameInMap("RoProductModel")
        private String roProductModel;

        @com.aliyun.core.annotation.NameInMap("RwRoSerialNo")
        private String rwRoSerialNo;

        private SystemPropertyInfo(Builder builder) {
            this.customPropertyInfos = builder.customPropertyInfos;
            this.roBootloader = builder.roBootloader;
            this.roBuildDisplayId = builder.roBuildDisplayId;
            this.roBuildFingerprint = builder.roBuildFingerprint;
            this.roBuildHost = builder.roBuildHost;
            this.roBuildId = builder.roBuildId;
            this.roBuildProduct = builder.roBuildProduct;
            this.roBuildTags = builder.roBuildTags;
            this.roBuildType = builder.roBuildType;
            this.roBuildUser = builder.roBuildUser;
            this.roProductBoard = builder.roProductBoard;
            this.roProductBrand = builder.roProductBrand;
            this.roProductDevice = builder.roProductDevice;
            this.roProductManufacturer = builder.roProductManufacturer;
            this.roProductModel = builder.roProductModel;
            this.rwRoSerialNo = builder.rwRoSerialNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemPropertyInfo create() {
            return builder().build();
        }

        /**
         * @return customPropertyInfos
         */
        public java.util.List<CustomPropertyInfos> getCustomPropertyInfos() {
            return this.customPropertyInfos;
        }

        /**
         * @return roBootloader
         */
        public String getRoBootloader() {
            return this.roBootloader;
        }

        /**
         * @return roBuildDisplayId
         */
        public String getRoBuildDisplayId() {
            return this.roBuildDisplayId;
        }

        /**
         * @return roBuildFingerprint
         */
        public String getRoBuildFingerprint() {
            return this.roBuildFingerprint;
        }

        /**
         * @return roBuildHost
         */
        public String getRoBuildHost() {
            return this.roBuildHost;
        }

        /**
         * @return roBuildId
         */
        public String getRoBuildId() {
            return this.roBuildId;
        }

        /**
         * @return roBuildProduct
         */
        public String getRoBuildProduct() {
            return this.roBuildProduct;
        }

        /**
         * @return roBuildTags
         */
        public String getRoBuildTags() {
            return this.roBuildTags;
        }

        /**
         * @return roBuildType
         */
        public String getRoBuildType() {
            return this.roBuildType;
        }

        /**
         * @return roBuildUser
         */
        public String getRoBuildUser() {
            return this.roBuildUser;
        }

        /**
         * @return roProductBoard
         */
        public String getRoProductBoard() {
            return this.roProductBoard;
        }

        /**
         * @return roProductBrand
         */
        public String getRoProductBrand() {
            return this.roProductBrand;
        }

        /**
         * @return roProductDevice
         */
        public String getRoProductDevice() {
            return this.roProductDevice;
        }

        /**
         * @return roProductManufacturer
         */
        public String getRoProductManufacturer() {
            return this.roProductManufacturer;
        }

        /**
         * @return roProductModel
         */
        public String getRoProductModel() {
            return this.roProductModel;
        }

        /**
         * @return rwRoSerialNo
         */
        public String getRwRoSerialNo() {
            return this.rwRoSerialNo;
        }

        public static final class Builder {
            private java.util.List<CustomPropertyInfos> customPropertyInfos; 
            private String roBootloader; 
            private String roBuildDisplayId; 
            private String roBuildFingerprint; 
            private String roBuildHost; 
            private String roBuildId; 
            private String roBuildProduct; 
            private String roBuildTags; 
            private String roBuildType; 
            private String roBuildUser; 
            private String roProductBoard; 
            private String roProductBrand; 
            private String roProductDevice; 
            private String roProductManufacturer; 
            private String roProductModel; 
            private String rwRoSerialNo; 

            private Builder() {
            } 

            private Builder(SystemPropertyInfo model) {
                this.customPropertyInfos = model.customPropertyInfos;
                this.roBootloader = model.roBootloader;
                this.roBuildDisplayId = model.roBuildDisplayId;
                this.roBuildFingerprint = model.roBuildFingerprint;
                this.roBuildHost = model.roBuildHost;
                this.roBuildId = model.roBuildId;
                this.roBuildProduct = model.roBuildProduct;
                this.roBuildTags = model.roBuildTags;
                this.roBuildType = model.roBuildType;
                this.roBuildUser = model.roBuildUser;
                this.roProductBoard = model.roProductBoard;
                this.roProductBrand = model.roProductBrand;
                this.roProductDevice = model.roProductDevice;
                this.roProductManufacturer = model.roProductManufacturer;
                this.roProductModel = model.roProductModel;
                this.rwRoSerialNo = model.rwRoSerialNo;
            } 

            /**
             * <p>A list of custom properties.</p>
             */
            public Builder customPropertyInfos(java.util.List<CustomPropertyInfos> customPropertyInfos) {
                this.customPropertyInfos = customPropertyInfos;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBootloader(String roBootloader) {
                this.roBootloader = roBootloader;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildDisplayId(String roBuildDisplayId) {
                this.roBuildDisplayId = roBuildDisplayId;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildFingerprint(String roBuildFingerprint) {
                this.roBuildFingerprint = roBuildFingerprint;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildHost(String roBuildHost) {
                this.roBuildHost = roBuildHost;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildId(String roBuildId) {
                this.roBuildId = roBuildId;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildProduct(String roBuildProduct) {
                this.roBuildProduct = roBuildProduct;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildTags(String roBuildTags) {
                this.roBuildTags = roBuildTags;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildType(String roBuildType) {
                this.roBuildType = roBuildType;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roBuildUser(String roBuildUser) {
                this.roBuildUser = roBuildUser;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roProductBoard(String roProductBoard) {
                this.roProductBoard = roProductBoard;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roProductBrand(String roProductBrand) {
                this.roProductBrand = roProductBrand;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roProductDevice(String roProductDevice) {
                this.roProductDevice = roProductDevice;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roProductManufacturer(String roProductManufacturer) {
                this.roProductManufacturer = roProductManufacturer;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder roProductModel(String roProductModel) {
                this.roProductModel = roProductModel;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder rwRoSerialNo(String rwRoSerialNo) {
                this.rwRoSerialNo = rwRoSerialNo;
                return this;
            }

            public SystemPropertyInfo build() {
                return new SystemPropertyInfo(this);
            } 

        } 

    }
}
