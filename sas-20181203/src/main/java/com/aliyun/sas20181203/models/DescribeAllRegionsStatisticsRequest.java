// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAllRegionsStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllRegionsStatisticsRequest</p>
 */
public class DescribeAllRegionsStatisticsRequest extends Request {
    @Query
    @NameInMap("Action1")
    private Integer action1;

    @Query
    @NameInMap("AllRegion")
    private Boolean allRegion;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Flow")
    private Integer flow;

    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("RuleType")
    private Integer ruleType;

    @Query
    @NameInMap("SaleId")
    private String saleId;

    @Query
    @NameInMap("SecureToken")
    private String secureToken;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("StatusList")
    private String statusList;

    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    @Query
    @NameInMap("WebGroupId")
    private Long webGroupId;


    private DescribeAllRegionsStatisticsRequest(Builder builder) {
        super(builder);
        this.action1 = builder.action1;
        this.allRegion = builder.allRegion;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.endTime = builder.endTime;
        this.flow = builder.flow;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.ruleType = builder.ruleType;
        this.saleId = builder.saleId;
        this.secureToken = builder.secureToken;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.statusList = builder.statusList;
        this.tag = builder.tag;
        this.type = builder.type;
        this.uuid = builder.uuid;
        this.webGroupId = builder.webGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllRegionsStatisticsRequest create() {
        return builder().build();
    }

    /**
     * @return action1
     */
    public Integer getAction1() {
        return this.action1;
    }

    /**
     * @return allRegion
     */
    public Boolean getAllRegion() {
        return this.allRegion;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return flow
     */
    public Integer getFlow() {
        return this.flow;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
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
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return saleId
     */
    public String getSaleId() {
        return this.saleId;
    }

    /**
     * @return secureToken
     */
    public String getSecureToken() {
        return this.secureToken;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return webGroupId
     */
    public Long getWebGroupId() {
        return this.webGroupId;
    }

    public static final class Builder extends Request.Builder {
        private Integer action1; 
        private Boolean allRegion; 
        private Integer currentPage; 
        private String dealed; 
        private String endTime; 
        private Integer flow; 
        private String from; 
        private Long groupId; 
        private Integer pageSize; 
        private String remark; 
        private Integer ruleType; 
        private String saleId; 
        private String secureToken; 
        private String sourceIp; 
        private String startTime; 
        private Integer status; 
        private String statusList; 
        private String tag; 
        private String type; 
        private String uuid; 
        private Long webGroupId; 

        /**
         * <p>Action1.</p>
         */
        public Builder action1(Integer action1) {
            this.putQueryParameter("Action1", action1);
            this.action1 = action1;
            return this;
        }

        /**
         * <p>AllRegion.</p>
         */
        public Builder allRegion(Boolean allRegion) {
            this.putQueryParameter("AllRegion", allRegion);
            this.allRegion = allRegion;
            return this;
        }

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Dealed.</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>EndTime.</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Flow.</p>
         */
        public Builder flow(Integer flow) {
            this.putQueryParameter("Flow", flow);
            this.flow = flow;
            return this;
        }

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>GroupId.</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Remark.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>RuleType.</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>SaleId.</p>
         */
        public Builder saleId(String saleId) {
            this.putQueryParameter("SaleId", saleId);
            this.saleId = saleId;
            return this;
        }

        /**
         * <p>SecureToken.</p>
         */
        public Builder secureToken(String secureToken) {
            this.putQueryParameter("SecureToken", secureToken);
            this.secureToken = secureToken;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>StartTime.</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>StatusList.</p>
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>Tag.</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Type.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * <p>WebGroupId.</p>
         */
        public Builder webGroupId(Long webGroupId) {
            this.putQueryParameter("WebGroupId", webGroupId);
            this.webGroupId = webGroupId;
            return this;
        }

        public DescribeAllRegionsStatisticsRequest build() {
            return new DescribeAllRegionsStatisticsRequest(this);
        } 

    } 

}
