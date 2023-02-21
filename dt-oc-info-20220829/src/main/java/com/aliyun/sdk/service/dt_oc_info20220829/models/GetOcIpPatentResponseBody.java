// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpPatentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIpPatentResponseBody</p>
 */
public class GetOcIpPatentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcIpPatentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcIpPatentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcIpPatentResponseBody build() {
            return new GetOcIpPatentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Agency")
        private String agency;

        @NameInMap("Agent")
        private String agent;

        @NameInMap("Brief")
        private String brief;

        @NameInMap("CateNum")
        private String cateNum;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("InventorList")
        private String inventorList;

        @NameInMap("MainClaim")
        private String mainClaim;

        @NameInMap("PatentName")
        private String patentName;

        @NameInMap("PatentStatus")
        private String patentStatus;

        @NameInMap("PatentType")
        private String patentType;

        @NameInMap("PatenteeList")
        private String patenteeList;

        @NameInMap("PrioDate")
        private String prioDate;

        @NameInMap("PrioNum")
        private String prioNum;

        @NameInMap("PublicDate")
        private String publicDate;

        @NameInMap("PublicNum")
        private String publicNum;

        @NameInMap("RequestDate")
        private String requestDate;

        @NameInMap("RequestNum")
        private String requestNum;

        private Data(Builder builder) {
            this.agency = builder.agency;
            this.agent = builder.agent;
            this.brief = builder.brief;
            this.cateNum = builder.cateNum;
            this.entName = builder.entName;
            this.inventorList = builder.inventorList;
            this.mainClaim = builder.mainClaim;
            this.patentName = builder.patentName;
            this.patentStatus = builder.patentStatus;
            this.patentType = builder.patentType;
            this.patenteeList = builder.patenteeList;
            this.prioDate = builder.prioDate;
            this.prioNum = builder.prioNum;
            this.publicDate = builder.publicDate;
            this.publicNum = builder.publicNum;
            this.requestDate = builder.requestDate;
            this.requestNum = builder.requestNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agency
         */
        public String getAgency() {
            return this.agency;
        }

        /**
         * @return agent
         */
        public String getAgent() {
            return this.agent;
        }

        /**
         * @return brief
         */
        public String getBrief() {
            return this.brief;
        }

        /**
         * @return cateNum
         */
        public String getCateNum() {
            return this.cateNum;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return inventorList
         */
        public String getInventorList() {
            return this.inventorList;
        }

        /**
         * @return mainClaim
         */
        public String getMainClaim() {
            return this.mainClaim;
        }

        /**
         * @return patentName
         */
        public String getPatentName() {
            return this.patentName;
        }

        /**
         * @return patentStatus
         */
        public String getPatentStatus() {
            return this.patentStatus;
        }

        /**
         * @return patentType
         */
        public String getPatentType() {
            return this.patentType;
        }

        /**
         * @return patenteeList
         */
        public String getPatenteeList() {
            return this.patenteeList;
        }

        /**
         * @return prioDate
         */
        public String getPrioDate() {
            return this.prioDate;
        }

        /**
         * @return prioNum
         */
        public String getPrioNum() {
            return this.prioNum;
        }

        /**
         * @return publicDate
         */
        public String getPublicDate() {
            return this.publicDate;
        }

        /**
         * @return publicNum
         */
        public String getPublicNum() {
            return this.publicNum;
        }

        /**
         * @return requestDate
         */
        public String getRequestDate() {
            return this.requestDate;
        }

        /**
         * @return requestNum
         */
        public String getRequestNum() {
            return this.requestNum;
        }

        public static final class Builder {
            private String agency; 
            private String agent; 
            private String brief; 
            private String cateNum; 
            private String entName; 
            private String inventorList; 
            private String mainClaim; 
            private String patentName; 
            private String patentStatus; 
            private String patentType; 
            private String patenteeList; 
            private String prioDate; 
            private String prioNum; 
            private String publicDate; 
            private String publicNum; 
            private String requestDate; 
            private String requestNum; 

            /**
             * 专利代理机构
             */
            public Builder agency(String agency) {
                this.agency = agency;
                return this;
            }

            /**
             * 代理人
             */
            public Builder agent(String agent) {
                this.agent = agent;
                return this;
            }

            /**
             * 简要说明
             */
            public Builder brief(String brief) {
                this.brief = brief;
                return this;
            }

            /**
             * 分类号
             */
            public Builder cateNum(String cateNum) {
                this.cateNum = cateNum;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 发明人
             */
            public Builder inventorList(String inventorList) {
                this.inventorList = inventorList;
                return this;
            }

            /**
             * 主权项
             */
            public Builder mainClaim(String mainClaim) {
                this.mainClaim = mainClaim;
                return this;
            }

            /**
             * 专利名
             */
            public Builder patentName(String patentName) {
                this.patentName = patentName;
                return this;
            }

            /**
             * 专利状态
             */
            public Builder patentStatus(String patentStatus) {
                this.patentStatus = patentStatus;
                return this;
            }

            /**
             * 专利类型
             */
            public Builder patentType(String patentType) {
                this.patentType = patentType;
                return this;
            }

            /**
             * 专利权人
             */
            public Builder patenteeList(String patenteeList) {
                this.patenteeList = patenteeList;
                return this;
            }

            /**
             * 优先权日
             */
            public Builder prioDate(String prioDate) {
                this.prioDate = prioDate;
                return this;
            }

            /**
             * 优先权号
             */
            public Builder prioNum(String prioNum) {
                this.prioNum = prioNum;
                return this;
            }

            /**
             * 公开（公告）日
             */
            public Builder publicDate(String publicDate) {
                this.publicDate = publicDate;
                return this;
            }

            /**
             * 公开（公告）号
             */
            public Builder publicNum(String publicNum) {
                this.publicNum = publicNum;
                return this;
            }

            /**
             * 申请日
             */
            public Builder requestDate(String requestDate) {
                this.requestDate = requestDate;
                return this;
            }

            /**
             * 申请号
             */
            public Builder requestNum(String requestNum) {
                this.requestNum = requestNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
