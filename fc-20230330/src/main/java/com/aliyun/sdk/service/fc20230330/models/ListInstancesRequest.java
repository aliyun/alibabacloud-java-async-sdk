// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTimeMs")
    private Long endTimeMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceStatus")
    private java.util.List < String > instanceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startKey")
    private String startKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTimeMs")
    private Long startTimeMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withAllActive")
    private Boolean withAllActive;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.endTimeMs = builder.endTimeMs;
        this.instanceIds = builder.instanceIds;
        this.instanceStatus = builder.instanceStatus;
        this.limit = builder.limit;
        this.qualifier = builder.qualifier;
        this.startKey = builder.startKey;
        this.startTimeMs = builder.startTimeMs;
        this.withAllActive = builder.withAllActive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return endTimeMs
     */
    public Long getEndTimeMs() {
        return this.endTimeMs;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceStatus
     */
    public java.util.List < String > getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return startKey
     */
    public String getStartKey() {
        return this.startKey;
    }

    /**
     * @return startTimeMs
     */
    public Long getStartTimeMs() {
        return this.startTimeMs;
    }

    /**
     * @return withAllActive
     */
    public Boolean getWithAllActive() {
        return this.withAllActive;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String functionName; 
        private Long endTimeMs; 
        private java.util.List < String > instanceIds; 
        private java.util.List < String > instanceStatus; 
        private String limit; 
        private String qualifier; 
        private String startKey; 
        private Long startTimeMs; 
        private Boolean withAllActive; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.endTimeMs = request.endTimeMs;
            this.instanceIds = request.instanceIds;
            this.instanceStatus = request.instanceStatus;
            this.limit = request.limit;
            this.qualifier = request.qualifier;
            this.startKey = request.startKey;
            this.startTimeMs = request.startTimeMs;
            this.withAllActive = request.withAllActive;
        } 

        /**
         * <p>The function name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-func</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * endTimeMs.
         */
        public Builder endTimeMs(Long endTimeMs) {
            this.putQueryParameter("endTimeMs", endTimeMs);
            this.endTimeMs = endTimeMs;
            return this;
        }

        /**
         * instanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "instanceIds", "json");
            this.putQueryParameter("instanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * instanceStatus.
         */
        public Builder instanceStatus(java.util.List < String > instanceStatus) {
            String instanceStatusShrink = shrink(instanceStatus, "instanceStatus", "json");
            this.putQueryParameter("instanceStatus", instanceStatusShrink);
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(String limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The function version or alias.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * startKey.
         */
        public Builder startKey(String startKey) {
            this.putQueryParameter("startKey", startKey);
            this.startKey = startKey;
            return this;
        }

        /**
         * startTimeMs.
         */
        public Builder startTimeMs(Long startTimeMs) {
            this.putQueryParameter("startTimeMs", startTimeMs);
            this.startTimeMs = startTimeMs;
            return this;
        }

        /**
         * <p>Specifies whether to list all instances. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withAllActive(Boolean withAllActive) {
            this.putQueryParameter("withAllActive", withAllActive);
            this.withAllActive = withAllActive;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
