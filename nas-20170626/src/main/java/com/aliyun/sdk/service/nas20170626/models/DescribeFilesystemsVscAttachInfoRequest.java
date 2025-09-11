// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeFilesystemsVscAttachInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeFilesystemsVscAttachInfoRequest</p>
 */
public class DescribeFilesystemsVscAttachInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceIds> resourceIds;

    private DescribeFilesystemsVscAttachInfoRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilesystemsVscAttachInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceIds
     */
    public java.util.List<ResourceIds> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<DescribeFilesystemsVscAttachInfoRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<ResourceIds> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFilesystemsVscAttachInfoRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * <p>The number of results for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Query token, which is the NextToken value returned from the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID information of the file system and virtual storage channel. Each batch can contain up to 10 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceIds(java.util.List<ResourceIds> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public DescribeFilesystemsVscAttachInfoRequest build() {
            return new DescribeFilesystemsVscAttachInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilesystemsVscAttachInfoRequest} extends {@link TeaModel}
     *
     * <p>DescribeFilesystemsVscAttachInfoRequest</p>
     */
    public static class ResourceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        private ResourceIds(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
            this.vscId = builder.vscId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIds create() {
            return builder().build();
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        public static final class Builder {
            private String fileSystemId; 
            private String vscId; 

            private Builder() {
            } 

            private Builder(ResourceIds model) {
                this.fileSystemId = model.fileSystemId;
                this.vscId = model.vscId;
            } 

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>bmcpfs-290t15yn4uo8lid****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The ID of the virtual storage channel.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-8vb864o3ppwfvh****</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            public ResourceIds build() {
                return new ResourceIds(this);
            } 

        } 

    }
}
