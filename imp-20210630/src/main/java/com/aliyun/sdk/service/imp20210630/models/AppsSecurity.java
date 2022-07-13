// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppsSecurity} extends {@link TeaModel}
 *
 * <p>AppsSecurity</p>
 */
public class AppsSecurity extends TeaModel {
    @NameInMap("PlayUrlTtl")
    private Integer playUrlTtl;

    private AppsSecurity(Builder builder) {
        this.playUrlTtl = builder.playUrlTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppsSecurity create() {
        return builder().build();
    }

    /**
     * @return playUrlTtl
     */
    public Integer getPlayUrlTtl() {
        return this.playUrlTtl;
    }

    public static final class Builder {
        private Integer playUrlTtl; 

        /**
         * PlayUrlTtl.
         */
        public Builder playUrlTtl(Integer playUrlTtl) {
            this.playUrlTtl = playUrlTtl;
            return this;
        }

        public AppsSecurity build() {
            return new AppsSecurity(this);
        } 

    } 

}
