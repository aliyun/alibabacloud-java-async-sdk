// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeRecursionZoneRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecursionZoneRequest</p>
 */
public class DescribeRecursionZoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeRecursionZoneRequest(Builder builder) {
        super(builder);
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecursionZoneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeRecursionZoneRequest, Builder> {
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecursionZoneRequest request) {
            super(request);
            this.zoneId = request.zoneId;
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
        public DescribeRecursionZoneRequest build() {
            return new DescribeRecursionZoneRequest(this);
        } 

    } 

}
