// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMPCoSPhaseGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListMPCoSPhaseGroupResponseBody</p>
 */
public class ListMPCoSPhaseGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListMPCoSPhaseGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMPCoSPhaseGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public ListMPCoSPhaseGroupResponseBody build() {
            return new ListMPCoSPhaseGroupResponseBody(this);
        } 

    } 

    public static class PageData extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("PhaseGroupId")
        private String phaseGroupId;

        @NameInMap("Remark")
        private String remark;

        private PageData(Builder builder) {
            this.name = builder.name;
            this.phaseGroupId = builder.phaseGroupId;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phaseGroupId
         */
        public String getPhaseGroupId() {
            return this.phaseGroupId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String name; 
            private String phaseGroupId; 
            private String remark; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PhaseGroupId.
             */
            public Builder phaseGroupId(String phaseGroupId) {
                this.phaseGroupId = phaseGroupId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Num")
        private Integer num;

        @NameInMap("PageData")
        private java.util.List < PageData> pageData;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.num = builder.num;
            this.pageData = builder.pageData;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return num
         */
        public Integer getNum() {
            return this.num;
        }

        /**
         * @return pageData
         */
        public java.util.List < PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer num; 
            private java.util.List < PageData> pageData; 
            private Integer size; 
            private Integer total; 

            /**
             * Num.
             */
            public Builder num(Integer num) {
                this.num = num;
                return this;
            }

            /**
             * PageData.
             */
            public Builder pageData(java.util.List < PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
