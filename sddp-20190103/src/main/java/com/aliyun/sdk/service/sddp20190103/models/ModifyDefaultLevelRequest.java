// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefaultLevelRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefaultLevelRequest</p>
 */
public class ModifyDefaultLevelRequest extends Request {
    @Query
    @NameInMap("DefaultId")
    private Long defaultId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SensitiveIds")
    private String sensitiveIds;

    private ModifyDefaultLevelRequest(Builder builder) {
        super(builder);
        this.defaultId = builder.defaultId;
        this.lang = builder.lang;
        this.sensitiveIds = builder.sensitiveIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefaultLevelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultId
     */
    public Long getDefaultId() {
        return this.defaultId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sensitiveIds
     */
    public String getSensitiveIds() {
        return this.sensitiveIds;
    }

    public static final class Builder extends Request.Builder<ModifyDefaultLevelRequest, Builder> {
        private Long defaultId; 
        private String lang; 
        private String sensitiveIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefaultLevelRequest request) {
            super(request);
            this.defaultId = request.defaultId;
            this.lang = request.lang;
            this.sensitiveIds = request.sensitiveIds;
        } 

        /**
         * DefaultId.
         */
        public Builder defaultId(Long defaultId) {
            this.putQueryParameter("DefaultId", defaultId);
            this.defaultId = defaultId;
            return this;
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
         * SensitiveIds.
         */
        public Builder sensitiveIds(String sensitiveIds) {
            this.putQueryParameter("SensitiveIds", sensitiveIds);
            this.sensitiveIds = sensitiveIds;
            return this;
        }

        @Override
        public ModifyDefaultLevelRequest build() {
            return new ModifyDefaultLevelRequest(this);
        } 

    } 

}
