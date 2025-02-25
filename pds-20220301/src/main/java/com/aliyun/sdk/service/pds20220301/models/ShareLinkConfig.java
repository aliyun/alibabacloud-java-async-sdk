// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ShareLinkConfig} extends {@link TeaModel}
 *
 * <p>ShareLinkConfig</p>
 */
public class ShareLinkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable_share_link_office_edit")
    private Boolean enableShareLinkOfficeEdit;

    private ShareLinkConfig(Builder builder) {
        this.enableShareLinkOfficeEdit = builder.enableShareLinkOfficeEdit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareLinkConfig create() {
        return builder().build();
    }

    /**
     * @return enableShareLinkOfficeEdit
     */
    public Boolean getEnableShareLinkOfficeEdit() {
        return this.enableShareLinkOfficeEdit;
    }

    public static final class Builder {
        private Boolean enableShareLinkOfficeEdit; 

        /**
         * enable_share_link_office_edit.
         */
        public Builder enableShareLinkOfficeEdit(Boolean enableShareLinkOfficeEdit) {
            this.enableShareLinkOfficeEdit = enableShareLinkOfficeEdit;
            return this;
        }

        public ShareLinkConfig build() {
            return new ShareLinkConfig(this);
        } 

    } 

}
