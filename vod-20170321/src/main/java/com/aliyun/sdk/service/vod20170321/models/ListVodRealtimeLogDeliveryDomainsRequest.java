// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVodRealtimeLogDeliveryDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListVodRealtimeLogDeliveryDomainsRequest</p>
 */
public class ListVodRealtimeLogDeliveryDomainsRequest extends Request {
    @Query
    @NameInMap("Logstore")
    @Validation(required = true)
    private String logstore;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
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

        private Builder(ListVodRealtimeLogDeliveryDomainsRequest response) {
            super(response);
            this.logstore = response.logstore;
            this.ownerId = response.ownerId;
            this.project = response.project;
            this.region = response.region;
        } 

        /**
         * Logstore.
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
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * Region.
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
