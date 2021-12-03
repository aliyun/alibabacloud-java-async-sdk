// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Layer} extends {@link TeaModel}
 *
 * <p>Layer</p>
 */
public class Layer extends TeaModel {
    @NameInMap("acl")
    private Integer acl;

    @NameInMap("arn")
    private String arn;

    @NameInMap("code")
    private LayerCode code;

    @NameInMap("codeChecksum")
    private String codeChecksum;

    @NameInMap("codeSize")
    private Long codeSize;

    @NameInMap("compatibleRuntime")
    private java.util.List < String > compatibleRuntime;

    @NameInMap("createTime")
    private String createTime;

    @NameInMap("description")
    private String description;

    @NameInMap("layerName")
    private String layerName;

    @NameInMap("version")
    private Integer version;


    private Layer(Builder builder) {
        this.acl = builder.acl;
        this.arn = builder.arn;
        this.code = builder.code;
        this.codeChecksum = builder.codeChecksum;
        this.codeSize = builder.codeSize;
        this.compatibleRuntime = builder.compatibleRuntime;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.layerName = builder.layerName;
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
    public Integer getAcl() {
        return this.acl;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return code
     */
    public LayerCode getCode() {
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
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Integer acl; 
        private String arn; 
        private LayerCode code; 
        private String codeChecksum; 
        private Long codeSize; 
        private java.util.List < String > compatibleRuntime; 
        private String createTime; 
        private String description; 
        private String layerName; 
        private Integer version; 

        /**
         * <p>层访问类型</p>
         */
        public Builder acl(Integer acl) {
            this.acl = acl;
            return this;
        }

        /**
         * <p>arn</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>层代码</p>
         */
        public Builder code(LayerCode code) {
            this.code = code;
            return this;
        }

        /**
         * <p>层Checksum</p>
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * <p>层代码大小</p>
         */
        public Builder codeSize(Long codeSize) {
            this.codeSize = codeSize;
            return this;
        }

        /**
         * <p>compatibleRuntime</p>
         */
        public Builder compatibleRuntime(java.util.List < String > compatibleRuntime) {
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * <p>层创建时间</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>层描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>层名称</p>
         */
        public Builder layerName(String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * <p>层版本</p>
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
