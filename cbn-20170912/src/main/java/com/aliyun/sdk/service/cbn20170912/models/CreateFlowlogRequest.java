// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateFlowlogRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowlogRequest</p>
 */
public class CreateFlowlogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowLogName")
    private String flowLogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogFormatString")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String logFormatString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private CreateFlowlogRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.flowLogName = builder.flowLogName;
        this.interval = builder.interval;
        this.logFormatString = builder.logFormatString;
        this.logStoreName = builder.logStoreName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowlogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flowLogName
     */
    public String getFlowLogName() {
        return this.flowLogName;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return logFormatString
     */
    public String getLogFormatString() {
        return this.logFormatString;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<CreateFlowlogRequest, Builder> {
        private String cenId; 
        private String clientToken; 
        private String description; 
        private String flowLogName; 
        private Long interval; 
        private String logFormatString; 
        private String logStoreName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String projectName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 
        private String transitRouterAttachmentId; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowlogRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.flowLogName = request.flowLogName;
            this.interval = request.interval;
            this.logFormatString = request.logFormatString;
            this.logStoreName = request.logStoreName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * <p>The ID of the CEN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-7qthudw0ll6jmc****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the flow log.</p>
         * <p>The description is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The flow log name.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        public Builder flowLogName(String flowLogName) {
            this.putQueryParameter("FlowLogName", flowLogName);
            this.flowLogName = flowLogName;
            return this;
        }

        /**
         * <p>The time window for collecting log data. Unit: seconds. Valid values: <strong>60</strong> and <strong>600</strong>. Default value: <strong>600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The strings that define the fields in the flow log.</p>
         * <p>Format: <code>${Field 1}${Field 2}${Field 3}...{Field n}</code></p>
         * <ul>
         * <li>If you do not configure this parameter, all fields are included in the flow log.</li>
         * <li>If you configure this parameter, start the string with <code>${srcaddr}${dstaddr}${bytes}</code> because <code>${srcaddr}${dstaddr}${bytes}</code> are required variables. For more information about the fields supported by flow logs, see <a href="https://help.aliyun.com/document_detail/339822.html">Configure a flow log</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>${srcaddr}${dstaddr}${bytes}</p>
         */
        public Builder logFormatString(String logFormatString) {
            this.putQueryParameter("LogFormatString", logFormatString);
            this.logFormatString = logFormatString;
            return this;
        }

        /**
         * <p>The Logstore that stores the captured traffic data.</p>
         * <ul>
         * <li><p>If a Logstore is already created in the selected region, enter the name of the Logstore.</p>
         * </li>
         * <li><p>If no Logstores are created in the selected region, enter a name and the system automatically creates a Logstore. The name of the Logstore. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be unique in a project.</li>
         * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start and end with a lowercase letter or a digit.</li>
         * <li>The name must be 3 to 63 characters in length,</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogStore</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putQueryParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The project that stores the captured traffic data.</p>
         * <ul>
         * <li><p>If a project is already created in the selected region, enter the name of the project.</p>
         * </li>
         * <li><p>If no projects are created in the selected region, enter a name and the system automatically creates a project.</p>
         * <p>The project name must be unique in a region. You cannot change the name after the project is created. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be globally unique.</li>
         * <li>The name can contain only lowercase letters, digits, and hyphens (-).</li>
         * <li>The name must start and end with a lowercase letter or a digit.</li>
         * <li>The name must be 3 to 63 characters in length,</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowLogProject</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The ID of the region where the flow log is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The tags.</p>
         * <p>You can specify at most 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the VPC connection, VPN connection, VBR connection, ECR connection, or inter-region connection.</p>
         * <p>If you create the flow log for a transfer router, skip this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-r6g0m3epjehw57****</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1rmwxnk221e3fas****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public CreateFlowlogRequest build() {
            return new CreateFlowlogRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFlowlogRequest} extends {@link TeaModel}
     *
     * <p>CreateFlowlogRequest</p>
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
             * <p>The tag keys.</p>
             * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length. The tag keys cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag values.</p>
             * <p>The tag values can be an empty string or up to 128 characters in length. The tag values cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Each key-value must be unique. You can specify at most 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
