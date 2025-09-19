// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetInstanceAlarmStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceAlarmStatisticsRequest</p>
 */
public class GetInstanceAlarmStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetInstanceAlarmStatisticsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceAlarmStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetInstanceAlarmStatisticsRequest, Builder> {
        private String from; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceAlarmStatisticsRequest request) {
            super(request);
            this.from = request.from;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The data source for statistics on instance alarms, with a default value of aqs:</p>
         * <ul>
         * <li><em>sas</em>: Situation Awareness data source</li>
         * <li><em>aqs</em>: Alarm event data</li>
         * <li><em>honeypot</em>: Honeypot</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The UUID of the server to be queried.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> API to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>00fea5a1-9792-4373-ab1e-bb6536ba****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetInstanceAlarmStatisticsRequest build() {
            return new GetInstanceAlarmStatisticsRequest(this);
        } 

    } 

}
