// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBackupSetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetListResponseBody</p>
 */
public class DescribeBackupSetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeBackupSetListResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data struct.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message. &quot;success&quot; is returned if the request is successful. Otherwise, an error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeBackupSetListResponseBody build() {
            return new DescribeBackupSetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupSetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupSetListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupModel")
        private Integer backupModel;

        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("BackupSetSize")
        private Long backupSetSize;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private Integer backupType;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public String getBackupSetId() {
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
            private String backupSetId; 
            private Long backupSetSize; 
            private Integer backupType; 
            private Long beginTime; 
            private Long endTime; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.backupModel = model.backupModel;
                this.backupSetId = model.backupSetId;
                this.backupSetSize = model.backupSetSize;
                this.backupType = model.backupType;
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
                this.status = model.status;
            } 

            /**
             * <p>The backup mode. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: automatic backup.</li>
             * <li><strong>1</strong>: manual backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backupModel(Integer backupModel) {
                this.backupModel = backupModel;
                return this;
            }

            /**
             * <p>The backup set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The size of the backup set, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>88803195</p>
             */
            public Builder backupSetSize(Long backupSetSize) {
                this.backupSetSize = backupSetSize;
                return this;
            }

            /**
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: fast backup.</li>
             * <li><strong>1</strong>: consistent backup.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder backupType(Integer backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The backup start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1635706960956</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The backup end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1635706960956</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The status of the backup set. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Backing up.</li>
             * <li><strong>1</strong>: Backup succeeded.</li>
             * <li><strong>2</strong>: Backup failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
