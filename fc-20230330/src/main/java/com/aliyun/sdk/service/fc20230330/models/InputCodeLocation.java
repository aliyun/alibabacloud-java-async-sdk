// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InputCodeLocation} extends {@link TeaModel}
 *
 * <p>InputCodeLocation</p>
 */
public class InputCodeLocation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("ossBucketName")
    @com.aliyun.core.annotation.Validation(maxLength = 63, minLength = 3)
    private String ossBucketName;

    @com.aliyun.core.annotation.NameInMap("ossObjectName")
    private String ossObjectName;

    @com.aliyun.core.annotation.NameInMap("zipFile")
    private String zipFile;

    private InputCodeLocation(Builder builder) {
        this.checksum = builder.checksum;
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectName = builder.ossObjectName;
        this.zipFile = builder.zipFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InputCodeLocation create() {
        return builder().build();
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
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
        private String checksum; 
        private String ossBucketName; 
        private String ossObjectName; 
        private String zipFile; 

        /**
         * checksum.
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * ossBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * ossObjectName.
         */
        public Builder ossObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * zipFile.
         */
        public Builder zipFile(String zipFile) {
            this.zipFile = zipFile;
            return this;
        }

        public InputCodeLocation build() {
            return new InputCodeLocation(this);
        } 

    } 

}
