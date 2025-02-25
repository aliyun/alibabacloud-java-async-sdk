// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeServcieScheduleRequest} extends {@link RequestModel}
 *
 * <p>DescribeServcieScheduleRequest</p>
 */
public class DescribeServcieScheduleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodConfigName")
    private String podConfigName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private DescribeServcieScheduleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.podConfigName = builder.podConfigName;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServcieScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return podConfigName
     */
    public String getPodConfigName() {
        return this.podConfigName;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeServcieScheduleRequest, Builder> {
        private String appId; 
        private String podConfigName; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServcieScheduleRequest request) {
            super(request);
            this.appId = request.appId;
            this.podConfigName = request.podConfigName;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>474bdef0-d149-4695-abfb-52912d91****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        public Builder podConfigName(String podConfigName) {
            this.putQueryParameter("PodConfigName", podConfigName);
            this.podConfigName = podConfigName;
            return this;
        }

        /**
         * <p>The unique ID of the device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hdm_f022bf160dc69e2d8eb421e508eb****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeServcieScheduleRequest build() {
            return new DescribeServcieScheduleRequest(this);
        } 

    } 

}
