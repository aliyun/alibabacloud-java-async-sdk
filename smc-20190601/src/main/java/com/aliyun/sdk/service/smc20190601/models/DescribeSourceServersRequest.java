// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
 * {@link DescribeSourceServersRequest} extends {@link RequestModel}
 *
 * <p>DescribeSourceServersRequest</p>
 */
public class DescribeSourceServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedJobType")
    private java.util.List<String> relatedJobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private java.util.List<String> sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkgroupId")
    private String workgroupId;

    private DescribeSourceServersRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.relatedJobType = builder.relatedJobType;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.sourceId = builder.sourceId;
        this.state = builder.state;
        this.tag = builder.tag;
        this.workgroupId = builder.workgroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSourceServersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return relatedJobType
     */
    public java.util.List<String> getRelatedJobType() {
        return this.relatedJobType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return sourceId
     */
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return workgroupId
     */
    public String getWorkgroupId() {
        return this.workgroupId;
    }

    public static final class Builder extends Request.Builder<DescribeSourceServersRequest, Builder> {
        private String jobId; 
        private String name; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> relatedJobType; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private java.util.List<String> sourceId; 
        private String state; 
        private java.util.List<Tag> tag; 
        private String workgroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSourceServersRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.relatedJobType = request.relatedJobType;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.sourceId = request.sourceId;
            this.state = request.state;
            this.tag = request.tag;
            this.workgroupId = request.workgroupId;
        } 

        /**
         * <p>The ID of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>j-bp19vlwm0tyigbmj****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The name of the migration source. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * <p>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>testSourceServerName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Minimum value: 1.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of migration job that is associated with the migration source.</p>
         */
        public Builder relatedJobType(java.util.List<String> relatedJobType) {
            this.putQueryParameter("RelatedJobType", relatedJobType);
            this.relatedJobType = relatedJobType;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw3ty5y7****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The migration source ID. You can specify multiple IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1e2fsl57knvuug****</p>
         */
        public Builder sourceId(java.util.List<String> sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The state of the migration source. Valid values:</p>
         * <ul>
         * <li>Unavailable: The migration source is inactive, or an error occurs in the migration source.</li>
         * <li>Available: The migration source is active.</li>
         * <li>InUse: The migration source is being migrated.</li>
         * <li>Deleting: The migration source is being deleted from Server Migration Center (SMC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The tag.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The workgroup ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-bp1ja22kdqphehlj****</p>
         */
        public Builder workgroupId(String workgroupId) {
            this.putQueryParameter("WorkgroupId", workgroupId);
            this.workgroupId = workgroupId;
            return this;
        }

        @Override
        public DescribeSourceServersRequest build() {
            return new DescribeSourceServersRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSourceServersRequest} extends {@link TeaModel}
     *
     * <p>DescribeSourceServersRequest</p>
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
             * <p>The key of tag N that is attached to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>You cannot specify an empty string as a tag key. The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that is attached to the SMC resource. Valid values of N: 1 to 20.</p>
             * <p>You can specify an empty string as a tag key. The tag value can be up to 64 characters in length and cannot contain http:// or https://.</p>
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
