// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListVodRealtimeLogDeliveryDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListVodRealtimeLogDeliveryDomainsRequest</p>
 */
public class ListVodRealtimeLogDeliveryDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private ListVodRealtimeLogDeliveryDomainsRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.ownerId = builder.ownerId;
        this.project = builder.project;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodRealtimeLogDeliveryDomainsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ListVodRealtimeLogDeliveryDomainsRequest, Builder> {
        private String logstore; 
        private Long ownerId; 
        private String project; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ListVodRealtimeLogDeliveryDomainsRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.ownerId = request.ownerId;
            this.project = request.project;
            this.region = request.region;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder logstore(String logstore) {
            this.putQueryParameter("Logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public ListVodRealtimeLogDeliveryDomainsRequest build() {
            return new ListVodRealtimeLogDeliveryDomainsRequest(this);
        } 

    } 

}
