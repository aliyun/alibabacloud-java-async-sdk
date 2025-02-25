// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExperimentsRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentsRequest</p>
 */
public class ListExperimentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    private String experimentGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListExperimentsRequest(Builder builder) {
        super(builder);
        this.experimentGroupId = builder.experimentGroupId;
        this.instanceId = builder.instanceId;
        this.query = builder.query;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListExperimentsRequest, Builder> {
        private String experimentGroupId; 
        private String instanceId; 
        private String query; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentsRequest request) {
            super(request);
            this.experimentGroupId = request.experimentGroupId;
            this.instanceId = request.instanceId;
            this.query = request.query;
            this.status = request.status;
        } 

        /**
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putQueryParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListExperimentsRequest build() {
            return new ListExperimentsRequest(this);
        } 

    } 

}
