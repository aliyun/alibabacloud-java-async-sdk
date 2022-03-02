// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link IndexDocument} extends {@link TeaModel}
 *
 * <p>IndexDocument</p>
 */
public class IndexDocument extends TeaModel {
    @NameInMap("Suffix")
    private String suffix;

    @NameInMap("SupportSubDir")
    private Boolean supportSubDir;

    @NameInMap("Type")
    private String type;

    private IndexDocument(Builder builder) {
        this.suffix = builder.suffix;
        this.supportSubDir = builder.supportSubDir;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndexDocument create() {
        return builder().build();
    }

    /**
     * @return suffix
     */
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * @return supportSubDir
     */
    public Boolean getSupportSubDir() {
        return this.supportSubDir;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String suffix; 
        private Boolean supportSubDir; 
        private String type; 

        /**
         * description
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * description
         */
        public Builder supportSubDir(Boolean supportSubDir) {
            this.supportSubDir = supportSubDir;
            return this;
        }

        /**
         * description
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IndexDocument build() {
            return new IndexDocument(this);
        } 

    } 

}
