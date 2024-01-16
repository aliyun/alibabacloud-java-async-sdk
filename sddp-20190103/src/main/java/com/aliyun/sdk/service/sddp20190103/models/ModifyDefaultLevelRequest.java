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
         * The default sensitivity level of data that Data Security Center (DSC) cannot classify as sensitive or insensitive. Valid values:
         * <p>
         * 
         * *   **1**: N/A
         * *   **2**: S1
         * *   **3**: S2
         * *   **4**: S3
         * *   **5**: S4
         */
        public Builder defaultId(Long defaultId) {
            this.putQueryParameter("DefaultId", defaultId);
            this.defaultId = defaultId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The sensitivity level ID of data that DSC classifies as sensitive. Separate multiple IDs with commas (,). Valid values:
         * <p>
         * 
         * *   **1**: N/A
         * *   **2**: S1
         * *   **3**: S2
         * *   **4**: S3
         * *   **5**: S4
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
