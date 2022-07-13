// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppsDomain} extends {@link TeaModel}
 *
 * <p>AppsDomain</p>
 */
public class AppsDomain extends TeaModel {
    @NameInMap("Domain")
    private String domain;

    private AppsDomain(Builder builder) {
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppsDomain create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder {
        private String domain; 

        /**
         * 域名
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        public AppsDomain build() {
            return new AppsDomain(this);
        } 

    } 

}
