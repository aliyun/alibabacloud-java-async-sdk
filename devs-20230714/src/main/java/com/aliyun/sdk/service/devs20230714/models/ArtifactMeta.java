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
 * {@link ArtifactMeta} extends {@link TeaModel}
 *
 * <p>ArtifactMeta</p>
 */
public class ArtifactMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ArtifactMeta(Builder builder) {
        this.checksum = builder.checksum;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArtifactMeta create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String checksum; 
        private String name; 

        private Builder() {
        } 

        private Builder(ArtifactMeta model) {
            this.checksum = model.checksum;
            this.name = model.name;
        } 

        /**
         * checksum.
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ArtifactMeta build() {
            return new ArtifactMeta(this);
        } 

    } 

}
