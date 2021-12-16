// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Part} extends {@link TeaModel}
 *
 * <p>Part</p>
 */
public class Part extends TeaModel {
    @NameInMap("ETag")
    private String ETag;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("PartNumber")
    private Long partNumber;

    @NameInMap("Size")
    private Long size;


    private Part(Builder builder) {
        this.ETag = builder.ETag;
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
     * @return ETag
     */
    public String getETag() {
        return this.ETag;
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
        private String ETag; 
        private String lastModified; 
        private Long partNumber; 
        private Long size; 

        /**
         * <p>description</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder partNumber(Long partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        /**
         * <p>description</p>
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
