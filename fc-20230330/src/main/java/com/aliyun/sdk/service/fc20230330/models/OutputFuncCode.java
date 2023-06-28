// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OutputFuncCode} extends {@link TeaModel}
 *
 * <p>OutputFuncCode</p>
 */
public class OutputFuncCode extends TeaModel {
    @NameInMap("checksum")
    private String checksum;

    @NameInMap("url")
    private String url;

    private OutputFuncCode(Builder builder) {
        this.checksum = builder.checksum;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OutputFuncCode create() {
        return builder().build();
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String checksum; 
        private String url; 

        /**
         * checksum.
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public OutputFuncCode build() {
            return new OutputFuncCode(this);
        } 

    } 

}
