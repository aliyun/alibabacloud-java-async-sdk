// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StorageLayer} extends {@link TeaModel}
 *
 * <p>StorageLayer</p>
 */
public class StorageLayer extends TeaModel {
    @NameInMap("Archive")
    private Long archive;

    @NameInMap("ColdArchive")
    private Long coldArchive;

    @NameInMap("Infrequent")
    private Long infrequent;

    @NameInMap("Standard")
    private Long standard;

    private StorageLayer(Builder builder) {
        this.archive = builder.archive;
        this.coldArchive = builder.coldArchive;
        this.infrequent = builder.infrequent;
        this.standard = builder.standard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StorageLayer create() {
        return builder().build();
    }

    /**
     * @return archive
     */
    public Long getArchive() {
        return this.archive;
    }

    /**
     * @return coldArchive
     */
    public Long getColdArchive() {
        return this.coldArchive;
    }

    /**
     * @return infrequent
     */
    public Long getInfrequent() {
        return this.infrequent;
    }

    /**
     * @return standard
     */
    public Long getStandard() {
        return this.standard;
    }

    public static final class Builder {
        private Long archive; 
        private Long coldArchive; 
        private Long infrequent; 
        private Long standard; 

        /**
         * 归档
         */
        public Builder archive(Long archive) {
            this.archive = archive;
            return this;
        }

        /**
         * 冷归档
         */
        public Builder coldArchive(Long coldArchive) {
            this.coldArchive = coldArchive;
            return this;
        }

        /**
         * 低频
         */
        public Builder infrequent(Long infrequent) {
            this.infrequent = infrequent;
            return this;
        }

        /**
         * 标准
         */
        public Builder standard(Long standard) {
            this.standard = standard;
            return this;
        }

        public StorageLayer build() {
            return new StorageLayer(this);
        } 

    } 

}
