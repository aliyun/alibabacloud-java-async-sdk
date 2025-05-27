// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListAutomateResponseConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListAutomateResponseConfigsRequest</p>
 */
public class ListAutomateResponseConfigsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoResponseType")
    private String autoResponseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    private Long subUserId;

    private ListAutomateResponseConfigsRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.autoResponseType = builder.autoResponseType;
        this.currentPage = builder.currentPage;
        this.id = builder.id;
        this.pageSize = builder.pageSize;
        this.playbookUuid = builder.playbookUuid;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.ruleName = builder.ruleName;
        this.status = builder.status;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutomateResponseConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return autoResponseType
     */
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<ListAutomateResponseConfigsRequest, Builder> {
        private String actionType; 
        private String autoResponseType; 
        private Integer currentPage; 
        private Long id; 
        private Integer pageSize; 
        private String playbookUuid; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String ruleName; 
        private Integer status; 
        private Long subUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListAutomateResponseConfigsRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.autoResponseType = request.autoResponseType;
            this.currentPage = request.currentPage;
            this.id = request.id;
            this.pageSize = request.pageSize;
            this.playbookUuid = request.playbookUuid;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.ruleName = request.ruleName;
            this.status = request.status;
            this.subUserId = request.subUserId;
        } 

        /**
         * <p>The type of the handling action. Valid values:</p>
         * <ul>
         * <li>doPlaybook: runs a playbook.</li>
         * <li>changeEventStatus: changes the status of an event.</li>
         * <li>changeThreatLevel: changes the risk level of an event.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>doPlaybook</p>
         */
        public Builder actionType(String actionType) {
            this.putBodyParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>The type of the automated response rule. Valid values:</p>
         * <ul>
         * <li>event</li>
         * <li>alert</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>event</p>
         */
        public Builder autoResponseType(String autoResponseType) {
            this.putBodyParameter("AutoResponseType", autoResponseType);
            this.autoResponseType = autoResponseType;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>system_aliyun_aegis_kill_quara_book</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The name of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw kill quara book</p>
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>100: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the user who created the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>17108579417****</p>
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public ListAutomateResponseConfigsRequest build() {
            return new ListAutomateResponseConfigsRequest(this);
        } 

    } 

}
