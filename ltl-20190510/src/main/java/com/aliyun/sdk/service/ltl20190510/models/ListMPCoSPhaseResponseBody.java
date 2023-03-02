// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMPCoSPhaseResponseBody} extends {@link TeaModel}
 *
 * <p>ListMPCoSPhaseResponseBody</p>
 */
public class ListMPCoSPhaseResponseBody extends TeaModel {
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

    private ListMPCoSPhaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMPCoSPhaseResponseBody create() {
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

        public ListMPCoSPhaseResponseBody build() {
            return new ListMPCoSPhaseResponseBody(this);
        } 

    } 

    public static class PageData extends TeaModel {
        @NameInMap("AccessPermission")
        private Integer accessPermission;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhaseId")
        private String phaseId;

        @NameInMap("Remark")
        private String remark;

        private PageData(Builder builder) {
            this.accessPermission = builder.accessPermission;
            this.name = builder.name;
            this.phaseId = builder.phaseId;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return accessPermission
         */
        public Integer getAccessPermission() {
            return this.accessPermission;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phaseId
         */
        public String getPhaseId() {
            return this.phaseId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Integer accessPermission; 
            private String name; 
            private String phaseId; 
            private String remark; 

            /**
             * AccessPermission.
             */
            public Builder accessPermission(Integer accessPermission) {
                this.accessPermission = accessPermission;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PhaseId.
             */
            public Builder phaseId(String phaseId) {
                this.phaseId = phaseId;
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
