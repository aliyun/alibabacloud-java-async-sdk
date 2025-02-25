// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link ModifyEventTypeStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventTypeStatusRequest</p>
 */
public class ModifyEventTypeStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubTypeIds")
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values: <strong>zh</strong> and <strong>en</strong>. The value zh indicates Chinese, and the value en indicates English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the anomalous event subtype. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <strong>DescribeEventTypes</strong> operation to query the ID of anomalous event subtype.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>020008</p>
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
