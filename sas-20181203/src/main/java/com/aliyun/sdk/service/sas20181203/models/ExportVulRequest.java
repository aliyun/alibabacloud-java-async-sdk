// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportVulRequest} extends {@link RequestModel}
 *
 * <p>ExportVulRequest</p>
 */
public class ExportVulRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("AttachTypes")
    private String attachTypes;

    @Query
    @NameInMap("ContainerName")
    private String containerName;

    @Query
    @NameInMap("CreateTsEnd")
    private Long createTsEnd;

    @Query
    @NameInMap("CreateTsStart")
    private Long createTsStart;

    @Query
    @NameInMap("CveId")
    private String cveId;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Necessity")
    private String necessity;

    @Query
    @NameInMap("Path")
    private String path;

    @Query
    @NameInMap("SearchTags")
    private String searchTags;

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
         * The name of the vulnerability.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The additional type of the vulnerabilities. You need to specify this parameter when you query application vulnerabilities. If you set the Type parameter to app, you must specify this parameter. Set the value to **sca**.
         * <p>
         * 
         * > If this parameter is set to **sca**, **application vulnerabilities** and the **vulnerabilities that are detected based on software component analysis** are queried. If you do not specify this parameter, only application vulnerabilities are queried.
         */
        public Builder attachTypes(String attachTypes) {
            this.putQueryParameter("AttachTypes", attachTypes);
            this.attachTypes = attachTypes;
            return this;
        }

        /**
         * The name of the container that is affected by the vulnerability.
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * The end time of the first scan.
         * <p>
         * 
         * >  This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTsEnd(Long createTsEnd) {
            this.putQueryParameter("CreateTsEnd", createTsEnd);
            this.createTsEnd = createTsEnd;
            return this;
        }

        /**
         * The start time of the first scan.
         * <p>
         * 
         * >  This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTsStart(Long createTsStart) {
            this.putQueryParameter("CreateTsStart", createTsStart);
            this.createTsStart = createTsStart;
            return this;
        }

        /**
         * The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.
         */
        public Builder cveId(String cveId) {
            this.putQueryParameter("CveId", cveId);
            this.cveId = cveId;
            return this;
        }

        /**
         * Specifies whether the vulnerability is fixed. Valid values:
         * <p>
         * 
         * *   **y**: The vulnerability is fixed.
         * *   **n**: The vulnerability is not fixed.
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The server group ID of the server on which the vulnerabilities are detected.
         * <p>
         * 
         * > You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the image that is affected by the vulnerability.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:
         * <p>
         * 
         * *   **asap**: high
         * *   **later**: medium
         * *   **nntf**: low
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * The path of the process that is affected by the vulnerability.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * The tag that is used to search for the vulnerabilities. Valid values:
         * <p>
         * 
         * *   Restart required
         * *   Remote exploitation
         * *   Exploit exists
         * *   Exploitable
         * *   Privilege escalation
         * *   Code execution
         */
        public Builder searchTags(String searchTags) {
            this.putQueryParameter("SearchTags", searchTags);
            this.searchTags = searchTags;
            return this;
        }

        /**
         * The type of the vulnerability that you want to export. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability
         * *   **sys**: Windows system vulnerability
         * *   **cms**: Web-CMS vulnerability
         * *   **app**: application vulnerability
         * *   **emg**: urgent vulnerability
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUID of the server on which the vulnerabilities are detected. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeVpcList](~~DescribeVpcList~~) operation to query the IDs of VPCs.
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
