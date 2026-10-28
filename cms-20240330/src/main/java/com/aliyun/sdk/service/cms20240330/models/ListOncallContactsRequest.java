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
 * {@link ListOncallContactsRequest} extends {@link RequestModel}
 *
 * <p>ListOncallContactsRequest</p>
 */
public class ListOncallContactsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
    private String oncallScheduleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timestamp")
    private String timestamp;

    private ListOncallContactsRequest(Builder builder) {
        super(builder);
        this.oncallScheduleId = builder.oncallScheduleId;
        this.regionId = builder.regionId;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOncallContactsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oncallScheduleId
     */
    public String getOncallScheduleId() {
        return this.oncallScheduleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder extends Request.Builder<ListOncallContactsRequest, Builder> {
        private String oncallScheduleId; 
        private String regionId; 
        private String timestamp; 

        private Builder() {
            super();
        } 

        private Builder(ListOncallContactsRequest request) {
            super(request);
            this.oncallScheduleId = request.oncallScheduleId;
            this.regionId = request.regionId;
            this.timestamp = request.timestamp;
        } 

        /**
         * <p>The unique identifier of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder oncallScheduleId(String oncallScheduleId) {
            this.putPathParameter("oncallScheduleId", oncallScheduleId);
            this.oncallScheduleId = oncallScheduleId;
            return this;
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
         * <p>The timestamp of the on-call shift to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1730183838000</p>
         */
        public Builder timestamp(String timestamp) {
            this.putQueryParameter("timestamp", timestamp);
            this.timestamp = timestamp;
            return this;
        }

        @Override
        public ListOncallContactsRequest build() {
            return new ListOncallContactsRequest(this);
        } 

    } 

}
