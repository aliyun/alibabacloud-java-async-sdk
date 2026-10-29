// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ActiveContactChannelRequest} extends {@link RequestModel}
 *
 * <p>ActiveContactChannelRequest</p>
 */
public class ActiveContactChannelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("site")
    private String site;

    private ActiveContactChannelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
        this.site = builder.site;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveContactChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    public static final class Builder extends Request.Builder<ActiveContactChannelRequest, Builder> {
        private String regionId; 
        private String code; 
        private String site; 

        private Builder() {
            super();
        } 

        private Builder(ActiveContactChannelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
            this.site = request.site;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.putQueryParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * site.
         */
        public Builder site(String site) {
            this.putQueryParameter("site", site);
            this.site = site;
            return this;
        }

        @Override
        public ActiveContactChannelRequest build() {
            return new ActiveContactChannelRequest(this);
        } 

    } 

}
