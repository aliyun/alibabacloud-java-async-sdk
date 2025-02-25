// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRealtimeLogDeliveryDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListRealtimeLogDeliveryDomainsRequest</p>
 */
public class ListRealtimeLogDeliveryDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private ListRealtimeLogDeliveryDomainsRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.project = builder.project;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeLogDeliveryDomainsRequest create() {
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

    public static final class Builder extends Request.Builder<ListRealtimeLogDeliveryDomainsRequest, Builder> {
        private String logstore; 
        private String project; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ListRealtimeLogDeliveryDomainsRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.project = request.project;
            this.region = request.region;
        } 

        /**
         * <p>The name of the Logstore that collects log data from Alibaba Cloud CDN in real time. You can specify multiple Logstore names and separate them with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LogstoreName</p>
         */
        public Builder logstore(String logstore) {
            this.putQueryParameter("Logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The name of the Log Service project that is used for real-time log delivery. You can specify multiple project names and separate them with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProjectName</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The ID of the region where the Log Service project is deployed. You can specify multiple region IDs and separate them with commas (,).</p>
         * <p>For more information about regions, see <a href="https://help.aliyun.com/document_detail/144883.html">Regions that support real-time log delivery</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ch-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public ListRealtimeLogDeliveryDomainsRequest build() {
            return new ListRealtimeLogDeliveryDomainsRequest(this);
        } 

    } 

}
