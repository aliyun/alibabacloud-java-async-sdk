// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListRayLogsRequest} extends {@link RequestModel}
 *
 * <p>ListRayLogsRequest</p>
 */
public class ListRayLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("delimiter")
    private String delimiter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxKeys")
    private Long maxKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    private ListRayLogsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.instanceId = builder.instanceId;
        this.bucketName = builder.bucketName;
        this.delimiter = builder.delimiter;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRayLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return delimiter
     */
    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder extends Request.Builder<ListRayLogsRequest, Builder> {
        private String workspaceId; 
        private String instanceId; 
        private String bucketName; 
        private String delimiter; 
        private String marker; 
        private Long maxKeys; 
        private String prefix; 

        private Builder() {
            super();
        } 

        private Builder(ListRayLogsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.instanceId = request.instanceId;
            this.bucketName = request.bucketName;
            this.delimiter = request.delimiter;
            this.marker = request.marker;
            this.maxKeys = request.maxKeys;
            this.prefix = request.prefix;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the Ray job.</p>
         * 
         * <strong>example:</strong>
         * <p>rj-311d343123</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>mybucket</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("bucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The character used to group object names. All objects whose names contain the specified prefix and between which the delimiter character appears for the first time are grouped as a set of elements (CommonPrefixes).</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder delimiter(String delimiter) {
            this.putQueryParameter("delimiter", delimiter);
            this.delimiter = delimiter;
            return this;
        }

        /**
         * <p>The marker after which the returned objects are listed in alphabetical order.</p>
         * 
         * <strong>example:</strong>
         * <p>test1.txt</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The maximum number of objects to return. If the listing cannot be completed in a single request due to the max-keys setting, a NextMarker element is included in the response as the marker for the next listing request.</p>
         * <p>Valid values: greater than 0 and less than 1000.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxKeys(Long maxKeys) {
            this.putQueryParameter("maxKeys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>The prefix that the keys of the returned files must start with.</p>
         * 
         * <strong>example:</strong>
         * <p>/w-xxxxxxx/ray/logs/rj-xxxxxxxxxx_default/</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        @Override
        public ListRayLogsRequest build() {
            return new ListRayLogsRequest(this);
        } 

    } 

}
