// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DLResourceUri} extends {@link TeaModel}
 *
 * <p>DLResourceUri</p>
 */
public class DLResourceUri extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private DLResourceUri(Builder builder) {
        this.resourceType = builder.resourceType;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLResourceUri create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String resourceType; 
        private String uri; 

        private Builder() {
        } 

        private Builder(DLResourceUri model) {
            this.resourceType = model.resourceType;
            this.uri = model.uri;
        } 

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>ARCHIVE</li>
         * <li>JAR</li>
         * <li>FILE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JAR</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The URL used to access the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://name****.example.com:8020/user/hive/udfs/my_***.jar</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public DLResourceUri build() {
            return new DLResourceUri(this);
        } 

    } 

}
