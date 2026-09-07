// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetDeviceOnlineHeatmapRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceOnlineHeatmapRequest</p>
 */
public class GetDeviceOnlineHeatmapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String saseUserId;

    private GetDeviceOnlineHeatmapRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.devTag = builder.devTag;
        this.saseUserId = builder.saseUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOnlineHeatmapRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public static final class Builder extends Request.Builder<GetDeviceOnlineHeatmapRequest, Builder> {
        private String date; 
        private String devTag; 
        private String saseUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceOnlineHeatmapRequest request) {
            super(request);
            this.date = request.date;
            this.devTag = request.devTag;
            this.saseUserId = request.saseUserId;
        } 

        /**
         * <p>The date to query, in the format yyyyMMdd with a fixed length of 8 characters. Online data is retained for only 8 days. Dates beyond the retention period return an empty list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20260809</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>The terminal device ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2987b3e0-8108-2f99-4d18-3b4f1c1****</p>
         */
        public Builder devTag(String devTag) {
            this.putQueryParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * <p>The user ID. You can obtain this value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Lists user terminal devices.</li>
         * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user terminal device.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        public Builder saseUserId(String saseUserId) {
            this.putQueryParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        @Override
        public GetDeviceOnlineHeatmapRequest build() {
            return new GetDeviceOnlineHeatmapRequest(this);
        } 

    } 

}
