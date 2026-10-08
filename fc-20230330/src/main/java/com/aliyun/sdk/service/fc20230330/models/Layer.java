// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Layer} extends {@link TeaModel}
 *
 * <p>Layer</p>
 */
public class Layer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("acl")
    private String acl;

    @com.aliyun.core.annotation.NameInMap("code")
    private OutputCodeLocation code;

    @com.aliyun.core.annotation.NameInMap("codeChecksum")
    private String codeChecksum;

    @com.aliyun.core.annotation.NameInMap("codeSize")
    private Long codeSize;

    @com.aliyun.core.annotation.NameInMap("compatibleRuntime")
    private java.util.List<String> compatibleRuntime;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("layerName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String layerName;

    @com.aliyun.core.annotation.NameInMap("layerVersionArn")
    private String layerVersionArn;

    @com.aliyun.core.annotation.NameInMap("license")
    private String license;

    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private Layer(Builder builder) {
        this.acl = builder.acl;
        this.code = builder.code;
        this.codeChecksum = builder.codeChecksum;
        this.codeSize = builder.codeSize;
        this.compatibleRuntime = builder.compatibleRuntime;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.layerName = builder.layerName;
        this.layerVersionArn = builder.layerVersionArn;
        this.license = builder.license;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Layer create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acl
     */
    public String getAcl() {
        return this.acl;
    }

    /**
     * @return code
     */
    public OutputCodeLocation getCode() {
        return this.code;
    }

    /**
     * @return codeChecksum
     */
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    /**
     * @return codeSize
     */
    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * @return compatibleRuntime
     */
    public java.util.List<String> getCompatibleRuntime() {
        return this.compatibleRuntime;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return layerVersionArn
     */
    public String getLayerVersionArn() {
        return this.layerVersionArn;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String acl; 
        private OutputCodeLocation code; 
        private String codeChecksum; 
        private Long codeSize; 
        private java.util.List<String> compatibleRuntime; 
        private String createTime; 
        private String description; 
        private String layerName; 
        private String layerVersionArn; 
        private String license; 
        private Integer version; 

        private Builder() {
        } 

        private Builder(Layer model) {
            this.acl = model.acl;
            this.code = model.code;
            this.codeChecksum = model.codeChecksum;
            this.codeSize = model.codeSize;
            this.compatibleRuntime = model.compatibleRuntime;
            this.createTime = model.createTime;
            this.description = model.description;
            this.layerName = model.layerName;
            this.layerVersionArn = model.layerVersionArn;
            this.license = model.license;
            this.version = model.version;
        } 

        /**
         * <p>The permission of the layer. Valid value: 0 and 1. 0 specifies that the layer is private, and 1 specifies that the layer is public. By default, public layers are public. Custom layers can be set to private or public.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder acl(String acl) {
            this.acl = acl;
            return this;
        }

        /**
         * <p>The information about the code package of the layer.</p>
         */
        public Builder code(OutputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The crc64 verification code of the layer code package, which is calculated based on ECMA-182.</p>
         * 
         * <strong>example:</strong>
         * <p>2825179536350****</p>
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * <p>The size of the layer code package. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>421</p>
         */
        public Builder codeSize(Long codeSize) {
            this.codeSize = codeSize;
            return this;
        }

        /**
         * <p>The runtimes that are supported by the layer.</p>
         */
        public Builder compatibleRuntime(java.util.List<String> compatibleRuntime) {
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * <p>The time when the layer version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T11:08:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the layer version.</p>
         * 
         * <strong>example:</strong>
         * <p>My first layer</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the layer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyLayer</p>
         */
        public Builder layerName(String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * <p>The name of the resource in the layer version. The name is in the acs:fc:{region}:{accountID}:layers/{layerName}/versions/{layerVersion} format.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-beijing:186824xxxxxx:layers/fc_layer/versions/1</p>
         */
        public Builder layerVersionArn(String layerVersionArn) {
            this.layerVersionArn = layerVersionArn;
            return this;
        }

        /**
         * <p>The license agreement.</p>
         * 
         * <strong>example:</strong>
         * <p>Apache</p>
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        /**
         * <p>The layer version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public Layer build() {
            return new Layer(this);
        } 

    } 

}
