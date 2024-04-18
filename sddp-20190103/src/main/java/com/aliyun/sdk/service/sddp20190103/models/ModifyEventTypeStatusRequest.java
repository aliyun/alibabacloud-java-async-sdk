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
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SubTypeIds")
    private String subTypeIds;

    private ModifyEventTypeStatusRequest(Builder builder) {
        super(builder);
        this.featureType = builder.featureType;
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
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
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
        private Integer featureType; 
        private String lang; 
        private String subTypeIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEventTypeStatusRequest request) {
            super(request);
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.subTypeIds = request.subTypeIds;
        } 

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values: **zh** and **en**. The value zh indicates Chinese, and the value en indicates English.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the anomalous event subtype. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > You can call the **DescribeEventTypes** operation to query the ID of anomalous event subtype.
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
