// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonCustomer} extends {@link TeaModel}
 *
 * <p>CommonCustomer</p>
 */
public class CommonCustomer extends TeaModel {
    @NameInMap("CloudUid")
    private String cloudUid;

    private CommonCustomer(Builder builder) {
        this.cloudUid = builder.cloudUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonCustomer create() {
        return builder().build();
    }

    /**
     * @return cloudUid
     */
    public String getCloudUid() {
        return this.cloudUid;
    }

    public static final class Builder {
        private String cloudUid; 

        /**
         * 云帐号Id
         */
        public Builder cloudUid(String cloudUid) {
            this.cloudUid = cloudUid;
            return this;
        }

        public CommonCustomer build() {
            return new CommonCustomer(this);
        } 

    } 

}
