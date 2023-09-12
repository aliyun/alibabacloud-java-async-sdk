// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LeavePictureList} extends {@link TeaModel}
 *
 * <p>LeavePictureList</p>
 */
public class LeavePictureList extends TeaModel {
    @NameInMap("desc")
    private String desc;

    @NameInMap("picture")
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

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * picture.
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
