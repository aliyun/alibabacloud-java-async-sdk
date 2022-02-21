// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZoneInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeZoneInfoRequest</p>
 */
public class DescribeZoneInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private DescribeZoneInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZoneInfoRequest create() {
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeZoneInfoRequest, Builder> {
        private String lang; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZoneInfoRequest response) {
            super(response);
            this.lang = response.lang;
            this.zoneId = response.zoneId;
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
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeZoneInfoRequest build() {
            return new DescribeZoneInfoRequest(this);
        } 

    } 

}
