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
 * {@link ArtifactStatus} extends {@link TeaModel}
 *
 * <p>ArtifactStatus</p>
 */
public class ArtifactStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("checksum")
    private String checksum;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private ArtifactStatus(Builder builder) {
        this.arn = builder.arn;
        this.checksum = builder.checksum;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArtifactStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return checksum
     */
    public String getChecksum() {
        return this.checksum;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private String arn; 
        private String checksum; 
        private Long size; 

        private Builder() {
        } 

        private Builder(ArtifactStatus model) {
            this.arn = model.arn;
            this.checksum = model.checksum;
            this.size = model.size;
        } 

        /**
         * arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * checksum.
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public ArtifactStatus build() {
            return new ArtifactStatus(this);
        } 

    } 

}
