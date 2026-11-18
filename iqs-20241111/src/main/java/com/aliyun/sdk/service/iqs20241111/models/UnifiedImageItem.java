// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link UnifiedImageItem} extends {@link TeaModel}
 *
 * <p>UnifiedImageItem</p>
 */
public class UnifiedImageItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("hostPageUrl")
    private String hostPageUrl;

    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("publishedTime")
    private String publishedTime;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("width")
    private Integer width;

    private UnifiedImageItem(Builder builder) {
        this.height = builder.height;
        this.hostPageUrl = builder.hostPageUrl;
        this.imageUrl = builder.imageUrl;
        this.publishedTime = builder.publishedTime;
        this.title = builder.title;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedImageItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return hostPageUrl
     */
    public String getHostPageUrl() {
        return this.hostPageUrl;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return publishedTime
     */
    public String getPublishedTime() {
        return this.publishedTime;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Integer height; 
        private String hostPageUrl; 
        private String imageUrl; 
        private String publishedTime; 
        private String title; 
        private Integer width; 

        private Builder() {
        } 

        private Builder(UnifiedImageItem model) {
            this.height = model.height;
            this.hostPageUrl = model.hostPageUrl;
            this.imageUrl = model.imageUrl;
            this.publishedTime = model.publishedTime;
            this.title = model.title;
            this.width = model.width;
        } 

        /**
         * <p>Height</p>
         * 
         * <strong>example:</strong>
         * <p>1330</p>
         */
        public Builder height(Integer height) {
            this.height = height;
            return this;
        }

        /**
         * <p>URL of the web page to which the image belongs</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://mbd.baidu.com/newspage/data/dtlandingsuper?nid=dt_4541580238898912926">http://mbd.baidu.com/newspage/data/dtlandingsuper?nid=dt_4541580238898912926</a></p>
         */
        public Builder hostPageUrl(String hostPageUrl) {
            this.hostPageUrl = hostPageUrl;
            return this;
        }

        /**
         * <p>Image URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.rmb.bdstatic.com/bjh/bb87f566c0c/241218/f7936f25837b20211e5ef88d7980c143.jpeg">http://pic.rmb.bdstatic.com/bjh/bb87f566c0c/241218/f7936f25837b20211e5ef88d7980c143.jpeg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Web page published time, in ISO time format</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-05T00:54:42+08:00</p>
         */
        public Builder publishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }

        /**
         * <p>Image title</p>
         * 
         * <strong>example:</strong>
         * <p>阿里巴巴现在以主业上为主,以电商为主,以能够盈利的业务为主</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>Image width</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder width(Integer width) {
            this.width = width;
            return this;
        }

        public UnifiedImageItem build() {
            return new UnifiedImageItem(this);
        } 

    } 

}
