// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInventoryEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInventoryEntriesResponseBody</p>
 */
public class ListInventoryEntriesResponseBody extends TeaModel {
    @NameInMap("CaptureTime")
    private String captureTime;

    @NameInMap("Entries")
    private java.util.List < java.util.Map<String, ?>> entries;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SchemaVersion")
    private String schemaVersion;

    @NameInMap("TypeName")
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

    /**
     * @return captureTime
     */
    public String getCaptureTime() {
        return this.captureTime;
    }

    /**
     * @return entries
     */
    public java.util.List < java.util.Map<String, ?>> getEntries() {
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
        private java.util.List < java.util.Map<String, ?>> entries; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String schemaVersion; 
        private String typeName; 

        /**
         * CaptureTime.
         */
        public Builder captureTime(String captureTime) {
            this.captureTime = captureTime;
            return this;
        }

        /**
         * Entries.
         */
        public Builder entries(java.util.List < java.util.Map<String, ?>> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SchemaVersion.
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * TypeName.
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
