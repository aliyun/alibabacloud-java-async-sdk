// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link Part} extends {@link TeaModel}
 *
 * <p>Part</p>
 */
public class Part extends TeaModel {
    @NameInMap("ETag")
    private String eTag;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("PartNumber")
    private Long partNumber;

    @NameInMap("Size")
    private Long size;

    private Part(Builder builder) {
        this.eTag = builder.eTag;
        this.lastModified = builder.lastModified;
        this.partNumber = builder.partNumber;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Part create() {
        return builder().build();
    }

    /**
     * @return eTag
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * @return partNumber
     */
    public Long getPartNumber() {
        return this.partNumber;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private String eTag; 
        private String lastModified; 
        private Long partNumber; 
        private Long size; 

        /**
         * description
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * description
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * description
         */
        public Builder partNumber(Long partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        /**
         * description
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public Part build() {
            return new Part(this);
        } 

    } 

}
