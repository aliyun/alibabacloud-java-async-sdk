// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetListResponseBody</p>
 */
public class DescribeBackupSetListResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeBackupSetListResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSetListResponseBody create() {
        return builder().build();
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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

        public DescribeBackupSetListResponseBody build() {
            return new DescribeBackupSetListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BackupModel")
        private Integer backupModel;

        @NameInMap("BackupSetId")
        private Long backupSetId;

        @NameInMap("BackupSetSize")
        private Long backupSetSize;

        @NameInMap("BackupType")
        private Integer backupType;

        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.backupModel = builder.backupModel;
            this.backupSetId = builder.backupSetId;
            this.backupSetSize = builder.backupSetSize;
            this.backupType = builder.backupType;
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupModel
         */
        public Integer getBackupModel() {
            return this.backupModel;
        }

        /**
         * @return backupSetId
         */
        public Long getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return backupSetSize
         */
        public Long getBackupSetSize() {
            return this.backupSetSize;
        }

        /**
         * @return backupType
         */
        public Integer getBackupType() {
            return this.backupType;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer backupModel; 
            private Long backupSetId; 
            private Long backupSetSize; 
            private Integer backupType; 
            private Long beginTime; 
            private Long endTime; 
            private Integer status; 

            /**
             * BackupModel.
             */
            public Builder backupModel(Integer backupModel) {
                this.backupModel = backupModel;
                return this;
            }

            /**
             * BackupSetId.
             */
            public Builder backupSetId(Long backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * BackupSetSize.
             */
            public Builder backupSetSize(Long backupSetSize) {
                this.backupSetSize = backupSetSize;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(Integer backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
