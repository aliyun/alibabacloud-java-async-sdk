// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVulnerabilitiesRequest} extends {@link RequestModel}
 *
 * <p>ListVulnerabilitiesRequest</p>
 */
public class ListVulnerabilitiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Department")
    private String department;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevTag")
    private String devTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevType")
    private String devType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanTaskId")
    private String scanTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateIds")
    private java.util.List<String> updateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulLevel")
    private String vulLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulType")
    private String vulType;

    private ListVulnerabilitiesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.department = builder.department;
        this.devTag = builder.devTag;
        this.devType = builder.devType;
        this.hostname = builder.hostname;
        this.pageSize = builder.pageSize;
        this.saseUserId = builder.saseUserId;
        this.scanTaskId = builder.scanTaskId;
        this.title = builder.title;
        this.updateIds = builder.updateIds;
        this.username = builder.username;
        this.vulLevel = builder.vulLevel;
        this.vulType = builder.vulType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVulnerabilitiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return devType
     */
    public String getDevType() {
        return this.devType;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    /**
     * @return scanTaskId
     */
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateIds
     */
    public java.util.List<String> getUpdateIds() {
        return this.updateIds;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return vulLevel
     */
    public String getVulLevel() {
        return this.vulLevel;
    }

    /**
     * @return vulType
     */
    public String getVulType() {
        return this.vulType;
    }

    public static final class Builder extends Request.Builder<ListVulnerabilitiesRequest, Builder> {
        private Long currentPage; 
        private String department; 
        private String devTag; 
        private String devType; 
        private String hostname; 
        private Long pageSize; 
        private String saseUserId; 
        private String scanTaskId; 
        private String title; 
        private java.util.List<String> updateIds; 
        private String username; 
        private String vulLevel; 
        private String vulType; 

        private Builder() {
            super();
        } 

        private Builder(ListVulnerabilitiesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.department = request.department;
            this.devTag = request.devTag;
            this.devType = request.devType;
            this.hostname = request.hostname;
            this.pageSize = request.pageSize;
            this.saseUserId = request.saseUserId;
            this.scanTaskId = request.scanTaskId;
            this.title = request.title;
            this.updateIds = request.updateIds;
            this.username = request.username;
            this.vulLevel = request.vulLevel;
            this.vulType = request.vulType;
        } 

        /**
         * <p>The page number of the current page in a paged query with paging. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The department name. Matches any level of department in the organizational structure to which the user belongs. Specify the department name itself without the full path of the organizational structure.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        public Builder department(String department) {
            this.putQueryParameter("Department", department);
            this.department = department;
            return this;
        }

        /**
         * <p>The unique identifier of the user endpoint device. Exact match. The value can be up to 64 characters in length. Valid values are obtained from:</p>
         * <ul>
         * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: lists user endpoint devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder devTag(String devTag) {
            this.putQueryParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * <p>The operating system type of the user endpoint device. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows. Currently, vulnerability scanning supports only Windows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder devType(String devType) {
            this.putQueryParameter("DevType", devType);
            this.devType = devType;
            return this;
        }

        /**
         * <p>The hostname of the user endpoint device. Fuzzy match is supported. The value can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP-8A3F</p>
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>The number of entries per page. Settings for paged query with paging. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The user ID. Exact match. Valid values are obtained from:</p>
         * <ul>
         * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: lists user endpoint devices.</li>
         * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: queries the details of a user endpoint device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        public Builder saseUserId(String saseUserId) {
            this.putQueryParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * <p>The ID of the vulnerability scanning node that detected the vulnerability. Used to filter detection results of a specified node. Valid values are obtained from:</p>
         * <ul>
         * <li><a href="~~ListVulScanTasks~~">ListVulScanTasks</a>: lists vulnerability scanning nodes.</li>
         * <li><a href="~~CreateVulScanTask~~">CreateVulScanTask</a>: creates a vulnerability scanning node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vul-scan-task-4d7b1e9a6c38****</p>
         */
        public Builder scanTaskId(String scanTaskId) {
            this.putQueryParameter("ScanTaskId", scanTaskId);
            this.scanTaskId = scanTaskId;
            return this;
        }

        /**
         * <p>The vulnerability title. Fuzzy match is supported. Matches both Chinese and English titles.</p>
         * 
         * <strong>example:</strong>
         * <p>Cumulative Update</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The patch IDs used for filtering. A maximum of 100 IDs can be specified. Duplicate values are not allowed.</p>
         */
        public Builder updateIds(java.util.List<String> updateIds) {
            this.putQueryParameter("UpdateIds", updateIds);
            this.updateIds = updateIds;
            return this;
        }

        /**
         * <p>The username. Fuzzy match is supported. The value can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), asterisks (*), hyphens (-), at signs (@), spaces, middle dots (·), and parentheses.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The vulnerability risk level used for filtering. Valid values:</p>
         * <ul>
         * <li><strong>High</strong>: high risk.</li>
         * <li><strong>Mid</strong>: medium risk.</li>
         * <li><strong>Low</strong>: low risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        public Builder vulLevel(String vulLevel) {
            this.putQueryParameter("VulLevel", vulLevel);
            this.vulLevel = vulLevel;
            return this;
        }

        /**
         * <p>The vulnerability type used for filtering. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows system vulnerability.</li>
         * <li><strong>ai_agent</strong>: AI Agent vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        public Builder vulType(String vulType) {
            this.putQueryParameter("VulType", vulType);
            this.vulType = vulType;
            return this;
        }

        @Override
        public ListVulnerabilitiesRequest build() {
            return new ListVulnerabilitiesRequest(this);
        } 

    } 

}
