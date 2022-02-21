// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisOperateRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisOperateRecordsResponseBody</p>
 */
public class DescribeDiagnosisOperateRecordsResponseBody extends TeaModel {
    @NameInMap("DiagnosisOperateRecordModels")
    private java.util.List < DiagnosisOperateRecordModels> diagnosisOperateRecordModels;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDiagnosisOperateRecordsResponseBody(Builder builder) {
        this.diagnosisOperateRecordModels = builder.diagnosisOperateRecordModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisOperateRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnosisOperateRecordModels
     */
    public java.util.List < DiagnosisOperateRecordModels> getDiagnosisOperateRecordModels() {
        return this.diagnosisOperateRecordModels;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DiagnosisOperateRecordModels> diagnosisOperateRecordModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DiagnosisOperateRecordModels.
         */
        public Builder diagnosisOperateRecordModels(java.util.List < DiagnosisOperateRecordModels> diagnosisOperateRecordModels) {
            this.diagnosisOperateRecordModels = diagnosisOperateRecordModels;
            return this;
        }

        /**
         * PageNumber
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnosisOperateRecordsResponseBody build() {
            return new DescribeDiagnosisOperateRecordsResponseBody(this);
        } 

    } 

    public static class DiagnosisOperateRecordModels extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("NewInstanceType")
        private String newInstanceType;

        @NameInMap("NewZoneId")
        private String newZoneId;

        @NameInMap("OperateDate")
        private String operateDate;

        @NameInMap("OperateRecordType")
        private String operateRecordType;

        @NameInMap("ZoneId")
        private String zoneId;

        private DiagnosisOperateRecordModels(Builder builder) {
            this.instanceType = builder.instanceType;
            this.newInstanceType = builder.newInstanceType;
            this.newZoneId = builder.newZoneId;
            this.operateDate = builder.operateDate;
            this.operateRecordType = builder.operateRecordType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosisOperateRecordModels create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return newInstanceType
         */
        public String getNewInstanceType() {
            return this.newInstanceType;
        }

        /**
         * @return newZoneId
         */
        public String getNewZoneId() {
            return this.newZoneId;
        }

        /**
         * @return operateDate
         */
        public String getOperateDate() {
            return this.operateDate;
        }

        /**
         * @return operateRecordType
         */
        public String getOperateRecordType() {
            return this.operateRecordType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String instanceType; 
            private String newInstanceType; 
            private String newZoneId; 
            private String operateDate; 
            private String operateRecordType; 
            private String zoneId; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * NewInstanceType.
             */
            public Builder newInstanceType(String newInstanceType) {
                this.newInstanceType = newInstanceType;
                return this;
            }

            /**
             * NewZoneId.
             */
            public Builder newZoneId(String newZoneId) {
                this.newZoneId = newZoneId;
                return this;
            }

            /**
             * OperateDate.
             */
            public Builder operateDate(String operateDate) {
                this.operateDate = operateDate;
                return this;
            }

            /**
             * OperateRecordType.
             */
            public Builder operateRecordType(String operateRecordType) {
                this.operateRecordType = operateRecordType;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DiagnosisOperateRecordModels build() {
                return new DiagnosisOperateRecordModels(this);
            } 

        } 

    }
}
