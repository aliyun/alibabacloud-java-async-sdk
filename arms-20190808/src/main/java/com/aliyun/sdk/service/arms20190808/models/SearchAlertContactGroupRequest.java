// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>SearchAlertContactGroupRequest</p>
 */
public class SearchAlertContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupName")
    private String contactGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDetail")
    private Boolean isDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private SearchAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupIds = builder.contactGroupIds;
        this.contactGroupName = builder.contactGroupName;
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.isDetail = builder.isDetail;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupIds
     */
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return contactGroupName
     */
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return isDetail
     */
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SearchAlertContactGroupRequest, Builder> {
        private String contactGroupIds; 
        private String contactGroupName; 
        private Long contactId; 
        private String contactName; 
        private Boolean isDetail; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SearchAlertContactGroupRequest request) {
            super(request);
            this.contactGroupIds = request.contactGroupIds;
            this.contactGroupName = request.contactGroupName;
            this.contactId = request.contactId;
            this.contactName = request.contactName;
            this.isDetail = request.isDetail;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the alert contact group. You can query multiple alert contact groups at a time. Separate multiple group IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>746</p>
         */
        public Builder contactGroupIds(String contactGroupIds) {
            this.putQueryParameter("ContactGroupIds", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * <p>The name of the alert contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * <p>The ID of the alert contact. You can call the SearchAlertContact operation to query the contact IDs. For more information, see <a href="https://help.aliyun.com/document_detail/130703.html">SearchAlertContact</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>Specifies whether to return all alert contacts in the queried alert contact group. By default, not all alert contacts are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
        }

        /**
         * <p>The ID of the region. Default value: <code>cn-hangzhou</code>.</p>
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

        @Override
        public SearchAlertContactGroupRequest build() {
            return new SearchAlertContactGroupRequest(this);
        } 

    } 

}
