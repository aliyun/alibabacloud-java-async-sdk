// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link OutputFuncCode} extends {@link TeaModel}
 *
 * <p>OutputFuncCode</p>
 */
public class OutputFuncCode extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("url")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(OutputFuncCode model) {
            this.checksum = model.checksum;
            this.url = model.url;
        } 

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
