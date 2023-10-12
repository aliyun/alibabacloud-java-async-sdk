// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceFormResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceFormResponseBody</p>
 */
public class GetDeviceFormResponseBody extends TeaModel {
    @NameInMap("DeviceForm")
    private DeviceForm deviceForm;

    @NameInMap("RequestId")
    private String requestId;

    private GetDeviceFormResponseBody(Builder builder) {
        this.deviceForm = builder.deviceForm;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceFormResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceForm
     */
    public DeviceForm getDeviceForm() {
        return this.deviceForm;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeviceForm deviceForm; 
        private String requestId; 

        /**
         * DeviceForm.
         */
        public Builder deviceForm(DeviceForm deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceFormResponseBody build() {
            return new GetDeviceFormResponseBody(this);
        } 

    } 

    public static class AttributeList extends TeaModel {
        @NameInMap("AttributeBuiltIn")
        private Boolean attributeBuiltIn;

        @NameInMap("AttributeFormat")
        private String attributeFormat;

        @NameInMap("AttributeFuzzyQuery")
        private Boolean attributeFuzzyQuery;

        @NameInMap("AttributeKey")
        private String attributeKey;

        @NameInMap("AttributeName")
        private String attributeName;

        @NameInMap("AttributePlaceholder")
        private String attributePlaceholder;

        @NameInMap("AttributeQuery")
        private Boolean attributeQuery;

        @NameInMap("AttributeReference")
        private String attributeReference;

        @NameInMap("AttributeRequirement")
        private Boolean attributeRequirement;

        @NameInMap("AttributeSequence")
        private Integer attributeSequence;

        @NameInMap("AttributeTableDisplay")
        private Boolean attributeTableDisplay;

        @NameInMap("AttributeType")
        private String attributeType;

        @NameInMap("AttributeUniqueness")
        private Boolean attributeUniqueness;

        private AttributeList(Builder builder) {
            this.attributeBuiltIn = builder.attributeBuiltIn;
            this.attributeFormat = builder.attributeFormat;
            this.attributeFuzzyQuery = builder.attributeFuzzyQuery;
            this.attributeKey = builder.attributeKey;
            this.attributeName = builder.attributeName;
            this.attributePlaceholder = builder.attributePlaceholder;
            this.attributeQuery = builder.attributeQuery;
            this.attributeReference = builder.attributeReference;
            this.attributeRequirement = builder.attributeRequirement;
            this.attributeSequence = builder.attributeSequence;
            this.attributeTableDisplay = builder.attributeTableDisplay;
            this.attributeType = builder.attributeType;
            this.attributeUniqueness = builder.attributeUniqueness;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeList create() {
            return builder().build();
        }

        /**
         * @return attributeBuiltIn
         */
        public Boolean getAttributeBuiltIn() {
            return this.attributeBuiltIn;
        }

        /**
         * @return attributeFormat
         */
        public String getAttributeFormat() {
            return this.attributeFormat;
        }

        /**
         * @return attributeFuzzyQuery
         */
        public Boolean getAttributeFuzzyQuery() {
            return this.attributeFuzzyQuery;
        }

        /**
         * @return attributeKey
         */
        public String getAttributeKey() {
            return this.attributeKey;
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributePlaceholder
         */
        public String getAttributePlaceholder() {
            return this.attributePlaceholder;
        }

        /**
         * @return attributeQuery
         */
        public Boolean getAttributeQuery() {
            return this.attributeQuery;
        }

        /**
         * @return attributeReference
         */
        public String getAttributeReference() {
            return this.attributeReference;
        }

        /**
         * @return attributeRequirement
         */
        public Boolean getAttributeRequirement() {
            return this.attributeRequirement;
        }

        /**
         * @return attributeSequence
         */
        public Integer getAttributeSequence() {
            return this.attributeSequence;
        }

        /**
         * @return attributeTableDisplay
         */
        public Boolean getAttributeTableDisplay() {
            return this.attributeTableDisplay;
        }

        /**
         * @return attributeType
         */
        public String getAttributeType() {
            return this.attributeType;
        }

        /**
         * @return attributeUniqueness
         */
        public Boolean getAttributeUniqueness() {
            return this.attributeUniqueness;
        }

        public static final class Builder {
            private Boolean attributeBuiltIn; 
            private String attributeFormat; 
            private Boolean attributeFuzzyQuery; 
            private String attributeKey; 
            private String attributeName; 
            private String attributePlaceholder; 
            private Boolean attributeQuery; 
            private String attributeReference; 
            private Boolean attributeRequirement; 
            private Integer attributeSequence; 
            private Boolean attributeTableDisplay; 
            private String attributeType; 
            private Boolean attributeUniqueness; 

            /**
             * 内置属性不可修改和删除
             */
            public Builder attributeBuiltIn(Boolean attributeBuiltIn) {
                this.attributeBuiltIn = attributeBuiltIn;
                return this;
            }

            /**
             * 设备形态属性值格式
             */
            public Builder attributeFormat(String attributeFormat) {
                this.attributeFormat = attributeFormat;
                return this;
            }

            /**
             * 前端查询控件是否支持模糊搜索
             */
            public Builder attributeFuzzyQuery(Boolean attributeFuzzyQuery) {
                this.attributeFuzzyQuery = attributeFuzzyQuery;
                return this;
            }

            /**
             * 设备形态属性主键
             */
            public Builder attributeKey(String attributeKey) {
                this.attributeKey = attributeKey;
                return this;
            }

            /**
             * 设备形态属性名称
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * 前端查询控件占位符
             */
            public Builder attributePlaceholder(String attributePlaceholder) {
                this.attributePlaceholder = attributePlaceholder;
                return this;
            }

            /**
             * 前端是否展示对应的查询控件
             */
            public Builder attributeQuery(Boolean attributeQuery) {
                this.attributeQuery = attributeQuery;
                return this;
            }

            /**
             * 设备形态属性关联对象
             */
            public Builder attributeReference(String attributeReference) {
                this.attributeReference = attributeReference;
                return this;
            }

            /**
             * 设备形态属性是否必填
             */
            public Builder attributeRequirement(Boolean attributeRequirement) {
                this.attributeRequirement = attributeRequirement;
                return this;
            }

            /**
             * AttributeSequence.
             */
            public Builder attributeSequence(Integer attributeSequence) {
                this.attributeSequence = attributeSequence;
                return this;
            }

            /**
             * 设备形态属性是否表格可见
             */
            public Builder attributeTableDisplay(Boolean attributeTableDisplay) {
                this.attributeTableDisplay = attributeTableDisplay;
                return this;
            }

            /**
             * 设备形态属性值类型
             */
            public Builder attributeType(String attributeType) {
                this.attributeType = attributeType;
                return this;
            }

            /**
             * 设备形态属性是否唯一
             */
            public Builder attributeUniqueness(Boolean attributeUniqueness) {
                this.attributeUniqueness = attributeUniqueness;
                return this;
            }

            public AttributeList build() {
                return new AttributeList(this);
            } 

        } 

    }
    public static class DeviceForm extends TeaModel {
        @NameInMap("AccountConfig")
        private Boolean accountConfig;

        @NameInMap("AttributeList")
        private java.util.List < AttributeList> attributeList;

        @NameInMap("ConfigCompare")
        private Boolean configCompare;

        @NameInMap("DetailDisplay")
        private Boolean detailDisplay;

        @NameInMap("DeviceFormId")
        private String deviceFormId;

        @NameInMap("DeviceFormName")
        private String deviceFormName;

        @NameInMap("FormBuiltIn")
        private Boolean formBuiltIn;

        @NameInMap("ResourceUse")
        private String resourceUse;

        @NameInMap("Script")
        private String script;

        @NameInMap("UniqueKey")
        private String uniqueKey;

        private DeviceForm(Builder builder) {
            this.accountConfig = builder.accountConfig;
            this.attributeList = builder.attributeList;
            this.configCompare = builder.configCompare;
            this.detailDisplay = builder.detailDisplay;
            this.deviceFormId = builder.deviceFormId;
            this.deviceFormName = builder.deviceFormName;
            this.formBuiltIn = builder.formBuiltIn;
            this.resourceUse = builder.resourceUse;
            this.script = builder.script;
            this.uniqueKey = builder.uniqueKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceForm create() {
            return builder().build();
        }

        /**
         * @return accountConfig
         */
        public Boolean getAccountConfig() {
            return this.accountConfig;
        }

        /**
         * @return attributeList
         */
        public java.util.List < AttributeList> getAttributeList() {
            return this.attributeList;
        }

        /**
         * @return configCompare
         */
        public Boolean getConfigCompare() {
            return this.configCompare;
        }

        /**
         * @return detailDisplay
         */
        public Boolean getDetailDisplay() {
            return this.detailDisplay;
        }

        /**
         * @return deviceFormId
         */
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        /**
         * @return deviceFormName
         */
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        /**
         * @return formBuiltIn
         */
        public Boolean getFormBuiltIn() {
            return this.formBuiltIn;
        }

        /**
         * @return resourceUse
         */
        public String getResourceUse() {
            return this.resourceUse;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        /**
         * @return uniqueKey
         */
        public String getUniqueKey() {
            return this.uniqueKey;
        }

        public static final class Builder {
            private Boolean accountConfig; 
            private java.util.List < AttributeList> attributeList; 
            private Boolean configCompare; 
            private Boolean detailDisplay; 
            private String deviceFormId; 
            private String deviceFormName; 
            private Boolean formBuiltIn; 
            private String resourceUse; 
            private String script; 
            private String uniqueKey; 

            /**
             * 是否需要账号配置
             */
            public Builder accountConfig(Boolean accountConfig) {
                this.accountConfig = accountConfig;
                return this;
            }

            /**
             * 设备形态属性列表
             */
            public Builder attributeList(java.util.List < AttributeList> attributeList) {
                this.attributeList = attributeList;
                return this;
            }

            /**
             * 是否支持配置生成
             */
            public Builder configCompare(Boolean configCompare) {
                this.configCompare = configCompare;
                return this;
            }

            /**
             * DetailDisplay.
             */
            public Builder detailDisplay(Boolean detailDisplay) {
                this.detailDisplay = detailDisplay;
                return this;
            }

            /**
             * 设备形态ID
             */
            public Builder deviceFormId(String deviceFormId) {
                this.deviceFormId = deviceFormId;
                return this;
            }

            /**
             * 设备形态名称
             */
            public Builder deviceFormName(String deviceFormName) {
                this.deviceFormName = deviceFormName;
                return this;
            }

            /**
             * 内置形态不可修改和删除
             */
            public Builder formBuiltIn(Boolean formBuiltIn) {
                this.formBuiltIn = formBuiltIn;
                return this;
            }

            /**
             * ResourceUse.
             */
            public Builder resourceUse(String resourceUse) {
                this.resourceUse = resourceUse;
                return this;
            }

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            /**
             * UniqueKey.
             */
            public Builder uniqueKey(String uniqueKey) {
                this.uniqueKey = uniqueKey;
                return this;
            }

            public DeviceForm build() {
                return new DeviceForm(this);
            } 

        } 

    }
}
