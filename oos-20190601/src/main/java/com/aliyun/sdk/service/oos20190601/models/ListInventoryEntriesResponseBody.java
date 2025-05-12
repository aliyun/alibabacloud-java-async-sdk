// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListInventoryEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInventoryEntriesResponseBody</p>
 */
public class ListInventoryEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaptureTime")
    private String captureTime;

    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List<java.util.Map<String, ?>> entries;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("TypeName")
    private String typeName;

    private ListInventoryEntriesResponseBody(Builder builder) {
        this.captureTime = builder.captureTime;
        this.entries = builder.entries;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.schemaVersion = builder.schemaVersion;
        this.typeName = builder.typeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInventoryEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return captureTime
     */
    public String getCaptureTime() {
        return this.captureTime;
    }

    /**
     * @return entries
     */
    public java.util.List<java.util.Map<String, ?>> getEntries() {
        return this.entries;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return this.typeName;
    }

    public static final class Builder {
        private String captureTime; 
        private java.util.List<java.util.Map<String, ?>> entries; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String schemaVersion; 
        private String typeName; 

        private Builder() {
        } 

        private Builder(ListInventoryEntriesResponseBody model) {
            this.captureTime = model.captureTime;
            this.entries = model.entries;
            this.instanceId = model.instanceId;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.schemaVersion = model.schemaVersion;
            this.typeName = model.typeName;
        } 

        /**
         * <p>The time when the request was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-17T12:28:13Z</p>
         */
        public Builder captureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }

        /**
         * <p>The configurations of the component.</p>
         */
        public Builder entries(java.util.List<java.util.Map<String, ?>> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cpoxxxwxxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A81E4B2E-6B33-4BAE-9856-55DB7C893E01</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version number of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS:InstanceInformation</p>
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            return this;
        }

        public ListInventoryEntriesResponseBody build() {
            return new ListInventoryEntriesResponseBody(this);
        } 

    } 

}
