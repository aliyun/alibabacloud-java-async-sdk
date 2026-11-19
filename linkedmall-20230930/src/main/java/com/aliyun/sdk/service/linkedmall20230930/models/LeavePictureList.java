// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link LeavePictureList} extends {@link TeaModel}
 *
 * <p>LeavePictureList</p>
 */
public class LeavePictureList extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("picture")
    private String picture;

    private LeavePictureList(Builder builder) {
        this.desc = builder.desc;
        this.picture = builder.picture;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LeavePictureList create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return picture
     */
    public String getPicture() {
        return this.picture;
    }

    public static final class Builder {
        private String desc; 
        private String picture; 

        private Builder() {
        } 

        private Builder(LeavePictureList model) {
            this.desc = model.desc;
            this.picture = model.picture;
        } 

        /**
         * <p>Description&gt;Notice: If the after-sales order rendering API returns that a message description is required, this field is mandatory.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>外观破损了。</p>
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * <p>Image of the after-sales Credential&gt;Notice: If the after-sales order rendering API returns that an after-sales image is required, this field is mandatory.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>https://</p>
         */
        public Builder picture(String picture) {
            this.picture = picture;
            return this;
        }

        public LeavePictureList build() {
            return new LeavePictureList(this);
        } 

    } 

}
