// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceShareAssociationsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceShareAssociationsRequest</p>
 */
public class ListResourceShareAssociationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociationStatus")
    private String associationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String associationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceShareIds")
    private java.util.List < String > resourceShareIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private ListResourceShareAssociationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.associationStatus = builder.associationStatus;
        this.associationType = builder.associationType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceId = builder.resourceId;
        this.resourceShareIds = builder.resourceShareIds;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceShareAssociationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return associationStatus
     */
    public String getAssociationStatus() {
        return this.associationStatus;
    }

    /**
     * @return associationType
     */
    public String getAssociationType() {
        return this.associationType;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceShareIds
     */
    public java.util.List < String > getResourceShareIds() {
        return this.resourceShareIds;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ListResourceShareAssociationsRequest, Builder> {
        private String regionId; 
        private String associationStatus; 
        private String associationType; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceId; 
        private java.util.List < String > resourceShareIds; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceShareAssociationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.associationStatus = request.associationStatus;
            this.associationType = request.associationType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceId = request.resourceId;
            this.resourceShareIds = request.resourceShareIds;
            this.target = request.target;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The association status. Valid values:</p>
         * <ul>
         * <li>Associating: The entity is being associated.</li>
         * <li>Associated: The entity is associated.</li>
         * <li>Failed: The entity fails to be associated.</li>
         * <li>Disassociating: The entity is being disassociated.</li>
         * <li>Disassociated: The entity is disassociated.</li>
         * </ul>
         * <blockquote>
         * <p> The system deletes the records of entities in the <code>Failed</code> or <code>Disassociated</code> state within 48 hours to 96 hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Associated</p>
         */
        public Builder associationStatus(String associationStatus) {
            this.putQueryParameter("AssociationStatus", associationStatus);
            this.associationStatus = associationStatus;
            return this;
        }

        /**
         * <p>The association type. Valid values:</p>
         * <ul>
         * <li>Resource</li>
         * <li>Target</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource</p>
         */
        public Builder associationType(String associationType) {
            this.putQueryParameter("AssociationType", associationType);
            this.associationType = associationType;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single request.</p>
         * <p>Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The <code>token</code> that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * <blockquote>
         * <p> This parameter is unavailable if you set the <code>AssociationType</code> parameter to <code>Target</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp183p93qs667muql****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The IDs of the resource shares.</p>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five resource shares can be specified at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-6GRmdD3X****</p>
         */
        public Builder resourceShareIds(java.util.List < String > resourceShareIds) {
            this.putQueryParameter("ResourceShareIds", resourceShareIds);
            this.resourceShareIds = resourceShareIds;
            return this;
        }

        /**
         * <p>The ID of the principal.</p>
         * <blockquote>
         * <p> This parameter is unavailable if you set the <code>AssociationType</code> parameter to <code>Resource</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172050525300****</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ListResourceShareAssociationsRequest build() {
            return new ListResourceShareAssociationsRequest(this);
        } 

    } 

}
