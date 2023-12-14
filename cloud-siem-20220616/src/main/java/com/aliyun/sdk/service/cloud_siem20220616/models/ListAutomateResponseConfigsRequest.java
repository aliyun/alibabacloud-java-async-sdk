// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutomateResponseConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListAutomateResponseConfigsRequest</p>
 */
public class ListAutomateResponseConfigsRequest extends Request {
    @Body
    @NameInMap("ActionType")
    private String actionType;

    @Body
    @NameInMap("AutoResponseType")
    private String autoResponseType;

    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("PlaybookUuid")
    private String playbookUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RuleName")
    private String ruleName;

    @Body
    @NameInMap("Status")
    private Integer status;

    @Body
    @NameInMap("SubUserId")
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
            this.ruleName = request.ruleName;
            this.status = request.status;
            this.subUserId = request.subUserId;
        } 

        /**
         * The type of the handling action. Valid values:
         * <p>
         * 
         * *   doPlaybook: runs a playbook.
         * *   changeEventStatus: changes the status of an event.
         * *   changeThreatLevel: changes the risk level of an event.
         */
        public Builder actionType(String actionType) {
            this.putBodyParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * The type of the automated response rule. Valid values:
         * <p>
         * 
         * *   event
         * *   alert
         */
        public Builder autoResponseType(String autoResponseType) {
            this.putBodyParameter("AutoResponseType", autoResponseType);
            this.autoResponseType = autoResponseType;
            return this;
        }

        /**
         * The page number. Pages start from page 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the automated response rule.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The UUID of the playbook.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the automated response rule.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The status of the rule. Valid values:
         * <p>
         * 
         * *   0: disabled
         * *   100: enabled
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the user who created the rule.
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
