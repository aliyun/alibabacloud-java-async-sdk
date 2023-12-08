// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubjectExtendInfo} extends {@link TeaModel}
 *
 * <p>SubjectExtendInfo</p>
 */
public class SubjectExtendInfo extends TeaModel {
    @NameInMap("deliveryDesc")
    private String deliveryDesc;

    @NameInMap("desc")
    private String desc;

    private SubjectExtendInfo(Builder builder) {
        this.deliveryDesc = builder.deliveryDesc;
        this.desc = builder.desc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubjectExtendInfo create() {
        return builder().build();
    }

    /**
     * @return deliveryDesc
     */
    public String getDeliveryDesc() {
        return this.deliveryDesc;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    public static final class Builder {
        private String deliveryDesc; 
        private String desc; 

        /**
         * deliveryDesc.
         */
        public Builder deliveryDesc(String deliveryDesc) {
            this.deliveryDesc = deliveryDesc;
            return this;
        }

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public SubjectExtendInfo build() {
            return new SubjectExtendInfo(this);
        } 

    } 

}
