// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServcieScheduleRequest} extends {@link RequestModel}
 *
 * <p>DescribeServcieScheduleRequest</p>
 */
public class DescribeServcieScheduleRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("PodConfigName")
    private String podConfigName;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
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

        private Builder(DescribeServcieScheduleRequest response) {
            super(response);
            this.appId = response.appId;
            this.podConfigName = response.podConfigName;
            this.uuid = response.uuid;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * PodConfigName.
         */
        public Builder podConfigName(String podConfigName) {
            this.putQueryParameter("PodConfigName", podConfigName);
            this.podConfigName = podConfigName;
            return this;
        }

        /**
         * Uuid.
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
