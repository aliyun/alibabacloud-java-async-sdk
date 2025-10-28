// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateJvmConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateJvmConfigurationRequest</p>
 */
public class UpdateJvmConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxHeapSize")
    private Integer maxHeapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPermSize")
    private Integer maxPermSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinHeapSize")
    private Integer minHeapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Options")
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
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c627c157-560d-*************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the instance group where the application is deployed. You can call the ListDeployGroup operation to query the group ID. For more information, see <a href="https://help.aliyun.com/document_detail/62077.html">ListDeployGroup</a>.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>To configure the JVM parameters for an instance group, set this parameter to a specific ID.</p>
         * </li>
         * <li><p>To configure the JVM parameters for an application, leave this parameter empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0afc726e-077e-4357-98b2-db9f7145****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The maximum size of the heap memory. Unit: MB.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
         * </li>
         * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder maxHeapSize(Integer maxHeapSize) {
            this.putQueryParameter("MaxHeapSize", maxHeapSize);
            this.maxHeapSize = maxHeapSize;
            return this;
        }

        /**
         * <p>The size of the permanent generation heap memory. Unit: MB.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
         * </li>
         * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxPermSize(Integer maxPermSize) {
            this.putQueryParameter("MaxPermSize", maxPermSize);
            this.maxPermSize = maxPermSize;
            return this;
        }

        /**
         * <p>The initial size of the heap memory. Unit: MB.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
         * </li>
         * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder minHeapSize(Integer minHeapSize) {
            this.putQueryParameter("MinHeapSize", minHeapSize);
            this.minHeapSize = minHeapSize;
            return this;
        }

        /**
         * <p>The custom JVM parameters.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If this parameter is not specified in the group configuration, the value specified in the application configuration is used.</p>
         * </li>
         * <li><p>If this parameter is not specified in the application configuration, the default value is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-Dproperty=value</p>
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
