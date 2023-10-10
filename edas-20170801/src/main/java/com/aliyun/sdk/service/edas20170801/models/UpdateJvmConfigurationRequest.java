// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJvmConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateJvmConfigurationRequest</p>
 */
public class UpdateJvmConfigurationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("MaxHeapSize")
    private Integer maxHeapSize;

    @Query
    @NameInMap("MaxPermSize")
    private Integer maxPermSize;

    @Query
    @NameInMap("MinHeapSize")
    private Integer minHeapSize;

    @Query
    @NameInMap("Options")
    private String options;

    private UpdateJvmConfigurationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.maxHeapSize = builder.maxHeapSize;
        this.maxPermSize = builder.maxPermSize;
        this.minHeapSize = builder.minHeapSize;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJvmConfigurationRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return maxHeapSize
     */
    public Integer getMaxHeapSize() {
        return this.maxHeapSize;
    }

    /**
     * @return maxPermSize
     */
    public Integer getMaxPermSize() {
        return this.maxPermSize;
    }

    /**
     * @return minHeapSize
     */
    public Integer getMinHeapSize() {
        return this.minHeapSize;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<UpdateJvmConfigurationRequest, Builder> {
        private String appId; 
        private String groupId; 
        private Integer maxHeapSize; 
        private Integer maxPermSize; 
        private Integer minHeapSize; 
        private String options; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJvmConfigurationRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.maxHeapSize = request.maxHeapSize;
            this.maxPermSize = request.maxPermSize;
            this.minHeapSize = request.minHeapSize;
            this.options = request.options;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the instance group where the application is deployed. You can call the ListDeployGroup operation to query the group ID. For more information, see [ListDeployGroup](~~62077~~).
         * <p>
         * 
         * > 
         * 
         * *   To configure the JVM parameters for an instance group, set this parameter to a specific ID.
         * 
         * *   To configure the JVM parameters for an application, leave this parameter empty.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The maximum size of the heap memory. Unit: MB.
         * <p>
         * 
         * > 
         * 
         * *   If this parameter is not specified in the group configuration, the value specified in the application configuration is used.
         * 
         * *   If this parameter is not specified in the application configuration, the default value is used.
         */
        public Builder maxHeapSize(Integer maxHeapSize) {
            this.putQueryParameter("MaxHeapSize", maxHeapSize);
            this.maxHeapSize = maxHeapSize;
            return this;
        }

        /**
         * The size of the permanent generation heap memory. Unit: MB.
         * <p>
         * 
         * > 
         * 
         * *   If this parameter is not specified in the group configuration, the value specified in the application configuration is used.
         * 
         * *   If this parameter is not specified in the application configuration, the default value is used.
         */
        public Builder maxPermSize(Integer maxPermSize) {
            this.putQueryParameter("MaxPermSize", maxPermSize);
            this.maxPermSize = maxPermSize;
            return this;
        }

        /**
         * The initial size of the heap memory. Unit: MB.
         * <p>
         * 
         * > 
         * 
         * *   If this parameter is not specified in the group configuration, the value specified in the application configuration is used.
         * 
         * *   If this parameter is not specified in the application configuration, the default value is used.
         */
        public Builder minHeapSize(Integer minHeapSize) {
            this.putQueryParameter("MinHeapSize", minHeapSize);
            this.minHeapSize = minHeapSize;
            return this;
        }

        /**
         * The custom JVM parameters.
         * <p>
         * 
         * > 
         * 
         * *   If this parameter is not specified in the group configuration, the value specified in the application configuration is used.
         * 
         * *   If this parameter is not specified in the application configuration, the default value is used.
         */
        public Builder options(String options) {
            this.putQueryParameter("Options", options);
            this.options = options;
            return this;
        }

        @Override
        public UpdateJvmConfigurationRequest build() {
            return new UpdateJvmConfigurationRequest(this);
        } 

    } 

}
