// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceGroupsRequest</p>
 */
public class ListDeviceGroupsRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("DeviceCodeList")
    private String deviceCodeList;

    @Body
    @NameInMap("Group")
    private String group;

    @Body
    @NameInMap("IsPage")
    @Validation(required = true)
    private Integer isPage;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListDeviceGroupsRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.dataSourceType = builder.dataSourceType;
        this.deviceCodeList = builder.deviceCodeList;
        this.group = builder.group;
        this.isPage = builder.isPage;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdList
     */
    public String getCorpIdList() {
        return this.corpIdList;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return deviceCodeList
     */
    public String getDeviceCodeList() {
        return this.deviceCodeList;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return isPage
     */
    public Integer getIsPage() {
        return this.isPage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDeviceGroupsRequest, Builder> {
        private String corpIdList; 
        private String dataSourceType; 
        private String deviceCodeList; 
        private String group; 
        private Integer isPage; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceGroupsRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.dataSourceType = response.dataSourceType;
            this.deviceCodeList = response.deviceCodeList;
            this.group = response.group;
            this.isPage = response.isPage;
            this.name = response.name;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
        } 

        /**
         * CorpIdList.
         */
        public Builder corpIdList(String corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DeviceCodeList.
         */
        public Builder deviceCodeList(String deviceCodeList) {
            this.putBodyParameter("DeviceCodeList", deviceCodeList);
            this.deviceCodeList = deviceCodeList;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putBodyParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * IsPage.
         */
        public Builder isPage(Integer isPage) {
            this.putBodyParameter("IsPage", isPage);
            this.isPage = isPage;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDeviceGroupsRequest build() {
            return new ListDeviceGroupsRequest(this);
        } 

    } 

}
