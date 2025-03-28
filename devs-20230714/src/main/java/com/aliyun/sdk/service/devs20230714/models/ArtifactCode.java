// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ArtifactCode} extends {@link TeaModel}
 *
 * <p>ArtifactCode</p>
 */
public class ArtifactCode extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private ArtifactCode(Builder builder) {
        this.checksum = builder.checksum;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArtifactCode create() {
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

        private Builder(ArtifactCode model) {
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

        public ArtifactCode build() {
            return new ArtifactCode(this);
        } 

    } 

}
