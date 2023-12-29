// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayerVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLayerVersionResponseBody</p>
 */
public class CreateLayerVersionResponseBody extends TeaModel {
    @NameInMap("acl")
    private Integer acl;

    @NameInMap("arn")
    private String arn;

    @NameInMap("code")
    private OutputCodeLocation code;

    @NameInMap("codeChecksum")
    private String codeChecksum;

    @NameInMap("codesize")
    private Long codesize;

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

    private CreateLayerVersionResponseBody(Builder builder) {
        this.acl = builder.acl;
        this.arn = builder.arn;
        this.code = builder.code;
        this.codeChecksum = builder.codeChecksum;
        this.codesize = builder.codesize;
        this.compatibleRuntime = builder.compatibleRuntime;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.layerName = builder.layerName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayerVersionResponseBody create() {
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
     * @return codesize
     */
    public Long getCodesize() {
        return this.codesize;
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
        private OutputCodeLocation code; 
        private String codeChecksum; 
        private Long codesize; 
        private java.util.List < String > compatibleRuntime; 
        private String createTime; 
        private String description; 
        private String layerName; 
        private Integer version; 

        /**
         * The access mode of the layer. Digit 0 specifies that the layer is private and digit 1 specifies that the layer is public. By default, public layers are public. Custom layers can be set to private or public.
         */
        public Builder acl(Integer acl) {
            this.acl = acl;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the layer.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The information about the layer code package.
         */
        public Builder code(OutputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * The CRC-64 value of the layer code package. The value is calculated based on the **ECMA-182 **standard.
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * The size of the layer code package. Unit: bytes.
         */
        public Builder codesize(Long codesize) {
            this.codesize = codesize;
            return this;
        }

        /**
         * The runtimes that are supported by the layer.
         */
        public Builder compatibleRuntime(java.util.List < String > compatibleRuntime) {
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * The time when the layer version was created. The time is in the yyyy-MM-ddTHH:mm:ssZ format.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The description of the layer version.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The layer name.
         */
        public Builder layerName(String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * The layer version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public CreateLayerVersionResponseBody build() {
            return new CreateLayerVersionResponseBody(this);
        } 

    } 

}
