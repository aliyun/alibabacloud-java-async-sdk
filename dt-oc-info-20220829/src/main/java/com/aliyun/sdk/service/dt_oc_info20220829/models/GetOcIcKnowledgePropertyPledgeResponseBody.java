// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcKnowledgePropertyPledgeResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcKnowledgePropertyPledgeResponseBody</p>
 */
public class GetOcIcKnowledgePropertyPledgeResponseBody extends TeaModel {
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

    private GetOcIcKnowledgePropertyPledgeResponseBody(Builder builder) {
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

    public static GetOcIcKnowledgePropertyPledgeResponseBody create() {
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

        public GetOcIcKnowledgePropertyPledgeResponseBody build() {
            return new GetOcIcKnowledgePropertyPledgeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Number")
        private String number;

        @NameInMap("Pawnee")
        private String pawnee;

        @NameInMap("Period")
        private String period;

        @NameInMap("Pledgor")
        private String pledgor;

        @NameInMap("PublicDate")
        private String publicDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.name = builder.name;
            this.number = builder.number;
            this.pawnee = builder.pawnee;
            this.period = builder.period;
            this.pledgor = builder.pledgor;
            this.publicDate = builder.publicDate;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return pawnee
         */
        public String getPawnee() {
            return this.pawnee;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return pledgor
         */
        public String getPledgor() {
            return this.pledgor;
        }

        /**
         * @return publicDate
         */
        public String getPublicDate() {
            return this.publicDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String number; 
            private String pawnee; 
            private String period; 
            private String pledgor; 
            private String publicDate; 
            private String status; 
            private String type; 

            /**
             * 公司名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 登记证号
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * 质权人名称
             */
            public Builder pawnee(String pawnee) {
                this.pawnee = pawnee;
                return this;
            }

            /**
             * 质权登记期限
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * 出质人名称
             */
            public Builder pledgor(String pledgor) {
                this.pledgor = pledgor;
                return this;
            }

            /**
             * 公示日期
             */
            public Builder publicDate(String publicDate) {
                this.publicDate = publicDate;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 种类
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
