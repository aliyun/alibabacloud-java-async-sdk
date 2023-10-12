// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeviceFormRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceFormRequest</p>
 */
public class UpdateDeviceFormRequest extends Request {
    @Body
    @NameInMap("AccountConfig")
    private Boolean accountConfig;

    @Body
    @NameInMap("AttributeList")
    private java.util.List < AttributeList> attributeList;

    @Body
    @NameInMap("ConfigCompare")
    private Boolean configCompare;

    @Body
    @NameInMap("DetailDisplay")
    private Boolean detailDisplay;

    @Body
    @NameInMap("DeviceFormId")
    @Validation(required = true)
    private String deviceFormId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("RelatedDeviceFormId")
    private String relatedDeviceFormId;

    @Body
    @NameInMap("Script")
    private String script;

    private UpdateDeviceFormRequest(Builder builder) {
        super(builder);
        this.accountConfig = builder.accountConfig;
        this.attributeList = builder.attributeList;
        this.configCompare = builder.configCompare;
        this.detailDisplay = builder.detailDisplay;
        this.deviceFormId = builder.deviceFormId;
        this.instanceId = builder.instanceId;
        this.relatedDeviceFormId = builder.relatedDeviceFormId;
        this.script = builder.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceFormRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return relatedDeviceFormId
     */
    public String getRelatedDeviceFormId() {
        return this.relatedDeviceFormId;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceFormRequest, Builder> {
        private Boolean accountConfig; 
        private java.util.List < AttributeList> attributeList; 
        private Boolean configCompare; 
        private Boolean detailDisplay; 
        private String deviceFormId; 
        private String instanceId; 
        private String relatedDeviceFormId; 
        private String script; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceFormRequest request) {
            super(request);
            this.accountConfig = request.accountConfig;
            this.attributeList = request.attributeList;
            this.configCompare = request.configCompare;
            this.detailDisplay = request.detailDisplay;
            this.deviceFormId = request.deviceFormId;
            this.instanceId = request.instanceId;
            this.relatedDeviceFormId = request.relatedDeviceFormId;
            this.script = request.script;
        } 

        /**
         * 是否需要账号配置
         */
        public Builder accountConfig(Boolean accountConfig) {
            this.putBodyParameter("AccountConfig", accountConfig);
            this.accountConfig = accountConfig;
            return this;
        }

        /**
         * 设备形态属性列表
         */
        public Builder attributeList(java.util.List < AttributeList> attributeList) {
            String attributeListShrink = shrink(attributeList, "AttributeList", "json");
            this.putBodyParameter("AttributeList", attributeListShrink);
            this.attributeList = attributeList;
            return this;
        }

        /**
         * 是否支持配置生成
         */
        public Builder configCompare(Boolean configCompare) {
            this.putBodyParameter("ConfigCompare", configCompare);
            this.configCompare = configCompare;
            return this;
        }

        /**
         * DetailDisplay.
         */
        public Builder detailDisplay(Boolean detailDisplay) {
            this.putBodyParameter("DetailDisplay", detailDisplay);
            this.detailDisplay = detailDisplay;
            return this;
        }

        /**
         * 设备形态ID
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putBodyParameter("DeviceFormId", deviceFormId);
            this.deviceFormId = deviceFormId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RelatedDeviceFormId.
         */
        public Builder relatedDeviceFormId(String relatedDeviceFormId) {
            this.putBodyParameter("RelatedDeviceFormId", relatedDeviceFormId);
            this.relatedDeviceFormId = relatedDeviceFormId;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.putBodyParameter("Script", script);
            this.script = script;
            return this;
        }

        @Override
        public UpdateDeviceFormRequest build() {
            return new UpdateDeviceFormRequest(this);
        } 

    } 

    public static class AttributeList extends TeaModel {
        @NameInMap("AttributeFormat")
        @Validation(required = true)
        private String attributeFormat;

        @NameInMap("AttributeFuzzyQuery")
        private Boolean attributeFuzzyQuery;

        @NameInMap("AttributeKey")
        @Validation(required = true)
        private String attributeKey;

        @NameInMap("AttributeName")
        @Validation(required = true)
        private String attributeName;

        @NameInMap("AttributePlaceholder")
        private String attributePlaceholder;

        @NameInMap("AttributeQuery")
        private Boolean attributeQuery;

        @NameInMap("AttributeReference")
        private String attributeReference;

        @NameInMap("AttributeRequirement")
        @Validation(required = true)
        private Boolean attributeRequirement;

        @NameInMap("AttributeSequence")
        private Integer attributeSequence;

        @NameInMap("AttributeTableDisplay")
        @Validation(required = true)
        private Boolean attributeTableDisplay;

        @NameInMap("AttributeType")
        private String attributeType;

        @NameInMap("AttributeUniqueness")
        @Validation(required = true)
        private Boolean attributeUniqueness;

        private AttributeList(Builder builder) {
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
             * 设备形态属性值格式
             */
            public Builder attributeFormat(String attributeFormat) {
                this.attributeFormat = attributeFormat;
                return this;
            }

            /**
             * AttributeFuzzyQuery.
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
             * AttributeQuery.
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
}
