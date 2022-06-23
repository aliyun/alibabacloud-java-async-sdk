// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonMediaResource} extends {@link TeaModel}
 *
 * <p>CommonMediaResource</p>
 */
public class CommonMediaResource extends TeaModel {
    @NameInMap("Format")
    private String format;

    @NameInMap("Id")
    private String id;

    @NameInMap("Name")
    private String name;

    @NameInMap("Sha1")
    private String sha1;

    @NameInMap("Size")
    private Long size;

    @NameInMap("Url")
    private String url;

    private CommonMediaResource(Builder builder) {
        this.format = builder.format;
        this.id = builder.id;
        this.name = builder.name;
        this.sha1 = builder.sha1;
        this.size = builder.size;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonMediaResource create() {
        return builder().build();
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sha1
     */
    public String getSha1() {
        return this.sha1;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String format; 
        private String id; 
        private String name; 
        private String sha1; 
        private Long size; 
        private String url; 

        /**
         * media format
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * media id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * media sha1
         */
        public Builder sha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }

        /**
         * media size
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * resource url
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public CommonMediaResource build() {
            return new CommonMediaResource(this);
        } 

    } 

}
