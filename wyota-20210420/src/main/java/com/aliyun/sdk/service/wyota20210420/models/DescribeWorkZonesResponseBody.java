// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkZonesResponseBody</p>
 */
public class DescribeWorkZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWorkZonesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkZonesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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

        public DescribeWorkZonesResponseBody build() {
            return new DescribeWorkZonesResponseBody(this);
        } 

    } 

    public static class WorkZoneDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SeatCol")
        private Integer seatCol;

        @com.aliyun.core.annotation.NameInMap("SeatRow")
        private Integer seatRow;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private WorkZoneDTOList(Builder builder) {
            this.seatCol = builder.seatCol;
            this.seatRow = builder.seatRow;
            this.tenantId = builder.tenantId;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkZoneDTOList create() {
            return builder().build();
        }

        /**
         * @return seatCol
         */
        public Integer getSeatCol() {
            return this.seatCol;
        }

        /**
         * @return seatRow
         */
        public Integer getSeatRow() {
            return this.seatRow;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private Integer seatCol; 
            private Integer seatRow; 
            private String tenantId; 
            private String zoneId; 
            private String zoneName; 

            /**
             * SeatCol.
             */
            public Builder seatCol(Integer seatCol) {
                this.seatCol = seatCol;
                return this;
            }

            /**
             * SeatRow.
             */
            public Builder seatRow(Integer seatRow) {
                this.seatRow = seatRow;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneName.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public WorkZoneDTOList build() {
                return new WorkZoneDTOList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("WorkZoneDTOList")
        private java.util.List < WorkZoneDTOList> workZoneDTOList;

        private Data(Builder builder) {
            this.totalCount = builder.totalCount;
            this.workZoneDTOList = builder.workZoneDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return workZoneDTOList
         */
        public java.util.List < WorkZoneDTOList> getWorkZoneDTOList() {
            return this.workZoneDTOList;
        }

        public static final class Builder {
            private Long totalCount; 
            private java.util.List < WorkZoneDTOList> workZoneDTOList; 

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * WorkZoneDTOList.
             */
            public Builder workZoneDTOList(java.util.List < WorkZoneDTOList> workZoneDTOList) {
                this.workZoneDTOList = workZoneDTOList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
