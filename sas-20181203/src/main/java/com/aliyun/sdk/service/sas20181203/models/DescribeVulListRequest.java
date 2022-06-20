// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulListRequest</p>
 */
public class DescribeVulListRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("AttachTypes")
    private String attachTypes;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Necessity")
    private String necessity;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    @Query
    @NameInMap("VpcInstanceIds")
    private String vpcInstanceIds;

    private DescribeVulListRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.attachTypes = builder.attachTypes;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.name = builder.name;
        this.necessity = builder.necessity;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.type = builder.type;
        this.uuids = builder.uuids;
        this.vpcInstanceIds = builder.vpcInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return attachTypes
     */
    public String getAttachTypes() {
        return this.attachTypes;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    /**
     * @return vpcInstanceIds
     */
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

    public static final class Builder extends Request.Builder<DescribeVulListRequest, Builder> {
        private String aliasName; 
        private String attachTypes; 
        private Integer currentPage; 
        private String dealed; 
        private String groupId; 
        private String lang; 
        private String name; 
        private String necessity; 
        private Integer pageSize; 
        private String remark; 
        private String type; 
        private String uuids; 
        private String vpcInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulListRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.attachTypes = request.attachTypes;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.name = request.name;
            this.necessity = request.necessity;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.type = request.type;
            this.uuids = request.uuids;
            this.vpcInstanceIds = request.vpcInstanceIds;
        } 

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * AttachTypes.
         */
        public Builder attachTypes(String attachTypes) {
            this.putQueryParameter("AttachTypes", attachTypes);
            this.attachTypes = attachTypes;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Dealed.
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Necessity.
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * VpcInstanceIds.
         */
        public Builder vpcInstanceIds(String vpcInstanceIds) {
            this.putQueryParameter("VpcInstanceIds", vpcInstanceIds);
            this.vpcInstanceIds = vpcInstanceIds;
            return this;
        }

        @Override
        public DescribeVulListRequest build() {
            return new DescribeVulListRequest(this);
        } 

    } 

}
