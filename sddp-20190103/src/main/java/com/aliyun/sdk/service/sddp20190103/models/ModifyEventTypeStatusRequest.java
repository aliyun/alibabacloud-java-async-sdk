// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventTypeStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventTypeStatusRequest</p>
 */
public class ModifyEventTypeStatusRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SubTypeIds")
    private String subTypeIds;

    private ModifyEventTypeStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.subTypeIds = builder.subTypeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventTypeStatusRequest create() {
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
     * @return subTypeIds
     */
    public String getSubTypeIds() {
        return this.subTypeIds;
    }

    public static final class Builder extends Request.Builder<ModifyEventTypeStatusRequest, Builder> {
        private String lang; 
        private String subTypeIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEventTypeStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.subTypeIds = request.subTypeIds;
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
         * SubTypeIds.
         */
        public Builder subTypeIds(String subTypeIds) {
            this.putQueryParameter("SubTypeIds", subTypeIds);
            this.subTypeIds = subTypeIds;
            return this;
        }

        @Override
        public ModifyEventTypeStatusRequest build() {
            return new ModifyEventTypeStatusRequest(this);
        } 

    } 

}
