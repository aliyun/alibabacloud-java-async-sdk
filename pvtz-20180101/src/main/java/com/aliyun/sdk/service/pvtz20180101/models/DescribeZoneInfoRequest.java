// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZoneInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeZoneInfoRequest</p>
 */
public class DescribeZoneInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DescribeZoneInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.zoneId = request.zoneId;
        } 

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The global ID of the zone.
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
