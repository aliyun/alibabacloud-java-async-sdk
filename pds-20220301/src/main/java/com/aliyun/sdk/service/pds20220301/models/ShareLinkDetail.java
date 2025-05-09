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
 * {@link ShareLinkDetail} extends {@link TeaModel}
 *
 * <p>ShareLinkDetail</p>
 */
public class ShareLinkDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable_office_editable")
    private Boolean enableOfficeEditable;

    private ShareLinkDetail(Builder builder) {
        this.enableOfficeEditable = builder.enableOfficeEditable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareLinkDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableOfficeEditable
     */
    public Boolean getEnableOfficeEditable() {
        return this.enableOfficeEditable;
    }

    public static final class Builder {
        private Boolean enableOfficeEditable; 

        private Builder() {
        } 

        private Builder(ShareLinkDetail model) {
            this.enableOfficeEditable = model.enableOfficeEditable;
        } 

        /**
         * enable_office_editable.
         */
        public Builder enableOfficeEditable(Boolean enableOfficeEditable) {
            this.enableOfficeEditable = enableOfficeEditable;
            return this;
        }

        public ShareLinkDetail build() {
            return new ShareLinkDetail(this);
        } 

    } 

}
