// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemWarningMachineRequest} extends {@link RequestModel}
 *
 * <p>ListCheckItemWarningMachineRequest</p>
 */
public class ListCheckItemWarningMachineRequest extends Request {
    @Query
    @NameInMap("CheckId")
    @Validation(required = true)
    private Long checkId;

    @Query
    @NameInMap("ContainerFieldName")
    private String containerFieldName;

    @Query
    @NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("RiskType")
    @Validation(required = true)
    private String riskType;

    @Query
    @NameInMap("Status")
    private Integer status;

    private ListCheckItemWarningMachineRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.groupId = builder.groupId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.riskType = builder.riskType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckItemWarningMachineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    /**
     * @return containerFieldValue
     */
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return riskType
     */
    public String getRiskType() {
        return this.riskType;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCheckItemWarningMachineRequest, Builder> {
        private Long checkId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Integer currentPage; 
        private Long groupId; 
        private String lang; 
        private Integer pageSize; 
        private String remark; 
        private String riskType; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckItemWarningMachineRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.groupId = request.groupId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.riskType = request.riskType;
            this.status = request.status;
        } 

        /**
         * The ID of the check item.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The name of the field that is used to query containers.
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The value of the field that is used to query containers.
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the asset group.
         * <p>
         * 
         * > You can call the [DescribeAllGroups](~~130972~~) operation to query the ID of the asset group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The keyword that is used to query servers in fuzzy match mode.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The type of the check item.
         */
        public Builder riskType(String riskType) {
            this.putQueryParameter("RiskType", riskType);
            this.riskType = riskType;
            return this;
        }

        /**
         * The status of the check item. Valid values:
         * <p>
         * 
         * *   1: failed
         * 
         * *   2: verifying
         * 
         * *   3: passed
         * 
         * *   6: ignored
         * 
         * *   7: fixing
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCheckItemWarningMachineRequest build() {
            return new ListCheckItemWarningMachineRequest(this);
        } 

    } 

}
