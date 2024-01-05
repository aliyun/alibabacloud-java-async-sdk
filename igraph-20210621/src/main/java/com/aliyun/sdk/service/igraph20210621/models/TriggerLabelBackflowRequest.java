// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerLabelBackflowRequest} extends {@link RequestModel}
 *
 * <p>TriggerLabelBackflowRequest</p>
 */
public class TriggerLabelBackflowRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("graphName")
    @Validation(required = true)
    private String graphName;

    @Path
    @NameInMap("labelName")
    @Validation(required = true)
    private String labelName;

    @Query
    @NameInMap("odpsPartition")
    private String odpsPartition;

    @Query
    @NameInMap("timestamp")
    private String timestamp;

    private TriggerLabelBackflowRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.graphName = builder.graphName;
        this.labelName = builder.labelName;
        this.odpsPartition = builder.odpsPartition;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerLabelBackflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return labelName
     */
    public String getLabelName() {
        return this.labelName;
    }

    /**
     * @return odpsPartition
     */
    public String getOdpsPartition() {
        return this.odpsPartition;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder extends Request.Builder<TriggerLabelBackflowRequest, Builder> {
        private String instanceId; 
        private String graphName; 
        private String labelName; 
        private String odpsPartition; 
        private String timestamp; 

        private Builder() {
            super();
        } 

        private Builder(TriggerLabelBackflowRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.graphName = request.graphName;
            this.labelName = request.labelName;
            this.odpsPartition = request.odpsPartition;
            this.timestamp = request.timestamp;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * graphName.
         */
        public Builder graphName(String graphName) {
            this.putPathParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * labelName.
         */
        public Builder labelName(String labelName) {
            this.putPathParameter("labelName", labelName);
            this.labelName = labelName;
            return this;
        }

        /**
         * odpsPartition.
         */
        public Builder odpsPartition(String odpsPartition) {
            this.putQueryParameter("odpsPartition", odpsPartition);
            this.odpsPartition = odpsPartition;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.putQueryParameter("timestamp", timestamp);
            this.timestamp = timestamp;
            return this;
        }

        @Override
        public TriggerLabelBackflowRequest build() {
            return new TriggerLabelBackflowRequest(this);
        } 

    } 

}
