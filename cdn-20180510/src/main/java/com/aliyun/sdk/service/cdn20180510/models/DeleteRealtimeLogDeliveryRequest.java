// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>DeleteRealtimeLogDeliveryRequest</p>
 */
public class DeleteRealtimeLogDeliveryRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Logstore")
    @Validation(required = true)
    private String logstore;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    private DeleteRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRealtimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
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

    public static final class Builder extends Request.Builder<DeleteRealtimeLogDeliveryRequest, Builder> {
        private String domain; 
        private String logstore; 
        private String project; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRealtimeLogDeliveryRequest request) {
            super(request);
            this.domain = request.domain;
            this.logstore = request.logstore;
            this.project = request.project;
            this.region = request.region;
        } 

        /**
         * The acceleration domain name for which you want to disable real-time log delivery. You can specify multiple domain names and separate them with commas (,).
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The name of the Logstore where log entries are stored.
         */
        public Builder logstore(String logstore) {
            this.putQueryParameter("Logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * The name of the Log Service project that is used for real-time log delivery.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * The ID of the region where the Log Service project is deployed. For more information, see [Regions that support real-time log delivery](~~144883~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public DeleteRealtimeLogDeliveryRequest build() {
            return new DeleteRealtimeLogDeliveryRequest(this);
        } 

    } 

}
