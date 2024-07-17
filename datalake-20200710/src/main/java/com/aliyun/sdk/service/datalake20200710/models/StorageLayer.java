// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StorageLayer} extends {@link TeaModel}
 *
 * <p>StorageLayer</p>
 */
public class StorageLayer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Archive")
    private Long archive;

    @com.aliyun.core.annotation.NameInMap("ColdArchive")
    private Long coldArchive;

    @com.aliyun.core.annotation.NameInMap("Infrequent")
    private Long infrequent;

    @com.aliyun.core.annotation.NameInMap("Standard")
    private Long standard;

    @com.aliyun.core.annotation.NameInMap("Unknown")
    private Long unknown;

    private StorageLayer(Builder builder) {
        this.archive = builder.archive;
        this.coldArchive = builder.coldArchive;
        this.infrequent = builder.infrequent;
        this.standard = builder.standard;
        this.unknown = builder.unknown;
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

    /**
     * @return unknown
     */
    public Long getUnknown() {
        return this.unknown;
    }

    public static final class Builder {
        private Long archive; 
        private Long coldArchive; 
        private Long infrequent; 
        private Long standard; 
        private Long unknown; 

        /**
         * Archive.
         */
        public Builder archive(Long archive) {
            this.archive = archive;
            return this;
        }

        /**
         * ColdArchive.
         */
        public Builder coldArchive(Long coldArchive) {
            this.coldArchive = coldArchive;
            return this;
        }

        /**
         * Infrequent.
         */
        public Builder infrequent(Long infrequent) {
            this.infrequent = infrequent;
            return this;
        }

        /**
         * Standard.
         */
        public Builder standard(Long standard) {
            this.standard = standard;
            return this;
        }

        /**
         * Unknown.
         */
        public Builder unknown(Long unknown) {
            this.unknown = unknown;
            return this;
        }

        public StorageLayer build() {
            return new StorageLayer(this);
        } 

    } 

}
