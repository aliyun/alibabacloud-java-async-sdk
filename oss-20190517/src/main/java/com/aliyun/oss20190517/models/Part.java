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

    @NameInMap("PartNumber")
    private Long partNumber;

    @NameInMap("Size")
    private Long size;

    @NameInMap("LastModified")
    private String lastModified;


    private Part(Builder builder) {
        this.ETag = builder.ETag;
        this.partNumber = builder.partNumber;
        this.size = builder.size;
        this.lastModified = builder.lastModified;
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
    public String ETag() {
        return this.ETag;
    }

    /**
     * @return partNumber
     */
    public Long partNumber() {
        return this.partNumber;
    }

    /**
     * @return size
     */
    public Long size() {
        return this.size;
    }

    /**
     * @return lastModified
     */
    public String lastModified() {
        return this.lastModified;
    }

    public static final class Builder {
        private String ETag; 
        private Long partNumber; 
        private Long size; 
        private String lastModified; 

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

        /**
         * <p>description</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Part build() {
            return new Part(this);
        } 

    } 

}
