// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ExportVulRequest} extends {@link RequestModel}
 *
 * <p>ExportVulRequest</p>
 */
public class ExportVulRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachTypes")
    private String attachTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTsEnd")
    private Long createTsEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTsStart")
    private Long createTsStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CveId")
    private String cveId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchTags")
    private String searchTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcInstanceIds")
    private String vpcInstanceIds;

    private ExportVulRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.attachTypes = builder.attachTypes;
        this.containerName = builder.containerName;
        this.createTsEnd = builder.createTsEnd;
        this.createTsStart = builder.createTsStart;
        this.cveId = builder.cveId;
        this.dealed = builder.dealed;
        this.groupId = builder.groupId;
        this.imageName = builder.imageName;
        this.lang = builder.lang;
        this.necessity = builder.necessity;
        this.path = builder.path;
        this.searchTags = builder.searchTags;
        this.type = builder.type;
        this.uuids = builder.uuids;
        this.vpcInstanceIds = builder.vpcInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportVulRequest create() {
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
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return createTsEnd
     */
    public Long getCreateTsEnd() {
        return this.createTsEnd;
    }

    /**
     * @return createTsStart
     */
    public Long getCreateTsStart() {
        return this.createTsStart;
    }

    /**
     * @return cveId
     */
    public String getCveId() {
        return this.cveId;
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return searchTags
     */
    public String getSearchTags() {
        return this.searchTags;
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

    public static final class Builder extends Request.Builder<ExportVulRequest, Builder> {
        private String aliasName; 
        private String attachTypes; 
        private String containerName; 
        private Long createTsEnd; 
        private Long createTsStart; 
        private String cveId; 
        private String dealed; 
        private String groupId; 
        private String imageName; 
        private String lang; 
        private String necessity; 
        private String path; 
        private String searchTags; 
        private String type; 
        private String uuids; 
        private String vpcInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(ExportVulRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.attachTypes = request.attachTypes;
            this.containerName = request.containerName;
            this.createTsEnd = request.createTsEnd;
            this.createTsStart = request.createTsStart;
            this.cveId = request.cveId;
            this.dealed = request.dealed;
            this.groupId = request.groupId;
            this.imageName = request.imageName;
            this.lang = request.lang;
            this.necessity = request.necessity;
            this.path = request.path;
            this.searchTags = request.searchTags;
            this.type = request.type;
            this.uuids = request.uuids;
            this.vpcInstanceIds = request.vpcInstanceIds;
        } 

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2019:3197-Important: sudo security update</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The additional type of the vulnerabilities. You need to specify this parameter when you query application vulnerabilities. If you set the Type parameter to app, you must specify this parameter. Set the value to <strong>sca</strong>.</p>
         * <blockquote>
         * <p>If this parameter is set to <strong>sca</strong>, <strong>application vulnerabilities</strong> and the <strong>vulnerabilities that are detected based on software component analysis</strong> are queried. If you do not specify this parameter, only application vulnerabilities are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        public Builder attachTypes(String attachTypes) {
            this.putQueryParameter("AttachTypes", attachTypes);
            this.attachTypes = attachTypes;
            return this;
        }

        /**
         * <p>The name of the container that is affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-7b87597b99-mcskr</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>The end time of the first scan.</p>
         * <blockquote>
         * <p> This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1696186800000</p>
         */
        public Builder createTsEnd(Long createTsEnd) {
            this.putQueryParameter("CreateTsEnd", createTsEnd);
            this.createTsEnd = createTsEnd;
            return this;
        }

        /**
         * <p>The start time of the first scan.</p>
         * <blockquote>
         * <p> This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1696128144000</p>
         */
        public Builder createTsStart(Long createTsStart) {
            this.putQueryParameter("CreateTsStart", createTsStart);
            this.createTsStart = createTsStart;
            return this;
        }

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2022-44702</p>
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * <p>Specifies whether the vulnerability is fixed. Valid values:</p>
         * <ul>
         * <li><strong>y</strong>: The vulnerability is fixed.</li>
         * <li><strong>n</strong>: The vulnerability is not fixed.</li>
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
         * <p>The server group ID of the server on which the vulnerabilities are detected.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8834224</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the image that is affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>container-<em><strong>:</strong></em>*</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
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
         * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high</li>
         * <li><strong>later</strong>: medium</li>
         * <li><strong>nntf</strong>: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * <p>The path of the process that is affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/test</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The tag that is used to search for the vulnerabilities. Valid values:</p>
         * <ul>
         * <li>Restart required</li>
         * <li>Remote exploitation</li>
         * <li>Exploit exists</li>
         * <li>Exploitable</li>
         * <li>Privilege escalation</li>
         * <li>Code execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Restart required</p>
         */
        public Builder searchTags(String searchTags) {
            this.putQueryParameter("SearchTags", searchTags);
            this.searchTags = searchTags;
            return this;
        }

        /**
         * <p>The type of the vulnerability that you want to export. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUID of the server on which the vulnerabilities are detected. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1587bedb-fdb4-48c4-9330-****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to query the IDs of VPCs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ins-133****,ins-5414****</p>
         */
        public Builder vpcInstanceIds(String vpcInstanceIds) {
            this.putQueryParameter("VpcInstanceIds", vpcInstanceIds);
            this.vpcInstanceIds = vpcInstanceIds;
            return this;
        }

        @Override
        public ExportVulRequest build() {
            return new ExportVulRequest(this);
        } 

    } 

}
