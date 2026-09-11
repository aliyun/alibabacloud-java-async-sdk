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
 * {@link DescribeAccessPointsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessPointsRequest</p>
 */
public class DescribeAccessPointsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroup")
    private String accessGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeAccessPointsRequest(Builder builder) {
        super(builder);
        this.accessGroup = builder.accessGroup;
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessPointsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroup
     */
    public String getAccessGroup() {
        return this.accessGroup;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeAccessPointsRequest, Builder> {
        private String accessGroup; 
        private String fileSystemId; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessPointsRequest request) {
            super(request);
            this.accessGroup = request.accessGroup;
            this.fileSystemId = request.fileSystemId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.tag = request.tag;
        } 

        /**
         * <p>The permission group name.</p>
         * <p>This parameter is required if the file system is a General-purpose NAS file system.</p>
         * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (the default permission group for VPCs).</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        public Builder accessGroup(String accessGroup) {
            this.putQueryParameter("AccessGroup", accessGroup);
            this.accessGroup = accessGroup;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>174494****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
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
         * <p>The query token. Set the value to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>MTY4NzcxOTcwMjAzMDk2Nzc0MyM4MDM4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of access point tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeAccessPointsRequest build() {
            return new DescribeAccessPointsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessPointsRequest} extends {@link TeaModel}
     *
     * <p>DescribeAccessPointsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>Valid values of N: 1 to 20.</li>
             * <li>The tag key can be up to 128 characters in length.</li>
             * <li>The tag key cannot start with aliyun or acs:.</li>
             * <li>The tag key cannot contain http:// or https://.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>Valid values of N: 1 to 20.</li>
             * <li>The tag value can be up to 128 characters in length.</li>
             * <li>The tag value cannot start with aliyun or acs:.</li>
             * <li>The tag value cannot contain http:// or https://.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
