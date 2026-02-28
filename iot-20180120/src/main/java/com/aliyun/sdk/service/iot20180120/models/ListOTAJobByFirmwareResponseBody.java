// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListOTAJobByFirmwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTAJobByFirmwareResponseBody</p>
 */
public class ListOTAJobByFirmwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListOTAJobByFirmwareResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAJobByFirmwareResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorMessage; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListOTAJobByFirmwareResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.pageCount = model.pageCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The update batch information returned if the call is successful. For more information, see <strong>SimpleOTATaskInfo</strong>.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D58AC86-D5BF-4B39-834E-913E7F2C985D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of update jobs returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOTAJobByFirmwareResponseBody build() {
            return new ListOTAJobByFirmwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOTAJobByFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAJobByFirmwareResponseBody</p>
     */
    public static class OtaTagDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OtaTagDTO(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtaTagDTO create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(OtaTagDTO model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of each tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OtaTagDTO build() {
                return new OtaTagDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOTAJobByFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAJobByFirmwareResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OtaTagDTO")
        private java.util.List<OtaTagDTO> otaTagDTO;

        private Tags(Builder builder) {
            this.otaTagDTO = builder.otaTagDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return otaTagDTO
         */
        public java.util.List<OtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

        public static final class Builder {
            private java.util.List<OtaTagDTO> otaTagDTO; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.otaTagDTO = model.otaTagDTO;
            } 

            /**
             * OtaTagDTO.
             */
            public Builder otaTagDTO(java.util.List<OtaTagDTO> otaTagDTO) {
                this.otaTagDTO = otaTagDTO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOTAJobByFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAJobByFirmwareResponseBody</p>
     */
    public static class SimpleOTAJobInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirmwareId")
        private String firmwareId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("SelectionType")
        private String selectionType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TargetSelection")
        private String targetSelection;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcEndTime")
        private String utcEndTime;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        @com.aliyun.core.annotation.NameInMap("UtcStartTime")
        private String utcStartTime;

        private SimpleOTAJobInfo(Builder builder) {
            this.firmwareId = builder.firmwareId;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.jobType = builder.jobType;
            this.productKey = builder.productKey;
            this.selectionType = builder.selectionType;
            this.tags = builder.tags;
            this.targetSelection = builder.targetSelection;
            this.utcCreate = builder.utcCreate;
            this.utcEndTime = builder.utcEndTime;
            this.utcModified = builder.utcModified;
            this.utcStartTime = builder.utcStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleOTAJobInfo create() {
            return builder().build();
        }

        /**
         * @return firmwareId
         */
        public String getFirmwareId() {
            return this.firmwareId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return selectionType
         */
        public String getSelectionType() {
            return this.selectionType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return targetSelection
         */
        public String getTargetSelection() {
            return this.targetSelection;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcEndTime
         */
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        /**
         * @return utcStartTime
         */
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public static final class Builder {
            private String firmwareId; 
            private String jobId; 
            private String jobStatus; 
            private String jobType; 
            private String productKey; 
            private String selectionType; 
            private Tags tags; 
            private String targetSelection; 
            private String utcCreate; 
            private String utcEndTime; 
            private String utcModified; 
            private String utcStartTime; 

            private Builder() {
            } 

            private Builder(SimpleOTAJobInfo model) {
                this.firmwareId = model.firmwareId;
                this.jobId = model.jobId;
                this.jobStatus = model.jobStatus;
                this.jobType = model.jobType;
                this.productKey = model.productKey;
                this.selectionType = model.selectionType;
                this.tags = model.tags;
                this.targetSelection = model.targetSelection;
                this.utcCreate = model.utcCreate;
                this.utcEndTime = model.utcEndTime;
                this.utcModified = model.utcModified;
                this.utcStartTime = model.utcStartTime;
            } 

            /**
             * <p>The ID of the update package.</p>
             * 
             * <strong>example:</strong>
             * <p>UfuxnwygsuSkVE0VCN****0100</p>
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * <p>The ID of the update batch.</p>
             * 
             * <strong>example:</strong>
             * <p>HvKuBpuk3rdk6E92CP****0200</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The status of the update batch.</p>
             * <ul>
             * <li><strong>PLANNED</strong>: The update batch is being planned. The batch is created, but the scheduled time has not arrived. This parameter is returned only if you perform a static update.</li>
             * <li><strong>IN_PROGRESS</strong>: The update batch is running.</li>
             * <li><strong>COMPLETE</strong>: The update batch is completed.</li>
             * <li><strong>CANCELED</strong>: The update batch is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_PROGRESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The type of the batch. Valid values:</p>
             * <ul>
             * <li><strong>VERFIY_FIRMWARE</strong>: update package verification.</li>
             * <li><strong>UPGRADE_FIRMWARE</strong>: batch update.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPGRADE_FIRMWARE</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the update package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a19mzPZ****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The update policy of the update batch. Valid values:</p>
             * <ul>
             * <li><strong>DYNAMIC</strong>: dynamic update. This value is returned if you call the <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> API operation to create an update batch.</li>
             * <li><strong>STATIC</strong>: static update. This value is returned if you call the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> API operation to create an update batch.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STATIC</p>
             */
            public Builder selectionType(String selectionType) {
                this.selectionType = selectionType;
                return this;
            }

            /**
             * <p>The tags of the update batch.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The scope of the update batch. Valid values: </p>
             * <ul>
             * <li><strong>ALL</strong>: updates all devices.</li>
             * <li><strong>SPECIFIC</strong>: updates specified devices.</li>
             * <li><strong>GRAY</strong>: performs a phased update.</li>
             * </ul>
             * <blockquote>
             * <p> The value ALL is returned if you call the <a href="/help/en/iot-platform/latest/av6dui">CreateOTADynamicUpgradeJob</a> API operation to create an update batch.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SPECIFIC</p>
             */
            public Builder targetSelection(String targetSelection) {
                this.targetSelection = targetSelection;
                return this;
            }

            /**
             * <p>The time when the update batch was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:43:10.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The end time of the update batch. The time is displayed in UTC.</p>
             * <p>This parameter is returned only after the update batch is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-29T02:43:10.000Z</p>
             */
            public Builder utcEndTime(String utcEndTime) {
                this.utcEndTime = utcEndTime;
                return this;
            }

            /**
             * <p>The time when the update batch was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:43:10.000Z</p>
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * <p>The start time of the update batch. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:43:10.000Z</p>
             */
            public Builder utcStartTime(String utcStartTime) {
                this.utcStartTime = utcStartTime;
                return this;
            }

            public SimpleOTAJobInfo build() {
                return new SimpleOTAJobInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOTAJobByFirmwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAJobByFirmwareResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimpleOTAJobInfo")
        private java.util.List<SimpleOTAJobInfo> simpleOTAJobInfo;

        private Data(Builder builder) {
            this.simpleOTAJobInfo = builder.simpleOTAJobInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return simpleOTAJobInfo
         */
        public java.util.List<SimpleOTAJobInfo> getSimpleOTAJobInfo() {
            return this.simpleOTAJobInfo;
        }

        public static final class Builder {
            private java.util.List<SimpleOTAJobInfo> simpleOTAJobInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.simpleOTAJobInfo = model.simpleOTAJobInfo;
            } 

            /**
             * SimpleOTAJobInfo.
             */
            public Builder simpleOTAJobInfo(java.util.List<SimpleOTAJobInfo> simpleOTAJobInfo) {
                this.simpleOTAJobInfo = simpleOTAJobInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
