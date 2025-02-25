// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Code} extends {@link TeaModel}
 *
 * <p>Code</p>
 */
public class Code extends TeaModel {
    @NameInMap("ossBucketName")
    private String ossBucketName;

    @NameInMap("ossObjectName")
    private String ossObjectName;

    @NameInMap("zipFile")
    private String zipFile;

    private Code(Builder builder) {
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
        private String ossBucketName; 
        private String ossObjectName; 
        private String zipFile; 

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

        public Code build() {
            return new Code(this);
        } 

    } 

}
