// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUuidsByVulNamesRequest} extends {@link RequestModel}
 *
 * <p>DescribeUuidsByVulNamesRequest</p>
 */
public class DescribeUuidsByVulNamesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldName")
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchTags")
    private String searchTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private String statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcInstanceIds")
    private String vpcInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulNames")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether the vulnerability is fixed. Valid values:</p>
         * <ul>
         * <li><strong>y</strong>: the vulnerability is fixed.</li>
         * <li><strong>n</strong>: the vulnerability is not fixed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>n</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The name of the search field that is used to query containers.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>The value of the search field that is used to query containers.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-adad-qeqwe</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>11286014</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The severity of the vulnerability. Separate multiple severities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high,low</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The priority based on which the vulnerability is fixed. Separate multiple priorities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high</li>
         * <li><strong>later</strong>: medium</li>
         * <li><strong>nntf</strong>: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap,later,nntf</p>
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.7.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The tags that are used to search for the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval</p>
         */
        public Builder searchTags(String searchTags) {
            this.putQueryParameter("SearchTags", searchTags);
            this.searchTags = searchTags;
            return this;
        }

        /**
         * <p>The status of the vulnerability. Separate multiple states with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: unfixed</li>
         * <li><strong>2</strong>: fix failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,4</p>
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The tag of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The type of the query condition. Valid values:</p>
         * <ul>
         * <li><strong>containerId</strong>: the ID of the container</li>
         * <li><strong>uuid</strong>: the ID of the asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the vulnerability is detected. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6ssrvbrwe37ekw****,vpc-bp1aevy8sofi8mh1q****</p>
         */
        public Builder vpcInstanceIds(String vpcInstanceIds) {
            this.putQueryParameter("VpcInstanceIds", vpcInstanceIds);
            this.vpcInstanceIds = vpcInstanceIds;
            return this;
        }

        /**
         * <p>An array that consists of the names of vulnerabilities.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedVul~~">DescribeGroupedVul</a> operation to obtain the names of vulnerabilities.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
