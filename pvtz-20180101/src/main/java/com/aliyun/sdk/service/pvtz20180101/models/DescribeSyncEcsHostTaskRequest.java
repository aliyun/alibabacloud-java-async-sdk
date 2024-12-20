// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyncEcsHostTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeSyncEcsHostTaskRequest</p>
 */
public class DescribeSyncEcsHostTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private DescribeSyncEcsHostTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncEcsHostTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSyncEcsHostTaskRequest, Builder> {
        private String lang; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSyncEcsHostTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The zone ID. This ID uniquely identifies the zone.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pvtz-test-id-2989149d628c5****</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeSyncEcsHostTaskRequest build() {
            return new DescribeSyncEcsHostTaskRequest(this);
        } 

    } 

}
