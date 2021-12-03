// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLayerVersionByArnResponseBody} extends {@link TeaModel}
 *
 * <p>GetLayerVersionByArnResponseBody</p>
 */
public class GetLayerVersionByArnResponseBody extends TeaModel {
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


    private GetLayerVersionByArnResponseBody(Builder builder) {
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

    public static GetLayerVersionByArnResponseBody create() {
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
         * <p>acl.</p>
         */
        public Builder acl(Integer acl) {
            this.acl = acl;
            return this;
        }

        /**
         * <p>arn.</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>code.</p>
         */
        public Builder code(OutputCodeLocation code) {
            this.code = code;
            return this;
        }

        /**
         * <p>codeChecksum.</p>
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * <p>codesize.</p>
         */
        public Builder codesize(Long codesize) {
            this.codesize = codesize;
            return this;
        }

        /**
         * <p>compatibleRuntime.</p>
         */
        public Builder compatibleRuntime(java.util.List < String > compatibleRuntime) {
            this.compatibleRuntime = compatibleRuntime;
            return this;
        }

        /**
         * <p>createTime.</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>layerName.</p>
         */
        public Builder layerName(String layerName) {
            this.layerName = layerName;
            return this;
        }

        /**
         * <p>version.</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public GetLayerVersionByArnResponseBody build() {
            return new GetLayerVersionByArnResponseBody(this);
        } 

    } 

}
