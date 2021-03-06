// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUuidsByVulNamesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUuidsByVulNamesRequest</p>
 */
public class DescribeUuidsByVulNamesRequest extends Request {
    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("FieldName")
    private String fieldName;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("Necessity")
    private String necessity;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SearchTags")
    private String searchTags;

    @Query
    @NameInMap("StatusList")
    private String statusList;

    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("TargetType")
    private String targetType;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("VpcInstanceIds")
    private String vpcInstanceIds;

    @Query
    @NameInMap("VulNames")
    @Validation(required = true)
    private java.util.List < String > vulNames;

    private DescribeUuidsByVulNamesRequest(Builder builder) {
        super(builder);
        this.dealed = builder.dealed;
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.level = builder.level;
        this.necessity = builder.necessity;
        this.remark = builder.remark;
        this.searchTags = builder.searchTags;
        this.statusList = builder.statusList;
        this.tag = builder.tag;
        this.targetType = builder.targetType;
        this.type = builder.type;
        this.vpcInstanceIds = builder.vpcInstanceIds;
        this.vulNames = builder.vulNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUuidsByVulNamesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return searchTags
     */
    public String getSearchTags() {
        return this.searchTags;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vpcInstanceIds
     */
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

    /**
     * @return vulNames
     */
    public java.util.List < String > getVulNames() {
        return this.vulNames;
    }

    public static final class Builder extends Request.Builder<DescribeUuidsByVulNamesRequest, Builder> {
        private String dealed; 
        private String fieldName; 
        private String fieldValue; 
        private Long groupId; 
        private String lang; 
        private String level; 
        private String necessity; 
        private String remark; 
        private String searchTags; 
        private String statusList; 
        private String tag; 
        private String targetType; 
        private String type; 
        private String vpcInstanceIds; 
        private java.util.List < String > vulNames; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUuidsByVulNamesRequest request) {
            super(request);
            this.dealed = request.dealed;
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.level = request.level;
            this.necessity = request.necessity;
            this.remark = request.remark;
            this.searchTags = request.searchTags;
            this.statusList = request.statusList;
            this.tag = request.tag;
            this.targetType = request.targetType;
            this.type = request.type;
            this.vpcInstanceIds = request.vpcInstanceIds;
            this.vulNames = request.vulNames;
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
         * FieldName.
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * FieldValue.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
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
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * SearchTags.
         */
        public Builder searchTags(String searchTags) {
            this.putQueryParameter("SearchTags", searchTags);
            this.searchTags = searchTags;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
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
         * VpcInstanceIds.
         */
        public Builder vpcInstanceIds(String vpcInstanceIds) {
            this.putQueryParameter("VpcInstanceIds", vpcInstanceIds);
            this.vpcInstanceIds = vpcInstanceIds;
            return this;
        }

        /**
         * VulNames.
         */
        public Builder vulNames(java.util.List < String > vulNames) {
            this.putQueryParameter("VulNames", vulNames);
            this.vulNames = vulNames;
            return this;
        }

        @Override
        public DescribeUuidsByVulNamesRequest build() {
            return new DescribeUuidsByVulNamesRequest(this);
        } 

    } 

}
