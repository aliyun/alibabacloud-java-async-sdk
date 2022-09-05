// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusAlertRulesRequest</p>
 */
public class ListPrometheusAlertRulesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("MatchExpressions")
    private String matchExpressions;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("Type")
    private String type;

    private ListPrometheusAlertRulesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.matchExpressions = builder.matchExpressions;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return matchExpressions
     */
    public String getMatchExpressions() {
        return this.matchExpressions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPrometheusAlertRulesRequest, Builder> {
        private String clusterId; 
        private String matchExpressions; 
        private String name; 
        private String regionId; 
        private Integer status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPrometheusAlertRulesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.matchExpressions = request.matchExpressions;
            this.name = request.name;
            this.regionId = request.regionId;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * MatchExpressions.
         */
        public Builder matchExpressions(String matchExpressions) {
            this.putQueryParameter("MatchExpressions", matchExpressions);
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPrometheusAlertRulesRequest build() {
            return new ListPrometheusAlertRulesRequest(this);
        } 

    } 

}
