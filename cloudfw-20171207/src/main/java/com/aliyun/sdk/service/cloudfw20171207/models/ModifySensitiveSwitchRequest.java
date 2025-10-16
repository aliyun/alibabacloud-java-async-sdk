// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifySensitiveSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifySensitiveSwitchRequest</p>
 */
public class ModifySensitiveSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveCategory")
    private String sensitiveCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchStatus")
    private String switchStatus;

    private ModifySensitiveSwitchRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sensitiveCategory = builder.sensitiveCategory;
        this.switchStatus = builder.switchStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySensitiveSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sensitiveCategory
     */
    public String getSensitiveCategory() {
        return this.sensitiveCategory;
    }

    /**
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return this.switchStatus;
    }

    public static final class Builder extends Request.Builder<ModifySensitiveSwitchRequest, Builder> {
        private String lang; 
        private String sensitiveCategory; 
        private String switchStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifySensitiveSwitchRequest request) {
            super(request);
            this.lang = request.lang;
            this.sensitiveCategory = request.sensitiveCategory;
            this.switchStatus = request.switchStatus;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SensitiveCategory.
         */
        public Builder sensitiveCategory(String sensitiveCategory) {
            this.putQueryParameter("SensitiveCategory", sensitiveCategory);
            this.sensitiveCategory = sensitiveCategory;
            return this;
        }

        /**
         * SwitchStatus.
         */
        public Builder switchStatus(String switchStatus) {
            this.putQueryParameter("SwitchStatus", switchStatus);
            this.switchStatus = switchStatus;
            return this;
        }

        @Override
        public ModifySensitiveSwitchRequest build() {
            return new ModifySensitiveSwitchRequest(this);
        } 

    } 

}
