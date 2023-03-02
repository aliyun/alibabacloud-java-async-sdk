// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemindsRequest} extends {@link RequestModel}
 *
 * <p>ListRemindsRequest</p>
 */
public class ListRemindsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AlertTarget")
    private String alertTarget;

    @Body
    @NameInMap("Founder")
    private String founder;

    @Body
    @NameInMap("NodeId")
    private Long nodeId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("RemindTypes")
    private String remindTypes;

    @Body
    @NameInMap("SearchText")
    private String searchText;

    private ListRemindsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertTarget = builder.alertTarget;
        this.founder = builder.founder;
        this.nodeId = builder.nodeId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remindTypes = builder.remindTypes;
        this.searchText = builder.searchText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemindsRequest create() {
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
     * @return alertTarget
     */
    public String getAlertTarget() {
        return this.alertTarget;
    }

    /**
     * @return founder
     */
    public String getFounder() {
        return this.founder;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remindTypes
     */
    public String getRemindTypes() {
        return this.remindTypes;
    }

    /**
     * @return searchText
     */
    public String getSearchText() {
        return this.searchText;
    }

    public static final class Builder extends Request.Builder<ListRemindsRequest, Builder> {
        private String regionId; 
        private String alertTarget; 
        private String founder; 
        private Long nodeId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remindTypes; 
        private String searchText; 

        private Builder() {
            super();
        } 

        private Builder(ListRemindsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertTarget = request.alertTarget;
            this.founder = request.founder;
            this.nodeId = request.nodeId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remindTypes = request.remindTypes;
            this.searchText = request.searchText;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is used to receive alert notifications.
         */
        public Builder alertTarget(String alertTarget) {
            this.putBodyParameter("AlertTarget", alertTarget);
            this.alertTarget = alertTarget;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is used to create the custom alert rules.
         */
        public Builder founder(String founder) {
            this.putBodyParameter("Founder", founder);
            this.founder = founder;
            return this;
        }

        /**
         * The ID of the node to which the custom alert rules are applied. You can use the ID to search for the custom alert rules that are applied to the node.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The number of the page to return. Valid values: 1 to 30. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The conditions that trigger an alert for the node. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT. The value FINISHED indicates that the node finishes running. The value UNFINISHED indicates that the node is still running at the specified point in time. The value ERROR indicates that an error occurs when the node is running. The value CYCLE_UNFINISHED indicates that the node does not finish running in the specified scheduling cycle. The value TIMEOUT indicates that the node times out. You can specify multiple conditions for a custom alert rule. If you specify multiple condition, separate them with commas (,).
         */
        public Builder remindTypes(String remindTypes) {
            this.putBodyParameter("RemindTypes", remindTypes);
            this.remindTypes = remindTypes;
            return this;
        }

        /**
         * The keyword in a rule name that is used to search for the rule. Fuzzy search is supported.
         */
        public Builder searchText(String searchText) {
            this.putBodyParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        @Override
        public ListRemindsRequest build() {
            return new ListRemindsRequest(this);
        } 

    } 

}
