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
 * {@link DescribeSystemPropertyTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemPropertyTemplatesResponseBody</p>
 */
public class DescribeSystemPropertyTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemPropertyTemplateModel")
    private java.util.List<SystemPropertyTemplateModel> systemPropertyTemplateModel;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSystemPropertyTemplatesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.systemPropertyTemplateModel = builder.systemPropertyTemplateModel;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemPropertyTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemPropertyTemplateModel
     */
    public java.util.List<SystemPropertyTemplateModel> getSystemPropertyTemplateModel() {
        return this.systemPropertyTemplateModel;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<SystemPropertyTemplateModel> systemPropertyTemplateModel; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSystemPropertyTemplatesResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.systemPropertyTemplateModel = model.systemPropertyTemplateModel;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The token used to start the next query. An empty value indicates that all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of property template objects.</p>
         */
        public Builder systemPropertyTemplateModel(java.util.List<SystemPropertyTemplateModel> systemPropertyTemplateModel) {
            this.systemPropertyTemplateModel = systemPropertyTemplateModel;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSystemPropertyTemplatesResponseBody build() {
            return new DescribeSystemPropertyTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSystemPropertyTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemPropertyTemplatesResponseBody</p>
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
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>propKey</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * <p>The property value.</p>
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
     * {@link DescribeSystemPropertyTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemPropertyTemplatesResponseBody</p>
     */
    public static class SystemPropertyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPropertyInfos")
        private java.util.List<CustomPropertyInfos> customPropertyInfos;

        @com.aliyun.core.annotation.NameInMap("RoProductDevice")
        private String roProductDevice;

        private SystemPropertyInfo(Builder builder) {
            this.customPropertyInfos = builder.customPropertyInfos;
            this.roProductDevice = builder.roProductDevice;
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
         * @return roProductDevice
         */
        public String getRoProductDevice() {
            return this.roProductDevice;
        }

        public static final class Builder {
            private java.util.List<CustomPropertyInfos> customPropertyInfos; 
            private String roProductDevice; 

            private Builder() {
            } 

            private Builder(SystemPropertyInfo model) {
                this.customPropertyInfos = model.customPropertyInfos;
                this.roProductDevice = model.roProductDevice;
            } 

            /**
             * <p>The custom property information.</p>
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
            public Builder roProductDevice(String roProductDevice) {
                this.roProductDevice = roProductDevice;
                return this;
            }

            public SystemPropertyInfo build() {
                return new SystemPropertyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSystemPropertyTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSystemPropertyTemplatesResponseBody</p>
     */
    public static class SystemPropertyTemplateModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableAuto")
        private Boolean enableAuto;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemPropertyInfo")
        private SystemPropertyInfo systemPropertyInfo;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private SystemPropertyTemplateModel(Builder builder) {
            this.enableAuto = builder.enableAuto;
            this.filePath = builder.filePath;
            this.status = builder.status;
            this.systemPropertyInfo = builder.systemPropertyInfo;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemPropertyTemplateModel create() {
            return builder().build();
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemPropertyInfo
         */
        public SystemPropertyInfo getSystemPropertyInfo() {
            return this.systemPropertyInfo;
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

        public static final class Builder {
            private Boolean enableAuto; 
            private String filePath; 
            private String status; 
            private SystemPropertyInfo systemPropertyInfo; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(SystemPropertyTemplateModel model) {
                this.enableAuto = model.enableAuto;
                this.filePath = model.filePath;
                this.status = model.status;
                this.systemPropertyInfo = model.systemPropertyInfo;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * <p>Indicates whether preset system properties can be automatically generated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAuto(Boolean enableAuto) {
                this.enableAuto = enableAuto;
                return this;
            }

            /**
             * <p>The URL path of the property template file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://filepath****.com">https://filepath****.com</a></p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The template status.</p>
             * 
             * <strong>example:</strong>
             * <p>init</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The system property template information.</p>
             */
            public Builder systemPropertyInfo(SystemPropertyInfo systemPropertyInfo) {
                this.systemPropertyInfo = systemPropertyInfo;
                return this;
            }

            /**
             * <p>The property template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-0caoenwutkkx****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Template 1</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public SystemPropertyTemplateModel build() {
                return new SystemPropertyTemplateModel(this);
            } 

        } 

    }
}
