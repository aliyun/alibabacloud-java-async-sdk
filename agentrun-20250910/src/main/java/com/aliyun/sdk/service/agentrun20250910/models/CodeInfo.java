// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CodeInfo} extends {@link TeaModel}
 *
 * <p>CodeInfo</p>
 */
public class CodeInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ossBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.NameInMap("ossObjectName")
    private String ossObjectName;

    private CodeInfo(Builder builder) {
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectName = builder.ossObjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CodeInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String ossBucketName; 
        private String ossObjectName; 

        private Builder() {
        } 

        private Builder(CodeInfo model) {
            this.ossBucketName = model.ossBucketName;
            this.ossObjectName = model.ossObjectName;
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

        public CodeInfo build() {
            return new CodeInfo(this);
        } 

    } 

}
