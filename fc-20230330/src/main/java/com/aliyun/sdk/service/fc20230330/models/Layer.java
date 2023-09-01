// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Layer} extends {@link TeaModel}
 *
 * <p>Layer</p>
 */
public class Layer extends TeaModel {
    @NameInMap("acl")
    private String acl;

    @NameInMap("code")
    private OutputCodeLocation code;

    @NameInMap("codeChecksum")
    private String codeChecksum;

    @NameInMap("codeSize")
    private Long codeSize;

    @NameInMap("compatibleRuntime")
    private java.util.List < String > compatibleRuntime;

    @NameInMap("createTime")
    private String createTime;

    @NameInMap("description")
    @Validation(maxLength = 256)
    private String description;

    @NameInMap("layerName")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String layerName;

    @NameInMap("layerVersionArn")
    private String layerVersionArn;

    @NameInMap("license")
    private String license;

    @NameInMap("version")
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
    public java.util.List < String > getCompatibleRuntime() {
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
        private java.util.List < String > compatibleRuntime; 
        private String createTime; 
        private String description; 
        private String layerName; 
        private String layerVersionArn; 
        private String license; 
        private Integer version; 

        /**
         * acl.
         */
        public Builder acl(String acl) {
            this.acl = acl;
            return this;
        }

        /**
         * code.
         */
        public Builder code(OutputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * codeChecksum.
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * codeSize.
         */
        public Builder codeSize(Long codeSize) {
            this.codeSize = codeSize;
            return this;
        }

        /**
         * compatibleRuntime.
         */
        public Builder compatibleRuntime(java.util.List < String > compatibleRuntime) {
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * layerName.
         */
        public Builder layerName(String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * layerVersionArn.
         */
        public Builder layerVersionArn(String layerVersionArn) {
            this.layerVersionArn = layerVersionArn;
            return this;
        }

        /**
         * license.
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        /**
         * version.
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
