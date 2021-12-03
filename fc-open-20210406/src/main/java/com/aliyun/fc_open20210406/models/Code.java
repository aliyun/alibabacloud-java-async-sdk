// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Code} extends {@link TeaModel}
 *
 * <p>Code</p>
 */
public class Code extends TeaModel {
    @NameInMap("codeCheckSum")
    private String codeCheckSum;

    @NameInMap("err")
    private String err;

    @NameInMap("ossBucketName")
    private String ossBucketName;

    @NameInMap("ossObjectName")
    private String ossObjectName;

    @NameInMap("zipFile")
    private String zipFile;


    private Code(Builder builder) {
        this.codeCheckSum = builder.codeCheckSum;
        this.err = builder.err;
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectName = builder.ossObjectName;
        this.zipFile = builder.zipFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Code create() {
        return builder().build();
    }

    /**
     * @return codeCheckSum
     */
    public String getCodeCheckSum() {
        return this.codeCheckSum;
    }

    /**
     * @return err
     */
    public String getErr() {
        return this.err;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    /**
     * @return zipFile
     */
    public String getZipFile() {
        return this.zipFile;
    }

    public static final class Builder {
        private String codeCheckSum; 
        private String err; 
        private String ossBucketName; 
        private String ossObjectName; 
        private String zipFile; 

        /**
         * <p>codeCheckSum</p>
         */
        public Builder codeCheckSum(String codeCheckSum) {
            this.codeCheckSum = codeCheckSum;
            return this;
        }

        /**
         * <p>error</p>
         */
        public Builder err(String err) {
            this.err = err;
            return this;
        }

        /**
         * <p>函数代码包的OSS bucket name</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>函数代码包的OSS对象名</p>
         */
        public Builder ossObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * <p>直接在request body中上传code zip包的base64编码</p>
         */
        public Builder zipFile(String zipFile) {
            this.zipFile = zipFile;
            return this;
        }

        public Code build() {
            return new Code(this);
        } 

    } 

}
